package com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


import javax.persistence.*;
import java.util.Date;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月25日 10:56
 */
@Data
@Entity
@Table(name = "statute")
@TableName(value = "statute")
@ApiModel("政策法规信息对象")
public class Statute {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint comment 'id'")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("政策法规名称")
    @Column(columnDefinition = "varchar(100) comment '政策法规名称'")
    private String name;

    @ApiModelProperty("颁布单位")
    @Column(columnDefinition = "varchar(100) comment '颁布单位'")
    private String unit;

    @ApiModelProperty("适用领域")
    @Column(columnDefinition = "varchar(100) comment '适用领域'")
    private String field;

    @ApiModelProperty("颁布时间")
    @Column(columnDefinition = "varchar(100) comment '颁布时间'")
    private String time;

    @ApiModelProperty("性质")
    @Column(columnDefinition = "varchar(100) comment '性质'")
    private String quality;

    @ApiModelProperty("备注信息")
    @Column(columnDefinition = "varchar(1000) comment '备注信息'")
    private String comments;

    @ApiModelProperty("创建日期（date）")
    @Column(columnDefinition = "timeStamp comment '创建日期（date）'")
    private Date registerTime;

    @ApiModelProperty("是否同步至小程序")
    @Column(columnDefinition = "int comment '是否同步至小程序（0 否，1 是'")
    private Integer sync;
}
