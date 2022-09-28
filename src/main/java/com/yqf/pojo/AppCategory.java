package com.sample;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppCategory {

  private Long id;
  private String categoryCode;
  private String categoryName;
  private Long parentId;
  private Long createdBy;
  private Timestamp creationTime;
  private Long modifyBy;
  private Timestamp modifyDate;

}
