package com.example.odataspringv2;

import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.core.rest.ODataRootLocator;

import javax.ws.rs.Path;

@Path("/")
public class CarsRootLocator extends ODataRootLocator {
    private final CarsODataJPAServiceFactory serviceFactory;
    public CarsRootLocator(CarsODataJPAServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @Override
    public ODataServiceFactory getServiceFactory() {
        return this.serviceFactory;
    }
}


