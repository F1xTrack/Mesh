package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class BundleResult {

    /* renamed from: a */
    private int f19517a;

    /* renamed from: b */
    private Bundle f19518b;

    public BundleResult(int i, Bundle bundle) {
        this.f19517a = i;
        this.f19518b = bundle;
    }

    public int getResultCode() {
        return this.f19517a;
    }

    public Bundle getRspBody() {
        return this.f19518b;
    }

    public void setResultCode(int i) {
        this.f19517a = i;
    }

    public void setRspBody(Bundle bundle) {
        this.f19518b = bundle;
    }
}
