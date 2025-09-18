package p000;

import java.io.IOException;

/* renamed from: VU */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1352VU implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f12591a;

    /* renamed from: b */
    public final /* synthetic */ C1415WU f12592b;

    public /* synthetic */ RunnableC1352VU(C1415WU c1415wu, int i) {
        this.f12591a = i;
        this.f12592b = c1415wu;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        C6313ke c6313keM2287I;
        C6313ke c6313keM8794i;
        switch (this.f12591a) {
            case 0:
                this.f12592b.m8787b();
                return;
            case 1:
                this.f12592b.m8787b();
                return;
            default:
                C1415WU c1415wu = this.f12592b;
                c1415wu.getClass();
                synchronized (C1415WU.f13201m) {
                    try {
                        C0786MU c0786mu = c1415wu.f13202a;
                        c0786mu.m5379a();
                        CC0 cc0M1004H0 = CC0.m1004H0(c0786mu.f7174a);
                        try {
                            c6313keM2287I = c1415wu.f13204c.m2287I();
                            if (cc0M1004H0 != null) {
                                cc0M1004H0.m1085k1();
                            }
                        } catch (Throwable th) {
                            if (cc0M1004H0 != null) {
                                cc0M1004H0.m1085k1();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = c6313keM2287I.f36583b;
                    if (i == 5) {
                        c6313keM8794i = c1415wu.m8794i(c6313keM2287I);
                    } else {
                        if (i == 3) {
                            c6313keM8794i = c1415wu.m8794i(c6313keM2287I);
                        } else if (!c1415wu.f13205d.m3550a(c6313keM2287I)) {
                            return;
                        } else {
                            c6313keM8794i = c1415wu.m8788c(c6313keM2287I);
                        }
                    }
                    c1415wu.m8791f(c6313keM8794i);
                    c1415wu.m8798m(c6313keM2287I, c6313keM8794i);
                    if (c6313keM8794i.f36583b == 4) {
                        c1415wu.m8797l(c6313keM8794i.f36582a);
                    }
                    int i2 = c6313keM8794i.f36583b;
                    if (i2 == 5) {
                        c1415wu.m8795j(new C1541YU());
                        return;
                    } else if (i2 == 2 || i2 == 1) {
                        c1415wu.m8795j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        c1415wu.m8796k(c6313keM8794i);
                        return;
                    }
                } catch (C1541YU e) {
                    c1415wu.m8795j(e);
                    return;
                }
        }
    }
}
