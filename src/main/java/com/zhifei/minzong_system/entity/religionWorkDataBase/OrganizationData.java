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
 * @Date: 2024年03月27日 21:48
 */
@ApiModel("宗教团体数据信息")
@Data
@Entity
@Table(name = "organization_data")
@TableName(value = "organization_data")
public class OrganizationData {
    @Id
    @ApiModelProperty("ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(value = "id", type = IdType.AUTO)
    @Column(columnDefinition = "bigint comment 'id'")
    private Integer id;

    @ApiModelProperty("所在地区")
    @Column(columnDefinition = "varchar(100) comment '所在地区'")
    private String area;

    @ApiModelProperty("宗教")
    @Column(columnDefinition = "varchar(100) comment '宗教'")
    private String religion;

    @ApiModelProperty("团体名称")
    @Column(columnDefinition = "varchar(100) comment '团体名称'")
    private String name;

    @ApiModelProperty("地址")
    @Column(columnDefinition = "varchar(100) comment '地址'")
    private String location;

    @ApiModelProperty("负责人姓名")
    @Column(columnDefinition = "varchar(100) comment '负责人姓名'")
    private String leader;

    @ApiModelProperty("团体类别")
    @Column(columnDefinition = "varchar(100) comment '团体类别'")
    private String categories;

    @ApiModelProperty("团体人数")
    @Column(columnDefinition = "int comment '团体人数'")
    private Integer number;

    @ApiModelProperty("创建日期（date）")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(columnDefinition = "timeStamp comment '创建日期（date）'")
    private Date registerTime;

    @ApiModelProperty("审核状态（0 待审核，1 通过， 2 不通过）")
    @Column(columnDefinition = "int comment '审核状态（0 待审核，1 通过， 2 不通过）'")
    private Integer state;
}
