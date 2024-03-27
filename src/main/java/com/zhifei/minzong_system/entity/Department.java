package com.zhifei.minzong_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月22日 09:49
 */
@ApiModel("民宗部门基础信息对象")
@Data
@Entity
@Table(name = "department")
@TableName(value = "department")
public class Department {

    @Id
    @ApiModelProperty("ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(value = "id", type = IdType.AUTO)
    @Column(columnDefinition = "bigint comment 'id'")
    private Integer id;

    @ApiModelProperty("所在地区")
    @Column(columnDefinition = "varchar(100) comment '所在地区'")
    private String area;

    @ApiModelProperty("机构名称")
    @Column(columnDefinition = "varchar(100) comment '机构名称'")
    private String institutionName;

    @ApiModelProperty("机构性质")
    @Column(columnDefinition = "varchar(100) comment '机构性质'")
    private String institutionQuality;

    @ApiModelProperty("机构级别")
    @Column(columnDefinition = "varchar(100) comment '机构级别'")
    private String institutionLevel;

    @ApiModelProperty("行政部门地址")
    @Column(columnDefinition = "varchar(100) comment '行政部门地址'")
    private String administrationLocation;

    @ApiModelProperty("主要负责人")
    @Column(columnDefinition = "varchar(100) comment '主要负责人'")
    private String leader;

    @ApiModelProperty("联系电话")
    @Column(columnDefinition = "varchar(100) comment '联系电话'")
    private String telephone;

    @ApiModelProperty("创建日期（yyyy-MM-dd HH:mm:ss）")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(columnDefinition = "timeStamp comment '创建日期（yyyy-MM-dd HH:mm:ss）'")
    private Date registerTime;

    @ApiModelProperty("审核状态（0 待审核，1 通过， 2 不通过）")
    @Column(columnDefinition = "int comment '审核状态（0 待审核，1 通过， 2 不通过）'")
    private Integer state;
}
