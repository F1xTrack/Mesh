package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;

/* renamed from: com.yandex.metrica.impl.ob.Y */
/* loaded from: classes2.dex */
public class C3065Y {

    /* renamed from: i */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C3065Y f22836i;

    /* renamed from: a */
    private final C2564Dm f22837a;

    /* renamed from: b */
    private final C3636u0 f22838b;

    /* renamed from: c */
    private final C3555qn f22839c;

    /* renamed from: d */
    private final C2743L1 f22840d;

    /* renamed from: e */
    private final C3739y f22841e;

    /* renamed from: f */
    private final C2669I2 f22842f;

    /* renamed from: g */
    private final C3324i0 f22843g;

    /* renamed from: h */
    private final C3713x f22844h;

    private C3065Y() {
        this(new C2564Dm(), new C3739y(), new C3555qn());
    }

    /* renamed from: g */
    public static C3065Y m15442g() {
        if (f22836i == null) {
            synchronized (C3065Y.class) {
                try {
                    if (f22836i == null) {
                        f22836i = new C3065Y(new C2564Dm(), new C3739y(), new C3555qn());
                    }
                } finally {
                }
            }
        }
        return f22836i;
    }

    /* renamed from: a */
    public C3713x m15443a() {
        return this.f22844h;
    }

    /* renamed from: b */
    public C3739y m15444b() {
        return this.f22841e;
    }

    /* renamed from: c */
    public InterfaceExecutorC3607sn m15445c() {
        return this.f22839c.m16637a();
    }

    /* renamed from: d */
    public C3555qn m15446d() {
        return this.f22839c;
    }

    /* renamed from: e */
    public C3324i0 m15447e() {
        return this.f22843g;
    }

    /* renamed from: f */
    public C3636u0 m15448f() {
        return this.f22838b;
    }

    /* renamed from: h */
    public C2564Dm m15449h() {
        return this.f22837a;
    }

    /* renamed from: i */
    public C2743L1 m15450i() {
        return this.f22840d;
    }

    /* renamed from: j */
    public InterfaceC2664Hm m15451j() {
        return this.f22837a;
    }

    /* renamed from: k */
    public C2669I2 m15452k() {
        return this.f22842f;
    }

    private C3065Y(C2564Dm c2564Dm, C3739y c3739y, C3555qn c3555qn) {
        this(c2564Dm, c3739y, c3555qn, new C3713x(c3739y, c3555qn.m16637a()));
    }

    private C3065Y(C2564Dm c2564Dm, C3739y c3739y, C3555qn c3555qn, C3713x c3713x) {
        this(c2564Dm, new C3636u0(), c3555qn, c3713x, new C2743L1(c2564Dm), c3739y, new C2669I2(c3739y, c3555qn.m16637a(), c3713x), new C3324i0(c3739y));
    }

    public C3065Y(C2564Dm c2564Dm, C3636u0 c3636u0, C3555qn c3555qn, C3713x c3713x, C2743L1 c2743l1, C3739y c3739y, C2669I2 c2669i2, C3324i0 c3324i0) {
        this.f22837a = c2564Dm;
        this.f22838b = c3636u0;
        this.f22839c = c3555qn;
        this.f22844h = c3713x;
        this.f22840d = c2743l1;
        this.f22841e = c3739y;
        this.f22842f = c2669i2;
        this.f22843g = c3324i0;
    }
}
