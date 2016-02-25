package com.mydomain;

import com.mydomain.config.SegmentListConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
public class AppRunner implements ApplicationRunner {

    @Autowired
    private SegmentListConfig segmentListConfig;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        segmentListConfig.getList().forEach(segment -> System.out.println(segment));
    }

}