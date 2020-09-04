package com.company.project.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.company.project.modules.base.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 用户通知
 * </p>
 *
 * @author author
 * @since 2020-09-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName(value = "sys_user_notice", autoResultMap = true)
public class UserNotice extends BaseEntity<Integer> {

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 通告ID
     */
    @TableField(typeHandler = JacksonTypeHandler.class)
    private List<Integer> noticeIds;

    /**
     * 创建时间
     */
    private Date updateDate;

}

