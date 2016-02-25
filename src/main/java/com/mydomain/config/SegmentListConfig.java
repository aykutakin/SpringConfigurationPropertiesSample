package com.mydomain.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aykut on 25.02.2016.
 */
@Configuration
@ConfigurationProperties(prefix = "segment")
public class SegmentListConfig {

    private List<String> list;

    SegmentListConfig() {
        this.list = new ArrayList<>();
    }

    public List<String> getList() {
        return this.list;
    }

}
