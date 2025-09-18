package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: Yc1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1899Yc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1977Zc1 b;

    public /* synthetic */ RunnableC1899Yc1(C1977Zc1 c1977Zc1, int i) {
        this.a = i;
        this.b = c1977Zc1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1801Ww c1801Ww;
        String str;
        switch (this.a) {
            case 0:
                C1977Zc1 c1977Zc1 = this.b;
                C5288jJ0 c5288jJ0 = c1977Zc1.l;
                boolean z = c1977Zc1.q;
                c5288jJ0.d.a(z);
                c5288jJ0.e.a(z);
                return;
            default:
                C1977Zc1 c1977Zc12 = this.b;
                MU mu = c1977Zc12.d;
                mu.a();
                Context context = mu.a;
                c1977Zc12.j = context;
                c1977Zc12.o = context.getPackageName();
                c1977Zc12.k = C0943Lw.e();
                c1977Zc12.l = new C5288jJ0(c1977Zc12.j, new C8425zm(100L, 1L, TimeUnit.MINUTES));
                c1977Zc12.m = V7.a();
                InterfaceC3739fG0 interfaceC3739fG0 = c1977Zc12.g;
                C0943Lw c0943Lw = c1977Zc12.k;
                c0943Lw.getClass();
                C1801Ww c1801Ww2 = C1801Ww.a;
                synchronized (C1801Ww.class) {
                    try {
                        if (C1801Ww.a == null) {
                            C1801Ww.a = new C1801Ww();
                        }
                        c1801Ww = C1801Ww.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c1801Ww.getClass();
                Long l = (Long) c0943Lw.a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map map = C1801Ww.b;
                if (!map.containsKey(l) || (str = (String) map.get(l)) == null) {
                    C8462zy0 c8462zy0D = c0943Lw.d(c1801Ww);
                    str = c8462zy0D.b() ? (String) c8462zy0D.a() : "FIREPERF";
                } else {
                    c0943Lw.c.f("com.google.firebase.perf.LogSourceName", str);
                }
                c1977Zc12.h = new C4168hW(interfaceC3739fG0, str);
                c1977Zc12.m.d(new WeakReference(C1977Zc1.s));
                Z7 z7F = C2457c8.F();
                c1977Zc12.n = z7F;
                MU mu2 = c1977Zc12.d;
                mu2.a();
                String str2 = mu2.c.b;
                z7F.n();
                C2457c8.u((C2457c8) z7F.b, str2);
                C3511e4 c3511e4A = C3893g4.A();
                String str3 = c1977Zc12.o;
                c3511e4A.n();
                C3893g4.u((C3893g4) c3511e4A.b, str3);
                c3511e4A.n();
                C3893g4.v((C3893g4) c3511e4A.b);
                Context context2 = c1977Zc12.j;
                String str4 = "";
                try {
                    String str5 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str5 != null) {
                        str4 = str5;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                c3511e4A.n();
                C3893g4.w((C3893g4) c3511e4A.b, str4);
                z7F.n();
                C2457c8.y((C2457c8) z7F.b, (C3893g4) c3511e4A.l());
                c1977Zc12.c.set(true);
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = c1977Zc12.b;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    BA0 ba0 = (BA0) concurrentLinkedQueue.poll();
                    if (ba0 != null) {
                        c1977Zc12.i.execute(new O91(c1977Zc12, 2, ba0));
                    }
                }
                break;
        }
    }
}
