package com.poc.fileUpload.Angular.config;

import java.util.HashSet;
import java.util.Set;

import org.glassfish.jersey.media.multipart.MultiPartFeature;

import com.poc.fileUpload.Angular.rest.resource.FileUploadResource;
import com.sun.research.ws.wadl.Application;

public class ApplicationConfig extends Application {

    public Set<Class<?>> getClasses() {
        final Set<Class<?>> resources = new HashSet<Class<?>>();

        // Add your resources.
        resources.add(FileUploadResource.class);

        // Add additional features such as support for Multipart.
        resources.add(MultiPartFeature.class);

        return resources;
    }
}