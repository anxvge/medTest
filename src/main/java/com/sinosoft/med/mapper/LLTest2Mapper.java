package com.sinosoft.med.mapper;

import com.sinosoft.med.pojo.LLTest2;

public interface LLTest2Mapper {
    int insert(LLTest2 record);

    int insertSelective(LLTest2 record);

    int getNum();
}