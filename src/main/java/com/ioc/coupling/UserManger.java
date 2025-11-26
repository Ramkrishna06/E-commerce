package com.ioc.coupling;

public class UserManger {

    UserInterfaceProvider Userinterfaceprovider;
    public UserManger(UserInterfaceProvider userinterfaceprovider) {
        Userinterfaceprovider = userinterfaceprovider;
    }
    //UserInterfaceProvider userobj1 = new NewDatabseprovider();


    public String getUserInfo(){
        return Userinterfaceprovider.getUserDetails();
    }
}
