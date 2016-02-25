package com.mydomain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppRunner implements ApplicationRunner {

    @Value("#{'${segment.list}'.split(',')}")
    private List<String> segmentList;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        segmentList.forEach(segment -> System.out.println(segment));
    }

}