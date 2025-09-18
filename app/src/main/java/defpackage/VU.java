package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class VU implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WU b;

    public /* synthetic */ VU(WU wu, int i) {
        this.a = i;
        this.b = wu;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        C5541ke c5541keI;
        C5541ke c5541keI2;
        switch (this.a) {
            case 0:
                this.b.b();
                return;
            case 1:
                this.b.b();
                return;
            default:
                WU wu = this.b;
                wu.getClass();
                synchronized (WU.m) {
                    try {
                        MU mu = wu.a;
                        mu.a();
                        CC0 cc0H0 = CC0.H0(mu.a);
                        try {
                            c5541keI = wu.c.I();
                            if (cc0H0 != null) {
                                cc0H0.k1();
                            }
                        } catch (Throwable th) {
                            if (cc0H0 != null) {
                                cc0H0.k1();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = c5541keI.b;
                    if (i == 5) {
                        c5541keI2 = wu.i(c5541keI);
                    } else {
                        if (i == 3) {
                            c5541keI2 = wu.i(c5541keI);
                        } else if (!wu.d.a(c5541keI)) {
                            return;
                        } else {
                            c5541keI2 = wu.c(c5541keI);
                        }
                    }
                    wu.f(c5541keI2);
                    wu.m(c5541keI, c5541keI2);
                    if (c5541keI2.b == 4) {
                        wu.l(c5541keI2.a);
                    }
                    int i2 = c5541keI2.b;
                    if (i2 == 5) {
                        wu.j(new YU());
                        return;
                    } else if (i2 == 2 || i2 == 1) {
                        wu.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        wu.k(c5541keI2);
                        return;
                    }
                } catch (YU e) {
                    wu.j(e);
                    return;
                }
        }
    }
}
