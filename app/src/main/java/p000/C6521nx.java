package p000;

import java.io.IOException;

/* renamed from: nx */
/* loaded from: classes2.dex */
public final class C6521nx implements InterfaceC10869r90 {

    /* renamed from: a */
    public static final C6521nx f38618a = new C6521nx();

    @Override // p000.InterfaceC10869r90
    /* renamed from: a */
    public final HS0 mo18634a(GN0 gn0) throws IOException {
        DN0 dn0 = gn0.f3711a;
        dn0.getClass();
        synchronized (dn0) {
            try {
                if (!dn0.f1993n) {
                    throw new IllegalStateException("released");
                }
                if (dn0.f1992m) {
                    throw new IllegalStateException("Check failed.");
                }
                if (dn0.f1991l) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1536YP c1536yp = dn0.f1987h;
        O90.m5965c(c1536yp);
        C10585ox0 c10585ox0 = dn0.f1980a;
        O90.m5968f(c10585ox0, "client");
        try {
            C4198hk c4198hk = new C4198hk(dn0, c1536yp, c1536yp.m9291a(gn0.f3716f, c10585ox0.f39376f, !O90.m5963a(gn0.f3715e.f40871b, "GET"), gn0.f3717g, gn0.f3718h).m2615k(c10585ox0, gn0));
            dn0.f1990k = c4198hk;
            dn0.f1995p = c4198hk;
            synchronized (dn0) {
                dn0.f1991l = true;
                dn0.f1992m = true;
            }
            if (dn0.f1994o) {
                throw new IOException("Canceled");
            }
            return GN0.m3054a(gn0, 0, c4198hk, null, 61).m3055b(gn0.f3715e);
        } catch (PT0 e) {
            c1536yp.m9293c(e.f9083b);
            throw e;
        } catch (IOException e2) {
            c1536yp.m9293c(e2);
            throw new PT0(e2);
        }
    }
}
