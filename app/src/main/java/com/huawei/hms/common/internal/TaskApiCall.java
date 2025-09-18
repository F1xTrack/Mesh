package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;
import p000.AbstractC0870Np;
import p000.T81;

/* loaded from: classes.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {

    /* renamed from: a */
    private final String f18972a;

    /* renamed from: b */
    private final String f18973b;

    /* renamed from: c */
    private Parcelable f18974c;

    /* renamed from: d */
    private String f18975d;

    /* renamed from: e */
    private AbstractC0870Np f18976e;

    /* renamed from: f */
    private int f18977f;

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.f18977f = 1;
        this.f18972a = str;
        this.f18973b = str2;
        this.f18974c = null;
        this.f18975d = null;
    }

    public abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, T81 t81);

    public int getApiLevel() {
        return this.f18977f;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.f18974c;
    }

    public String getRequestJson() {
        return this.f18973b;
    }

    public AbstractC0870Np getToken() {
        return null;
    }

    public String getTransactionId() {
        return this.f18975d;
    }

    public String getUri() {
        return this.f18972a;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, T81 t81) {
        HMSLog.m12622i("TaskApiCall", "doExecute, uri:" + this.f18972a + ", errorCode:" + responseErrorCode.getErrorCode() + ", transactionId:" + this.f18975d);
        doExecute(clientt, responseErrorCode, str, t81);
    }

    public void setApiLevel(int i) {
        this.f18977f = i;
    }

    public void setParcelable(Parcelable parcelable) {
        this.f18974c = parcelable;
    }

    public void setTransactionId(String str) {
        this.f18975d = str;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.f18977f = 1;
        this.f18972a = str;
        this.f18973b = str2;
        this.f18974c = null;
        this.f18975d = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i) {
        this.f18972a = str;
        this.f18973b = str2;
        this.f18974c = null;
        this.f18975d = str3;
        this.f18977f = i;
    }

    public void setToken(AbstractC0870Np abstractC0870Np) {
    }
}
