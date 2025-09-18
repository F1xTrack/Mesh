package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Cg extends Q5 {
    public final C4567g5 b;
    public final Bg c;
    public final T3 d;

    public Cg(C4567g5 c4567g5, Bg bg) {
        this(c4567g5, bg, new T3());
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Eg load(P5 p5) {
        Eg eg = (Eg) super.load(p5);
        eg.n = ((C5032zg) p5.componentArguments).a;
        eg.s = this.b.v.a();
        eg.x = this.b.s.a();
        C5032zg c5032zg = (C5032zg) p5.componentArguments;
        eg.d = c5032zg.c;
        eg.e = c5032zg.b;
        eg.f = c5032zg.d;
        eg.g = c5032zg.e;
        eg.j = c5032zg.f;
        eg.h = c5032zg.g;
        eg.i = c5032zg.h;
        Boolean boolValueOf = Boolean.valueOf(c5032zg.i);
        Bg bg = this.c;
        eg.k = boolValueOf;
        eg.l = bg;
        C5032zg c5032zg2 = (C5032zg) p5.componentArguments;
        eg.w = c5032zg2.k;
        C4583gl c4583gl = p5.a;
        C5020z4 c5020z4 = c4583gl.n;
        eg.o = c5020z4.a;
        Pd pd = c4583gl.s;
        if (pd != null) {
            eg.t = pd.a;
            eg.u = pd.b;
        }
        eg.p = c5020z4.b;
        eg.r = c4583gl.e;
        eg.q = c4583gl.k;
        T3 t3 = this.d;
        Map<String, String> map = c5032zg2.j;
        Q3 q3D = C4667ka.C.d();
        t3.getClass();
        eg.v = T3.a(map, c4583gl, q3D);
        return eg;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new Eg(this.b);
    }

    public Cg(C4567g5 c4567g5, Bg bg, T3 t3) {
        super(c4567g5.getContext(), c4567g5.b().c());
        this.b = c4567g5;
        this.c = bg;
        this.d = t3;
    }

    public final Eg a() {
        return new Eg(this.b);
    }
}
