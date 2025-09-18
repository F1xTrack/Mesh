package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C3802u;
import com.yandex.metrica.C3803v;
import com.yandex.metrica.C3806y;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.p022ob.C3739y;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.vg */
/* loaded from: classes2.dex */
public final class C3678vg extends C3470ng {

    /* renamed from: i */
    private final C3574rg f25017i;

    /* renamed from: j */
    private final C3756yg f25018j;

    /* renamed from: k */
    private final C3730xg f25019k;

    /* renamed from: l */
    private final C2669I2 f25020l;

    /* renamed from: com.yandex.metrica.impl.ob.vg$A */
    public class A implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3739y.c f25021a;

        public A(C3739y.c cVar) {
            this.f25021a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).mo14486a(this.f25021a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$B */
    public class B implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f25023a;

        public B(String str) {
            this.f25023a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).reportEvent(this.f25023a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$C */
    public class C implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f25025a;

        /* renamed from: b */
        final /* synthetic */ String f25026b;

        public C(String str, String str2) {
            this.f25025a = str;
            this.f25026b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).reportEvent(this.f25025a, this.f25026b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$D */
    public class D implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f25028a;

        /* renamed from: b */
        final /* synthetic */ List f25029b;

        public D(String str, List list) {
            this.f25028a = str;
            this.f25029b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).reportEvent(this.f25028a, C2968U2.m15237a(this.f25029b));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$E */
    public class E implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f25031a;

        /* renamed from: b */
        final /* synthetic */ Throwable f25032b;

        public E(String str, Throwable th) {
            this.f25031a = str;
            this.f25032b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).reportError(this.f25031a, this.f25032b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$a */
    public class RunnableC9028a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f25034a;

        /* renamed from: b */
        final /* synthetic */ String f25035b;

        /* renamed from: c */
        final /* synthetic */ Throwable f25036c;

        public RunnableC9028a(String str, String str2, Throwable th) {
            this.f25034a = str;
            this.f25035b = str2;
            this.f25036c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).reportError(this.f25034a, this.f25035b, this.f25036c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$b */
    public class RunnableC9029b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Throwable f25038a;

        public RunnableC9029b(Throwable th) {
            this.f25038a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).reportUnhandledException(this.f25038a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$c */
    public class RunnableC9030c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f25040a;

        public RunnableC9030c(String str) {
            this.f25040a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).mo14384c(this.f25040a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$d */
    public class RunnableC9031d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Intent f25042a;

        public RunnableC9031d(Intent intent) {
            this.f25042a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16980c(C3678vg.this).m16806a().m16642a(this.f25042a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$e */
    public class RunnableC9032e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f25044a;

        public RunnableC9032e(String str) {
            this.f25044a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16980c(C3678vg.this).m16806a().m16643a(this.f25044a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$f */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Intent f25046a;

        public f(Intent intent) {
            this.f25046a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16980c(C3678vg.this).m16806a().m16642a(this.f25046a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$g */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f25048a;

        public g(String str) {
            this.f25048a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).mo14487a(this.f25048a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$h */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Location f25050a;

        public h(Location location) {
            this.f25050a = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3626tg c3626tgM16492e = C3678vg.this.m16492e();
            Location location = this.f25050a;
            c3626tgM16492e.getClass();
            C3405l3.m16350a(location);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$i */
    public class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f25052a;

        public i(boolean z) {
            this.f25052a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3626tg c3626tgM16492e = C3678vg.this.m16492e();
            boolean z = this.f25052a;
            c3626tgM16492e.getClass();
            C3405l3.m16353a(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$j */
    public class j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f25054a;

        public j(boolean z) {
            this.f25054a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3626tg c3626tgM16492e = C3678vg.this.m16492e();
            boolean z = this.f25054a;
            c3626tgM16492e.getClass();
            C3405l3.m16353a(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$k */
    public class k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f25056a;

        /* renamed from: b */
        final /* synthetic */ YandexMetricaConfig f25057b;

        /* renamed from: c */
        final /* synthetic */ C3806y f25058c;

        public k(Context context, YandexMetricaConfig yandexMetricaConfig, C3806y c3806y) {
            this.f25056a = context;
            this.f25057b = yandexMetricaConfig;
            this.f25058c = c3806y;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3626tg c3626tgM16492e = C3678vg.this.m16492e();
            Context context = this.f25056a;
            c3626tgM16492e.getClass();
            C3405l3.m16349a(context).m16371b(this.f25057b, C3678vg.this.m16490c().m16886a(this.f25058c));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$l */
    public class l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f25060a;

        public l(boolean z) {
            this.f25060a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3626tg c3626tgM16492e = C3678vg.this.m16492e();
            boolean z = this.f25060a;
            c3626tgM16492e.getClass();
            C3405l3.m16357c(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$m */
    public class m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f25062a;

        public m(String str) {
            this.f25062a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3626tg c3626tgM16492e = C3678vg.this.m16492e();
            String str = this.f25062a;
            c3626tgM16492e.getClass();
            C3405l3.m16351a(str);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$n */
    public class n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UserProfile f25064a;

        public n(UserProfile userProfile) {
            this.f25064a = userProfile;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).reportUserProfile(this.f25064a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$o */
    public class o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Revenue f25066a;

        public o(Revenue revenue) {
            this.f25066a = revenue;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).reportRevenue(this.f25066a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$p */
    public class p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ECommerceEvent f25068a;

        public p(ECommerceEvent eCommerceEvent) {
            this.f25068a = eCommerceEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).reportECommerce(this.f25068a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$q */
    public class q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DeferredDeeplinkParametersListener f25070a;

        public q(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
            this.f25070a = deferredDeeplinkParametersListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.this.m16492e().getClass();
            C3405l3.m16363k().m16367a(this.f25070a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$r */
    public class r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DeferredDeeplinkListener f25072a;

        public r(DeferredDeeplinkListener deferredDeeplinkListener) {
            this.f25072a = deferredDeeplinkListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.this.m16492e().getClass();
            C3405l3.m16363k().m16366a(this.f25072a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$s */
    public class s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppMetricaDeviceIDListener f25074a;

        public s(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f25074a = appMetricaDeviceIDListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.this.m16492e().getClass();
            C3405l3.m16363k().m16370b(this.f25074a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$t */
    public class t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f25076a;

        /* renamed from: b */
        final /* synthetic */ String f25077b;

        public t(String str, String str2) {
            this.f25076a = str;
            this.f25077b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3626tg c3626tgM16492e = C3678vg.this.m16492e();
            String str = this.f25076a;
            String str2 = this.f25077b;
            c3626tgM16492e.getClass();
            C3405l3.m16352a(str, str2);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$u */
    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).mo14485a(C3678vg.this.m16495h());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$v */
    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$w */
    public class w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f25081a;

        /* renamed from: b */
        final /* synthetic */ String f25082b;

        public w(String str, String str2) {
            this.f25081a = str;
            this.f25082b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).mo14378a(this.f25081a, this.f25082b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$x */
    public class x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f25084a;

        public x(String str) {
            this.f25084a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.m16978a(C3678vg.this).mo14383b(this.f25084a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$y */
    public class y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f25086a;

        public y(Activity activity) {
            this.f25086a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.this.f25020l.m14280b(this.f25086a, C3678vg.m16978a(C3678vg.this));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$z */
    public class z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f25088a;

        public z(Activity activity) {
            this.f25088a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3678vg.this.f25020l.m14278a(this.f25088a, C3678vg.m16978a(C3678vg.this));
        }
    }

    public C3678vg(InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(new C3626tg(), interfaceExecutorC3607sn, new C3756yg(), new C3730xg(), new C3043X2());
    }

    /* renamed from: a */
    public void m16985a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        this.f25018j.m17246a(context, yandexMetricaConfig);
        C3806y c3806yM17184a = this.f25019k.m17184a(yandexMetricaConfig instanceof C3806y ? (C3806y) yandexMetricaConfig : new C3806y(yandexMetricaConfig));
        C3803v c3803vM16494g = m16494g();
        c3803vM16494g.getClass();
        c3803vM16494g.f25528e.m16074a(context);
        Boolean bool = c3806yM17184a.sessionsAutoTrackingEnabled;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            c3803vM16494g.f25527d.m14277a(true);
        }
        c3803vM16494g.f25524a.getClass();
        C3405l3.m16349a(context).m16372b(c3806yM17184a);
        ((C3581rn) m16491d()).execute(new k(context, yandexMetricaConfig, c3806yM17184a));
        m16492e().getClass();
        C3405l3.m16362j();
    }

    /* renamed from: c */
    public void m17007c(Activity activity) {
        m16488a().mo14391a(null);
        this.f25018j.getClass();
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new y(activity));
    }

    /* renamed from: d */
    public void m17010d(String str) {
        m16488a().mo14391a(null);
        this.f25018j.m17256c(str);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new RunnableC9030c(str));
    }

    /* renamed from: e */
    public void m17011e(String str) {
        m16488a().mo14391a(null);
        this.f25018j.m17253a(str);
        ((C3581rn) m16491d()).execute(new g(str));
    }

    /* renamed from: f */
    public void m17012f(String str) {
        this.f25018j.getClass();
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new m(str));
    }

    /* renamed from: i */
    public void m17013i() {
        m16488a().mo14391a(null);
        this.f25018j.getClass();
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new v());
    }

    private C3678vg(C3626tg c3626tg, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3756yg c3756yg, C3730xg c3730xg, C3043X2 c3043x2) {
        this(c3626tg, interfaceExecutorC3607sn, c3756yg, c3730xg, new C3444mg(c3626tg), new C3574rg(c3626tg), c3043x2, new C3803v(c3626tg, c3043x2), C3548qg.m16620a(), C3065Y.m15442g().m15448f(), C3065Y.m15442g().m15452k(), C3065Y.m15442g().m15447e());
    }

    /* renamed from: b */
    public void m17005b(String str) throws ValidationException {
        m16488a().mo14391a(null);
        this.f25018j.reportEvent(str);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new B(str));
    }

    public C3678vg(C3626tg c3626tg, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3756yg c3756yg, C3730xg c3730xg, C3444mg c3444mg, C3574rg c3574rg, C3043X2 c3043x2, C3803v c3803v, C3548qg c3548qg, C3636u0 c3636u0, C2669I2 c2669i2, C3324i0 c3324i0) {
        super(c3626tg, interfaceExecutorC3607sn, c3444mg, c3043x2, c3803v, c3548qg, c3636u0, c3324i0);
        this.f25019k = c3730xg;
        this.f25018j = c3756yg;
        this.f25017i = c3574rg;
        this.f25020l = c2669i2;
    }

    /* renamed from: b */
    public void m17006b(String str, String str2) throws ValidationException {
        m16488a().mo14391a(null);
        this.f25018j.reportEvent(str, str2);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new C(str, str2));
    }

    /* renamed from: c */
    public void m17009c(String str, String str2) {
        m16488a().mo14391a(null);
        if (this.f25018j.m17259f(str)) {
            m16494g().getClass();
            ((C3581rn) m16491d()).execute(new w(str, str2));
        }
    }

    /* renamed from: b */
    public void m17003b(Activity activity) {
        Intent intent = null;
        m16488a().mo14391a(null);
        this.f25018j.m17255c(activity);
        m16494g().getClass();
        if (activity != null) {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
            }
        }
        ((C3581rn) m16491d()).execute(new RunnableC9031d(intent));
    }

    /* renamed from: c */
    public void m17008c(String str) {
        if (this.f25017i.m16693a().m16805b() && this.f25018j.m17260g(str)) {
            m16494g().getClass();
            ((C3581rn) m16491d()).execute(new x(str));
        }
    }

    /* renamed from: c */
    public static C3611t1 m16980c(C3678vg c3678vg) {
        c3678vg.m16492e().getClass();
        return C3405l3.m16363k().m16375d();
    }

    /* renamed from: a */
    public void m16982a(Activity activity) {
        m16488a().mo14391a(null);
        this.f25018j.getClass();
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new z(activity));
    }

    /* renamed from: b */
    public void m17004b(Context context, boolean z2) {
        this.f25018j.m17254b(context);
        m16494g().f25528e.m16074a(context);
        ((C3581rn) m16491d()).execute(new l(z2));
    }

    /* renamed from: a */
    public void m16983a(Application application) {
        m16488a().mo14391a(null);
        this.f25018j.m17243a(application);
        C3803v c3803vM16494g = m16494g();
        c3803vM16494g.f25526c.m17201a(application);
        C3739y.c cVarM14277a = c3803vM16494g.f25527d.m14277a(false);
        ((C3581rn) m16491d()).execute(new A(cVarM14277a));
    }

    /* renamed from: a */
    public void m17000a(String str, Map<String, Object> map) throws ValidationException {
        m16488a().mo14391a(null);
        this.f25018j.reportEvent(str, map);
        m16494g().getClass();
        List listM15235a = C2968U2.m15235a((Map) map);
        ((C3581rn) m16491d()).execute(new D(str, listM15235a));
    }

    /* renamed from: a */
    public void m16999a(String str, Throwable th) throws ValidationException {
        m16488a().mo14391a(null);
        this.f25018j.reportError(str, th);
        m16494g().getClass();
        if (th == null) {
            th = new C2922S6();
            th.fillInStackTrace();
        }
        ((C3581rn) m16491d()).execute(new E(str, th));
    }

    /* renamed from: a */
    public void m16998a(String str, String str2, Throwable th) {
        m16488a().mo14391a(null);
        this.f25018j.reportError(str, str2, th);
        ((C3581rn) m16491d()).execute(new RunnableC9028a(str, str2, th));
    }

    /* renamed from: a */
    public void m17001a(Throwable th) throws ValidationException {
        m16488a().mo14391a(null);
        this.f25018j.reportUnhandledException(th);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new RunnableC9029b(th));
    }

    /* renamed from: a */
    public void m16996a(String str) {
        m16488a().mo14391a(null);
        this.f25018j.m17258e(str);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new RunnableC9032e(str));
    }

    /* renamed from: a */
    public void m16987a(Intent intent) {
        m16488a().mo14391a(null);
        this.f25018j.m17248a(intent);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new f(intent));
    }

    /* renamed from: a */
    public void m16988a(Location location) {
        this.f25018j.getClass();
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new h(location));
    }

    /* renamed from: a */
    public void m17002a(boolean z2) {
        this.f25018j.getClass();
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new i(z2));
    }

    /* renamed from: a */
    public void m16986a(Context context, boolean z2) {
        this.f25018j.m17244a(context);
        m16494g().f25528e.m16074a(context);
        ((C3581rn) m16491d()).execute(new j(z2));
    }

    /* renamed from: a */
    public void m16995a(UserProfile userProfile) throws ValidationException {
        m16488a().mo14391a(null);
        this.f25018j.reportUserProfile(userProfile);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new n(userProfile));
    }

    /* renamed from: a */
    public void m16993a(Revenue revenue) throws ValidationException {
        m16488a().mo14391a(null);
        this.f25018j.reportRevenue(revenue);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new o(revenue));
    }

    /* renamed from: a */
    public void m16994a(ECommerceEvent eCommerceEvent) {
        m16488a().mo14391a(null);
        this.f25018j.reportECommerce(eCommerceEvent);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new p(eCommerceEvent));
    }

    /* renamed from: a */
    public void m16992a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        m16488a().mo14391a(null);
        this.f25018j.m17252a(deferredDeeplinkParametersListener);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new q(deferredDeeplinkParametersListener));
    }

    /* renamed from: a */
    public void m16991a(DeferredDeeplinkListener deferredDeeplinkListener) {
        m16488a().mo14391a(null);
        this.f25018j.m17251a(deferredDeeplinkListener);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new r(deferredDeeplinkListener));
    }

    /* renamed from: a */
    public void m16990a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        m16488a().mo14391a(null);
        this.f25018j.m17250a(appMetricaDeviceIDListener);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new s(appMetricaDeviceIDListener));
    }

    /* renamed from: a */
    public IReporter m16981a(Context context, String str) {
        this.f25018j.m17247a(context, str);
        m16489b().m16074a(context);
        return m16493f().m16624a(context, str);
    }

    /* renamed from: a */
    public void m16984a(Context context, ReporterConfig reporterConfig) {
        this.f25018j.m17245a(context, reporterConfig);
        C3802u c3802u = new C3802u(reporterConfig);
        m16494g().f25528e.m16074a(context);
        m16493f().m16623a(context, c3802u);
    }

    /* renamed from: a */
    public void m16997a(String str, String str2) {
        this.f25018j.m17257d(str);
        m16494g().getClass();
        ((C3581rn) m16491d()).execute(new t(str, str2));
    }

    /* renamed from: a */
    public void m16989a(WebView webView) {
        m16488a().mo14391a(null);
        this.f25018j.m17249a(webView);
        m16494g().f25525b.m15411a(webView, this);
        ((C3581rn) m16491d()).execute(new u());
    }

    /* renamed from: a */
    public static InterfaceC2966U0 m16978a(C3678vg c3678vg) {
        c3678vg.m16492e().getClass();
        return C3405l3.m16363k().m16375d().m16807b();
    }
}
