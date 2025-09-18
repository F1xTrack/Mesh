package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.b3 */
/* loaded from: classes2.dex */
public class C3145b3 {

    /* renamed from: l */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C3145b3 f23097l;

    /* renamed from: m */
    private static final Object f23098m = new Object();

    /* renamed from: a */
    private final Context f23099a;

    /* renamed from: b */
    private final WifiManager f23100b;

    /* renamed from: c */
    private C3260fe f23101c;

    /* renamed from: d */
    private C3416le f23102d;

    /* renamed from: e */
    private C2789Mm f23103e;

    /* renamed from: f */
    private InterfaceC2963Tm<Context, Intent, Void> f23104f;

    /* renamed from: g */
    private C2885Qi f23105g;

    /* renamed from: h */
    private final InterfaceC3286ge f23106h;

    /* renamed from: i */
    private final InterfaceC3286ge f23107i;

    /* renamed from: j */
    private final C3171c3 f23108j;

    /* renamed from: k */
    private final C3197d3 f23109k;

    private C3145b3(Context context, WifiManager wifiManager, C3416le c3416le) {
        this(context, wifiManager, c3416le, new C3260fe(c3416le.m16387a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.yandex.metrica.impl.p022ob.C3093Z2> m15671c() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3145b3.m15671c():java.util.List");
    }

    /* renamed from: a */
    public static C3145b3 m15668a(Context context) {
        if (f23097l == null) {
            synchronized (f23098m) {
                try {
                    if (f23097l == null) {
                        Context applicationContext = context.getApplicationContext();
                        f23097l = new C3145b3(applicationContext, (WifiManager) applicationContext.getApplicationContext().getSystemService("wifi"), new C3416le());
                    }
                } finally {
                }
            }
        }
        return f23097l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.yandex.metrica.impl.p022ob.C3093Z2> m15676b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.fe r0 = r2.f23101c     // Catch: java.lang.Throwable -> L2d
            android.content.Context r1 = r2.f23099a     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.m15934c(r1)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto Ld
            r0 = 0
            goto L25
        Ld:
            android.net.wifi.WifiManager r0 = r2.f23100b     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L1c
            boolean r0 = r0.isWifiEnabled()     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 != 0) goto L20
            goto L21
        L20:
            r1 = r0
        L21:
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2d
        L25:
            if (r0 != 0) goto L2f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            return r0
        L2d:
            r0 = move-exception
            goto L35
        L2f:
            java.util.List r0 = r2.m15671c()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            return r0
        L35:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3145b3.m15676b():java.util.List");
    }

    private C3145b3(Context context, WifiManager wifiManager, C3416le c3416le, C3260fe c3260fe) {
        this(context, wifiManager, c3416le, new C2789Mm(), c3260fe, new C3118a2(), new C3171c3(), C2842P0.m14728i().m14739j().m16503d());
    }

    public C3145b3(Context context, WifiManager wifiManager, C3416le c3416le, C2789Mm c2789Mm, C3260fe c3260fe, C3118a2 c3118a2, C3171c3 c3171c3, C3197d3 c3197d3) {
        this.f23099a = context;
        this.f23100b = wifiManager;
        this.f23102d = c3416le;
        this.f23101c = c3260fe;
        this.f23106h = c3118a2.m15598d(c3260fe);
        this.f23107i = c3118a2.m15599e(c3260fe);
        this.f23103e = c2789Mm;
        this.f23108j = c3171c3;
        this.f23109k = c3197d3;
    }

    /* renamed from: a */
    public void m15673a(C2885Qi c2885Qi) {
        this.f23105g = c2885Qi;
        this.f23102d.m16388a(c2885Qi);
        this.f23101c.m15931a(this.f23102d.m16387a());
        if (c2885Qi.m14878d() != null) {
            C3171c3 c3171c3 = this.f23108j;
            C3524pi c3524piM14878d = c2885Qi.m14878d();
            c3171c3.f21964a.m14679a(c3524piM14878d.f24511b, c3171c3.mo14802a(c3524piM14878d));
        }
    }

    /* renamed from: a */
    public void m15674a(boolean z) {
        this.f23102d.m16389a(z);
        this.f23101c.m15931a(this.f23102d.m16387a());
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public synchronized boolean m15675a(CountDownLatch countDownLatch, AbstractC3194d0 abstractC3194d0) {
        Boolean boolValueOf;
        try {
            if (!this.f23107i.mo15433a(this.f23099a)) {
                return false;
            }
            if (this.f23104f == null) {
                this.f23104f = new C3119a3(this, abstractC3194d0, countDownLatch);
            }
            this.f23109k.m15735a(this.f23104f);
            WifiManager wifiManager = this.f23100b;
            if (wifiManager != null) {
                try {
                    boolValueOf = Boolean.valueOf(wifiManager.startScan());
                } catch (Throwable unused) {
                }
            } else {
                boolValueOf = null;
            }
            return Boolean.TRUE.equals(boolValueOf);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public C3171c3 m15672a() {
        return this.f23108j;
    }
}
