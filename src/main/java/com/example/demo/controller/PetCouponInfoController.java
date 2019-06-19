package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by CHENLI on 2018/9/25.
 */
@RestController
@RequestMapping("/pet/coupon-info")
public class PetCouponInfoController {

    /**
     * 领券中心列表
     * @return
     */
    @GetMapping("/center")
    public void getCouponStarted() {
        System.out.println("132123");
        return  ;
    }
}
