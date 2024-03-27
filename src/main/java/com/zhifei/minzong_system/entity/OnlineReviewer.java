package com.zhifei.minzong_system.entity;

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
 * @Date: 2024年03月27日 18:30
 */
@ApiModel("网评员队伍数据信息对象")
@Data
@Entity
@Table(name = "online_reviewer")
@TableName(value = "online_reviewer")
public class OnlineReviewer {
    @Id
    @ApiModelProperty("ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(value = "id", type = IdType.AUTO)
    @Column(columnDefinition = "bigint comment 'id'")
    private Integer id;

    @ApiModelProperty("所在地区")
    @Column(columnDefinition = "varchar(100) comment '所在地区'")
    private String area;

    @ApiModelProperty("姓名")
    @Column(columnDefinition = "varchar(100) comment '姓名'")
    private String name;

    @ApiModelProperty("单位及职务")
    @Column(columnDefinition = "varchar(100) comment '单位及职务'")
    private String duties;

    @ApiModelProperty("政治面貌")
    @Column(columnDefinition = "varchar(100) comment '政治面貌'")
    private String political;

    @ApiModelProperty("出生年月")
    @Column(columnDefinition = "varchar(100) comment '出生年月'")
    private String birthday;

    @ApiModelProperty("手机号")
    @Column(columnDefinition = "varchar(100) comment '手机号'")
    private String telephone;

    @ApiModelProperty("擅长领域")
    @Column(columnDefinition = "varchar(100) comment '擅长领域'")
    private String field;

    @ApiModelProperty("备注信息")
    @Column(columnDefinition = "varchar(500) comment '备注信息'")
    private String comments;

    @ApiModelProperty("创建日期（date）")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(columnDefinition = "timeStamp comment '创建日期（date）'")
    private Date registerTime;

    @ApiModelProperty("审核状态（0 待审核，1 通过， 2 不通过）")
    @Column(columnDefinition = "int comment '审核状态（0 待审核，1 通过， 2 不通过）'")
    private Integer state;
}
