package com.yandex.metrica.impl.ob;

import android.content.Context;
import defpackage.AbstractC1705Vq;

/* renamed from: com.yandex.metrica.impl.ob.bb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2651bb {
    private final Context a;
    private final String b;
    private final InterfaceC2676cb c;
    private final InterfaceC2616a1 d;
    private final Om e;
    private final R2 f;

    public C2651bb(Context context, String str, InterfaceC2676cb interfaceC2676cb, InterfaceC2616a1 interfaceC2616a1) {
        this(context, str, interfaceC2676cb, interfaceC2616a1, new Nm(), new R2());
    }

    public boolean a(Wa wa) {
        long jB = this.e.b();
        if (wa == null) {
            return false;
        }
        boolean z = true;
        boolean z2 = jB <= wa.a;
        if (!z2) {
            z = z2;
        } else if (this.d.a() + jB > wa.a) {
            z = false;
        }
        if (z) {
            return this.f.b(this.c.a(new D9(Qa.a(this.a).g())), wa.b, AbstractC1705Vq.l(new StringBuilder(), this.b, " diagnostics event"));
        }
        return false;
    }

    public C2651bb(Context context, String str, InterfaceC2676cb interfaceC2676cb, InterfaceC2616a1 interfaceC2616a1, Om om, R2 r2) {
        this.a = context;
        this.b = str;
        this.c = interfaceC2676cb;
        this.d = interfaceC2616a1;
        this.e = om;
        this.f = r2;
    }
}
