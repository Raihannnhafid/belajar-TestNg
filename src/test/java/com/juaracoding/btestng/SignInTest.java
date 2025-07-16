package com.juaracoding.btestng;

import org.testng.annotations.Test;

/** */

public class SignInTest {

  @Test(priority = 2)
    public void signInTest() {
       System.out.println("Method SignInTest.sigIntest dijalankan ");
    }

     @Test(priority = 1)
    public void dashboardTest() {
        System.out.println("Method SignInTest.dashboardTest dijalankan");
    }

    @Test(priority = 3)
    public void profilTest(){
      System.out.println("Method SignInTest.profilTest dijalankan");
    }

}
