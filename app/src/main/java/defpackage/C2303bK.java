package defpackage;

import android.content.Context;

/* renamed from: bK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2303bK {
    public final int a;
    public final String b;
    public final C2112aK c;
    public final long d;
    public final long e;
    public final long f;
    public final C3759fN g;
    public final C0084Av0 h;
    public final C0162Bv0 i;
    public final Context j;

    public C2303bK(C6846rT1 c6846rT1) {
        C0084Av0 c0084Av0;
        this.j = (Context) c6846rT1.b;
        if (((C2112aK) c6846rT1.c) == null) {
            c6846rT1.c = new C2112aK(this);
        }
        this.a = 1;
        this.b = "image_cache";
        C2112aK c2112aK = (C2112aK) c6846rT1.c;
        c2112aK.getClass();
        this.c = c2112aK;
        this.d = 41943040L;
        this.e = 10485760L;
        this.f = 2097152L;
        this.g = (C3759fN) c6846rT1.d;
        synchronized (C0084Av0.class) {
            try {
                if (C0084Av0.b == null) {
                    C0084Av0.b = new C0084Av0(0);
                }
                c0084Av0 = C0084Av0.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.h = c0084Av0;
        this.i = C0162Bv0.k();
        C0240Cv0.s0();
    }
}
