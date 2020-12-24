package com.Interceptor;

import com.alibaba.fastjson.JSONObject;
import com.zx.microserver.register.util.ReadPropertiesUtil;
import com.zx.microserver.register.util.ZxSecurityServerUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:智霸霸
 * @Date 2020/6/1
 */
public class CheckInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // Path 传递需要认证的地址
        // access_token 会话权限
        // appname 服务编号
        String path=request.getServletPath();
        String appname= ReadPropertiesUtil.getParam("com.zx.register.appname");
        String token=request.getHeader("accessToken");
        System.out.println("请求路径"+path+"|"+"token"+token);
        HttpSession session=request.getSession();
        Map validateMsg=new HashMap();
        if(token!=null&&!"".equals(token)) {
            validateMsg = ZxSecurityServerUtil.validate(path, token, appname);//如未指定authenUrl，将自动获取application.properties中的值
            if (validateMsg.containsKey("success") && Boolean.parseBoolean(validateMsg.get("success").toString())) {
                session.setAttribute("msg",validateMsg);
                return true;
            }
        }else{
            validateMsg.put("success",false );
            validateMsg.put("msg", "access_token验证失败");

        }
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        response.setStatus(401);

        PrintWriter pw = response.getWriter();

        pw.write(JSONObject.toJSONString(validateMsg));
        pw.flush();
        pw.close();
        return false;

     //   return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
