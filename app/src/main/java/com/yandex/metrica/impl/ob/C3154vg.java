package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.ob.C3217y;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.vg */
/* loaded from: classes2.dex */
public final class C3154vg extends C2955ng {
    private final C3054rg i;
    private final C3234yg j;
    private final C3209xg k;
    private final I2 l;

    /* renamed from: com.yandex.metrica.impl.ob.vg$A */
    public class A implements Runnable {
        final /* synthetic */ C3217y.c a;

        public A(C3217y.c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$B */
    public class B implements Runnable {
        final /* synthetic */ String a;

        public B(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).reportEvent(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$C */
    public class C implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public C(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).reportEvent(this.a, this.b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$D */
    public class D implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ List b;

        public D(String str, List list) {
            this.a = str;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).reportEvent(this.a, U2.a(this.b));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$E */
    public class E implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Throwable b;

        public E(String str, Throwable th) {
            this.a = str;
            this.b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).reportError(this.a, this.b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$a */
    public class RunnableC3155a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Throwable c;

        public RunnableC3155a(String str, String str2, Throwable th) {
            this.a = str;
            this.b = str2;
            this.c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).reportError(this.a, this.b, this.c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$b */
    public class RunnableC3156b implements Runnable {
        final /* synthetic */ Throwable a;

        public RunnableC3156b(Throwable th) {
            this.a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).reportUnhandledException(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$c */
    public class RunnableC3157c implements Runnable {
        final /* synthetic */ String a;

        public RunnableC3157c(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).c(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$d */
    public class RunnableC3158d implements Runnable {
        final /* synthetic */ Intent a;

        public RunnableC3158d(Intent intent) {
            this.a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.c(C3154vg.this).a().a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$e */
    public class RunnableC3159e implements Runnable {
        final /* synthetic */ String a;

        public RunnableC3159e(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.c(C3154vg.this).a().a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$f */
    public class f implements Runnable {
        final /* synthetic */ Intent a;

        public f(Intent intent) {
            this.a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.c(C3154vg.this).a().a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$g */
    public class g implements Runnable {
        final /* synthetic */ String a;

        public g(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$h */
    public class h implements Runnable {
        final /* synthetic */ Location a;

        public h(Location location) {
            this.a = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3104tg c3104tgE = C3154vg.this.e();
            Location location = this.a;
            c3104tgE.getClass();
            C2892l3.a(location);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$i */
    public class i implements Runnable {
        final /* synthetic */ boolean a;

        public i(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3104tg c3104tgE = C3154vg.this.e();
            boolean z = this.a;
            c3104tgE.getClass();
            C2892l3.a(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$j */
    public class j implements Runnable {
        final /* synthetic */ boolean a;

        public j(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3104tg c3104tgE = C3154vg.this.e();
            boolean z = this.a;
            c3104tgE.getClass();
            C2892l3.a(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$k */
    public class k implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ YandexMetricaConfig b;
        final /* synthetic */ com.yandex.metrica.y c;

        public k(Context context, YandexMetricaConfig yandexMetricaConfig, com.yandex.metrica.y yVar) {
            this.a = context;
            this.b = yandexMetricaConfig;
            this.c = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3104tg c3104tgE = C3154vg.this.e();
            Context context = this.a;
            c3104tgE.getClass();
            C2892l3.a(context).b(this.b, C3154vg.this.c().a(this.c));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$l */
    public class l implements Runnable {
        final /* synthetic */ boolean a;

        public l(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3104tg c3104tgE = C3154vg.this.e();
            boolean z = this.a;
            c3104tgE.getClass();
            C2892l3.c(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$m */
    public class m implements Runnable {
        final /* synthetic */ String a;

        public m(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3104tg c3104tgE = C3154vg.this.e();
            String str = this.a;
            c3104tgE.getClass();
            C2892l3.a(str);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$n */
    public class n implements Runnable {
        final /* synthetic */ UserProfile a;

        public n(UserProfile userProfile) {
            this.a = userProfile;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).reportUserProfile(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$o */
    public class o implements Runnable {
        final /* synthetic */ Revenue a;

        public o(Revenue revenue) {
            this.a = revenue;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).reportRevenue(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$p */
    public class p implements Runnable {
        final /* synthetic */ ECommerceEvent a;

        public p(ECommerceEvent eCommerceEvent) {
            this.a = eCommerceEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).reportECommerce(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$q */
    public class q implements Runnable {
        final /* synthetic */ DeferredDeeplinkParametersListener a;

        public q(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
            this.a = deferredDeeplinkParametersListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.this.e().getClass();
            C2892l3.k().a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$r */
    public class r implements Runnable {
        final /* synthetic */ DeferredDeeplinkListener a;

        public r(DeferredDeeplinkListener deferredDeeplinkListener) {
            this.a = deferredDeeplinkListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.this.e().getClass();
            C2892l3.k().a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$s */
    public class s implements Runnable {
        final /* synthetic */ AppMetricaDeviceIDListener a;

        public s(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.a = appMetricaDeviceIDListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.this.e().getClass();
            C2892l3.k().b(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$t */
    public class t implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public t(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3104tg c3104tgE = C3154vg.this.e();
            String str = this.a;
            String str2 = this.b;
            c3104tgE.getClass();
            C2892l3.a(str, str2);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$u */
    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).a(C3154vg.this.h());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$v */
    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$w */
    public class w implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public w(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).a(this.a, this.b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$x */
    public class x implements Runnable {
        final /* synthetic */ String a;

        public x(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.a(C3154vg.this).b(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$y */
    public class y implements Runnable {
        final /* synthetic */ Activity a;

        public y(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.this.l.b(this.a, C3154vg.a(C3154vg.this));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$z */
    public class z implements Runnable {
        final /* synthetic */ Activity a;

        public z(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3154vg.this.l.a(this.a, C3154vg.a(C3154vg.this));
        }
    }

    public C3154vg(InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(new C3104tg(), interfaceExecutorC3086sn, new C3234yg(), new C3209xg(), new X2());
    }

    public void a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        this.j.a(context, yandexMetricaConfig);
        com.yandex.metrica.y yVarA = this.k.a(yandexMetricaConfig instanceof com.yandex.metrica.y ? (com.yandex.metrica.y) yandexMetricaConfig : new com.yandex.metrica.y(yandexMetricaConfig));
        com.yandex.metrica.v vVarG = g();
        vVarG.getClass();
        vVarG.e.a(context);
        Boolean bool = yVarA.sessionsAutoTrackingEnabled;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            vVarG.d.a(true);
        }
        vVarG.a.getClass();
        C2892l3.a(context).b(yVarA);
        ((C3061rn) d()).execute(new k(context, yandexMetricaConfig, yVarA));
        e().getClass();
        C2892l3.j();
    }

    public void c(Activity activity) {
        a().a(null);
        this.j.getClass();
        g().getClass();
        ((C3061rn) d()).execute(new y(activity));
    }

    public void d(String str) {
        a().a(null);
        this.j.c(str);
        g().getClass();
        ((C3061rn) d()).execute(new RunnableC3157c(str));
    }

    public void e(String str) {
        a().a(null);
        this.j.a(str);
        ((C3061rn) d()).execute(new g(str));
    }

    public void f(String str) {
        this.j.getClass();
        g().getClass();
        ((C3061rn) d()).execute(new m(str));
    }

    public void i() {
        a().a(null);
        this.j.getClass();
        g().getClass();
        ((C3061rn) d()).execute(new v());
    }

    private C3154vg(C3104tg c3104tg, InterfaceExecutorC3086sn interfaceExecutorC3086sn, C3234yg c3234yg, C3209xg c3209xg, X2 x2) {
        this(c3104tg, interfaceExecutorC3086sn, c3234yg, c3209xg, new C2930mg(c3104tg), new C3054rg(c3104tg), x2, new com.yandex.metrica.v(c3104tg, x2), C3030qg.a(), Y.g().f(), Y.g().k(), Y.g().e());
    }

    public void b(String str) throws ValidationException {
        a().a(null);
        this.j.reportEvent(str);
        g().getClass();
        ((C3061rn) d()).execute(new B(str));
    }

    public C3154vg(C3104tg c3104tg, InterfaceExecutorC3086sn interfaceExecutorC3086sn, C3234yg c3234yg, C3209xg c3209xg, C2930mg c2930mg, C3054rg c3054rg, X2 x2, com.yandex.metrica.v vVar, C3030qg c3030qg, C3113u0 c3113u0, I2 i2, C2815i0 c2815i0) {
        super(c3104tg, interfaceExecutorC3086sn, c2930mg, x2, vVar, c3030qg, c3113u0, c2815i0);
        this.k = c3209xg;
        this.j = c3234yg;
        this.i = c3054rg;
        this.l = i2;
    }

    public void b(String str, String str2) throws ValidationException {
        a().a(null);
        this.j.reportEvent(str, str2);
        g().getClass();
        ((C3061rn) d()).execute(new C(str, str2));
    }

    public void c(String str, String str2) {
        a().a(null);
        if (this.j.f(str)) {
            g().getClass();
            ((C3061rn) d()).execute(new w(str, str2));
        }
    }

    public void b(Activity activity) {
        Intent intent = null;
        a().a(null);
        this.j.c(activity);
        g().getClass();
        if (activity != null) {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
            }
        }
        ((C3061rn) d()).execute(new RunnableC3158d(intent));
    }

    public void c(String str) {
        if (this.i.a().b() && this.j.g(str)) {
            g().getClass();
            ((C3061rn) d()).execute(new x(str));
        }
    }

    public static C3089t1 c(C3154vg c3154vg) {
        c3154vg.e().getClass();
        return C2892l3.k().d();
    }

    public void a(Activity activity) {
        a().a(null);
        this.j.getClass();
        g().getClass();
        ((C3061rn) d()).execute(new z(activity));
    }

    public void b(Context context, boolean z2) {
        this.j.b(context);
        g().e.a(context);
        ((C3061rn) d()).execute(new l(z2));
    }

    public void a(Application application) {
        a().a(null);
        this.j.a(application);
        com.yandex.metrica.v vVarG = g();
        vVarG.c.a(application);
        C3217y.c cVarA = vVarG.d.a(false);
        ((C3061rn) d()).execute(new A(cVarA));
    }

    public void a(String str, Map<String, Object> map) throws ValidationException {
        a().a(null);
        this.j.reportEvent(str, map);
        g().getClass();
        List listA = U2.a((Map) map);
        ((C3061rn) d()).execute(new D(str, listA));
    }

    public void a(String str, Throwable th) throws ValidationException {
        a().a(null);
        this.j.reportError(str, th);
        g().getClass();
        if (th == null) {
            th = new S6();
            th.fillInStackTrace();
        }
        ((C3061rn) d()).execute(new E(str, th));
    }

    public void a(String str, String str2, Throwable th) {
        a().a(null);
        this.j.reportError(str, str2, th);
        ((C3061rn) d()).execute(new RunnableC3155a(str, str2, th));
    }

    public void a(Throwable th) throws ValidationException {
        a().a(null);
        this.j.reportUnhandledException(th);
        g().getClass();
        ((C3061rn) d()).execute(new RunnableC3156b(th));
    }

    public void a(String str) {
        a().a(null);
        this.j.e(str);
        g().getClass();
        ((C3061rn) d()).execute(new RunnableC3159e(str));
    }

    public void a(Intent intent) {
        a().a(null);
        this.j.a(intent);
        g().getClass();
        ((C3061rn) d()).execute(new f(intent));
    }

    public void a(Location location) {
        this.j.getClass();
        g().getClass();
        ((C3061rn) d()).execute(new h(location));
    }

    public void a(boolean z2) {
        this.j.getClass();
        g().getClass();
        ((C3061rn) d()).execute(new i(z2));
    }

    public void a(Context context, boolean z2) {
        this.j.a(context);
        g().e.a(context);
        ((C3061rn) d()).execute(new j(z2));
    }

    public void a(UserProfile userProfile) throws ValidationException {
        a().a(null);
        this.j.reportUserProfile(userProfile);
        g().getClass();
        ((C3061rn) d()).execute(new n(userProfile));
    }

    public void a(Revenue revenue) throws ValidationException {
        a().a(null);
        this.j.reportRevenue(revenue);
        g().getClass();
        ((C3061rn) d()).execute(new o(revenue));
    }

    public void a(ECommerceEvent eCommerceEvent) {
        a().a(null);
        this.j.reportECommerce(eCommerceEvent);
        g().getClass();
        ((C3061rn) d()).execute(new p(eCommerceEvent));
    }

    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        a().a(null);
        this.j.a(deferredDeeplinkParametersListener);
        g().getClass();
        ((C3061rn) d()).execute(new q(deferredDeeplinkParametersListener));
    }

    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        a().a(null);
        this.j.a(deferredDeeplinkListener);
        g().getClass();
        ((C3061rn) d()).execute(new r(deferredDeeplinkListener));
    }

    public void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        a().a(null);
        this.j.a(appMetricaDeviceIDListener);
        g().getClass();
        ((C3061rn) d()).execute(new s(appMetricaDeviceIDListener));
    }

    public IReporter a(Context context, String str) {
        this.j.a(context, str);
        b().a(context);
        return f().a(context, str);
    }

    public void a(Context context, ReporterConfig reporterConfig) {
        this.j.a(context, reporterConfig);
        com.yandex.metrica.u uVar = new com.yandex.metrica.u(reporterConfig);
        g().e.a(context);
        f().a(context, uVar);
    }

    public void a(String str, String str2) {
        this.j.d(str);
        g().getClass();
        ((C3061rn) d()).execute(new t(str, str2));
    }

    public void a(WebView webView) {
        a().a(null);
        this.j.a(webView);
        g().b.a(webView, this);
        ((C3061rn) d()).execute(new u());
    }

    public static U0 a(C3154vg c3154vg) {
        c3154vg.e().getClass();
        return C2892l3.k().d().b();
    }
}
