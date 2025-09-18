package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.C3801t;
import com.yandex.metrica.C3802u;
import com.yandex.metrica.C3803v;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.pg */
/* loaded from: classes2.dex */
public class C3522pg implements InterfaceC3016W0 {

    /* renamed from: a */
    private final C3626tg f24450a;

    /* renamed from: b */
    private final C2508Bg f24451b;

    /* renamed from: c */
    private final InterfaceExecutorC3607sn f24452c;

    /* renamed from: d */
    private final Context f24453d;

    /* renamed from: e */
    private final C3730xg f24454e;

    /* renamed from: f */
    private final C3802u f24455f;

    /* renamed from: g */
    private final C3803v f24456g;

    /* renamed from: h */
    private final C3496og f24457h;

    /* renamed from: com.yandex.metrica.impl.ob.pg$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f24458a;

        /* renamed from: b */
        final /* synthetic */ String f24459b;

        public a(String str, String str2) {
            this.f24458a = str;
            this.f24459b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().mo13934b(this.f24458a, this.f24459b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f24461a;

        /* renamed from: b */
        final /* synthetic */ String f24462b;

        public b(String str, String str2) {
            this.f24461a = str;
            this.f24462b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().mo13935d(this.f24461a, this.f24462b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$c */
    public class c implements InterfaceC3088Ym<InterfaceC3016W0> {

        /* renamed from: a */
        final /* synthetic */ C3626tg f24464a;

        /* renamed from: b */
        final /* synthetic */ Context f24465b;

        /* renamed from: c */
        final /* synthetic */ C3802u f24466c;

        public c(C3626tg c3626tg, Context context, C3802u c3802u) {
            this.f24464a = c3626tg;
            this.f24465b = context;
            this.f24466c = c3802u;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3088Ym
        /* renamed from: a */
        public InterfaceC3016W0 mo15519a() {
            C3626tg c3626tg = this.f24464a;
            Context context = this.f24465b;
            C3802u c3802u = this.f24466c;
            c3626tg.getClass();
            return C3405l3.m16349a(context).m16364a(c3802u);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$d */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f24467a;

        public d(String str) {
            this.f24467a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().reportEvent(this.f24467a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$e */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f24469a;

        /* renamed from: b */
        final /* synthetic */ String f24470b;

        public e(String str, String str2) {
            this.f24469a = str;
            this.f24470b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().reportEvent(this.f24469a, this.f24470b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$f */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f24472a;

        /* renamed from: b */
        final /* synthetic */ List f24473b;

        public f(String str, List list) {
            this.f24472a = str;
            this.f24473b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().reportEvent(this.f24472a, C2968U2.m15237a(this.f24473b));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$g */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f24475a;

        /* renamed from: b */
        final /* synthetic */ Throwable f24476b;

        public g(String str, Throwable th) {
            this.f24475a = str;
            this.f24476b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().reportError(this.f24475a, this.f24476b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$h */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f24478a;

        /* renamed from: b */
        final /* synthetic */ String f24479b;

        /* renamed from: c */
        final /* synthetic */ Throwable f24480c;

        public h(String str, String str2, Throwable th) {
            this.f24478a = str;
            this.f24479b = str2;
            this.f24480c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().reportError(this.f24478a, this.f24479b, this.f24480c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$i */
    public class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Throwable f24482a;

        public i(Throwable th) {
            this.f24482a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().reportUnhandledException(this.f24482a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$j */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().resumeSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$k */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().pauseSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$l */
    public class l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f24486a;

        public l(String str) {
            this.f24486a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().setUserProfileID(this.f24486a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$m */
    public class m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3513p7 f24488a;

        public m(C3513p7 c3513p7) {
            this.f24488a = c3513p7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().mo14377a(this.f24488a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$n */
    public class n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UserProfile f24490a;

        public n(UserProfile userProfile) {
            this.f24490a = userProfile;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().reportUserProfile(this.f24490a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$o */
    public class o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Revenue f24492a;

        public o(Revenue revenue) {
            this.f24492a = revenue;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().reportRevenue(this.f24492a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$p */
    public class p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ECommerceEvent f24494a;

        public p(ECommerceEvent eCommerceEvent) {
            this.f24494a = eCommerceEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().reportECommerce(this.f24494a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$q */
    public class q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f24496a;

        public q(boolean z) {
            this.f24496a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().setStatisticsSending(this.f24496a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$r */
    public class r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3802u f24498a;

        public r(C3802u c3802u) {
            this.f24498a = c3802u;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.m16584a(C3522pg.this, this.f24498a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$s */
    public class s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3802u f24500a;

        public s(C3802u c3802u) {
            this.f24500a = c3802u;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.m16584a(C3522pg.this, this.f24500a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$t */
    public class t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3227e7 f24502a;

        public t(C3227e7 c3227e7) {
            this.f24502a = c3227e7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().mo14375a(this.f24502a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$u */
    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().mo14381b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$v */
    public class v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f24505a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f24506b;

        public v(String str, JSONObject jSONObject) {
            this.f24505a = str;
            this.f24506b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().mo14379a(this.f24505a, this.f24506b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$w */
    public class w implements Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3522pg.this.m16585a().sendEventsBuffer();
        }
    }

    public C3522pg(InterfaceExecutorC3607sn interfaceExecutorC3607sn, Context context, String str) {
        this(interfaceExecutorC3607sn, context.getApplicationContext(), str, new C3626tg());
    }

    /* renamed from: a */
    public final InterfaceC3016W0 m16585a() {
        C3626tg c3626tg = this.f24450a;
        Context context = this.f24453d;
        C3802u c3802u = this.f24455f;
        c3626tg.getClass();
        return C3405l3.m16349a(context).m16364a(c3802u);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0
    /* renamed from: b */
    public void mo14381b() {
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new u());
    }

    /* renamed from: d */
    public void m16587d(String str) {
        C3802u c3802u = new C3802u(new C3801t(str));
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new r(c3802u));
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this.f24457h;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        this.f24451b.getClass();
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new k());
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f24451b.reportECommerce(eCommerceEvent);
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new p(eCommerceEvent));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) throws ValidationException {
        this.f24451b.reportError(str, th);
        this.f24456g.getClass();
        if (th == null) {
            th = new C2922S6();
            th.fillInStackTrace();
        }
        ((C3581rn) this.f24452c).execute(new g(str, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) throws ValidationException {
        this.f24451b.reportEvent(str);
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new d(str));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) throws ValidationException {
        this.f24451b.reportRevenue(revenue);
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new o(revenue));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) throws ValidationException {
        this.f24451b.reportUnhandledException(th);
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new i(th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) throws ValidationException {
        this.f24451b.reportUserProfile(userProfile);
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new n(userProfile));
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        this.f24451b.getClass();
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new j());
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        this.f24451b.getClass();
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new w());
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
        this.f24451b.getClass();
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new q(z));
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
        this.f24451b.getClass();
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new l(str));
    }

    private C3522pg(InterfaceExecutorC3607sn interfaceExecutorC3607sn, Context context, String str, C3626tg c3626tg) {
        this(interfaceExecutorC3607sn, context, new C2508Bg(), c3626tg, new C3730xg(), new C3803v(c3626tg, new C3043X2()), new C3802u(new C3801t(str)));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0, com.yandex.metrica.InterfaceC3800s
    /* renamed from: b */
    public void mo13934b(String str, String str2) {
        this.f24451b.getClass();
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new a(str, str2));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3143b1
    /* renamed from: a */
    public void mo14377a(C3513p7 c3513p7) {
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new m(c3513p7));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) throws ValidationException {
        this.f24451b.reportEvent(str, str2);
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new e(str, str2));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0, com.yandex.metrica.InterfaceC3800s
    /* renamed from: d */
    public void mo13935d(String str, String str2) throws ValidationException {
        this.f24451b.mo13935d(str, str2);
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new b(str, str2));
    }

    private C3522pg(InterfaceExecutorC3607sn interfaceExecutorC3607sn, Context context, C2508Bg c2508Bg, C3626tg c3626tg, C3730xg c3730xg, C3803v c3803v, C3802u c3802u) {
        this(interfaceExecutorC3607sn, context, c2508Bg, c3626tg, c3730xg, c3803v, c3802u, new C3496og(c2508Bg.m13862a(), c3803v, interfaceExecutorC3607sn, new c(c3626tg, context, c3802u)));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3143b1
    /* renamed from: a */
    public void mo14375a(C3227e7 c3227e7) {
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new t(c3227e7));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
        this.f24451b.reportError(str, str2, th);
        ((C3581rn) this.f24452c).execute(new h(str, str2, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) throws ValidationException {
        this.f24451b.reportEvent(str, map);
        this.f24456g.getClass();
        List listM15235a = C2968U2.m15235a((Map) map);
        ((C3581rn) this.f24452c).execute(new f(str, listM15235a));
    }

    public C3522pg(InterfaceExecutorC3607sn interfaceExecutorC3607sn, Context context, C2508Bg c2508Bg, C3626tg c3626tg, C3730xg c3730xg, C3803v c3803v, C3802u c3802u, C3496og c3496og) {
        this.f24452c = interfaceExecutorC3607sn;
        this.f24453d = context;
        this.f24451b = c2508Bg;
        this.f24450a = c3626tg;
        this.f24454e = c3730xg;
        this.f24456g = c3803v;
        this.f24455f = c3802u;
        this.f24457h = c3496og;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0
    /* renamed from: a */
    public void mo14379a(String str, JSONObject jSONObject) {
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new v(str, jSONObject));
    }

    /* renamed from: a */
    public void m16586a(C3802u c3802u) {
        C3802u c3802uM17183a = this.f24454e.m17183a(c3802u);
        this.f24456g.getClass();
        ((C3581rn) this.f24452c).execute(new s(c3802uM17183a));
    }

    /* renamed from: a */
    public static void m16584a(C3522pg c3522pg, C3802u c3802u) {
        C3626tg c3626tg = c3522pg.f24450a;
        Context context = c3522pg.f24453d;
        c3626tg.getClass();
        C3405l3.m16349a(context).m16374c(c3802u);
    }
}
