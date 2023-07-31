//package com.caocaorbac.service;
//
//import com.caocaorbac.model.XxlJobInfo;
//import com.caocaorbac.utils.DateUtils;
//import com.caocaorbac.utils.XxlUtil;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//@RequiredArgsConstructor
//public class XxlService {
//
//    private final XxlUtil xxlUtil;
//
//    @Value("${xxl.job.executor.appname}")
//    private String appName;
//
//    public void addJob(
//            XxlJobInfo xxlJobInfo) {
//        xxlUtil.addJob(xxlJobInfo, appName);
//        long triggerNextTime = xxlJobInfo.getTriggerNextTime();
//        log.info("任务已添加，将在{}开始执行任务", DateUtils.formatDate(triggerNextTime));
//    }
//
//}
