package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class AN0 implements Runnable {
    public final InterfaceC0131Bl a;
    public volatile AtomicInteger b = new AtomicInteger(0);
    public final /* synthetic */ DN0 c;

    public AN0(DN0 dn0, InterfaceC0131Bl interfaceC0131Bl) {
        this.c = dn0;
        this.a = interfaceC0131Bl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6860rY0 c6860rY0;
        String strConcat = "OkHttp ".concat(this.c.b.a.g());
        DN0 dn0 = this.c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            dn0.e.i();
            boolean z = false;
            try {
                try {
                    try {
                        this.a.Z(dn0, dn0.j());
                        c6860rY0 = dn0.a.a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            C6601qB0 c6601qB0 = C6601qB0.a;
                            C6601qB0 c6601qB02 = C6601qB0.a;
                            String str = "Callback failure for " + DN0.a(dn0);
                            c6601qB02.getClass();
                            C6601qB0.i(4, str, e);
                        } else {
                            this.a.w0(dn0, e);
                        }
                        c6860rY0 = dn0.a.a;
                        c6860rY0.v(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        dn0.e();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            I02.a(iOException, th);
                            this.a.w0(dn0, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                c6860rY0.v(this);
            } catch (Throwable th3) {
                dn0.a.a.v(this);
                throw th3;
            }
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
