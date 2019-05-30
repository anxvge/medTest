package com.sinosoft.med.service.impl;

import com.sinosoft.med.mapper.LLTest2Mapper;
import com.sinosoft.med.service.TestConnectOracleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestConnectOracleImp implements TestConnectOracleService {

    @Autowired
    private LLTest2Mapper mapper;

    public int querySth(){
        return mapper.getNum();
    }
}
