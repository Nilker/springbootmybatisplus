package com.bootmvcmyplus.demo.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.bootmvcmyplus.demo.entity.SysUser;
import com.bootmvcmyplus.demo.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * <p>
 * 系统用户表 前端控制器
 * </p>
 *
 * @author lihl
 * @since 2018-06-14
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @RequestMapping("/ff")
    public void ff() {
        SysUser sysUser = new SysUser();
        sysUser.setAge(22);
        sysUser.setName("张三");
        sysUser.setType(1);
        sysUser.insert();

        EntityWrapper<SysUser> entityWrapper = new EntityWrapper<>(sysUser);
        entityWrapper.setEntity(new SysUser().setName("张三"));

        Map<String, Object> ma = sysUserService.selectMap(entityWrapper);
    }
}

