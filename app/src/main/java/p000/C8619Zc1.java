package p000;

import android.content.Context;
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
public final class C8619Zc1 implements InterfaceC1266U7 {

    /* renamed from: r */
    public static final C6989v4 f15027r = C6989v4.m25319d();

    /* renamed from: s */
    public static final C8619Zc1 f15028s = new C8619Zc1();

    /* renamed from: a */
    public final ConcurrentHashMap f15029a;

    /* renamed from: d */
    public C0786MU f15032d;

    /* renamed from: e */
    public C6367lV f15033e;

    /* renamed from: f */
    public InterfaceC1478XU f15034f;

    /* renamed from: g */
    public InterfaceC9347fG0 f15035g;

    /* renamed from: h */
    public C4184hW f15036h;

    /* renamed from: j */
    public Context f15038j;

    /* renamed from: k */
    public C0751Lw f15039k;

    /* renamed from: l */
    public C9865jJ0 f15040l;

    /* renamed from: m */
    public C1329V7 f15041m;

    /* renamed from: n */
    public C1581Z7 f15042n;

    /* renamed from: o */
    public String f15043o;

    /* renamed from: p */
    public String f15044p;

    /* renamed from: b */
    public final ConcurrentLinkedQueue f15030b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final AtomicBoolean f15031c = new AtomicBoolean(false);

    /* renamed from: q */
    public boolean f15045q = false;

    /* renamed from: i */
    public final ThreadPoolExecutor f15037i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public C8619Zc1() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f15029a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    /* renamed from: a */
    public static String m9555a(FA0 fa0) {
        if (fa0.mo1566e()) {
            C7629Gb1 c7629Gb1Mo1567h = fa0.mo1567h();
            long jM3111I = c7629Gb1Mo1567h.m3111I();
            Locale locale = Locale.ENGLISH;
            return AbstractC11153tN0.m24912x("trace metric: ", c7629Gb1Mo1567h.m3112J(), " (duration: ", new DecimalFormat("#.####").format(jM3111I / 1000.0d), "ms)");
        }
        if (fa0.mo1568i()) {
            C8602Yu0 c8602Yu0Mo1569j = fa0.mo1569j();
            long jM9412Q = c8602Yu0Mo1569j.m9421Z() ? c8602Yu0Mo1569j.m9412Q() : 0L;
            String strValueOf = c8602Yu0Mo1569j.m9417V() ? String.valueOf(c8602Yu0Mo1569j.m9407L()) : GrsBaseInfo.CountryCodeSource.UNKNOWN;
            Locale locale2 = Locale.ENGLISH;
            return AbstractC1374Vq.m8593l(F91.m2541x("network request trace: ", c8602Yu0Mo1569j.m9414S(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(jM9412Q / 1000.0d), "ms)");
        }
        if (!fa0.mo1565a()) {
            return "log";
        }
        C10207m00 c10207m00Mo1570k = fa0.mo1570k();
        Locale locale3 = Locale.ENGLISH;
        boolean zM22621C = c10207m00Mo1570k.m22621C();
        int iM22624z = c10207m00Mo1570k.m22624z();
        int iM22623y = c10207m00Mo1570k.m22623y();
        StringBuilder sb = new StringBuilder("gauges (hasMetadata: ");
        sb.append(zM22621C);
        sb.append(", cpuGaugeCount: ");
        sb.append(iM22624z);
        sb.append(", memoryGaugeCount: ");
        return AbstractC1374Vq.m8591j(sb, iM22623y, ")");
    }

    /* renamed from: b */
    public final void m9556b(EA0 ea0) {
        if (ea0.mo1566e()) {
            this.f15041m.m8298b("_fstec");
        } else if (ea0.mo1568i()) {
            this.f15041m.m8298b("_fsntc");
        }
    }

    /* renamed from: c */
    public final void m9557c(C7629Gb1 c7629Gb1, EnumC3909d8 enumC3909d8) {
        this.f15037i.execute(new RunnableC8176Qp0(this, c7629Gb1, enumC3909d8, 14));
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
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9558d(p000.DA0 r18, p000.EnumC3909d8 r19) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8619Zc1.m9558d(DA0, d8):void");
    }

    @Override // p000.InterfaceC1266U7
    public final void onUpdateAppState(EnumC3909d8 enumC3909d8) {
        this.f15045q = enumC3909d8 == EnumC3909d8.FOREGROUND;
        if (this.f15031c.get()) {
            this.f15037i.execute(new RunnableC8567Yc1(this, 0));
        }
    }
}
