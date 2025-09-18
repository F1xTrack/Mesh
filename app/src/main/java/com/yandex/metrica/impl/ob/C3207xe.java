package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.xe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3207xe extends AbstractC3052re {
    private C3232ye f;

    public C3207xe(Context context, String str) {
        super(context, null);
        this.f = new C3232ye("LOCATION_TRACKING_ENABLED");
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3052re
    public String d() {
        return "_serviceproviderspreferences";
    }

    public boolean f() {
        return this.b.getBoolean(this.f.a(), false);
    }

    public void g() {
        a(this.f.a()).b();
    }
}
