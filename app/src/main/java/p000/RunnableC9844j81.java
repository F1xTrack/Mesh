package p000;

import android.content.res.Configuration;
import com.p018my.tracker.ads.AdEvent;
import com.p018my.tracker.miniapps.MiniAppEvent;
import com.p018my.tracker.obfuscated.C2313f0;
import com.yandex.metrica.RunnableC3792k;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.C6017f;
import io.sentry.C6193y;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.android.replay.C5949i;
import io.sentry.android.replay.C5950j;
import io.sentry.android.replay.C5954n;
import io.sentry.android.replay.capture.AbstractC5929c;
import io.sentry.android.replay.capture.C5928b;
import io.sentry.android.replay.capture.C5932f;
import io.sentry.android.replay.capture.C5935i;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.EnumC6089e;
import io.sentry.rrweb.AbstractC6131b;
import io.sentry.rrweb.C6142m;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.p031ok.tracer.profiler.systrace.SystraceProfiler$onStart$traceListener$1;

/* renamed from: j81 */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9844j81 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f34934a;

    /* renamed from: b */
    public final /* synthetic */ long f34935b;

    /* renamed from: c */
    public final /* synthetic */ Object f34936c;

    /* renamed from: d */
    public final /* synthetic */ Object f34937d;

    public /* synthetic */ RunnableC9844j81(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.f34934a = 5;
        this.f34936c = appComponentsBreadcrumbsIntegration;
        this.f34935b = j;
        this.f34937d = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        EnumC6089e enumC6089e = null;
        long j = this.f34935b;
        Object obj = this.f34937d;
        Object obj2 = this.f34936c;
        switch (this.f34934a) {
            case 0:
                SystraceProfiler$onStart$traceListener$1.onFinish$lambda$1((File) obj2, (String) obj, j);
                return;
            case 1:
                C8165Qj1 c8165Qj1 = (C8165Qj1) obj2;
                c8165Qj1.getClass();
                int i = AbstractC7485Dh1.f2166a;
                C1474XQ c1474xq = ((SurfaceHolderCallbackC1285UQ) c8165Qj1.f9757b).f11780a;
                C7251zE c7251zE = c1474xq.f13736r;
                C1514Y3 c1514y3M26333P = c7251zE.m26333P();
                c7251zE.m26334Q(c1514y3M26333P, 26, new C0424Gj(c1514y3M26333P, obj, j));
                if (c1474xq.f13706R == obj) {
                    c1474xq.f13730m.m8134f(26, new C6730rE(22));
                    return;
                }
                return;
            case 2:
                ((C2313f0) obj2).m12989a((AdEvent) obj, j);
                return;
            case 3:
                ((C2313f0) obj2).m12997a((String) obj, j);
                return;
            case 4:
                ((C2313f0) obj2).m12990a((MiniAppEvent) obj, j);
                return;
            case 5:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
                if (appComponentsBreadcrumbsIntegration.f33512b != null) {
                    int i2 = appComponentsBreadcrumbsIntegration.f33511a.getResources().getConfiguration().orientation;
                    if (i2 == 1) {
                        enumC6089e = EnumC6089e.PORTRAIT;
                    } else if (i2 == 2) {
                        enumC6089e = EnumC6089e.LANDSCAPE;
                    }
                    String lowerCase = enumC6089e != null ? enumC6089e.name().toLowerCase(Locale.ROOT) : StringUtils.UNDEFINED;
                    C6017f c6017f = new C6017f(j);
                    c6017f.f34146d = "navigation";
                    c6017f.f34148f = "device.orientation";
                    c6017f.m21778b(lowerCase, "position");
                    c6017f.f34150h = EnumC6069n1.INFO;
                    C6193y c6193y = new C6193y();
                    c6193y.m21928c((Configuration) obj, "android:configuration");
                    appComponentsBreadcrumbsIntegration.f33512b.mo21376v(c6017f, c6193y);
                    return;
                }
                return;
            default:
                C5932f c5932f = (C5932f) obj2;
                O90.m5968f(c5932f, "this$0");
                C5954n c5954n = (C5954n) obj;
                C5950j c5950j = c5932f.f33925i;
                if (c5950j != null) {
                    c5954n.invoke(c5950j, Long.valueOf(j));
                }
                c5932f.f33947u.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - c5932f.f33945s.getSessionReplay().f33291i;
                C5950j c5950j2 = c5932f.f33925i;
                if (c5950j2 != null) {
                    TO0 to0 = new TO0();
                    AbstractC0246Du.m1924q(c5950j2.f33994g, new C5949i(jCurrentTimeMillis, c5950j2, to0, 0));
                    str = (String) to0.f11337a;
                } else {
                    str = null;
                }
                InterfaceC10293mf0 interfaceC10293mf0 = AbstractC5929c.f33916r[2];
                C5928b c5928b = c5932f.f33929m;
                c5928b.getClass();
                O90.m5968f(interfaceC10293mf0, "property");
                Object andSet = c5928b.f33913b.getAndSet(str);
                if (!O90.m5963a(andSet, str)) {
                    C1563Yq c1563Yq = new C1563Yq(andSet, str, c5928b.f33915d);
                    AbstractC5929c abstractC5929c = c5928b.f33914c;
                    if (abstractC5929c.f33917a.getMainThreadChecker().mo21581a()) {
                        AbstractC6003a.m21738G(AbstractC5929c.m21650g(abstractC5929c), abstractC5929c.f33917a, "CaptureStrategy.runInBackground", new RunnableC3792k(6, c1563Yq));
                    } else {
                        c1563Yq.invoke();
                    }
                }
                ArrayList arrayList = c5932f.f33949w;
                SO0 so0 = new SO0();
                AbstractC0246Du.m1924q(arrayList, new C5949i(jCurrentTimeMillis, c5932f, so0, 1));
                if (so0.f10713a) {
                    Iterator it = arrayList.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC7230yu.m26279j();
                            throw null;
                        }
                        C5935i c5935i = (C5935i) next;
                        c5935i.f33950a.f33276t = i3;
                        List<AbstractC6131b> list = c5935i.f33951b.f33300b;
                        if (list != null) {
                            for (AbstractC6131b abstractC6131b : list) {
                                if (abstractC6131b instanceof C6142m) {
                                    ((C6142m) abstractC6131b).f34596d = i3;
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

    public /* synthetic */ RunnableC9844j81(Object obj, Object obj2, long j, int i) {
        this.f34934a = i;
        this.f34936c = obj;
        this.f34937d = obj2;
        this.f34935b = j;
    }
}
