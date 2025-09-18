package io.sentry;

import android.app.Activity;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C5087d;
import io.sentry.android.core.C5088e;
import io.sentry.android.core.C5091h;
import io.sentry.android.core.RunnableC5086c;
import io.sentry.android.core.SentryAndroidOptions;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class W0 implements R1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ W0(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // io.sentry.R1
    public void a(P1 p1) {
        C5087d c5087dB;
        int i;
        M1 m1 = (M1) this.a;
        R1 r1 = (R1) this.b;
        AtomicReference atomicReference = (AtomicReference) this.c;
        if (r1 != null) {
            m1.getClass();
            r1.a(p1);
        }
        C5091h c5091h = m1.r.g;
        if (c5091h != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) c5091h.a;
            WeakReference weakReference = (WeakReference) c5091h.b;
            String str = (String) c5091h.c;
            activityLifecycleIntegration.getClass();
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                C5088e c5088e = activityLifecycleIntegration.r;
                io.sentry.protocol.t tVar = m1.a;
                synchronized (c5088e) {
                    if (c5088e.c()) {
                        C5087d c5087d = null;
                        c5088e.d(new RunnableC5086c(c5088e, activity, 1), null);
                        C5087d c5087d2 = (C5087d) c5088e.d.remove(activity);
                        if (c5087d2 != null && (c5087dB = c5088e.b()) != null) {
                            c5087d = new C5087d(c5087dB.a - c5087d2.a, c5087dB.b - c5087d2.b, c5087dB.c - c5087d2.c);
                        }
                        if (c5087d != null && ((i = c5087d.a) != 0 || c5087d.b != 0 || c5087d.c != 0)) {
                            io.sentry.protocol.i iVar = new io.sentry.protocol.i(Integer.valueOf(i), LocalNotification.Importance.NONE);
                            io.sentry.protocol.i iVar2 = new io.sentry.protocol.i(Integer.valueOf(c5087d.b), LocalNotification.Importance.NONE);
                            io.sentry.protocol.i iVar3 = new io.sentry.protocol.i(Integer.valueOf(c5087d.c), LocalNotification.Importance.NONE);
                            HashMap map = new HashMap();
                            map.put("frames_total", iVar);
                            map.put("frames_slow", iVar2);
                            map.put("frames_frozen", iVar3);
                            c5088e.c.put(tVar, map);
                        }
                    }
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.d;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().k(EnumC5148n1.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        b2 b2Var = m1.q;
        if (b2Var != null) {
            atomicReference.set(b2Var.j(m1));
        }
    }

    public void b(O1 o1) {
        ConcurrentHashMap concurrentHashMap;
        Y0 y0 = (Y0) this.a;
        if (o1 == null) {
            ((D1) y0.a).getLogger().k(EnumC5148n1.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        y0.getClass();
        C5133i1 c5133i1 = (C5133i1) this.b;
        String strE = null;
        N1 n1 = c5133i1.b() != null ? N1.Crashed : null;
        boolean z = N1.Crashed == n1 || c5133i1.c();
        io.sentry.protocol.n nVar = c5133i1.d;
        String str = (nVar == null || (concurrentHashMap = nVar.f) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) c5133i1.d.f.get("user-agent");
        Object objR = io.sentry.config.a.r((C5185y) this.c);
        if (objR instanceof io.sentry.hints.a) {
            strE = ((io.sentry.hints.a) objR).e();
            n1 = N1.Abnormal;
        }
        if (!o1.c(n1, str, z, strE) || o1.g == N1.Ok) {
            return;
        }
        o1.b(io.sentry.config.a.k());
    }
}
