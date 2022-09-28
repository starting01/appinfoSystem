package com.yqf.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author peak
 * @Version 1.0
 *  app信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppInfo {

  private Long id;
  private String softwareName;
  private String APKName;
  private String supportRom;
  private String interfaceLanguage;
  private Double softwareSize;
  private java.sql.Date updateDate;
  private Long devId;
  private String appInfo;
  private Long status;
  private java.sql.Timestamp onSaleDate;
  private java.sql.Timestamp offSaleDate;
  private Long flatformId;
  private Long categoryLevel3;
  private Long downloads;
  private Long createdBy;
  private Timestamp creationDate;
  private Long modifyBy;
  private Timestamp modifyDate;
  private Long categoryLevel1;
  private Long categoryLevel2;
  private String logoPicPath;
  private String logoLocPath;

  private String versionId;
  private String categoryLevel1Name;
  private String categoryLevel2Name;
  private String categoryLevel3Name;
  private String flatformName;
  private String versionNo;
  private String statusName;



}
