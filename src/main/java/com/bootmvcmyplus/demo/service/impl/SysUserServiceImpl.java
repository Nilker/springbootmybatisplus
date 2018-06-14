package com.bootmvcmyplus.demo.service.impl;

import com.bootmvcmyplus.demo.entity.SysUser;
import com.bootmvcmyplus.demo.mapper.SysUserMapper;
import com.bootmvcmyplus.demo.service.ISysUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author lihl
 * @since 2018-06-14
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
