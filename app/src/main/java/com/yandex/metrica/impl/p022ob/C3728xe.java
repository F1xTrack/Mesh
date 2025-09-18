package com.yandex.metrica.impl.p022ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.xe */
/* loaded from: classes2.dex */
public class C3728xe extends AbstractC3572re {

    /* renamed from: f */
    private C3754ye f25248f;

    public C3728xe(Context context, String str) {
        super(context, null);
        this.f25248f = new C3754ye("LOCATION_TRACKING_ENABLED");
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3572re
    /* renamed from: d */
    public String mo16612d() {
        return "_serviceproviderspreferences";
    }

    /* renamed from: f */
    public boolean m17180f() {
        return this.f24614b.getBoolean(this.f25248f.m17234a(), false);
    }

    /* renamed from: g */
    public void m17181g() {
        m16688a(this.f25248f.m17234a()).m16690b();
    }
}
