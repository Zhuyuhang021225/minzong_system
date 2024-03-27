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
 * @Date: 2024年03月27日 21:29
 */
@ApiModel("宗教活动场所财务信息对象")
@Data
@Entity
@Table(name = "venues_fiance")
@TableName(value = "venues_fiance")
public class VenuesFiance {
    @Id
    @ApiModelProperty("ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(value = "id", type = IdType.AUTO)
    @Column(columnDefinition = "bigint comment 'id'")
    private Integer id;

    @ApiModelProperty("所在地区")
    @Column(columnDefinition = "varchar(100) comment '所在地区'")
    private String area;

    @ApiModelProperty("乡镇（街道）")
    @Column(columnDefinition = "varchar(100) comment '乡镇（街道）'")
    private String town;

    @ApiModelProperty("宗教")
    @Column(columnDefinition = "varchar(100) comment '宗教'")
    private String religion;

    @ApiModelProperty("教派")
    @Column(columnDefinition = "varchar(100) comment '教派'")
    private String sect;

    @ApiModelProperty("派别")
    @Column(columnDefinition = "varchar(100) comment '派别'")
    private String faction;

    @ApiModelProperty("宗教活动场所名称")
    @Column(columnDefinition = "varchar(100) comment '宗教活动场所名称'")
    private String name;

    @ApiModelProperty("财务是否审计（0 否，1 是）")
    @Column(columnDefinition = "int comment '财务是否审计（0 否，1 是）'")
    private Integer isAudit;


    @ApiModelProperty("是否公开（0 否，1 是）")
    @Column(columnDefinition = "int comment '是否公开（0 否，1 是）'")
    private Integer isPublic;

    @ApiModelProperty("是否纳税（0 否，1 是）")
    @Column(columnDefinition = "int comment '是否纳税（0 否，1 是）'")
    private Integer isTaxes;


    @ApiModelProperty("是否有财务制度（0 否，1 是）")
    @Column(columnDefinition = "int comment '是否有财务制度（0 否，1 是）'")
    private Integer hasSystem;

    @ApiModelProperty("是否具有专业会计资质（0 否，1 是）")
    @Column(columnDefinition = "int comment '是否具有专业会计资质（0 否，1 是）'")
    private Integer hasQualification;

    @ApiModelProperty("是否设立银行账户（0 否，1 是）")
    @Column(columnDefinition = "int comment '是否设立银行账户（0 否，1 是）'")
    private Integer hasBankAccount;

    @ApiModelProperty("创建日期（date）")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(columnDefinition = "timeStamp comment '创建日期（date）'")
    private Date registerTime;

    @ApiModelProperty("审核状态（0 待审核，1 通过， 2 不通过）")
    @Column(columnDefinition = "int comment '审核状态（0 待审核，1 通过， 2 不通过）'")
    private Integer state;
}
