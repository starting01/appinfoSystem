package com.yqf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author peak
 * @Version 1.0
 *  app版本
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppVersion {

  private Long id;
  private Long appId;
  private String versionNo;
  private String versionInfo;
  private Long publishStatus;
  private String downloadLink;
  private Double versionSize;
  private Long createdBy;
  private Timestamp creationDate;
  private Long modifyBy;
  private Timestamp modifyDate;
  private String apkLocPath;
  private String apkFileName;

}
