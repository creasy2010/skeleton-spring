package com.example.demo.model.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品分类商品
 * Created by daiyitian on 2017/4/11.
 */
@Service("GoodsCateStoreService")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 新增商品分类
     *
     * @param cate 商品分类
     */

    /**
     * 分页查询商品分类
     *
     * @return page
     */
    public void page() {
        System.out.println(userRepository.findAll());
    }

    public void save(User user) {
        System.out.println(userRepository.save(user));
    }
}
