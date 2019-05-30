package com.sinosoft.med.mapper;

import com.sinosoft.med.pojo.LLYBDateRange;

public interface LLYBDateRangeMapper {
    int deleteByPrimaryKey(String grpcontno);

    int insert(LLYBDateRange record);

    int insertSelective(LLYBDateRange record);

    LLYBDateRange selectByPrimaryKey(String grpcontno);

    int updateByPrimaryKeySelective(LLYBDateRange record);

    int updateByPrimaryKey(LLYBDateRange record);
}