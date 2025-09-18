package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.ue, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3127ue extends AbstractC3052re {
    private static final C3232ye h = new C3232ye("SERVICE_API_LEVEL", null);
    private static final C3232ye i = new C3232ye("CLIENT_API_LEVEL", null);
    private C3232ye f;
    private C3232ye g;

    public C3127ue(Context context) {
        super(context, null);
        this.f = new C3232ye(h.b());
        this.g = new C3232ye(i.b());
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3052re
    public String d() {
        return "_migrationpreferences";
    }

    public int f() {
        return this.b.getInt(this.f.a(), -1);
    }

    public C3127ue g() {
        a(this.g.a());
        return this;
    }

    @Deprecated
    public C3127ue h() {
        a(this.f.a());
        return this;
    }
}
