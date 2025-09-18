package com.yandex.metrica.impl.ob;

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
import defpackage.InterfaceC7878wt1;
import defpackage.O90;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class J implements S0 {
    private static final Collection<Integer> n = new HashSet(Arrays.asList(14, 15));
    private static final uo<C2631ag> o = new a();
    protected final Context a;
    protected final C2866k2 b;
    protected final Im c;
    protected final C3215xm d;
    protected final F7 e;
    protected final A7 f;
    protected final C3120u7 g;
    private final C3070s7 h;
    protected final C2941n2 i;
    private C2890l1 j;
    private final Hm k;
    private final K0 l;
    private final C2622a7 m;

    public class a implements uo<C2631ag> {
        @Override // com.yandex.metrica.impl.ob.uo
        public so a(C2631ag c2631ag) {
            return U2.a((Object[]) c2631ag.b) ? so.a(this, "attributes list is empty") : so.a(this);
        }
    }

    public static final class b {
        private static final uo<Revenue> a = new yo();

        public static uo<Revenue> a() {
            return a;
        }
    }

    public J(Context context, C2941n2 c2941n2, C2866k2 c2866k2, K0 k0, Hm hm, InterfaceC7878wt1 interfaceC7878wt1, C3185wh c3185wh, F7 f7, A7 a7, C3120u7 c3120u7, C3070s7 c3070s7, C2622a7 c2622a7) {
        this.a = context.getApplicationContext();
        this.i = c2941n2;
        this.b = c2866k2;
        this.l = k0;
        this.e = f7;
        this.f = a7;
        this.g = c3120u7;
        this.h = c3070s7;
        this.m = c2622a7;
        Im imB = AbstractC3265zm.b(c2866k2.b().a());
        this.c = imB;
        c2866k2.a(new Ln(imB, "Crash Environment"));
        C3215xm c3215xmA = AbstractC3265zm.a(c2866k2.b().a());
        this.d = c3215xmA;
        if (C2814i.a(c2866k2.b().a.getAsBoolean("CFG_IS_LOG_ENABLED"))) {
            imB.e();
            c3215xmA.e();
        }
        this.k = hm;
    }

    public void a(C2890l1 c2890l1) {
        this.j = c2890l1;
    }

    @Override // com.yandex.metrica.impl.ob.S0, com.yandex.metrica.impl.ob.W0, com.yandex.metrica.s
    public void b(String str, String str2) {
        Im im = this.c;
        List<Integer> list = J0.i;
        this.i.a(new S(str2, str, EnumC2865k1.EVENT_TYPE_STATBOX.b(), 0, im), this.b);
        if (this.c.c()) {
            StringBuilder sb = new StringBuilder("Statbox event received  with name: ");
            sb.append(f(str));
            sb.append(" with value: ");
            String strF = f(str2);
            if (strF.length() > 100) {
                sb.append(strF.substring(0, 100));
                sb.append("...");
            } else {
                sb.append(strF);
            }
            this.c.b(sb.toString());
        }
    }

    public void c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.b.c.a(str, str2);
        } else if (this.c.c()) {
            this.c.c("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
        }
    }

    @Override // com.yandex.metrica.impl.ob.S0, com.yandex.metrica.impl.ob.W0, com.yandex.metrica.s
    public void d(String str, String str2) {
        List<Integer> list = J0.i;
        this.i.a(new C2864k0(str2, str, EnumC2865k1.EVENT_TYPE_DIAGNOSTIC.b(), new Nm()), this.b);
    }

    public void e(String str) {
        this.i.e();
        this.j.b();
        C2941n2 c2941n2 = this.i;
        Im im = this.c;
        List<Integer> list = J0.i;
        c2941n2.a(new S("", str, EnumC2865k1.EVENT_TYPE_START.b(), im), this.b);
        this.b.h();
    }

    public void f() {
        this.i.b(this.b);
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        if (this.c.c()) {
            this.c.b("Pause session");
        }
        d(null);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        if (this.c.c()) {
            this.c.b("E-commerce event received: " + eCommerceEvent.getPublicDescription());
        }
        this.i.a(eCommerceEvent, this.b);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) {
        C2846j7 c2846j7 = new C2846j7(str, a(th));
        C2941n2 c2941n2 = this.i;
        byte[] bArrA = AbstractC2714e.a(this.f.b(c2846j7));
        Im im = this.c;
        List<Integer> list = J0.i;
        c2941n2.a(new S(bArrA, str, EnumC2865k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.b(), im), this.b);
        if (this.c.c()) {
            this.c.a("Error received: %s", f(str));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) {
        if (this.c.c() && this.c.c()) {
            this.c.b("Event received: " + f(str));
        }
        Im im = this.c;
        List<Integer> list = J0.i;
        this.i.a(new S("", str, EnumC2865k1.EVENT_TYPE_REGULAR.b(), 0, im), this.b);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) {
        so soVarA = b.a().a(revenue);
        if (!soVarA.b()) {
            if (this.c.c()) {
                this.c.c("Passed revenue is not valid. Reason: " + soVarA.a());
                return;
            }
            return;
        }
        this.i.a(new C3016q2(revenue, this.c), this.b);
        if (this.c.c()) {
            StringBuilder sb = new StringBuilder("Revenue received for productID: ");
            sb.append(f(revenue.productID));
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
            this.c.b(sb.toString());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) {
        C2996p7 c2996p7A = C3021q7.a(th, new C2722e7(null, null, ((Dm) this.k).b()), null, this.l.a(), this.l.b());
        this.i.b(c2996p7A, this.b);
        b(c2996p7A);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) {
        Gf gf = new Gf();
        Iterator<UserProfileUpdate<? extends Hf>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            AbstractC3233yf abstractC3233yf = (AbstractC3233yf) it.next().getUserProfileUpdatePatcher();
            abstractC3233yf.a(this.c);
            abstractC3233yf.a(gf);
        }
        C2631ag c2631agC = gf.c();
        so soVarA = o.a(c2631agC);
        if (soVarA.b()) {
            this.i.a(c2631agC, this.b);
            if (this.c.c()) {
                this.c.b("User profile received");
                return;
            }
            return;
        }
        if (this.c.c()) {
            this.c.c("UserInfo wasn't sent because " + soVarA.a());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        e(null);
        if (this.c.c()) {
            this.c.b("Resume session");
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        C2941n2 c2941n2 = this.i;
        EnumC2865k1 enumC2865k1 = EnumC2865k1.EVENT_TYPE_PURGE_BUFFER;
        Im im = this.c;
        List<Integer> list = J0.i;
        c2941n2.a(new S("", "", enumC2865k1.b(), 0, im), this.b);
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
        this.b.b().n(z);
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
        this.i.b(str, this.b);
        if (this.c.c()) {
            this.c.b("Set user profile ID: " + f(str));
        }
    }

    public void a(Map<String, String> map) {
        if (U2.b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }

    public String f(String str) {
        return str == null ? "<null>" : str.isEmpty() ? "<empty>" : str;
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void a(int i, String str, String str2, Map<String, String> map) {
        if (n.contains(Integer.valueOf(i)) || i < 1 || i > 99) {
            HashMap map2 = map == null ? null : new HashMap(map);
            Im im = this.c;
            List<Integer> list = J0.i;
            this.i.a(new S(str2, str, EnumC2865k1.EVENT_TYPE_CUSTOM_EVENT.b(), i, im).c(C3240ym.g(map2)), this.b);
        }
    }

    public void d(String str) {
        if (this.b.f()) {
            return;
        }
        this.i.d();
        this.j.a();
        this.b.g();
        C2941n2 c2941n2 = this.i;
        Im im = this.c;
        List<Integer> list = J0.i;
        c2941n2.a(new S("", str, EnumC2865k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.b(), 0, im), this.b);
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void c(String str) {
        this.i.a(str, this.b);
        if (this.c.c()) {
            this.c.b("Error received: native");
        }
    }

    private void e(String str, String str2) {
        if (this.c.c()) {
            this.c.b("Event received: " + f(str) + ". With value: " + f(str2));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        String strB;
        C2996p7 c2996p7A = this.m.a(pluginErrorDetails);
        C2941n2 c2941n2 = this.i;
        C2946n7 c2946n7 = c2996p7A.a;
        String str = "";
        if (c2946n7 != null && (strB = c2946n7.b()) != null) {
            str = strB;
        }
        byte[] bArrA = AbstractC2714e.a(this.e.b(c2996p7A));
        Im im = this.c;
        List<Integer> list = J0.i;
        c2941n2.a(new S(bArrA, str, EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b(), im), this.b);
        if (this.c.c()) {
            this.c.a("Crash from plugin received: %s", f(pluginErrorDetails.getMessage()));
        }
    }

    private C2996p7 a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTrace;
        if (th == null) {
            stackTrace = null;
            th2 = null;
        } else if (th instanceof S6) {
            stackTrace = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTrace = null;
        }
        return C3021q7.a(th2, new C2722e7(null, null, ((Dm) this.k).b()), stackTrace != null ? Arrays.asList(stackTrace) : null, this.l.a(), this.l.b());
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
        this.i.a(J0.a(str2, AbstractC2714e.a(this.g.b(new C2797h7(new C2846j7(str2, a(th)), str))), this.c), this.b);
        if (this.c.c()) {
            this.c.a("Error received: id: %s, message: %s", f(str), f(str2));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) {
        if (this.c.c()) {
            e(str, str2);
        }
        Im im = this.c;
        List<Integer> list = J0.i;
        this.i.a(new S(str2, str, EnumC2865k1.EVENT_TYPE_REGULAR.b(), 0, im), this.b);
    }

    public boolean e() {
        boolean zF = this.b.f();
        boolean z = !zF;
        if (!zF) {
            Im im = this.c;
            List<Integer> list = J0.i;
            this.i.a(new S("", "", EnumC2865k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.b(), 0, im), this.b);
        }
        return z;
    }

    public void b(C2996p7 c2996p7) {
        if (this.c.c()) {
            this.c.b("Unhandled exception received: " + c2996p7.toString());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) {
        HashMap map2 = U2.b(map) ? null : new HashMap(map);
        C2941n2 c2941n2 = this.i;
        Im im = this.c;
        List<Integer> list = J0.i;
        c2941n2.a(new S("", str, EnumC2865k1.EVENT_TYPE_REGULAR.b(), 0, im), this.b, map2);
        if (this.c.c()) {
            e(str, map2 != null ? map2.toString() : null);
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2641b1
    public void a(C2996p7 c2996p7) {
        this.i.a(c2996p7, this.b);
        b(c2996p7);
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void b() throws JSONException {
        Integer numValueOf;
        C2941n2 c2941n2 = this.i;
        Context context = this.a;
        C2864k0 c2864k0 = new C2864k0();
        c2864k0.a = "";
        P0 p0I = P0.i();
        O90.e(p0I, "GlobalServiceLocator.getInstance()");
        M mD = p0I.d();
        O90.e(mD, "GlobalServiceLocator.get…nce().batteryInfoProvider");
        Integer numA = mD.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
        if (U2.a(23)) {
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
        JSONObject jSONObjectPut = new JSONObject().put("dfid", new JSONObject().putOpt("battery", numA).put("boot_time_seconds", jElapsedRealtime).putOpt("notification_filter", numValueOf));
        O90.e(jSONObjectPut, "JSONObject()\n           …tionFilter)\n            )");
        c2864k0.e = EnumC2865k1.EVENT_TYPE_IDENTITY_LIGHT.b();
        c2864k0.b = jSONObjectPut.toString();
        c2941n2.a(c2864k0, this.b);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C2622a7 c2622a7 = this.m;
        c2622a7.getClass();
        this.i.a(J0.a(str, AbstractC2714e.a(this.f.b(new C2846j7(str, pluginErrorDetails != null ? c2622a7.a(pluginErrorDetails) : null))), this.c), this.b);
        if (this.c.c()) {
            this.c.a("Error from plugin received: %s", f(str));
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2641b1
    public void a(C2722e7 c2722e7) {
        C2747f7 c2747f7 = new C2747f7(c2722e7, this.l.a(), this.l.b());
        C2941n2 c2941n2 = this.i;
        byte[] bArrA = AbstractC2714e.a(this.h.b(c2747f7));
        Im im = this.c;
        List<Integer> list = J0.i;
        c2941n2.a(new S(bArrA, "", EnumC2865k1.EVENT_TYPE_ANR.b(), im), this.b);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C2622a7 c2622a7 = this.m;
        c2622a7.getClass();
        this.i.a(J0.a(str2, AbstractC2714e.a(this.g.b(new C2797h7(new C2846j7(str2, pluginErrorDetails != null ? c2622a7.a(pluginErrorDetails) : null), str))), this.c), this.b);
        if (this.c.c()) {
            this.c.a("Error with identifier: %s from plugin received: %s", str, f(str2));
        }
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void a(String str, JSONObject jSONObject) {
        C2941n2 c2941n2 = this.i;
        C2864k0 c2864k0 = new C2864k0();
        c2864k0.a = str;
        c2864k0.e = EnumC2865k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.b();
        c2864k0.b = jSONObject.toString();
        c2941n2.a(c2864k0, this.b);
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void a(String str, String str2) {
        e(str, str2);
        Im im = this.c;
        List<Integer> list = J0.i;
        this.i.a(new S(str2, str, EnumC2865k1.EVENT_TYPE_REGULAR.b(), 0, im).a(I0.JS), this.b);
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void b(String str) {
        this.i.a(C2864k0.a(str), this.b);
    }
}
