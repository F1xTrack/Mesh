package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: Yc1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8567Yc1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f14393a;

    /* renamed from: b */
    public final /* synthetic */ C8619Zc1 f14394b;

    public /* synthetic */ RunnableC8567Yc1(C8619Zc1 c8619Zc1, int i) {
        this.f14393a = i;
        this.f14394b = c8619Zc1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1443Ww c1443Ww;
        String str;
        switch (this.f14393a) {
            case 0:
                C8619Zc1 c8619Zc1 = this.f14394b;
                C9865jJ0 c9865jJ0 = c8619Zc1.f15040l;
                boolean z = c8619Zc1.f15045q;
                c9865jJ0.f35059d.m19000a(z);
                c9865jJ0.f35060e.m19000a(z);
                return;
            default:
                C8619Zc1 c8619Zc12 = this.f14394b;
                C0786MU c0786mu = c8619Zc12.f15032d;
                c0786mu.m5379a();
                Context context = c0786mu.f7174a;
                c8619Zc12.f15038j = context;
                c8619Zc12.f15043o = context.getPackageName();
                c8619Zc12.f15039k = C0751Lw.m5135e();
                c8619Zc12.f15040l = new C9865jJ0(c8619Zc12.f15038j, new C7285zm(100L, 1L, TimeUnit.MINUTES));
                c8619Zc12.f15041m = C1329V7.m8297a();
                InterfaceC9347fG0 interfaceC9347fG0 = c8619Zc12.f15035g;
                C0751Lw c0751Lw = c8619Zc12.f15039k;
                c0751Lw.getClass();
                C1443Ww c1443Ww2 = C1443Ww.f13457a;
                synchronized (C1443Ww.class) {
                    try {
                        if (C1443Ww.f13457a == null) {
                            C1443Ww.f13457a = new C1443Ww();
                        }
                        c1443Ww = C1443Ww.f13457a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c1443Ww.getClass();
                Long l = (Long) c0751Lw.f6932a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map map = C1443Ww.f13458b;
                if (!map.containsKey(l) || (str = (String) map.get(l)) == null) {
                    C11991zy0 c11991zy0M5143d = c0751Lw.m5143d(c1443Ww);
                    str = c11991zy0M5143d.m26594b() ? (String) c11991zy0M5143d.m26593a() : "FIREPERF";
                } else {
                    c0751Lw.f6934c.m18423f("com.google.firebase.perf.LogSourceName", str);
                }
                c8619Zc12.f15036h = new C4184hW(interfaceC9347fG0, str);
                c8619Zc12.f15041m.m8300d(new WeakReference(C8619Zc1.f15028s));
                C1581Z7 c1581z7M10598F = C1828c8.m10598F();
                c8619Zc12.f15042n = c1581z7M10598F;
                C0786MU c0786mu2 = c8619Zc12.f15032d;
                c0786mu2.m5379a();
                String str2 = c0786mu2.f7176c.f27219b;
                c1581z7M10598F.m23922n();
                C1828c8.m10599u((C1828c8) c1581z7M10598F.f40483b, str2);
                C3967e4 c3967e4M18394A = C4093g4.m18394A();
                String str3 = c8619Zc12.f15043o;
                c3967e4M18394A.m23922n();
                C4093g4.m18395u((C4093g4) c3967e4M18394A.f40483b, str3);
                c3967e4M18394A.m23922n();
                C4093g4.m18396v((C4093g4) c3967e4M18394A.f40483b);
                Context context2 = c8619Zc12.f15038j;
                String str4 = "";
                try {
                    String str5 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str5 != null) {
                        str4 = str5;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                c3967e4M18394A.m23922n();
                C4093g4.m18397w((C4093g4) c3967e4M18394A.f40483b, str4);
                c1581z7M10598F.m23922n();
                C1828c8.m10603y((C1828c8) c1581z7M10598F.f40483b, (C4093g4) c3967e4M18394A.m23920l());
                c8619Zc12.f15031c.set(true);
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = c8619Zc12.f15030b;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    BA0 ba0 = (BA0) concurrentLinkedQueue.poll();
                    if (ba0 != null) {
                        c8619Zc12.f15037i.execute(new O91(c8619Zc12, 2, ba0));
                    }
                }
                break;
        }
    }
}
