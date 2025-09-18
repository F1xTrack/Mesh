package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.td */
/* loaded from: classes2.dex */
public class C3623td {

    /* renamed from: a */
    protected final C3389kd f24819a;

    /* renamed from: b */
    private final C3118a2 f24820b;

    /* renamed from: c */
    private final C3545qd f24821c;

    public C3623td(C3389kd c3389kd) {
        this(c3389kd, new C3118a2());
    }

    /* renamed from: a */
    private C3545qd m16845a() {
        return new C3545qd();
    }

    public C3623td(C3389kd c3389kd, C3118a2 c3118a2) {
        this.f24819a = c3389kd;
        this.f24820b = c3118a2;
        this.f24821c = m16845a();
    }

    /* renamed from: a */
    public C3441md<C2579Ec> m16846a(C3727xd c3727xd, C2579Ec c2579Ec) {
        C3778zc c3778zc = this.f24819a.f23918a;
        Context context = c3778zc.f25415a;
        Looper looperM16706b = c3778zc.f25416b.m16706b();
        C3389kd c3389kd = this.f24819a;
        return new C3441md<>(new C2505Bd(context, looperM16706b, c3389kd.f23919b, this.f24820b.m15597c(c3389kd.f23918a.f25417c), "passive", new C3311hd(c3727xd)), this.f24821c, new C3597sd(), new C3571rd(), c2579Ec);
    }
}
