package com.company.project.modules.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.company.project.modules.system.entity.Dept;
import com.company.project.modules.system.mapper.DeptMapper;
import com.company.project.modules.system.service.DeptService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门管理 服务实现类
 * </p>
 *
 * @author author
 * @since 2020-08-29
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}
