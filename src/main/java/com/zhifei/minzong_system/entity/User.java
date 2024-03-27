package com.zhifei.minzong_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月19日 11:37
 */
@ApiModel("用户信息对象")
@Data
@Entity
@Table(name = "user")
@TableName(value = "user")
public class User {

    @ApiModelProperty("ID")
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint comment 'id'")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户名")
    @Column(columnDefinition = "varchar(100) comment '用户名'")
    private String name;

    @ApiModelProperty("登录名")
    @Column(columnDefinition = "varchar(100) comment '登录名'")
    private String loginName;

    @ApiModelProperty("密码")
    @Column(columnDefinition = "varchar(100) comment '密码'")
    private String password;

    @ApiModelProperty("部门")
    @Column(columnDefinition = "varchar(100) comment '部门'")
    private String department;

    @ApiModelProperty("是否为部门负责人（0 不是，1 是）")
    @Column(columnDefinition = "int comment '是否为部门负责人（0 不是，1 是）'")
    private Integer isDepartment;

    @ApiModelProperty("手机号")
    @Column(columnDefinition = "varchar(100) comment '手机号'")
    private String telephone;
}
