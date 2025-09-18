package com.huawei.hms.push;

import com.huawei.hms.aaid.constant.ErrorEnum;

/* loaded from: classes.dex */
public class BaseException extends Exception {

    /* renamed from: a */
    private final int f19353a;

    /* renamed from: b */
    private final ErrorEnum f19354b;

    public BaseException(int i) {
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(i);
        this.f19354b = errorEnumFromCode;
        this.f19353a = errorEnumFromCode.getExternalCode();
    }

    public int getErrorCode() {
        return this.f19353a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f19354b.getMessage();
    }
}
