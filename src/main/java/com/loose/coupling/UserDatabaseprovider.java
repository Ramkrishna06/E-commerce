package com.loose.coupling;

public class UserDatabaseprovider implements UserInterfaceProvider{
    @Override
    public String getUserDetails() {
        return "comes from user database";
    }
}
