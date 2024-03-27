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
 * @Date: 2024年03月27日 17:50
 */
@ApiModel("民宗宗教政策法规解读对象")
@Data
@Entity
@Table(name = "statue_interpretation")
@TableName("statue_interpretation")
public class StatuteInterpretation {
    @Id
    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint comment 'id'")
    private Integer id;

    @ApiModelProperty("政策法规名称")
    @Column(columnDefinition = "varchar(100) comment '政策法规名称'")
    private String name;

    @ApiModelProperty("适用领域")
    @Column(columnDefinition = "varchar(100) comment '适用领域'")
    private String field;

    @ApiModelProperty("解读范围")
    @Column(columnDefinition = "varchar(100) comment '解读范围'")
    private String interpretationField;

    @ApiModelProperty("解读单位/人")
    @Column(columnDefinition = "varchar(100) comment '解读单位/人'")
    private String interpretation;

    @ApiModelProperty("创建日期（date）")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(columnDefinition = "timeStamp comment '创建日期（date）'")
    private Date registerTime;
}
