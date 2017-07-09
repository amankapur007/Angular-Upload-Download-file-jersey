package com.poc.fileUpload.Angular.config;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.poc.fileUpload.Angular.rest.resource.FileUploadResource;
import com.poc.fileUpload.Angular.rest.resource.HelloWorld;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerEndpoints();
    }
    private void registerEndpoints() {
        register(MultiPartFeature.class);
        register(HelloWorld.class);
        register(FileUploadResource.class);     
    }
}