package com.example.demo.model.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * <p>商品分类实体</p>
 * Created by dyt 2019/4/25
 */
//@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name="user")
public class User {
    private static final long serialVersionUID = -8278190742410600860L;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    /**
     * 名字
     */
    @Column(name = "name")
    private String name;
}