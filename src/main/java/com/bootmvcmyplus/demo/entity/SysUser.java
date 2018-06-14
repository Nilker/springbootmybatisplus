package com.bootmvcmyplus.demo.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author lihl
 * @since 2018-06-14
 */
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 用户年龄
     */
    private Integer age;
    /**
     * 0、禁用 1、正常, 如果使用tinyint(1)，mysql连接没加tinyInt1isBit=false，默认mysql驱动会把值转成boolean
     */
    private Integer type;
    /**
     * 自定义填充的创建时间
     */
    private Date ctime;


    public Long getId() {
        return id;
    }

    public SysUser setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SysUser setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public SysUser setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public SysUser setType(Integer type) {
        this.type = type;
        return this;
    }

    public Date getCtime() {
        return ctime;
    }

    public SysUser setCtime(Date ctime) {
        this.ctime = ctime;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        ", id=" + id +
        ", name=" + name +
        ", age=" + age +
        ", type=" + type +
        ", ctime=" + ctime +
        "}";
    }
}
