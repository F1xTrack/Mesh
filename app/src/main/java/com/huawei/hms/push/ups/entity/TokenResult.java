package com.huawei.hms.push.ups.entity;

/* loaded from: classes.dex */
public class TokenResult extends CodeResult {

    /* renamed from: c */
    private String f19483c;

    public TokenResult() {
    }

    public String getToken() {
        return this.f19483c;
    }

    public void setToken(String str) {
        this.f19483c = str;
    }

    public TokenResult(int i) {
        super(i);
    }

    public TokenResult(int i, String str) {
        super(i, str);
    }

    public TokenResult(String str) {
        this.f19483c = str;
    }
}
