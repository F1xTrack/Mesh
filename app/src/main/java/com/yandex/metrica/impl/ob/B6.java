package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;

/* loaded from: classes2.dex */
class B6 {
    private String a;
    private I9 b;
    private A6 c;

    public B6(Context context) {
        this(context.getPackageName(), P0.i().u(), new A6());
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        A6 a6 = this.c;
        String str = this.a;
        boolean zF = this.b.f();
        a6.getClass();
        bundle.putString(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, str);
        bundle.putBoolean("clte", zF);
        return bundle;
    }

    public B6(String str, I9 i9, A6 a6) {
        this.a = str;
        this.b = i9;
        this.c = a6;
    }
}
