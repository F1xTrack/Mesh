package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.K0 */
/* loaded from: classes2.dex */
public class C2717K0 {

    /* renamed from: a */
    private final C2794N2 f21566a;

    /* renamed from: b */
    private final C2791N f21567b;

    public C2717K0(Context context) {
        this(new C2794N2(context, "com.yandex.android.appmetrica.build_id"), new C2791N(context, "com.yandex.android.appmetrica.is_offline"));
    }

    /* renamed from: a */
    public String m14455a() {
        return this.f21566a.m16553a();
    }

    /* renamed from: b */
    public Boolean m14456b() {
        return this.f21567b.m16553a();
    }

    public C2717K0(C2794N2 c2794n2, C2791N c2791n) {
        this.f21566a = c2794n2;
        this.f21567b = c2791n;
    }
}
