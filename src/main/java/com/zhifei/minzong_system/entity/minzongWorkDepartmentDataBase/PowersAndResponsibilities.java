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
 * @Date: 2024年03月27日 18:12
 */
@Data
@Entity
@Table(name = "powers_and_responsibilities")
@TableName(value = "powers_and_responsibilities")
@ApiModel("行政权力和责任信息对象")
public class PowersAndResponsibilities {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint comment 'id'")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("权力类别")
    @Column(columnDefinition = "varchar(100) comment '权力类别'")
    private String categories;

    @ApiModelProperty("权力项目名称")
    @Column(columnDefinition = "varchar(100) comment '权力项目名称'")
    private String name;

    @ApiModelProperty("实施依据")
    @Column(columnDefinition = "varchar(100) comment '实施依据'")
    private String basis;

    @ApiModelProperty("责任主体")
    @Column(columnDefinition = "varchar(100) comment '责任主体'")
    private String subject;

    @ApiModelProperty("责任事项")
    @Column(columnDefinition = "varchar(100) comment '责任事项'")
    private String liability;

    @ApiModelProperty("追责情形")
    @Column(columnDefinition = "varchar(100) comment '追责情形'")
    private String accountability;

    @ApiModelProperty("监督电话")
    @Column(columnDefinition = "varchar(100) comment '监督电话'")
    private String telephone;

    @ApiModelProperty("创建日期（date）")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(columnDefinition = "timeStamp comment '创建日期（date）'")
    private Date registerTime;
}
