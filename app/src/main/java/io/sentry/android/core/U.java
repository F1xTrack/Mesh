package io.sentry.android.core;

import android.os.Looper;
import io.sentry.C5133i1;
import io.sentry.C5185y;
import io.sentry.EnumC5150o0;
import io.sentry.F1;
import io.sentry.InterfaceC5173u;
import io.sentry.Q1;
import io.sentry.S1;
import io.sentry.U1;
import io.sentry.protocol.C5155a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class U implements InterfaceC5173u {
    public final C5088e a;
    public final SentryAndroidOptions b;

    public U(SentryAndroidOptions sentryAndroidOptions, C5088e c5088e) {
        io.sentry.config.a.D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.b = sentryAndroidOptions;
        this.a = c5088e;
    }

    public static void b(io.sentry.android.core.performance.e eVar, io.sentry.protocol.A a) {
        Q1 q1A;
        S1 s1;
        if (eVar.a == io.sentry.android.core.performance.d.UNKNOWN || (q1A = a.b.a()) == null) {
            return;
        }
        ArrayList arrayList = a.s;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            io.sentry.protocol.w wVar = (io.sentry.protocol.w) it.next();
            if (wVar.f.contentEquals("app.start.cold") || wVar.f.contentEquals("app.start.warm")) {
                s1 = wVar.d;
                break;
            }
        }
        s1 = null;
        io.sentry.android.core.performance.d dVar = eVar.a;
        io.sentry.android.core.performance.d dVar2 = io.sentry.android.core.performance.d.COLD;
        io.sentry.protocol.t tVar = q1A.a;
        if (dVar == dVar2) {
            long j = io.sentry.android.core.performance.e.n;
            io.sentry.android.core.performance.f fVar = eVar.c;
            if (fVar.c() && Math.abs(j - fVar.c) <= 10000) {
                io.sentry.android.core.performance.f fVar2 = new io.sentry.android.core.performance.f();
                fVar2.e(fVar.c);
                fVar2.b = fVar.b;
                fVar2.d = j;
                fVar2.a = "Process Initialization";
                arrayList.add(g(fVar2, s1, tVar, "process.load"));
            }
            ArrayList arrayList2 = new ArrayList(eVar.f.values());
            Collections.sort(arrayList2);
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(g((io.sentry.android.core.performance.f) it2.next(), s1, tVar, "contentprovider.load"));
                }
            }
            io.sentry.android.core.performance.f fVar3 = eVar.e;
            if (fVar3.d()) {
                arrayList.add(g(fVar3, s1, tVar, "application.load"));
            }
        }
        ArrayList arrayList3 = new ArrayList(eVar.g);
        Collections.sort(arrayList3);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) it3.next();
            if (bVar.a.c()) {
                io.sentry.android.core.performance.f fVar4 = bVar.a;
                if (fVar4.d()) {
                    arrayList.add(g(fVar4, s1, tVar, "activity.load"));
                }
            }
            io.sentry.android.core.performance.f fVar5 = bVar.b;
            if (fVar5.c() && fVar5.d()) {
                arrayList.add(g(fVar5, s1, tVar, "activity.load"));
            }
        }
    }

    public static boolean d(io.sentry.protocol.A a) {
        Iterator it = a.s.iterator();
        while (it.hasNext()) {
            io.sentry.protocol.w wVar = (io.sentry.protocol.w) it.next();
            if (wVar.f.contentEquals("app.start.cold") || wVar.f.contentEquals("app.start.warm")) {
                return true;
            }
        }
        Q1 q1A = a.b.a();
        if (q1A != null) {
            String str = q1A.e;
            if (str.equals("app.start.cold") || str.equals("app.start.warm")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(io.sentry.protocol.A r11) {
        /*
            java.util.ArrayList r11 = r11.s
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r0.next()
            io.sentry.protocol.w r3 = (io.sentry.protocol.w) r3
            java.lang.String r4 = r3.f
            java.lang.String r5 = "ui.load.initial_display"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L20
            r1 = r3
            goto L2b
        L20:
            java.lang.String r4 = "ui.load.full_display"
            java.lang.String r5 = r3.f
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
            io.sentry.protocol.w r0 = (io.sentry.protocol.w) r0
            if (r0 == r1) goto L38
            if (r0 != r2) goto L49
            goto L38
        L49:
            java.util.Map r3 = r0.k
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
            java.lang.Double r6 = r0.a
            if (r1 == 0) goto L85
            double r7 = r6.doubleValue()
            java.lang.Double r9 = r1.a
            double r9 = r9.doubleValue()
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L85
            java.lang.Double r9 = r1.b
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
            java.lang.Double r8 = r2.a
            double r8 = r8.doubleValue()
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto La3
            java.lang.Double r8 = r2.b
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
            java.util.Map r5 = r0.k
            if (r5 != 0) goto Lb2
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap
            r5.<init>()
            r0.k = r5
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
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.U.f(io.sentry.protocol.A):void");
    }

    public static io.sentry.protocol.w g(io.sentry.android.core.performance.f fVar, S1 s1, io.sentry.protocol.t tVar, String str) {
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        return new io.sentry.protocol.w(Double.valueOf(fVar.b / 1000.0d), Double.valueOf(fVar.a() / 1000.0d), tVar, new S1(), s1, str, fVar.a, U1.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), null, map);
    }

    @Override // io.sentry.InterfaceC5173u
    public final F1 a(F1 f1, C5185y c5185y) {
        return f1;
    }

    @Override // io.sentry.InterfaceC5173u
    public final C5133i1 c(C5133i1 c5133i1, C5185y c5185y) {
        return c5133i1;
    }

    @Override // io.sentry.InterfaceC5173u
    public final synchronized io.sentry.protocol.A e(io.sentry.protocol.A a, C5185y c5185y) {
        Map mapE;
        try {
            if (!this.b.isTracingEnabled()) {
                return a;
            }
            io.sentry.android.core.performance.e eVarC = io.sentry.android.core.performance.e.c();
            if (d(a)) {
                if (eVarC.m) {
                    io.sentry.android.core.performance.f fVarB = eVarC.b(this.b);
                    long j = fVarB.d() ? fVarB.d - fVarB.c : 0L;
                    if (j != 0) {
                        a.t.put(eVarC.a == io.sentry.android.core.performance.d.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.i(Float.valueOf(j), EnumC5150o0.MILLISECOND.apiName()));
                        b(eVarC, a);
                        eVarC.m = false;
                        eVarC.f.clear();
                        eVarC.g.clear();
                    }
                }
                C5155a c5155a = (C5155a) a.b.d(C5155a.class, "app");
                if (c5155a == null) {
                    c5155a = new C5155a();
                    a.b.b(c5155a);
                }
                c5155a.j = eVarC.a == io.sentry.android.core.performance.d.COLD ? "cold" : "warm";
            }
            f(a);
            io.sentry.protocol.t tVar = a.a;
            Q1 q1A = a.b.a();
            if (tVar != null && q1A != null && q1A.e.contentEquals("ui.load") && (mapE = this.a.e(tVar)) != null) {
                a.t.putAll(mapE);
            }
            return a;
        } catch (Throwable th) {
            throw th;
        }
    }
}
