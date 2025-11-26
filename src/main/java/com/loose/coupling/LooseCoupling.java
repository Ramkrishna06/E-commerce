package com.loose.coupling;

public class LooseCoupling {

    public static void main(String[] args) {
        UserInterfaceProvider userobj1 = new NewDatabseprovider();

        System.out.println(userobj1.getUserDetails());

        UserManger userMangerwithnewdb = new UserManger(userobj1);

        System.out.println(userMangerwithnewdb.getUserInfo());


        UserInterfaceProvider userobj2 = new UserDatabaseprovider();

        //System.out.println(userobj2.getUserDetails());

        UserManger userMangerwithdb = new UserManger(userobj2);

        System.out.println(userMangerwithdb.getUserInfo());




    }
}
