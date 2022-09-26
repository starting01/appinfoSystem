package com.yqf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author peak
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DevUser {
    private BigInteger id;
    private String devCode;
    private String devName;
    private String devPassword;
    private String devEmail;
    private String devInfo;
    private BigInteger createdBy;
    private Date creationDate;
    private BigInteger modifyBy;
    private Date modifyDate;
}
