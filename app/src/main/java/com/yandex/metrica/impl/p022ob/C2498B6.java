package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Bundle;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;

/* renamed from: com.yandex.metrica.impl.ob.B6 */
/* loaded from: classes2.dex */
class C2498B6 {

    /* renamed from: a */
    private String f20919a;

    /* renamed from: b */
    private C2676I9 f20920b;

    /* renamed from: c */
    private C2473A6 f20921c;

    public C2498B6(Context context) {
        this(context.getPackageName(), C2842P0.m14728i().m14750u(), new C2473A6());
    }

    /* renamed from: a */
    public Bundle m13921a() {
        Bundle bundle = new Bundle();
        C2473A6 c2473a6 = this.f20921c;
        String str = this.f20919a;
        boolean zM14326f = this.f20920b.m14326f();
        c2473a6.getClass();
        bundle.putString(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, str);
        bundle.putBoolean("clte", zM14326f);
        return bundle;
    }

    public C2498B6(String str, C2676I9 c2676i9, C2473A6 c2473a6) {
        this.f20919a = str;
        this.f20920b = c2676i9;
        this.f20921c = c2473a6;
    }
}
