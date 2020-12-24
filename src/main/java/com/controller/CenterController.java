package com.controller;
import com.bean.Govproject;
import com.dao.GovprojectDao;
import com.dao.InvestProjectPlanDao;
import com.model.DataCount;
import com.model.DataResult;
import com.service.*;
import com.zx.microserver.register.annotation.*;
import com.zx.microserver.register.plugin.push.register.util.DataTypeEnum;
import com.zx.microserver.register.util.ReadPropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author:智霸霸
 * @Date 2020/6/1
 */
@Controller
public class CenterController {

    @Autowired
    private GovProjectService govProjectService;
    @Autowired
    private InvestProjectPlanService planService;
    @Autowired
    private PublickContactService publickContactService;
    @Autowired
    private SeiProjectService seiProjectService;
    @Autowired
    private GetAllCount getAllCount;
    @ResponseBody
    @RequestMapping(value = "/getGovernmentProject",method = RequestMethod.POST)
    public DataResult governmentProject(
            @RequestParam(value = "todaytime",required = false) String todaytime,
            @RequestParam(value = "pageIndex",required = false) String pageIndex,
            @RequestParam(value = "projectName",required = false) String projectName,
            @RequestParam(value="companyName",required = false) String companyName
            ){
                if(!"".equals(todaytime)&&todaytime!=null&&!"".equals(pageIndex)&&pageIndex!=null)
                    return govProjectService.returnGovproject(todaytime,pageIndex);
                else
                    return govProjectService.getGovproject(projectName,companyName);
        }
    @ResponseBody
    @RequestMapping(value = "/getInvestProjectPlan",method = RequestMethod.POST)
    public DataResult investProject(
            @RequestParam(value = "todaytime",required = false) String todaytime,
            @RequestParam(value = "pageIndex",required = false) String pageIndex,
            @RequestParam(value = "year",required = false) String year,
            @RequestParam(value = "projectName",required = false) String projectName,
            @RequestParam(value = "companyName",required = false) String companyName

            ){
        if(!"".equals(todaytime)&&todaytime!=null&&!"".equals(pageIndex)&&pageIndex!=null)
            return planService.returnData(todaytime,pageIndex);
        else
            return planService.getData( year, projectName,companyName);
    }
    @ResponseBody
    @RequestMapping(value = "/getSeiProject",method = RequestMethod.POST)
    public DataResult selProject(
            @RequestParam(value = "todaytime",required = false) String todaytime,
            @RequestParam(value = "pageIndex",required = false) String pageIndex,
            @RequestParam(value = "projectName",required = false) String projectName,
            @RequestParam(value = "applyYear",required = false) String applyYear
    ){
        if(!"".equals(todaytime)&&todaytime!=null&&!"".equals(pageIndex)&&pageIndex!=null)
            return seiProjectService.returnSeiProject(todaytime,pageIndex);
        else
            return seiProjectService.getData(projectName,applyYear);
    }


    @ResponseBody
    @RequestMapping(value = "/getPublickContact",method = RequestMethod.POST)
    public DataResult publickContact(
            @RequestParam(value = "todaytime",required = false) String todaytime,
            @RequestParam(value = "pageIndex",required = false) String pageIndex,
            @RequestParam(value = "projectPrincipal",required = false) String projectPrincipal,
            @RequestParam(value = "projectPrincipalPhone",required = false) String projectPrincipalPhone,
            @RequestParam(value = "projectContact",required = false) String projectContact,
            @RequestParam(value = "projectContactPhone",required = false) String projectContactPhone
    ){
        if(!"".equals(todaytime)&&todaytime!=null&&!"".equals(pageIndex)&&pageIndex!=null)
            return publickContactService.returnPublickContact(todaytime,pageIndex);
        else
            return publickContactService.getData(projectPrincipal,projectPrincipalPhone,projectContact,projectContactPhone);
    }
    @ResponseBody
    @RequestMapping(value = "/getDataCount",method = RequestMethod.GET)
    @ZxApiResultParams(
            param = {
                    @ZxApiResultParam(name = "政府投资项目数",dataType = DataTypeEnum.Int,remark = "政府投资项目数据量"),
                    @ZxApiResultParam(name = "项目联系人信息",dataType = DataTypeEnum.Int,remark = "项目联系人信息数据量"),
                    @ZxApiResultParam(name = "战略性新兴产业项目信息",dataType = DataTypeEnum.Int,remark = "战略性新兴产业项目信息数据量"),
                    @ZxApiResultParam(name = "重大项目年度投资计划",dataType = DataTypeEnum.Int,remark = "重大项目年度投资计划数据量"),
            }
    )
    public DataCount getDataCount(){
            return getAllCount.getDataCount();
    }
}
