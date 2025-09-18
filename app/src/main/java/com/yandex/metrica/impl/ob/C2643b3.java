package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2643b3 {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile C2643b3 l;
    private static final Object m = new Object();
    private final Context a;
    private final WifiManager b;
    private C2754fe c;
    private C2903le d;
    private Mm e;
    private Tm<Context, Intent, Void> f;
    private Qi g;
    private final InterfaceC2779ge h;
    private final InterfaceC2779ge i;
    private final C2668c3 j;
    private final C2693d3 k;

    private C2643b3(Context context, WifiManager wifiManager, C2903le c2903le) {
        this(context, wifiManager, c2903le, new C2754fe(c2903le.a()));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.yandex.metrica.impl.ob.Z2> c() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2643b3.c():java.util.List");
    }

    public static C2643b3 a(Context context) {
        if (l == null) {
            synchronized (m) {
                try {
                    if (l == null) {
                        Context applicationContext = context.getApplicationContext();
                        l = new C2643b3(applicationContext, (WifiManager) applicationContext.getApplicationContext().getSystemService("wifi"), new C2903le());
                    }
                } finally {
                }
            }
        }
        return l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.yandex.metrica.impl.ob.Z2> b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.fe r0 = r2.c     // Catch: java.lang.Throwable -> L2d
            android.content.Context r1 = r2.a     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.c(r1)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto Ld
            r0 = 0
            goto L25
        Ld:
            android.net.wifi.WifiManager r0 = r2.b     // Catch: java.lang.Throwable -> L2d
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
            java.util.List r0 = r2.c()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            return r0
        L35:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2643b3.b():java.util.List");
    }

    private C2643b3(Context context, WifiManager wifiManager, C2903le c2903le, C2754fe c2754fe) {
        this(context, wifiManager, c2903le, new Mm(), c2754fe, new C2617a2(), new C2668c3(), P0.i().j().d());
    }

    public C2643b3(Context context, WifiManager wifiManager, C2903le c2903le, Mm mm, C2754fe c2754fe, C2617a2 c2617a2, C2668c3 c2668c3, C2693d3 c2693d3) {
        this.a = context;
        this.b = wifiManager;
        this.d = c2903le;
        this.c = c2754fe;
        this.h = c2617a2.d(c2754fe);
        this.i = c2617a2.e(c2754fe);
        this.e = mm;
        this.j = c2668c3;
        this.k = c2693d3;
    }

    public void a(Qi qi) {
        this.g = qi;
        this.d.a(qi);
        this.c.a(this.d.a());
        if (qi.d() != null) {
            C2668c3 c2668c3 = this.j;
            C3007pi c3007piD = qi.d();
            c2668c3.a.a(c3007piD.b, c2668c3.a(c3007piD));
        }
    }

    public void a(boolean z) {
        this.d.a(z);
        this.c.a(this.d.a());
    }

    @SuppressLint({"MissingPermission"})
    public synchronized boolean a(CountDownLatch countDownLatch, AbstractC2690d0 abstractC2690d0) {
        Boolean boolValueOf;
        try {
            if (!this.i.a(this.a)) {
                return false;
            }
            if (this.f == null) {
                this.f = new C2618a3(this, abstractC2690d0, countDownLatch);
            }
            this.k.a(this.f);
            WifiManager wifiManager = this.b;
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

    public C2668c3 a() {
        return this.j;
    }
}
