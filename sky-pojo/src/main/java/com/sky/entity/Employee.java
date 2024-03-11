package com.sky.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "id",position = 1)
    private Long id;

    @ApiModelProperty(value = "用户名",position = 2)
    private String username;

    @ApiModelProperty(value = "姓名",position = 3)
    private String name;

    @ApiModelProperty(value = "密码",position = 4)
    private String password;

    @ApiModelProperty(value = "手机号",position = 5)
    private String phone;

    @ApiModelProperty(value = "性别",position = 6)
    private String sex;

    @ApiModelProperty(value = "身份证号码",position = 7)
    private String idNumber;

    @ApiModelProperty(value = "状态",position = 8)
    private Integer status;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    private Long createUser;

    private Long updateUser;

}
