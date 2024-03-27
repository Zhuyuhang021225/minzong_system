package com.zhifei.minzong_system.entity.religionWorkDataBase;

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
 * @Date: 2024年03月27日 22:01
 */
@ApiModel("宗教教职人员数据信息")
@Data
@Entity
@Table(name = "faculty")
@TableName(value = "faculty")
public class Faculty {
    @Id
    @ApiModelProperty("ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(value = "id", type = IdType.AUTO)
    @Column(columnDefinition = "bigint comment 'id'")
    private Integer id;

    @ApiModelProperty("姓名")
    @Column(columnDefinition = "varchar(100) comment '姓名'")
    private String name;

    @ApiModelProperty("性别")
    @Column(columnDefinition = "varchar(100) comment '性别'")
    private String gender;

    @ApiModelProperty("民族")
    @Column(columnDefinition = "varchar(100) comment '民族'")
    private String national;

    @ApiModelProperty("政治身份")
    @Column(columnDefinition = "varchar(100) comment '政治身份'")
    private String political;

    @ApiModelProperty("教职身份")
    @Column(columnDefinition = "varchar(100) comment '教职身份'")
    private String facultyStatus;

    @ApiModelProperty("宗教称谓")
    @Column(columnDefinition = "varchar(100) comment '宗教称谓'")
    private String ReligionAppellation;

    @ApiModelProperty("宗教")
    @Column(columnDefinition = "varchar(100) comment '宗教'")
    private String religion;

    @ApiModelProperty("派别")
    @Column(columnDefinition = "varchar(100) comment '派别'")
    private String faction;

    @ApiModelProperty("所在地区")
    @Column(columnDefinition = "varchar(100) comment '所在地区'")
    private String area;

    @ApiModelProperty("乡镇（街道）")
    @Column(columnDefinition = "varchar(100) comment '乡镇（街道）'")
    private String town;

    @ApiModelProperty("是否购买社保（0 否，1 是）")
    @Column(columnDefinition = "int comment '是否购买社保（0 否，1 是）'")
    private Integer hasSocialSecurity;

    @ApiModelProperty("是否购买医保（0 否，1 是）")
    @Column(columnDefinition = "int comment '是否购买医保（0 否，1 是）'")
    private Integer hasHealthCare;

    @ApiModelProperty("创建日期（date）")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(columnDefinition = "timeStamp comment '创建日期（date）'")
    private Date registerTime;

    @ApiModelProperty("审核状态（0 待审核，1 通过， 2 不通过）")
    @Column(columnDefinition = "int comment '审核状态（0 待审核，1 通过， 2 不通过）'")
    private Integer state;
}
