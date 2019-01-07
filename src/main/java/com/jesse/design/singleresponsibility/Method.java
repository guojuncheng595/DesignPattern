package com.jesse.design.singleresponsibility;

public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "jesse";
        address = "杭州";
    }

    /**
     * 可变长参数：String...
     * @param userName
     * @param properties
     */
    private void updateUserInfo(String userName, String... properties) {
        userName = "jesse";
//        address = "杭州";

    }



    private void updateUserName(String userName) {
        userName = "jesse";
    }

    private void updateAddress(String address) {
        address = "杭州";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            //TODO something1
        } else {
            //TODO something2
        }
        userName = "jesse";
        address = "杭州";
    }
}
