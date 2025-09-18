package defpackage;

import java.io.IOException;

/* renamed from: nx */
/* loaded from: classes2.dex */
public final class C6171nx implements InterfaceC6785r90 {
    public static final C6171nx a = new C6171nx();

    @Override // defpackage.InterfaceC6785r90
    public final HS0 a(GN0 gn0) throws IOException {
        DN0 dn0 = gn0.a;
        dn0.getClass();
        synchronized (dn0) {
            try {
                if (!dn0.n) {
                    throw new IllegalStateException("released");
                }
                if (dn0.m) {
                    throw new IllegalStateException("Check failed.");
                }
                if (dn0.l) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        YP yp = dn0.h;
        O90.c(yp);
        C6363ox0 c6363ox0 = dn0.a;
        O90.f(c6363ox0, "client");
        try {
            C4210hk c4210hk = new C4210hk(dn0, yp, yp.a(gn0.f, c6363ox0.f, !O90.a(gn0.e.b, "GET"), gn0.g, gn0.h).k(c6363ox0, gn0));
            dn0.k = c4210hk;
            dn0.p = c4210hk;
            synchronized (dn0) {
                dn0.l = true;
                dn0.m = true;
            }
            if (dn0.o) {
                throw new IOException("Canceled");
            }
            return GN0.a(gn0, 0, c4210hk, null, 61).b(gn0.e);
        } catch (PT0 e) {
            yp.c(e.b);
            throw e;
        } catch (IOException e2) {
            yp.c(e2);
            throw new PT0(e2);
        }
    }
}
