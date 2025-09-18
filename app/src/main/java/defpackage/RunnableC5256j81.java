package defpackage;

import android.content.res.Configuration;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.f0;
import com.yandex.metrica.k;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.C5122f;
import io.sentry.C5185y;
import io.sentry.EnumC5148n1;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.android.replay.capture.b;
import io.sentry.android.replay.capture.c;
import io.sentry.android.replay.capture.f;
import io.sentry.android.replay.i;
import io.sentry.android.replay.j;
import io.sentry.android.replay.n;
import io.sentry.config.a;
import io.sentry.protocol.EnumC5159e;
import io.sentry.rrweb.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.ok.tracer.profiler.systrace.SystraceProfiler$onStart$traceListener$1;

/* renamed from: j81 */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5256j81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC5256j81(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.a = 5;
        this.c = appComponentsBreadcrumbsIntegration;
        this.b = j;
        this.d = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        EnumC5159e enumC5159e = null;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                SystraceProfiler$onStart$traceListener$1.onFinish$lambda$1((File) obj2, (String) obj, j);
                return;
            case 1:
                C1296Qj1 c1296Qj1 = (C1296Qj1) obj2;
                c1296Qj1.getClass();
                int i = AbstractC0277Dh1.a;
                XQ xq = ((UQ) c1296Qj1.b).a;
                C8323zE c8323zE = xq.r;
                Y3 y3P = c8323zE.P();
                c8323zE.Q(y3P, 26, new C0515Gj(y3P, obj, j));
                if (xq.R == obj) {
                    xq.m.f(26, new C6799rE(22));
                    return;
                }
                return;
            case 2:
                ((f0) obj2).a((AdEvent) obj, j);
                return;
            case 3:
                ((f0) obj2).a((String) obj, j);
                return;
            case 4:
                ((f0) obj2).a((MiniAppEvent) obj, j);
                return;
            case 5:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
                if (appComponentsBreadcrumbsIntegration.b != null) {
                    int i2 = appComponentsBreadcrumbsIntegration.a.getResources().getConfiguration().orientation;
                    if (i2 == 1) {
                        enumC5159e = EnumC5159e.PORTRAIT;
                    } else if (i2 == 2) {
                        enumC5159e = EnumC5159e.LANDSCAPE;
                    }
                    String lowerCase = enumC5159e != null ? enumC5159e.name().toLowerCase(Locale.ROOT) : StringUtils.UNDEFINED;
                    C5122f c5122f = new C5122f(j);
                    c5122f.d = "navigation";
                    c5122f.f = "device.orientation";
                    c5122f.b(lowerCase, "position");
                    c5122f.h = EnumC5148n1.INFO;
                    C5185y c5185y = new C5185y();
                    c5185y.c((Configuration) obj, "android:configuration");
                    appComponentsBreadcrumbsIntegration.b.v(c5122f, c5185y);
                    return;
                }
                return;
            default:
                f fVar = (f) obj2;
                O90.f(fVar, "this$0");
                n nVar = (n) obj;
                j jVar = fVar.i;
                if (jVar != null) {
                    nVar.invoke(jVar, Long.valueOf(j));
                }
                fVar.u.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - fVar.s.getSessionReplay().i;
                j jVar2 = fVar.i;
                if (jVar2 != null) {
                    TO0 to0 = new TO0();
                    AbstractC0314Du.q(jVar2.g, new i(jCurrentTimeMillis, jVar2, to0, 0));
                    str = (String) to0.a;
                } else {
                    str = null;
                }
                InterfaceC5927mf0 interfaceC5927mf0 = c.r[2];
                b bVar = fVar.m;
                bVar.getClass();
                O90.f(interfaceC5927mf0, "property");
                Object andSet = bVar.b.getAndSet(str);
                if (!O90.a(andSet, str)) {
                    C1939Yq c1939Yq = new C1939Yq(andSet, str, bVar.d);
                    c cVar = bVar.c;
                    if (cVar.a.getMainThreadChecker().a()) {
                        a.G(c.g(cVar), cVar.a, "CaptureStrategy.runInBackground", new k(6, c1939Yq));
                    } else {
                        c1939Yq.invoke();
                    }
                }
                ArrayList arrayList = fVar.w;
                SO0 so0 = new SO0();
                AbstractC0314Du.q(arrayList, new i(jCurrentTimeMillis, fVar, so0, 1));
                if (so0.a) {
                    Iterator it = arrayList.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC8259yu.j();
                            throw null;
                        }
                        io.sentry.android.replay.capture.i iVar = (io.sentry.android.replay.capture.i) next;
                        iVar.a.t = i3;
                        List<io.sentry.rrweb.b> list = iVar.b.b;
                        if (list != null) {
                            for (io.sentry.rrweb.b bVar2 : list) {
                                if (bVar2 instanceof m) {
                                    ((m) bVar2).d = i3;
                                }
                            }
                        }
                        i3 = i4;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC5256j81(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
