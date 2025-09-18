package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.xl */
/* loaded from: classes2.dex */
class C3735xl {

    /* renamed from: a */
    private final InterfaceC3553ql f25258a;

    /* renamed from: b */
    private final InterfaceC2513Bl f25259b;

    public C3735xl(InterfaceC3553ql interfaceC3553ql, InterfaceC2513Bl interfaceC2513Bl) {
        this.f25258a = interfaceC3553ql;
        this.f25259b = interfaceC2513Bl;
    }

    /* renamed from: a */
    public boolean m17195a(Activity activity, C3164bm c3164bm) {
        Bundle bundleMo14011a = this.f25258a.mo14011a(activity);
        return this.f25259b.mo13937a(bundleMo14011a == null ? null : bundleMo14011a.getString("yandex:ads:context"), c3164bm);
    }
}
