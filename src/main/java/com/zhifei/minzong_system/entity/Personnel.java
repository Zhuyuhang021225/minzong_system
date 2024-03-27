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
 * @Date: 2024年03月22日 11:02
 */
@ApiModel("民宗人员信息对象")
@Data
@Entity
@Table(name = "personnel")
@TableName("personnel")
public class Personnel {

    @Id
    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint comment 'id'")
    private Integer id;

    @ApiModelProperty("所在地区")
    @Column(columnDefinition = "varchar(100) comment '所在地区'")
    private String area;

    @ApiModelProperty("机构名称")
    @Column(columnDefinition = "varchar(100) comment '机构名称'")
    private String institutionName;

    @ApiModelProperty("内设机构名称")
    @Column(columnDefinition = "varchar(100) comment '内设机构名称'")
    private String innerInstitutionName;

    @ApiModelProperty("姓名")
    @Column(columnDefinition = "varchar(100) comment '姓名'")
    private String name;

    @ApiModelProperty("职务")
    @Column(columnDefinition = "varchar(100) comment '职务'")
    private String duties;

    @ApiModelProperty("编制")
    @Column(columnDefinition = "varchar(100) comment '编制'")
    private String weave;

    @ApiModelProperty("座机号")
    @Column(columnDefinition = "varchar(100) comment '座机号'")
    private String landline;

    @ApiModelProperty("手机号")
    @Column(columnDefinition = "varchar(100) comment '手机号'")
    private String telephone;

    @ApiModelProperty("学历")
    @Column(columnDefinition = "varchar(100) comment '学历'")
    private String degree;

    @ApiModelProperty("政治面貌")
    @Column(columnDefinition = "varchar(100) comment '政治面貌'")
    private String politicalOutlook;

    @ApiModelProperty("创建日期（yyyy-MM-dd HH:mm:ss）")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(columnDefinition = "timeStamp comment '创建日期（yyyy-MM-dd HH:mm:ss）'")
    private Date registerTime;

    @ApiModelProperty("审核状态（0 待审核，1 通过， 2 不通过）")
    @Column(columnDefinition = "int comment '审核状态（0 待审核，1 通过， 2 不通过）'")
    private Integer state;
}
