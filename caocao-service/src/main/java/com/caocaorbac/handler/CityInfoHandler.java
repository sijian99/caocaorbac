package com.caocaorbac.handler;

import com.caocaorbac.service.CityInfoService;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CityInfoHandler extends IJobHandler {
    private CityInfoService cityInfoService;

    @XxlJob(value = "cityInfoHandler")
    @Override
    public void execute() throws Exception{
        cityInfoService.saveCitiesInfo();
    }


}
