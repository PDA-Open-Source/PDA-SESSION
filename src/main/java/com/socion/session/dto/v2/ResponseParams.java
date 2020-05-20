package com.socion.session.dto.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseParams {
    private String resmsgid;
    private String msgid;
    private String err;
    private RegistryResponse.Status status;
    private String errmsg;
    private List<Object> resultList;

    public ResponseParams() {
        this.msgid = UUID.randomUUID().toString();
        this.resmsgid = "";
        this.err = "";
        this.errmsg = "";
        // When there is no error, treat status as success
        this.status = RegistryResponse.Status.SUCCESSFUL;
    }

    public String getResmsgid() {
        return resmsgid;
    }

    public void setResmsgid(String resmsgid) {
        this.resmsgid = resmsgid;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public RegistryResponse.Status getStatus() {
        return status;
    }

    public void setStatus(RegistryResponse.Status status) {
        this.status = status;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public List<Object> getResultList() {
        return resultList;
    }

    public void setResultList(List<Object> resultList) {
        this.resultList = resultList;
    }
}