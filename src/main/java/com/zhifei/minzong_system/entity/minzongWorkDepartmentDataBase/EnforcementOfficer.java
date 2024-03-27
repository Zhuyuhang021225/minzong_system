package com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase;

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
 * @Date: 2024年03月27日 20:46
 */
@ApiModel("民宗行政执法人员信息对象")
@Data
@Entity
@Table(name = "enforcement_officer")
@TableName(value = "enforcement_officer")
public class EnforcementOfficer {

    @Id
    @ApiModelProperty("ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(value = "id", type = IdType.AUTO)
    @Column(columnDefinition = "bigint comment 'id'")
    private Integer id;

    @ApiModelProperty("姓名")
    @Column(columnDefinition = "varchar(100) comment '姓名'")
    private String name;

    @ApiModelProperty("所属主体名称")
    @Column(columnDefinition = "varchar(100) comment '所属主体名称'")
    private String subjectName;

    @ApiModelProperty("性别")
    @Column(columnDefinition = "varchar(100) comment '性别'")
    private String gender;

    @ApiModelProperty("出生日期")
    @Column(columnDefinition = "varchar(100) comment '出生日期'")
    private String birthday;

    @ApiModelProperty("政治面貌")
    @Column(columnDefinition = "varchar(100) comment '政治面貌'")
    private String political;

    @ApiModelProperty("职级")
    @Column(columnDefinition = "varchar(100) comment '职级'")
    private String level;

    @ApiModelProperty("民族")
    @Column(columnDefinition = "varchar(100) comment '政治面貌'")
    private String national;

    @ApiModelProperty("最高学历")
    @Column(columnDefinition = "varchar(100) comment '最高学历'")
    private String degree;


    @ApiModelProperty("是否具有法律职业资格（0 否，1 是）")
    @Column(columnDefinition = "int comment '是否具有法律职业资格（0 否，1 是）'")
    private Integer isQualification;


    @ApiModelProperty("是否公开（0 否，1 是）")
    @Column(columnDefinition = "int comment '是否公开（0 否，1 是）'")
    private Integer isPublic;


    @ApiModelProperty("审核状态（0 待审核，1 通过， 2 不通过）")
    @Column(columnDefinition = "int comment '审核状态（0 待审核，1 通过， 2 不通过）'")
    private Integer state;
}
