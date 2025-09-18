package com.yandex.metrica.impl.p022ob;

import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import com.yandex.metrica.profile.UserProfileUpdate;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p000.InterfaceC11601wt1;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.J */
/* loaded from: classes2.dex */
public abstract class AbstractC2691J implements InterfaceC2916S0 {

    /* renamed from: n */
    private static final Collection<Integer> f21458n = new HashSet(Arrays.asList(14, 15));

    /* renamed from: o */
    private static final InterfaceC3660uo<C3132ag> f21459o = new a();

    /* renamed from: a */
    protected final Context f21460a;

    /* renamed from: b */
    protected final C3378k2 f21461b;

    /* renamed from: c */
    protected final C2689Im f21462c;

    /* renamed from: d */
    protected final C3736xm f21463d;

    /* renamed from: e */
    protected final C2599F7 f21464e;

    /* renamed from: f */
    protected final C2474A7 f21465f;

    /* renamed from: g */
    protected final C3643u7 f21466g;

    /* renamed from: h */
    private final C3591s7 f21467h;

    /* renamed from: i */
    protected final C3456n2 f21468i;

    /* renamed from: j */
    private C3403l1 f21469j;

    /* renamed from: k */
    private final InterfaceC2664Hm f21470k;

    /* renamed from: l */
    private final C2717K0 f21471l;

    /* renamed from: m */
    private final C3123a7 f21472m;

