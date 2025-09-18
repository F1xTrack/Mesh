package io.sentry.android.core;

import android.os.Looper;
import io.sentry.C5765F1;
import io.sentry.C5798Q1;
import io.sentry.C5803S1;
import io.sentry.C6039i1;
import io.sentry.C6193y;
import io.sentry.EnumC5809U1;
import io.sentry.EnumC6071o0;
import io.sentry.InterfaceC6165u;
import io.sentry.android.core.performance.C5902b;
import io.sentry.android.core.performance.C5905e;
import io.sentry.android.core.performance.C5906f;
import io.sentry.android.core.performance.EnumC5904d;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6078A;
import io.sentry.protocol.C6085a;
import io.sentry.protocol.C6093i;
import io.sentry.protocol.C6104t;
import io.sentry.protocol.C6107w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.android.core.U */
/* loaded from: classes2.dex */
public final class C5848U implements InterfaceC6165u {

    /* renamed from: a */
    public final C5863e f33622a;

    /* renamed from: b */
    public final SentryAndroidOptions f33623b;

    public C5848U(SentryAndroidOptions sentryAndroidOptions, C5863e c5863e) {
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33623b = sentryAndroidOptions;
        this.f33622a = c5863e;
    }

    /* renamed from: b */
    public static void m21547b(C5905e c5905e, C6078A c6078a) {
        C5798Q1 c5798q1M21849a;
        C5803S1 c5803s1;
        if (c5905e.f33819a == EnumC5904d.UNKNOWN || (c5798q1M21849a = c6078a.f33417b.m21849a()) == null) {
            return;
        }
        ArrayList arrayList = c6078a.f34280s;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6107w c6107w = (C6107w) it.next();
            if (c6107w.f34456f.contentEquals("app.start.cold") || c6107w.f34456f.contentEquals("app.start.warm")) {
                c5803s1 = c6107w.f34454d;
                break;
            }
        }
        c5803s1 = null;
        EnumC5904d enumC5904d = c5905e.f33819a;
        EnumC5904d enumC5904d2 = EnumC5904d.COLD;
        C6104t c6104t = c5798q1M21849a.f33379a;
        if (enumC5904d == enumC5904d2) {
            long j = C5905e.f33817n;
            C5906f c5906f = c5905e.f33821c;
            if (c5906f.m21611c() && Math.abs(j - c5906f.f33834c) <= 10000) {
                C5906f c5906f2 = new C5906f();
                c5906f2.m21613e(c5906f.f33834c);
                c5906f2.f33833b = c5906f.f33833b;
                c5906f2.f33835d = j;
                c5906f2.f33832a = "Process Initialization";
                arrayList.add(m21550g(c5906f2, c5803s1, c6104t, "process.load"));
            }
            ArrayList arrayList2 = new ArrayList(c5905e.f33824f.values());
            Collections.sort(arrayList2);
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(m21550g((C5906f) it2.next(), c5803s1, c6104t, "contentprovider.load"));
                }
            }
            C5906f c5906f3 = c5905e.f33823e;
            if (c5906f3.m21612d()) {
                arrayList.add(m21550g(c5906f3, c5803s1, c6104t, "application.load"));
            }
        }
        ArrayList arrayList3 = new ArrayList(c5905e.f33825g);
        Collections.sort(arrayList3);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C5902b c5902b = (C5902b) it3.next();
            if (c5902b.f33812a.m21611c()) {
                C5906f c5906f4 = c5902b.f33812a;
                if (c5906f4.m21612d()) {
                    arrayList.add(m21550g(c5906f4, c5803s1, c6104t, "activity.load"));
                }
            }
            C5906f c5906f5 = c5902b.f33813b;
            if (c5906f5.m21611c() && c5906f5.m21612d()) {
                arrayList.add(m21550g(c5906f5, c5803s1, c6104t, "activity.load"));
            }
        }
    }

    /* renamed from: d */
    public static boolean m21548d(C6078A c6078a) {
        Iterator it = c6078a.f34280s.iterator();
        while (it.hasNext()) {
            C6107w c6107w = (C6107w) it.next();
            if (c6107w.f34456f.contentEquals("app.start.cold") || c6107w.f34456f.contentEquals("app.start.warm")) {
                return true;
            }
        }
        C5798Q1 c5798q1M21849a = c6078a.f33417b.m21849a();
        if (c5798q1M21849a != null) {
            String str = c5798q1M21849a.f33383e;
            if (str.equals("app.start.cold") || str.equals("app.start.warm")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m21549f(io.sentry.protocol.C6078A r11) {
        /*
            java.util.ArrayList r11 = r11.f34280s
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r0.next()
            io.sentry.protocol.w r3 = (io.sentry.protocol.C6107w) r3
            java.lang.String r4 = r3.f34456f
            java.lang.String r5 = "ui.load.initial_display"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L20
            r1 = r3
            goto L2b
        L20:
            java.lang.String r4 = "ui.load.full_display"
            java.lang.String r5 = r3.f34456f
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2b
            r2 = r3
        L2b:
            if (r1 == 0) goto L8
            if (r2 == 0) goto L8
        L2f:
            if (r1 != 0) goto L34
            if (r2 != 0) goto L34
            return
        L34:
            java.util.Iterator r11 = r11.iterator()
        L38:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r11.next()
            io.sentry.protocol.w r0 = (io.sentry.protocol.C6107w) r0
            if (r0 == r1) goto L38
            if (r0 != r2) goto L49
            goto L38
        L49:
            java.util.Map r3 = r0.f34461k
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L62
            java.lang.String r6 = "thread.name"
            java.lang.Object r3 = r3.get(r6)
            if (r3 == 0) goto L62
            java.lang.String r6 = "main"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L60
            goto L62
        L60:
            r3 = r4
            goto L63
        L62:
            r3 = r5
        L63:
            java.lang.Double r6 = r0.f34451a
            if (r1 == 0) goto L85
            double r7 = r6.doubleValue()
            java.lang.Double r9 = r1.f34451a
            double r9 = r9.doubleValue()
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L85
            java.lang.Double r9 = r1.f34452b
            if (r9 == 0) goto L81
            double r9 = r9.doubleValue()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L85
        L81:
            if (r3 == 0) goto L85
            r3 = r5
            goto L86
        L85:
            r3 = r4
        L86:
            if (r2 == 0) goto La3
            double r6 = r6.doubleValue()
            java.lang.Double r8 = r2.f34451a
            double r8 = r8.doubleValue()
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto La3
            java.lang.Double r8 = r2.f34452b
            if (r8 == 0) goto La2
            double r8 = r8.doubleValue()
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto La3
        La2:
            r4 = r5
        La3:
            if (r3 != 0) goto La7
            if (r4 == 0) goto L38
        La7:
            java.util.Map r5 = r0.f34461k
            if (r5 != 0) goto Lb2
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap
            r5.<init>()
            r0.f34461k = r5
        Lb2:
            if (r3 == 0) goto Lbb
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r3 = "ui.contributes_to_ttid"
            r5.put(r3, r0)
        Lbb:
            if (r4 == 0) goto L38
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r3 = "ui.contributes_to_ttfd"
            r5.put(r3, r0)
            goto L38
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5848U.m21549f(io.sentry.protocol.A):void");
    }

    /* renamed from: g */
    public static C6107w m21550g(C5906f c5906f, C5803S1 c5803s1, C6104t c6104t, String str) {
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        return new C6107w(Double.valueOf(c5906f.f33833b / 1000.0d), Double.valueOf(c5906f.m21609a() / 1000.0d), c6104t, new C5803S1(), c5803s1, str, c5906f.f33832a, EnumC5809U1.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), null, map);
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: a */
    public final C5765F1 mo21517a(C5765F1 c5765f1, C6193y c6193y) {
        return c5765f1;
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: c */
    public final C6039i1 mo21519c(C6039i1 c6039i1, C6193y c6193y) {
        return c6039i1;
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: e */
    public final synchronized C6078A mo21521e(C6078A c6078a, C6193y c6193y) {
        Map mapM21561e;
        try {
            if (!this.f33623b.isTracingEnabled()) {
                return c6078a;
            }
            C5905e c5905eM21604c = C5905e.m21604c();
            if (m21548d(c6078a)) {
                if (c5905eM21604c.f33831m) {
                    C5906f c5906fM21606b = c5905eM21604c.m21606b(this.f33623b);
                    long j = c5906fM21606b.m21612d() ? c5906fM21606b.f33835d - c5906fM21606b.f33834c : 0L;
                    if (j != 0) {
                        c6078a.f34281t.put(c5905eM21604c.f33819a == EnumC5904d.COLD ? "app_start_cold" : "app_start_warm", new C6093i(Float.valueOf(j), EnumC6071o0.MILLISECOND.apiName()));
                        m21547b(c5905eM21604c, c6078a);
                        c5905eM21604c.f33831m = false;
                        c5905eM21604c.f33824f.clear();
                        c5905eM21604c.f33825g.clear();
                    }
                }
                C6085a c6085a = (C6085a) c6078a.f33417b.m21852d(C6085a.class, "app");
                if (c6085a == null) {
                    c6085a = new C6085a();
                    c6078a.f33417b.m21850b(c6085a);
                }
                c6085a.f34321j = c5905eM21604c.f33819a == EnumC5904d.COLD ? "cold" : "warm";
            }
            m21549f(c6078a);
            C6104t c6104t = c6078a.f33416a;
            C5798Q1 c5798q1M21849a = c6078a.f33417b.m21849a();
            if (c6104t != null && c5798q1M21849a != null && c5798q1M21849a.f33383e.contentEquals("ui.load") && (mapM21561e = this.f33622a.m21561e(c6104t)) != null) {
                c6078a.f34281t.putAll(mapM21561e);
            }
            return c6078a;
        } catch (Throwable th) {
            throw th;
        }
    }
}
