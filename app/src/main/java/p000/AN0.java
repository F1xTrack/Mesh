package p000;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class AN0 implements Runnable {

    /* renamed from: a */
    public final InterfaceC0111Bl f177a;

    /* renamed from: b */
    public volatile AtomicInteger f178b = new AtomicInteger(0);

    /* renamed from: c */
    public final /* synthetic */ DN0 f179c;

    public AN0(DN0 dn0, InterfaceC0111Bl interfaceC0111Bl) {
        this.f179c = dn0;
        this.f177a = interfaceC0111Bl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10919rY0 c10919rY0;
        String strConcat = "OkHttp ".concat(this.f179c.f1981b.f40870a.m1534g());
        DN0 dn0 = this.f179c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            dn0.f1984e.m25369i();
            boolean z = false;
            try {
                try {
                    try {
                        this.f177a.mo851Z(dn0, dn0.m1672j());
                        c10919rY0 = dn0.f1980a.f39371a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            C10745qB0 c10745qB0 = C10745qB0.f40658a;
                            C10745qB0 c10745qB02 = C10745qB0.f40658a;
                            String str = "Callback failure for " + DN0.m1665a(dn0);
                            c10745qB02.getClass();
                            C10745qB0.m23946i(4, str, e);
                        } else {
                            this.f177a.mo852w0(dn0, e);
                        }
                        c10919rY0 = dn0.f1980a.f39371a;
                        c10919rY0.m24423v(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        dn0.m1668e();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            I02.m3687a(iOException, th);
                            this.f177a.mo852w0(dn0, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                c10919rY0.m24423v(this);
            } catch (Throwable th3) {
                dn0.f1980a.f39371a.m24423v(this);
                throw th3;
            }
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
