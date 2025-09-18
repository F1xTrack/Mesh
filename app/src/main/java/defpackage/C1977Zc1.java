package defpackage;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Zc1 */
/* loaded from: classes.dex */
public final class C1977Zc1 implements U7 {
    public static final C7533v4 r = C7533v4.d();
    public static final C1977Zc1 s = new C1977Zc1();
    public final ConcurrentHashMap a;
    public MU d;
    public C5705lV e;
    public XU f;
    public InterfaceC3739fG0 g;
    public C4168hW h;
    public Context j;
    public C0943Lw k;
    public C5288jJ0 l;
    public V7 m;
    public Z7 n;
    public String o;
    public String p;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public boolean q = false;
    public final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public C1977Zc1() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(FA0 fa0) {
        if (fa0.e()) {
            C0493Gb1 c0493Gb1H = fa0.h();
            long jI = c0493Gb1H.I();
            Locale locale = Locale.ENGLISH;
            return AbstractC7209tN0.x("trace metric: ", c0493Gb1H.J(), " (duration: ", new DecimalFormat("#.####").format(jI / 1000.0d), "ms)");
        }
        if (fa0.i()) {
            C1952Yu0 c1952Yu0J = fa0.j();
            long jQ = c1952Yu0J.Z() ? c1952Yu0J.Q() : 0L;
            String strValueOf = c1952Yu0J.V() ? String.valueOf(c1952Yu0J.L()) : GrsBaseInfo.CountryCodeSource.UNKNOWN;
            Locale locale2 = Locale.ENGLISH;
            return AbstractC1705Vq.l(F91.x("network request trace: ", c1952Yu0J.S(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(jQ / 1000.0d), "ms)");
        }
        if (!fa0.a()) {
            return "log";
        }
        C5800m00 c5800m00K = fa0.k();
        Locale locale3 = Locale.ENGLISH;
        boolean zC = c5800m00K.C();
        int iZ = c5800m00K.z();
        int iY = c5800m00K.y();
        StringBuilder sb = new StringBuilder("gauges (hasMetadata: ");
        sb.append(zC);
        sb.append(", cpuGaugeCount: ");
        sb.append(iZ);
        sb.append(", memoryGaugeCount: ");
        return AbstractC1705Vq.j(sb, iY, ")");
    }

    public final void b(EA0 ea0) {
        if (ea0.e()) {
            this.m.b("_fstec");
        } else if (ea0.i()) {
            this.m.b("_fsntc");
        }
    }

    public final void c(C0493Gb1 c0493Gb1, EnumC3333d8 enumC3333d8) {
        this.i.execute(new RunnableC1313Qp0(this, c0493Gb1, enumC3333d8, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:375:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.DA0 r18, defpackage.EnumC3333d8 r19) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1977Zc1.d(DA0, d8):void");
    }

    @Override // defpackage.U7
    public final void onUpdateAppState(EnumC3333d8 enumC3333d8) {
        this.q = enumC3333d8 == EnumC3333d8.FOREGROUND;
        if (this.c.get()) {
            this.i.execute(new RunnableC1899Yc1(this, 0));
        }
    }
}
