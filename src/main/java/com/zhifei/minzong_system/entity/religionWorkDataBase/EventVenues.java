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
 * @Date: 2024年03月27日 21:09
 */
@ApiModel("宗教活动场所数据信息对象")
@Data
@Entity
@Table(name = "event_venues")
@TableName(value = "event_venues")
public class EventVenues {

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

    @ApiModelProperty("场所名称")
    @Column(columnDefinition = "varchar(100) comment '场所名称'")
    private String name;

    @ApiModelProperty("地址")
    @Column(columnDefinition = "varchar(100) comment '地址'")
    private String location;

    @ApiModelProperty("场所类别")
    @Column(columnDefinition = "varchar(100) comment '场所类别'")
    private String categories;

    @ApiModelProperty("场所负责人姓名")
    @Column(columnDefinition = "varchar(100) comment '场所负责人姓名'")
    private String leader;

    @ApiModelProperty("场所联系电话")
    @Column(columnDefinition = "varchar(100) comment '场所联系电话'")
    private String telephone;

    @ApiModelProperty("创建日期（date）")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(columnDefinition = "timeStamp comment '创建日期（date）'")
    private Date registerTime;

    @ApiModelProperty("审核状态（0 待审核，1 通过， 2 不通过）")
    @Column(columnDefinition = "int comment '审核状态（0 待审核，1 通过， 2 不通过）'")
    private Integer state;
}
