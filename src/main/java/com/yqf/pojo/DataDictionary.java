package com.yqf.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataDictionary {

  private Long id;
  private String typeCode;
  private String typeName;
  private Long valueId;
  private String valueName;
  private Long createdBy;
  private Timestamp creationDate;
  private Long modifyBy;
  private Timestamp modifyDate;

}
