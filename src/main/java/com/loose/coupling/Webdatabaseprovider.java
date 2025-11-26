package com.loose.coupling;

public class Webdatabaseprovider implements UserInterfaceProvider {

    @Override
    public String getUserDetails() {
        return "comes from web database";
    }
}
