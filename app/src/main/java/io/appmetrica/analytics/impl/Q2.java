package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Q2 implements Aa {
    public static final HashSet m = new HashSet(Arrays.asList(1, 13));
    public static final O2 n = new O2();
    protected final Context a;
    protected final Yg b;
    protected final PublicLogger c;
    protected final Nm d;
    protected final Vf e;
    protected final C4926v6 f;
    public final Y g;
    protected final Nh h;
    public C4621ib i;
    public final Ub j;
    public final J9 k;
    public final C4453be l;

    public Q2(Context context, Nh nh, Yg yg, J9 j9, Ub ub, Nm nm, Vf vf, C4926v6 c4926v6, Y y, C4453be c4453be) {
        this.a = context.getApplicationContext();
        this.h = nh;
        this.b = yg;
        this.k = j9;
        this.d = nm;
        this.e = vf;
        this.f = c4926v6;
        this.g = y;
        this.l = c4453be;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(yg.b().getApiKey());
        this.c = orCreatePublicLogger;
        yg.a(new C4868sk(orCreatePublicLogger, "Crash Environment"));
        if (AbstractC4780p3.a(yg.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.j = ub;
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.c.info("Put error environment pair <%s, %s>", str, str2);
        A8 a8 = this.b.c;
        a8.b.b(a8.a, str, str2);
    }

    public final void b(Map<String, String> map) {
        if (hn.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str) {
        if (this.b.f()) {
            return;
        }
        this.h.d.c();
        C4621ib c4621ib = this.i;
        c4621ib.a.removeCallbacks(c4621ib.c, c4621ib.b.b.b.getApiKey());
        this.b.e = true;
        Nh nh = this.h;
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4("", str, 3, 0, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.c.info("Clear app environment", new Object[0]);
        Nh nh = this.h;
        Yg yg = this.b;
        nh.getClass();
        T5 t5N = C4443b4.n();
        Re re = new Re(yg.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(yg.b);
        synchronized (yg) {
            str = yg.f;
        }
        nh.a(new Pg(t5N, false, 1, null, new Yg(re, counterConfiguration, str)));
    }

    public final void d(String str) {
        this.h.d.b();
        C4621ib c4621ib = this.i;
        C4621ib.a(c4621ib.a, c4621ib.b, c4621ib.c);
        Nh nh = this.h;
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4("", str, 6400, 0, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
        this.b.e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    public String k() {
        return "[BaseReporter]";
    }

    public void l() {
        String str;
        He he;
        Nh nh = this.h;
        Yg yg = this.b;
        nh.getClass();
        Le le = yg.d;
        synchronized (yg) {
            str = yg.f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(yg.b.getApiKey());
        Set set = AbstractC4857s9.a;
        JSONObject jSONObject = new JSONObject();
        if (le != null && (he = le.a) != null) {
            try {
                jSONObject.put("preloadInfo", he.c());
            } catch (Throwable unused) {
            }
        }
        String string = jSONObject.toString();
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(string, "", 6144, 0, orCreatePublicLogger);
        c4443b4.c(str);
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.c.info("Pause session", new Object[0]);
        c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.c.info("Put app environment: <%s, %s>", str, str2);
        Nh nh = this.h;
        Yg yg = this.b;
        nh.getClass();
        T5 t5B = C4443b4.b(str, str2);
        Re re = new Re(yg.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(yg.b);
        synchronized (yg) {
            str3 = yg.f;
        }
        nh.a(new Pg(t5B, false, 1, null, new Yg(re, counterConfiguration, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        String str;
        this.c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        Nh nh = this.h;
        Yg yg = this.b;
        nh.getClass();
        for (Th th : eCommerceEvent.toProto()) {
            C4443b4 c4443b4 = new C4443b4(LoggerStorage.getOrCreatePublicLogger(yg.b.getApiKey()));
            Wa wa = Wa.EVENT_TYPE_UNDEFINED;
            c4443b4.d = 41000;
            c4443b4.b = c4443b4.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) th.a)));
            c4443b4.g = th.b.getBytesTruncated();
            Re re = new Re(yg.a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(yg.b);
            synchronized (yg) {
                str = yg.f;
            }
            nh.a(new Pg(c4443b4, false, 1, null, new Yg(re, counterConfiguration, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        Uf uf = new Uf(str, a(th));
        Nh nh = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.e.fromModel(uf));
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(byteArray, str, 5892, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
        this.c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        Nh nh = this.h;
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4("", str, 1, 0, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        String str;
        C4507di c4507di = P2.a;
        c4507di.getClass();
        mn mnVarA = c4507di.a(revenue);
        if (!mnVarA.a) {
            this.c.warning("Passed revenue is not valid. Reason: " + mnVarA.b, new Object[0]);
            return;
        }
        Nh nh = this.h;
        C4532ei c4532ei = new C4532ei(revenue, this.c);
        Yg yg = this.b;
        nh.getClass();
        C4443b4 c4443b4A = C4443b4.a(LoggerStorage.getOrCreatePublicLogger(yg.b.getApiKey()), c4532ei);
        Re re = new Re(yg.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(yg.b);
        synchronized (yg) {
            str = yg.f;
        }
        nh.a(new Pg(c4443b4A, false, 1, null, new Yg(re, counterConfiguration, str)));
        this.c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        Mm mmA = Pm.a(th, new T(null, null, this.j.b()), null, (String) this.k.a.a(), (Boolean) this.k.b.a());
        Nh nh = this.h;
        Yg yg = this.b;
        nh.d.b();
        nh.a(nh.b.a(mmA, yg));
        this.c.info("Unhandled exception received: " + mmA, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        String str;
        Zm zm = new Zm(Zm.c);
        Iterator<UserProfileUpdate<? extends InterfaceC4437an>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC4437an userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            ((AbstractC4502dd) userProfileUpdatePatcher).e = this.c;
            userProfileUpdatePatcher.a(zm);
        }
        en enVar = new en();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < zm.a.size(); i++) {
            SparseArray sparseArray = zm.a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C4462bn) it2.next());
            }
        }
        enVar.a = (C4462bn[]) arrayList.toArray(new C4462bn[arrayList.size()]);
        mn mnVarA = n.a(enVar);
        if (!mnVarA.a) {
            this.c.warning("UserInfo wasn't sent because " + mnVarA.b, new Object[0]);
            return;
        }
        Nh nh = this.h;
        Yg yg = this.b;
        nh.getClass();
        T5 t5A = C4443b4.a(enVar);
        Re re = new Re(yg.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(yg.b);
        synchronized (yg) {
            str = yg.f;
        }
        nh.a(new Pg(t5A, false, 1, null, new Yg(re, counterConfiguration, str)));
        this.c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        d(null);
        this.c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        this.c.info("Send event buffer", new Object[0]);
        Nh nh = this.h;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        C4443b4 c4443b4 = new C4443b4("", "", 256, 0, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.b.b.setDataSendingEnabled(z);
        this.c.info("Updated data sending enabled: %s", Boolean.valueOf(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        Nh nh = this.h;
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        c4443b4.p = Collections.singletonMap(str, bArr);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        Nh nh = this.h;
        Yg yg = this.b;
        nh.getClass();
        C4443b4 c4443b4 = new C4443b4(LoggerStorage.getOrCreatePublicLogger(yg.b.getApiKey()));
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        c4443b4.d = 40962;
        c4443b4.c(str);
        c4443b4.b = c4443b4.e(str);
        Re re = new Re(yg.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(yg.b);
        synchronized (yg) {
            str2 = yg.f;
        }
        nh.a(new Pg(c4443b4, false, 1, null, new Yg(re, counterConfiguration, str2)));
        this.c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        String str;
        Nh nh = this.h;
        B b = new B(adRevenue, z, this.c);
        Yg yg = this.b;
        nh.getClass();
        C4443b4 c4443b4A = C4443b4.a(LoggerStorage.getOrCreatePublicLogger(yg.b.getApiKey()), b);
        Re re = new Re(yg.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(yg.b);
        synchronized (yg) {
            str = yg.f;
        }
        nh.a(new Pg(c4443b4A, false, 1, null, new Yg(re, counterConfiguration, str)));
        this.c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC4450bb.b(adRevenue.payload) + ", autoCollected=" + z + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final void b(String str, String str2) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Nh nh = this.h;
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(str2, str, 1, 0, publicLogger);
        c4443b4.l = EnumC4666k9.JS;
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
    }

    public final void a(Map<String, String> map) {
        if (hn.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    public final Mm a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTrace;
        if (th == null) {
            stackTrace = null;
            th2 = null;
        } else if (th instanceof O1) {
            stackTrace = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTrace = null;
        }
        return Pm.a(th2, new T(null, null, this.j.b()), stackTrace != null ? Arrays.asList(stackTrace) : null, (String) this.k.a.a(), (Boolean) this.k.b.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Nh nh = this.h;
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(str2, str, 1, 0, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        C4902u6 c4902u6 = new C4902u6(new Uf(str2, a(th)), str);
        Nh nh = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(c4902u6));
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(byteArray, str2, 5896, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
        this.c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        Mm mmA = this.l.a(pluginErrorDetails);
        Nh nh = this.h;
        Cm cm = mmA.a;
        String str = cm != null ? (String) WrapUtils.getOrDefault(cm.a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.d.fromModel(mmA));
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(byteArray, str, 5891, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
        this.c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final boolean b() {
        return this.b.f();
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Ra
    public void a(Mm mm) {
        Nh nh = this.h;
        Yg yg = this.b;
        nh.d.b();
        Pg pgA = nh.b.a(mm, yg);
        Yg yg2 = pgA.e;
        Qk qk = nh.e;
        if (qk != null) {
            yg2.b.setUuid(((Pk) qk).g());
        } else {
            yg2.getClass();
        }
        nh.c.b(pgA);
        this.c.info("Unhandled exception received: " + mm, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        Nh nh = this.h;
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        nh.a(new C4443b4("", str, 1, 0, publicLogger), this.b, 1, map);
        PublicLogger publicLogger2 = this.c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        Mm mmA;
        C4453be c4453be = this.l;
        if (pluginErrorDetails != null) {
            mmA = c4453be.a(pluginErrorDetails);
        } else {
            c4453be.getClass();
            mmA = null;
        }
        Uf uf = new Uf(str, mmA);
        Nh nh = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.e.fromModel(uf));
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(byteArray, str, 5896, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
        this.c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Ra
    public final void a(T t) {
        X x = new X(t, (String) this.k.a.a(), (Boolean) this.k.b.a());
        Nh nh = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.g.fromModel(x));
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(byteArray, "", 5968, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
        this.c.info("Received ANR", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        if (m.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        int type = moduleEvent.getType();
        String name = moduleEvent.getName();
        String value = moduleEvent.getValue();
        Map<String, Object> environment = moduleEvent.getEnvironment();
        Map<String, byte[]> extras = moduleEvent.getExtras();
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(value, name, 8192, type, publicLogger);
        c4443b4.c = AbstractC4450bb.b(environment);
        if (extras != null) {
            c4443b4.p = extras;
        }
        this.h.a(c4443b4, this.b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Mm mmA;
        C4453be c4453be = this.l;
        if (pluginErrorDetails != null) {
            mmA = c4453be.a(pluginErrorDetails);
        } else {
            c4453be.getClass();
            mmA = null;
        }
        C4902u6 c4902u6 = new C4902u6(new Uf(str2, mmA), str);
        Nh nh = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(c4902u6));
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(byteArray, str2, 5896, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
        this.c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final void a(String str) {
        Nh nh = this.h;
        T5 t5A = T5.a(str);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(t5A, yg), yg, 1, null);
    }
}
