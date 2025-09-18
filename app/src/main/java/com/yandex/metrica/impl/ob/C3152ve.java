package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.ve, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3152ve extends AbstractC3052re {
    private static final C3232ye g = new C3232ye("PREF_KEY_OFFSET", null);
    private C3232ye f;

    public C3152ve(Context context, String str) {
        super(context, str);
        this.f = new C3232ye(g.b(), null);
    }

    public long a(int i) {
        return this.b.getLong(this.f.a(), i);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3052re
    public String d() {
        return "_servertimeoffset";
    }

    public void f() {
        a(this.f.a()).b();
    }
}
