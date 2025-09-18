package p000;

import android.content.Context;

/* renamed from: bK */
/* loaded from: classes.dex */
public final class C1778bK {

    /* renamed from: a */
    public final int f16972a;

    /* renamed from: b */
    public final String f16973b;

    /* renamed from: c */
    public final C1657aK f16974c;

    /* renamed from: d */
    public final long f16975d;

    /* renamed from: e */
    public final long f16976e;

    /* renamed from: f */
    public final long f16977f;

    /* renamed from: g */
    public final C4049fN f16978g;

    /* renamed from: h */
    public final C7356Av0 f16979h;

    /* renamed from: i */
    public final C7408Bv0 f16980i;

    /* renamed from: j */
    public final Context f16981j;

    public C1778bK(C10910rT1 c10910rT1) {
        C7356Av0 c7356Av0;
        this.f16981j = (Context) c10910rT1.f41678b;
        if (((C1657aK) c10910rT1.f41679c) == null) {
            c10910rT1.f41679c = new C1657aK(this);
        }
        this.f16972a = 1;
        this.f16973b = "image_cache";
        C1657aK c1657aK = (C1657aK) c10910rT1.f41679c;
        c1657aK.getClass();
        this.f16974c = c1657aK;
        this.f16975d = 41943040L;
        this.f16976e = 10485760L;
        this.f16977f = 2097152L;
        this.f16978g = (C4049fN) c10910rT1.f41680d;
        synchronized (C7356Av0.class) {
            try {
                if (C7356Av0.f462b == null) {
                    C7356Av0.f462b = new C7356Av0(0);
                }
                c7356Av0 = C7356Av0.f462b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16979h = c7356Av0;
        this.f16980i = C7408Bv0.m902k();
        C7460Cv0.m1461s0();
    }
}
