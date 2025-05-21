package com.dss.api_impl.config;

import com.dss.api_impl.service.ProductServiceImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(ProductServiceImpl.class);
    }
}
