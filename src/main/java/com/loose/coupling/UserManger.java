package com.loose.coupling;

public class UserManger {

    UserInterfaceProvider Userinterfaceprovider;


    public UserManger(UserInterfaceProvider userinterfaceprovider) {
        this.Userinterfaceprovider = userinterfaceprovider;
    }



    public String getUserInfo(){
        return Userinterfaceprovider.getUserDetails();
    }

}
