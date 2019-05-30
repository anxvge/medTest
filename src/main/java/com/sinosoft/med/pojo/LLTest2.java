package com.sinosoft.med.pojo;

import java.io.Serializable;

public class LLTest2 implements Serializable {
    private String grpcontno;

    private static final long serialVersionUID = 1L;

    public String getGrpcontno() {
        return grpcontno;
    }

    public void setGrpcontno(String grpcontno) {
        this.grpcontno = grpcontno == null ? null : grpcontno.trim();
    }
}