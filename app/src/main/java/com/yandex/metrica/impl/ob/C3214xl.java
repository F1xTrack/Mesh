package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.xl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3214xl {
    private final InterfaceC3035ql a;
    private final Bl b;

    public C3214xl(InterfaceC3035ql interfaceC3035ql, Bl bl) {
        this.a = interfaceC3035ql;
        this.b = bl;
    }

    public boolean a(Activity activity, C2662bm c2662bm) {
        Bundle bundleA = this.a.a(activity);
        return this.b.a(bundleA == null ? null : bundleA.getString("yandex:ads:context"), c2662bm);
    }
}
