package com.sinosoft.med.pojo;

import java.io.Serializable;
import java.util.Date;

public class LLYBDateRange implements Serializable {
    private String grpcontno;

    private Date injurystartdate;

    private Date injuryenddate;

    private Date accstartdate;

    private Date accenddate;

    private Date feestartdate;

    private Date feeenddate;

    private Date balancestartdate;

    private Date balanceenddate;

    private Date makedate;

    private String maketime;

    private Date modifydate;

    private String modifytime;

    private String mngcom;

    private String operator;

    private static final long serialVersionUID = 1L;

    public String getGrpcontno() {
        return grpcontno;
    }

    public void setGrpcontno(String grpcontno) {
        this.grpcontno = grpcontno == null ? null : grpcontno.trim();
    }

    public Date getInjurystartdate() {
        return injurystartdate;
    }

    public void setInjurystartdate(Date injurystartdate) {
        this.injurystartdate = injurystartdate;
    }

    public Date getInjuryenddate() {
        return injuryenddate;
    }

    public void setInjuryenddate(Date injuryenddate) {
        this.injuryenddate = injuryenddate;
    }

    public Date getAccstartdate() {
        return accstartdate;
    }

    public void setAccstartdate(Date accstartdate) {
        this.accstartdate = accstartdate;
    }

    public Date getAccenddate() {
        return accenddate;
    }

    public void setAccenddate(Date accenddate) {
        this.accenddate = accenddate;
    }

    public Date getFeestartdate() {
        return feestartdate;
    }

    public void setFeestartdate(Date feestartdate) {
        this.feestartdate = feestartdate;
    }

    public Date getFeeenddate() {
        return feeenddate;
    }

    public void setFeeenddate(Date feeenddate) {
        this.feeenddate = feeenddate;
    }

    public Date getBalancestartdate() {
        return balancestartdate;
    }

    public void setBalancestartdate(Date balancestartdate) {
        this.balancestartdate = balancestartdate;
    }

    public Date getBalanceenddate() {
        return balanceenddate;
    }

    public void setBalanceenddate(Date balanceenddate) {
        this.balanceenddate = balanceenddate;
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public String getMaketime() {
        return maketime;
    }

    public void setMaketime(String maketime) {
        this.maketime = maketime == null ? null : maketime.trim();
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime == null ? null : modifytime.trim();
    }

    public String getMngcom() {
        return mngcom;
    }

    public void setMngcom(String mngcom) {
        this.mngcom = mngcom == null ? null : mngcom.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}