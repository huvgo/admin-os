package com.company.project.modules.sys.service;

import com.company.project.modules.sys.entity.UserNotice;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户通知 服务类
 * </p>
 *
 * @author author
 * @since 2020-09-04
 */
public interface UserNoticeService extends IService<UserNotice> {

    UserNotice getByUserId(Integer id);
}
