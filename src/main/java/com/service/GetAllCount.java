package com.service;

import com.dao.GovprojectDao;
import com.dao.InvestProjectPlanDao;
import com.dao.PublickContactDao;
import com.dao.SeiProjectDao;
import com.model.DataCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:智霸霸
 * @Date 2020/8/11
 */
@Service
public class GetAllCount {
    @Autowired
    private GovprojectDao govprojectDao;
    @Autowired
    private InvestProjectPlanDao investProjectPlanDao;
    @Autowired
    private PublickContactDao publickContactDao;
    @Autowired
    private SeiProjectDao seiProjectDao;
    private DataCount dataCount=new DataCount();
    public DataCount getDataCount(){
        dataCount.setGovproject(govprojectDao.getCount());
        dataCount.setInvestprojectplan(investProjectPlanDao.getCount());
        dataCount.setPubliccontact(publickContactDao.getCount());
        dataCount.setSelproject(seiProjectDao.getCount());
        return dataCount;
    }
}
