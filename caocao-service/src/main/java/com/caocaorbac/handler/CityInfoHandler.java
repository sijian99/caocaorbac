package com.caocaorbac.handler;

import com.caocaorbac.service.CityInfoService;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityInfoHandler{
    private static Logger logger = LoggerFactory.getLogger(CityInfoHandler.class);
    @Autowired
    private CityInfoService cityInfoService;

    @XxlJob(value = "cityInfoHandler")

    public void execute() throws Exception{
        XxlJobHelper.log("XXL-JOB, cityInfoService.");
        cityInfoService.saveCitiesInfo();
    }




}
