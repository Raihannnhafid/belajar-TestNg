package com.juaracoding.btestng;

import org.testng.annotations.Test;

public class SignInTest {

  @Test
    public void signInTest() {
       System.out.println("Method sigIntest dijalankan ");
    }

     @Test(dependsOnMethods =  {"signInTest"})
    public void dashboardTest() {
        System.out.println("Method dashboardTest dijalankan");
    }

}
