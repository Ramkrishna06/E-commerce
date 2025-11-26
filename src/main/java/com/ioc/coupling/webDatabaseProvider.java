package com.ioc.coupling;

public class webDatabaseProvider implements UserInterfaceProvider {

    @Override
    public String getUserDetails() {
        return "comes from web database";
    }
}
