package com.huawei.hms.activity.internal;

import android.content.Intent;

/* loaded from: classes.dex */
public class BusResponseResult {

    /* renamed from: a */
    private Intent f18707a;

    /* renamed from: b */
    private int f18708b;

    public int getCode() {
        return this.f18708b;
    }

    public Intent getIntent() {
        return this.f18707a;
    }

    public void setCode(int i) {
        this.f18708b = i;
    }

    public void setIntent(Intent intent) {
        this.f18707a = intent;
    }
}
