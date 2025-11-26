package com.ioc.coupling;

public class userDatabaseProvider implements UserInterfaceProvider {
    @Override
    public String getUserDetails() {
        return "comes from user database";
    }
}
