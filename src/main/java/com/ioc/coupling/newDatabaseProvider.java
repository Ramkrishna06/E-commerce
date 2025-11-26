package com.ioc.coupling;

public class newDatabaseProvider implements UserInterfaceProvider {

    @Override
    public String getUserDetails() {
          return "comes from new database";
    }

}
