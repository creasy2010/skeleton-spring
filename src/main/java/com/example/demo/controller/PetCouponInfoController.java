package com.example.demo.controller;

import com.example.demo.model.user.User;
import com.example.demo.model.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by CHENLI on 2018/9/25.
 */
@RestController
@RequestMapping("/pet/coupon-info")
public class PetCouponInfoController {


    @Autowired
    private UserService userService;
    /**
     * 领券中心列表
     * @return
     */
    @GetMapping("/center")
    public void getCouponStarted() {
        userService.page();
        User user = new User();
        user.setName("Jay");
        userService.save(user);
        return  ;
    }
}