    /* renamed from: com.yandex.metrica.impl.ob.J$a */
    public class a implements InterfaceC3660uo<C3132ag> {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3660uo
        /* renamed from: a */
        public C3608so mo14391a(C3132ag c3132ag) {
            return C2968U2.m15247a((Object[]) c3132ag.f23051b) ? C3608so.m16803a(this, "attributes list is empty") : C3608so.m16802a(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.J$b */
    public static final class b {

        /* renamed from: a */
        private static final InterfaceC3660uo<Revenue> f21473a = new C3764yo();

        /* renamed from: a */
        public static InterfaceC3660uo<Revenue> m14392a() {
            return f21473a;
        }
    }

    public AbstractC2691J(Context context, C3456n2 c3456n2, C3378k2 c3378k2, C2717K0 c2717k0, InterfaceC2664Hm interfaceC2664Hm, InterfaceC11601wt1 interfaceC11601wt1, C3705wh c3705wh, C2599F7 c2599f7, C2474A7 c2474a7, C3643u7 c3643u7, C3591s7 c3591s7, C3123a7 c3123a7) {
        this.f21460a = context.getApplicationContext();
        this.f21468i = c3456n2;
        this.f21461b = c3378k2;
        this.f21471l = c2717k0;
        this.f21464e = c2599f7;
        this.f21465f = c2474a7;
        this.f21466g = c3643u7;
        this.f21467h = c3591s7;
        this.f21472m = c3123a7;
        C2689Im c2689ImM17346b = AbstractC3788zm.m17346b(c3378k2.m15168b().m13768a());
        this.f21462c = c2689ImM17346b;
        c3378k2.m16252a(new C2765Ln(c2689ImM17346b, "Crash Environment"));
        C3736xm c3736xmM17345a = AbstractC3788zm.m17345a(c3378k2.m15168b().m13768a());
        this.f21463d = c3736xmM17345a;
        if (C3323i.m16067a(c3378k2.m15168b().f20731a.getAsBoolean("CFG_IS_LOG_ENABLED"))) {
            c2689ImM17346b.m17372e();
            c3736xmM17345a.m17372e();
        }
        this.f21470k = interfaceC2664Hm;
    }

    /* renamed from: a */
    public void m14376a(C3403l1 c3403l1) {
        this.f21469j = c3403l1;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2916S0, com.yandex.metrica.impl.p022ob.InterfaceC3016W0, com.yandex.metrica.InterfaceC3800s
    /* renamed from: b */
    public void mo13934b(String str, String str2) {
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        this.f21468i.m16451a(new C2915S(str2, str, EnumC3377k1.EVENT_TYPE_STATBOX.m16250b(), 0, c2689Im), this.f21461b);
        if (this.f21462c.m17370c()) {
            StringBuilder sb = new StringBuilder("Statbox event received  with name: ");
            sb.append(m14389f(str));
            sb.append(" with value: ");
            String strM14389f = m14389f(str2);
            if (strM14389f.length() > 100) {
                sb.append(strM14389f.substring(0, 100));
                sb.append("...");
            } else {
                sb.append(strM14389f);
            }
            this.f21462c.m17366b(sb.toString());
        }
    }

    /* renamed from: c */
    public void mo14385c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f21461b.f23900c.m14215a(str, str2);
        } else if (this.f21462c.m17370c()) {
            this.f21462c.m17369c("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2916S0, com.yandex.metrica.impl.p022ob.InterfaceC3016W0, com.yandex.metrica.InterfaceC3800s
    /* renamed from: d */
    public void mo13935d(String str, String str2) {
        List<Integer> list = C2692J0.f21482i;
        this.f21468i.m16451a(new C3376k0(str2, str, EnumC3377k1.EVENT_TYPE_DIAGNOSTIC.m16250b(), new C2814Nm()), this.f21461b);
    }

    /* renamed from: e */
    public void m14387e(String str) {
        this.f21468i.m16471e();
        this.f21469j.m16344b();
        C3456n2 c3456n2 = this.f21468i;
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        c3456n2.m16451a(new C2915S("", str, EnumC3377k1.EVENT_TYPE_START.m16250b(), c2689Im), this.f21461b);
        this.f21461b.m16258h();
    }

    /* renamed from: f */
    public void m14390f() {
        this.f21468i.m16464b(this.f21461b);
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        if (this.f21462c.m17370c()) {
            this.f21462c.m17366b("Pause session");
        }
        m14386d(null);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        if (this.f21462c.m17370c()) {
            this.f21462c.m17366b("E-commerce event received: " + eCommerceEvent.getPublicDescription());
        }
        this.f21468i.m16447a(eCommerceEvent, this.f21461b);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) {
        C3357j7 c3357j7 = new C3357j7(str, m14372a(th));
        C3456n2 c3456n2 = this.f21468i;
        byte[] bArrM15809a = AbstractC3219e.m15809a(this.f21465f.mo13847b(c3357j7));
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        c3456n2.m16451a(new C2915S(bArrM15809a, str, EnumC3377k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.m16250b(), c2689Im), this.f21461b);
        if (this.f21462c.m17370c()) {
            this.f21462c.m17363a("Error received: %s", m14389f(str));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) {
        if (this.f21462c.m17370c() && this.f21462c.m17370c()) {
            this.f21462c.m17366b("Event received: " + m14389f(str));
        }
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        this.f21468i.m16451a(new C2915S("", str, EnumC3377k1.EVENT_TYPE_REGULAR.m16250b(), 0, c2689Im), this.f21461b);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) {
        C3608so c3608soMo14391a = b.m14392a().mo14391a(revenue);
        if (!c3608soMo14391a.m16805b()) {
            if (this.f21462c.m17370c()) {
                this.f21462c.m17368c("Passed revenue is not valid. Reason: " + c3608soMo14391a.m16804a());
                return;
            }
            return;
        }
        this.f21468i.m16453a(new C3534q2(revenue, this.f21462c), this.f21461b);
        if (this.f21462c.m17370c()) {
            StringBuilder sb = new StringBuilder("Revenue received for productID: ");
            sb.append(m14389f(revenue.productID));
            sb.append(" of quantity: ");
            Integer num = revenue.quantity;
            if (num != null) {
                sb.append(num);
            } else {
                sb.append("<null>");
            }
            sb.append(" with price");
            if (revenue.priceMicros != null) {
                sb.append(" (in micros): ");
                sb.append(revenue.priceMicros);
            } else {
                sb.append(": ");
                sb.append(revenue.price);
            }
            sb.append(" ");
            sb.append(revenue.currency);
            this.f21462c.m17366b(sb.toString());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) {
        C3513p7 c3513p7M16602a = C3539q7.m16602a(th, new C3227e7(null, null, ((C2564Dm) this.f21470k).m14015b()), null, this.f21471l.m14455a(), this.f21471l.m14456b());
        this.f21468i.m16465b(c3513p7M16602a, this.f21461b);
        m14382b(c3513p7M16602a);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) {
        C2632Gf c2632Gf = new C2632Gf();
        Iterator<UserProfileUpdate<? extends InterfaceC2657Hf>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            AbstractC3755yf abstractC3755yf = (AbstractC3755yf) it.next().getUserProfileUpdatePatcher();
            abstractC3755yf.m17238a(this.f21462c);
            abstractC3755yf.mo13933a(c2632Gf);
        }
        C3132ag c3132agM14201c = c2632Gf.m14201c();
        C3608so c3608soMo14391a = f21459o.mo14391a(c3132agM14201c);
        if (c3608soMo14391a.m16805b()) {
            this.f21468i.m16450a(c3132agM14201c, this.f21461b);
            if (this.f21462c.m17370c()) {
                this.f21462c.m17366b("User profile received");
                return;
            }
            return;
        }
        if (this.f21462c.m17370c()) {
            this.f21462c.m17368c("UserInfo wasn't sent because " + c3608soMo14391a.m16804a());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        m14387e(null);
        if (this.f21462c.m17370c()) {
            this.f21462c.m17366b("Resume session");
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        C3456n2 c3456n2 = this.f21468i;
        EnumC3377k1 enumC3377k1 = EnumC3377k1.EVENT_TYPE_PURGE_BUFFER;
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        c3456n2.m16451a(new C2915S("", "", enumC3377k1.m16250b(), 0, c2689Im), this.f21461b);
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
        this.f21461b.m15168b().m13781n(z);
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
        this.f21468i.m16467b(str, this.f21461b);
        if (this.f21462c.m17370c()) {
            this.f21462c.m17366b("Set user profile ID: " + m14389f(str));
        }
    }

    /* renamed from: a */
    public void m14380a(Map<String, String> map) {
        if (C2968U2.m15250b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            mo14385c(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: f */
    public String m14389f(String str) {
        return str == null ? "<null>" : str.isEmpty() ? "<empty>" : str;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2916S0
    /* renamed from: a */
    public void mo14374a(int i, String str, String str2, Map<String, String> map) {
        if (f21458n.contains(Integer.valueOf(i)) || i < 1 || i > 99) {
            HashMap map2 = map == null ? null : new HashMap(map);
            C2689Im c2689Im = this.f21462c;
            List<Integer> list = C2692J0.f21482i;
            this.f21468i.m16451a(new C2915S(str2, str, EnumC3377k1.EVENT_TYPE_CUSTOM_EVENT.m16250b(), i, c2689Im).m16232c(C3762ym.m17305g(map2)), this.f21461b);
        }
    }

    /* renamed from: d */
    public void m14386d(String str) {
        if (this.f21461b.mo15660f()) {
            return;
        }
        this.f21468i.m16470d();
        this.f21469j.m16343a();
        this.f21461b.m16257g();
        C3456n2 c3456n2 = this.f21468i;
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        c3456n2.m16451a(new C2915S("", str, EnumC3377k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.m16250b(), 0, c2689Im), this.f21461b);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2916S0
    /* renamed from: c */
    public void mo14384c(String str) {
        this.f21468i.m16457a(str, this.f21461b);
        if (this.f21462c.m17370c()) {
            this.f21462c.m17366b("Error received: native");
        }
    }

    /* renamed from: e */
    private void m14373e(String str, String str2) {
        if (this.f21462c.m17370c()) {
            this.f21462c.m17366b("Event received: " + m14389f(str) + ". With value: " + m14389f(str2));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        String strM16478b;
        C3513p7 c3513p7M15603a = this.f21472m.m15603a(pluginErrorDetails);
        C3456n2 c3456n2 = this.f21468i;
        C3461n7 c3461n7 = c3513p7M15603a.f24427a;
        String str = "";
        if (c3461n7 != null && (strM16478b = c3461n7.m16478b()) != null) {
            str = strM16478b;
        }
        byte[] bArrM15809a = AbstractC3219e.m15809a(this.f21464e.mo13847b(c3513p7M15603a));
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        c3456n2.m16451a(new C2915S(bArrM15809a, str, EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.m16250b(), c2689Im), this.f21461b);
        if (this.f21462c.m17370c()) {
            this.f21462c.m17363a("Crash from plugin received: %s", m14389f(pluginErrorDetails.getMessage()));
        }
    }

    /* renamed from: a */
    private C3513p7 m14372a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTrace;
        if (th == null) {
            stackTrace = null;
            th2 = null;
        } else if (th instanceof C2922S6) {
            stackTrace = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTrace = null;
        }
        return C3539q7.m16602a(th2, new C3227e7(null, null, ((C2564Dm) this.f21470k).m14015b()), stackTrace != null ? Arrays.asList(stackTrace) : null, this.f21471l.m14455a(), this.f21471l.m14456b());
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
        this.f21468i.m16451a(C2692J0.m14397a(str2, AbstractC3219e.m15809a(this.f21466g.mo13847b(new C3305h7(new C3357j7(str2, m14372a(th)), str))), this.f21462c), this.f21461b);
        if (this.f21462c.m17370c()) {
            this.f21462c.m17363a("Error received: id: %s, message: %s", m14389f(str), m14389f(str2));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) {
        if (this.f21462c.m17370c()) {
            m14373e(str, str2);
        }
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        this.f21468i.m16451a(new C2915S(str2, str, EnumC3377k1.EVENT_TYPE_REGULAR.m16250b(), 0, c2689Im), this.f21461b);
    }

    /* renamed from: e */
    public boolean m14388e() {
        boolean zMo15660f = this.f21461b.mo15660f();
        boolean z = !zMo15660f;
        if (!zMo15660f) {
            C2689Im c2689Im = this.f21462c;
            List<Integer> list = C2692J0.f21482i;
            this.f21468i.m16451a(new C2915S("", "", EnumC3377k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.m16250b(), 0, c2689Im), this.f21461b);
        }
        return z;
    }

    /* renamed from: b */
    public void m14382b(C3513p7 c3513p7) {
        if (this.f21462c.m17370c()) {
            this.f21462c.m17366b("Unhandled exception received: " + c3513p7.toString());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) {
        HashMap map2 = C2968U2.m15250b(map) ? null : new HashMap(map);
        C3456n2 c3456n2 = this.f21468i;
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        c3456n2.m16445a(new C2915S("", str, EnumC3377k1.EVENT_TYPE_REGULAR.m16250b(), 0, c2689Im), this.f21461b, map2);
        if (this.f21462c.m17370c()) {
            m14373e(str, map2 != null ? map2.toString() : null);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3143b1
    /* renamed from: a */
    public void mo14377a(C3513p7 c3513p7) {
        this.f21468i.m16452a(c3513p7, this.f21461b);
        m14382b(c3513p7);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0
    /* renamed from: b */
    public void mo14381b() throws JSONException {
        Integer numValueOf;
        C3456n2 c3456n2 = this.f21468i;
        Context context = this.f21460a;
        C3376k0 c3376k0 = new C3376k0();
        c3376k0.f23827a = "";
        C2842P0 c2842p0M14728i = C2842P0.m14728i();
        O90.m5967e(c2842p0M14728i, "GlobalServiceLocator.getInstance()");
        C2766M c2766mM14734d = c2842p0M14728i.m14734d();
        O90.m5967e(c2766mM14734d, "GlobalServiceLocator.get…nce().batteryInfoProvider");
        Integer numM14564a = c2766mM14734d.m14564a();
        long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
        if (C2968U2.m15243a(23)) {
            try {
                Object systemService = context.getSystemService("notification");
                if (systemService != null) {
                    numValueOf = Integer.valueOf(((NotificationManager) systemService).getCurrentInterruptionFilter());
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
                }
            } catch (Throwable unused) {
            }
        } else {
            numValueOf = null;
        }
        JSONObject jSONObjectPut = new JSONObject().put("dfid", new JSONObject().putOpt("battery", numM14564a).put("boot_time_seconds", jElapsedRealtime).putOpt("notification_filter", numValueOf));
        O90.m5967e(jSONObjectPut, "JSONObject()\n           …tionFilter)\n            )");
        c3376k0.f23831e = EnumC3377k1.EVENT_TYPE_IDENTITY_LIGHT.m16250b();
        c3376k0.f23828b = jSONObjectPut.toString();
        c3456n2.m16451a(c3376k0, this.f21461b);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C3123a7 c3123a7 = this.f21472m;
        c3123a7.getClass();
        this.f21468i.m16451a(C2692J0.m14397a(str, AbstractC3219e.m15809a(this.f21465f.mo13847b(new C3357j7(str, pluginErrorDetails != null ? c3123a7.m15603a(pluginErrorDetails) : null))), this.f21462c), this.f21461b);
        if (this.f21462c.m17370c()) {
            this.f21462c.m17363a("Error from plugin received: %s", m14389f(str));
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3143b1
    /* renamed from: a */
    public void mo14375a(C3227e7 c3227e7) {
        C3253f7 c3253f7 = new C3253f7(c3227e7, this.f21471l.m14455a(), this.f21471l.m14456b());
        C3456n2 c3456n2 = this.f21468i;
        byte[] bArrM15809a = AbstractC3219e.m15809a(this.f21467h.mo13847b(c3253f7));
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        c3456n2.m16451a(new C2915S(bArrM15809a, "", EnumC3377k1.EVENT_TYPE_ANR.m16250b(), c2689Im), this.f21461b);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C3123a7 c3123a7 = this.f21472m;
        c3123a7.getClass();
        this.f21468i.m16451a(C2692J0.m14397a(str2, AbstractC3219e.m15809a(this.f21466g.mo13847b(new C3305h7(new C3357j7(str2, pluginErrorDetails != null ? c3123a7.m15603a(pluginErrorDetails) : null), str))), this.f21462c), this.f21461b);
        if (this.f21462c.m17370c()) {
            this.f21462c.m17363a("Error with identifier: %s from plugin received: %s", str, m14389f(str2));
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0
    /* renamed from: a */
    public void mo14379a(String str, JSONObject jSONObject) {
        C3456n2 c3456n2 = this.f21468i;
        C3376k0 c3376k0 = new C3376k0();
        c3376k0.f23827a = str;
        c3376k0.f23831e = EnumC3377k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.m16250b();
        c3376k0.f23828b = jSONObject.toString();
        c3456n2.m16451a(c3376k0, this.f21461b);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2916S0
    /* renamed from: a */
    public void mo14378a(String str, String str2) {
        m14373e(str, str2);
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        this.f21468i.m16451a(new C2915S(str2, str, EnumC3377k1.EVENT_TYPE_REGULAR.m16250b(), 0, c2689Im).m16223a(EnumC2667I0.JS), this.f21461b);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2916S0
    /* renamed from: b */
    public void mo14383b(String str) {
        this.f21468i.m16451a(C3376k0.m16216a(str), this.f21461b);
    }
}
