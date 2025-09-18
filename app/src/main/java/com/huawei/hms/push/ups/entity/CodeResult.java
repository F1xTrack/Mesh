package com.huawei.hms.push.ups.entity;

/* loaded from: classes.dex */
public class CodeResult {

    /* renamed from: a */
    private int f19481a;

    /* renamed from: b */
    private String f19482b;

    public CodeResult() {
    }

    public String getReason() {
        return this.f19482b;
    }

    public int getReturnCode() {
        return this.f19481a;
    }

    public void setReason(String str) {
        this.f19482b = str;
    }

    public void setReturnCode(int i) {
        this.f19481a = i;
    }

    public CodeResult(int i) {
        this.f19481a = i;
    }

    public CodeResult(int i, String str) {
        this.f19481a = i;
        this.f19482b = str;
    }
}
