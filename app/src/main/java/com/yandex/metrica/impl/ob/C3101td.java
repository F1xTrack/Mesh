package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.td, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3101td {
    protected final C2877kd a;
    private final C2617a2 b;
    private final C3027qd c;

    public C3101td(C2877kd c2877kd) {
        this(c2877kd, new C2617a2());
    }

    private C3027qd a() {
        return new C3027qd();
    }

    public C3101td(C2877kd c2877kd, C2617a2 c2617a2) {
        this.a = c2877kd;
        this.b = c2617a2;
        this.c = a();
    }

    public C2927md<Ec> a(C3206xd c3206xd, Ec ec) {
        C3255zc c3255zc = this.a.a;
        Context context = c3255zc.a;
        Looper looperB = c3255zc.b.b();
        C2877kd c2877kd = this.a;
        return new C2927md<>(new Bd(context, looperB, c2877kd.b, this.b.c(c2877kd.a.c), "passive", new C2803hd(c3206xd)), this.c, new C3076sd(), new C3051rd(), ec);
    }
}
