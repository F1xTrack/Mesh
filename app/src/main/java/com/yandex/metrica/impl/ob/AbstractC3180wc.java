package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.wc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3180wc {
    protected final I9 a;
    protected final C2877kd b;
    protected final C2617a2 c;
    private final Oc d;
    private final C3100tc e;
    private final C3125uc f;

    public AbstractC3180wc(C2877kd c2877kd, I9 i9, C2617a2 c2617a2) {
        this.b = c2877kd;
        this.a = i9;
        this.c = c2617a2;
        Oc ocA = a();
        this.d = ocA;
        this.e = new C3100tc(ocA, c());
        this.f = new C3125uc(c2877kd.a.b);
    }

    public abstract Oc a();

    public abstract InterfaceC2779ge a(C2754fe c2754fe);

    public C2927md<Ec> a(C3206xd c3206xd, Ec ec) {
        C3255zc c3255zc = this.b.a;
        Context context = c3255zc.a;
        Looper looperB = c3255zc.b.b();
        C2877kd c2877kd = this.b;
        return new C2927md<>(new Bd(context, looperB, c2877kd.b, a(c2877kd.a.c), b(), new C2803hd(c3206xd)), this.e, new C3150vc(this.d, new Nm()), this.f, ec);
    }

    public abstract String b();

    public abstract String c();
}
