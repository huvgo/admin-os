package com.company.project.modules.sys.entity;

import com.company.project.modules.com.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 系统日志
 * </p>
 *
 * @author author
 * @since 2020-08-30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName(value = "sys_log")
public class Log extends BaseEntity {

        /**
        * 操作用户ID
        */
        private String operationUserId;

        /**
        * 用户操作
        */
        private String operation;

        /**
        * 请求方法
        */
        private String method;

        /**
        * 请求参数
        */
        private String params;

        /**
        * 执行时长(毫秒)
        */
        private Long time;

        /**
        * IP地址
        */
        private String ip;

        /**
        * 创建时间
        */
        private Date createDate;

}

