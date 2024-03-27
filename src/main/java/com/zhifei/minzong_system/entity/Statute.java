package com.zhifei.minzong_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
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

    @Column(columnDefinition = "varchar(100) comment '政策法规名称'")
    private String name;

    @Column(columnDefinition = "varchar(100) comment '颁布单位'")
    private String unit;

    @Column(columnDefinition = "varchar(100) comment '适用领域'")
    private String field;

    @Column(columnDefinition = "varchar(100) comment '颁布时间'")
    private String time;

    @Column(columnDefinition = "varchar(100) comment '性质'")
    private String quality;

    @Column(columnDefinition = "varchar(1000) comment '备注信息'")
    private String comments;

    @Column(columnDefinition = "timeStamp comment '政策法规名称'")
    private Date registerTime;

    @Column(columnDefinition = "int comment '政策法规名称'")
    private Integer sync;
}
