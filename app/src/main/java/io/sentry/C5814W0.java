package io.sentry;

import android.app.Activity;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C5861d;
import io.sentry.android.core.C5863e;
import io.sentry.android.core.C5869h;
import io.sentry.android.core.RunnableC5858c;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC6003a;
import io.sentry.hints.InterfaceC6026a;
import io.sentry.protocol.C6093i;
import io.sentry.protocol.C6098n;
import io.sentry.protocol.C6104t;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.sentry.W0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5814W0 implements InterfaceC5800R1 {

    /* renamed from: a */
    public final /* synthetic */ Object f33434a;

    /* renamed from: b */
    public final /* synthetic */ Object f33435b;

    /* renamed from: c */
    public final /* synthetic */ Object f33436c;

    public /* synthetic */ C5814W0(Object obj, Object obj2, Object obj3) {
        this.f33434a = obj;
        this.f33435b = obj2;
        this.f33436c = obj3;
    }

    @Override // io.sentry.InterfaceC5800R1
    /* renamed from: a */
    public void mo21409a(C5795P1 c5795p1) {
        C5861d c5861dM21558b;
        int i;
        C5786M1 c5786m1 = (C5786M1) this.f33434a;
        InterfaceC5800R1 interfaceC5800R1 = (InterfaceC5800R1) this.f33435b;
        AtomicReference atomicReference = (AtomicReference) this.f33436c;
        if (interfaceC5800R1 != null) {
            c5786m1.getClass();
            interfaceC5800R1.mo21409a(c5795p1);
        }
        C5869h c5869h = c5786m1.f33343r.f33477g;
        if (c5869h != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) c5869h.f33699a;
            WeakReference weakReference = (WeakReference) c5869h.f33700b;
            String str = (String) c5869h.f33701c;
            activityLifecycleIntegration.getClass();
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                C5863e c5863e = activityLifecycleIntegration.f33500r;
                C6104t c6104t = c5786m1.f33326a;
                synchronized (c5863e) {
                    if (c5863e.m21559c()) {
                        C5861d c5861d = null;
                        c5863e.m21560d(new RunnableC5858c(c5863e, activity, 1), null);
                        C5861d c5861d2 = (C5861d) c5863e.f33673d.remove(activity);
                        if (c5861d2 != null && (c5861dM21558b = c5863e.m21558b()) != null) {
                            c5861d = new C5861d(c5861dM21558b.f33660a - c5861d2.f33660a, c5861dM21558b.f33661b - c5861d2.f33661b, c5861dM21558b.f33662c - c5861d2.f33662c);
                        }
                        if (c5861d != null && ((i = c5861d.f33660a) != 0 || c5861d.f33661b != 0 || c5861d.f33662c != 0)) {
                            C6093i c6093i = new C6093i(Integer.valueOf(i), LocalNotification.Importance.NONE);
                            C6093i c6093i2 = new C6093i(Integer.valueOf(c5861d.f33661b), LocalNotification.Importance.NONE);
                            C6093i c6093i3 = new C6093i(Integer.valueOf(c5861d.f33662c), LocalNotification.Importance.NONE);
                            HashMap map = new HashMap();
                            map.put("frames_total", c6093i);
                            map.put("frames_slow", c6093i2);
                            map.put("frames_frozen", c6093i3);
                            c5863e.f33672c.put(c6104t, map);
                        }
                    }
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f33486d;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        InterfaceC5982b2 interfaceC5982b2 = c5786m1.f33342q;
        if (interfaceC5982b2 != null) {
            atomicReference.set(interfaceC5982b2.mo21697j(c5786m1));
        }
    }

    /* renamed from: b */
    public void m21475b(C5792O1 c5792o1) {
        ConcurrentHashMap concurrentHashMap;
        C5820Y0 c5820y0 = (C5820Y0) this.f33434a;
        if (c5792o1 == null) {
            ((C5759D1) c5820y0.f33441a).getLogger().mo21407k(EnumC6069n1.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        c5820y0.getClass();
        C6039i1 c6039i1 = (C6039i1) this.f33435b;
        String strMo21619e = null;
        EnumC5789N1 enumC5789N1 = c6039i1.m21787b() != null ? EnumC5789N1.Crashed : null;
        boolean z = EnumC5789N1.Crashed == enumC5789N1 || c6039i1.m21788c();
        C6098n c6098n = c6039i1.f33419d;
        String str = (c6098n == null || (concurrentHashMap = c6098n.f34412f) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) c6039i1.f33419d.f34412f.get("user-agent");
        Object objM21758r = AbstractC6003a.m21758r((C6193y) this.f33436c);
        if (objM21758r instanceof InterfaceC6026a) {
            strMo21619e = ((InterfaceC6026a) objM21758r).mo21619e();
            enumC5789N1 = EnumC5789N1.Abnormal;
        }
        if (!c5792o1.m21455c(enumC5789N1, str, z, strMo21619e) || c5792o1.f33353g == EnumC5789N1.Ok) {
            return;
        }
        c5792o1.m21454b(AbstractC6003a.m21752k());
    }
}
