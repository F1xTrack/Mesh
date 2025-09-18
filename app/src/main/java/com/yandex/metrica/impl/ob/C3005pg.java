package com.yandex.metrica.impl.ob;

import android.content.Context;
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
public class C3005pg implements W0 {
    private final C3104tg a;
    private final Bg b;
    private final InterfaceExecutorC3086sn c;
    private final Context d;
    private final C3209xg e;
    private final com.yandex.metrica.u f;
    private final com.yandex.metrica.v g;
    private final C2980og h;

    /* renamed from: com.yandex.metrica.impl.ob.pg$a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().b(this.a, this.b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$b */
    public class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().d(this.a, this.b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$c */
    public class c implements Ym<W0> {
        final /* synthetic */ C3104tg a;
        final /* synthetic */ Context b;
        final /* synthetic */ com.yandex.metrica.u c;

        public c(C3104tg c3104tg, Context context, com.yandex.metrica.u uVar) {
            this.a = c3104tg;
            this.b = context;
            this.c = uVar;
        }

        @Override // com.yandex.metrica.impl.ob.Ym
        public W0 a() {
            C3104tg c3104tg = this.a;
            Context context = this.b;
            com.yandex.metrica.u uVar = this.c;
            c3104tg.getClass();
            return C2892l3.a(context).a(uVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$d */
    public class d implements Runnable {
        final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().reportEvent(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$e */
    public class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public e(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().reportEvent(this.a, this.b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$f */
    public class f implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ List b;

        public f(String str, List list) {
            this.a = str;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().reportEvent(this.a, U2.a(this.b));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$g */
    public class g implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Throwable b;

        public g(String str, Throwable th) {
            this.a = str;
            this.b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().reportError(this.a, this.b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$h */
    public class h implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Throwable c;

        public h(String str, String str2, Throwable th) {
            this.a = str;
            this.b = str2;
            this.c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().reportError(this.a, this.b, this.c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$i */
    public class i implements Runnable {
        final /* synthetic */ Throwable a;

        public i(Throwable th) {
            this.a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().reportUnhandledException(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$j */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().resumeSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$k */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().pauseSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$l */
    public class l implements Runnable {
        final /* synthetic */ String a;

        public l(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().setUserProfileID(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$m */
    public class m implements Runnable {
        final /* synthetic */ C2996p7 a;

        public m(C2996p7 c2996p7) {
            this.a = c2996p7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$n */
    public class n implements Runnable {
        final /* synthetic */ UserProfile a;

        public n(UserProfile userProfile) {
            this.a = userProfile;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().reportUserProfile(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$o */
    public class o implements Runnable {
        final /* synthetic */ Revenue a;

        public o(Revenue revenue) {
            this.a = revenue;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().reportRevenue(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$p */
    public class p implements Runnable {
        final /* synthetic */ ECommerceEvent a;

        public p(ECommerceEvent eCommerceEvent) {
            this.a = eCommerceEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().reportECommerce(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$q */
    public class q implements Runnable {
        final /* synthetic */ boolean a;

        public q(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().setStatisticsSending(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$r */
    public class r implements Runnable {
        final /* synthetic */ com.yandex.metrica.u a;

        public r(com.yandex.metrica.u uVar) {
            this.a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.a(C3005pg.this, this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$s */
    public class s implements Runnable {
        final /* synthetic */ com.yandex.metrica.u a;

        public s(com.yandex.metrica.u uVar) {
            this.a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.a(C3005pg.this, this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$t */
    public class t implements Runnable {
        final /* synthetic */ C2722e7 a;

        public t(C2722e7 c2722e7) {
            this.a = c2722e7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$u */
    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$v */
    public class v implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;

        public v(String str, JSONObject jSONObject) {
            this.a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().a(this.a, this.b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$w */
    public class w implements Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3005pg.this.a().sendEventsBuffer();
        }
    }

    public C3005pg(InterfaceExecutorC3086sn interfaceExecutorC3086sn, Context context, String str) {
        this(interfaceExecutorC3086sn, context.getApplicationContext(), str, new C3104tg());
    }

    public final W0 a() {
        C3104tg c3104tg = this.a;
        Context context = this.d;
        com.yandex.metrica.u uVar = this.f;
        c3104tg.getClass();
        return C2892l3.a(context).a(uVar);
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void b() {
        this.g.getClass();
        ((C3061rn) this.c).execute(new u());
    }

    public void d(String str) {
        com.yandex.metrica.u uVar = new com.yandex.metrica.u(new com.yandex.metrica.t(str));
        this.g.getClass();
        ((C3061rn) this.c).execute(new r(uVar));
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this.h;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        this.b.getClass();
        this.g.getClass();
        ((C3061rn) this.c).execute(new k());
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.b.reportECommerce(eCommerceEvent);
        this.g.getClass();
        ((C3061rn) this.c).execute(new p(eCommerceEvent));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) throws ValidationException {
        this.b.reportError(str, th);
        this.g.getClass();
        if (th == null) {
            th = new S6();
            th.fillInStackTrace();
        }
        ((C3061rn) this.c).execute(new g(str, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) throws ValidationException {
        this.b.reportEvent(str);
        this.g.getClass();
        ((C3061rn) this.c).execute(new d(str));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) throws ValidationException {
        this.b.reportRevenue(revenue);
        this.g.getClass();
        ((C3061rn) this.c).execute(new o(revenue));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) throws ValidationException {
        this.b.reportUnhandledException(th);
        this.g.getClass();
        ((C3061rn) this.c).execute(new i(th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) throws ValidationException {
        this.b.reportUserProfile(userProfile);
        this.g.getClass();
        ((C3061rn) this.c).execute(new n(userProfile));
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        this.b.getClass();
        this.g.getClass();
        ((C3061rn) this.c).execute(new j());
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        this.b.getClass();
        this.g.getClass();
        ((C3061rn) this.c).execute(new w());
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
        this.b.getClass();
        this.g.getClass();
        ((C3061rn) this.c).execute(new q(z));
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
        this.b.getClass();
        this.g.getClass();
        ((C3061rn) this.c).execute(new l(str));
    }

    private C3005pg(InterfaceExecutorC3086sn interfaceExecutorC3086sn, Context context, String str, C3104tg c3104tg) {
        this(interfaceExecutorC3086sn, context, new Bg(), c3104tg, new C3209xg(), new com.yandex.metrica.v(c3104tg, new X2()), new com.yandex.metrica.u(new com.yandex.metrica.t(str)));
    }

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.s
    public void b(String str, String str2) {
        this.b.getClass();
        this.g.getClass();
        ((C3061rn) this.c).execute(new a(str, str2));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2641b1
    public void a(C2996p7 c2996p7) {
        this.g.getClass();
        ((C3061rn) this.c).execute(new m(c2996p7));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) throws ValidationException {
        this.b.reportEvent(str, str2);
        this.g.getClass();
        ((C3061rn) this.c).execute(new e(str, str2));
    }

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.s
    public void d(String str, String str2) throws ValidationException {
        this.b.d(str, str2);
        this.g.getClass();
        ((C3061rn) this.c).execute(new b(str, str2));
    }

    private C3005pg(InterfaceExecutorC3086sn interfaceExecutorC3086sn, Context context, Bg bg, C3104tg c3104tg, C3209xg c3209xg, com.yandex.metrica.v vVar, com.yandex.metrica.u uVar) {
        this(interfaceExecutorC3086sn, context, bg, c3104tg, c3209xg, vVar, uVar, new C2980og(bg.a(), vVar, interfaceExecutorC3086sn, new c(c3104tg, context, uVar)));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2641b1
    public void a(C2722e7 c2722e7) {
        this.g.getClass();
        ((C3061rn) this.c).execute(new t(c2722e7));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
        this.b.reportError(str, str2, th);
        ((C3061rn) this.c).execute(new h(str, str2, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) throws ValidationException {
        this.b.reportEvent(str, map);
        this.g.getClass();
        List listA = U2.a((Map) map);
        ((C3061rn) this.c).execute(new f(str, listA));
    }

    public C3005pg(InterfaceExecutorC3086sn interfaceExecutorC3086sn, Context context, Bg bg, C3104tg c3104tg, C3209xg c3209xg, com.yandex.metrica.v vVar, com.yandex.metrica.u uVar, C2980og c2980og) {
        this.c = interfaceExecutorC3086sn;
        this.d = context;
        this.b = bg;
        this.a = c3104tg;
        this.e = c3209xg;
        this.g = vVar;
        this.f = uVar;
        this.h = c2980og;
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void a(String str, JSONObject jSONObject) {
        this.g.getClass();
        ((C3061rn) this.c).execute(new v(str, jSONObject));
    }

    public void a(com.yandex.metrica.u uVar) {
        com.yandex.metrica.u uVarA = this.e.a(uVar);
        this.g.getClass();
        ((C3061rn) this.c).execute(new s(uVarA));
    }

    public static void a(C3005pg c3005pg, com.yandex.metrica.u uVar) {
        C3104tg c3104tg = c3005pg.a;
        Context context = c3005pg.d;
        c3104tg.getClass();
        C2892l3.a(context).c(uVar);
    }
}
