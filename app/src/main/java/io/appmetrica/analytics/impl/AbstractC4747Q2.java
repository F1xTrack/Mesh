package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.p028io.Base64Utils;
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

/* renamed from: io.appmetrica.analytics.impl.Q2 */
/* loaded from: classes2.dex */
public abstract class AbstractC4747Q2 implements InterfaceC4367Aa {

    /* renamed from: m */
    public static final HashSet f30641m = new HashSet(Arrays.asList(1, 13));

    /* renamed from: n */
    public static final C4699O2 f30642n = new C4699O2();

    /* renamed from: a */
    protected final Context f30643a;

    /* renamed from: b */
    protected final C4952Yg f30644b;

    /* renamed from: c */
    protected final PublicLogger f30645c;

    /* renamed from: d */
    protected final C4695Nm f30646d;

    /* renamed from: e */
    protected final C4879Vf f30647e;

    /* renamed from: f */
    protected final C5515v6 f30648f;

    /* renamed from: g */
    public final C4935Y f30649g;

    /* renamed from: h */
    protected final C4690Nh f30650h;

    /* renamed from: i */
    public C5195ib f30651i;

    /* renamed from: j */
    public final C4851Ub f30652j;

    /* renamed from: k */
    public final C4586J9 f30653k;

    /* renamed from: l */
    public final C5023be f30654l;

    public AbstractC4747Q2(Context context, C4690Nh c4690Nh, C4952Yg c4952Yg, C4586J9 c4586j9, C4851Ub c4851Ub, C4695Nm c4695Nm, C4879Vf c4879Vf, C5515v6 c5515v6, C4935Y c4935y, C5023be c5023be) {
        this.f30643a = context.getApplicationContext();
        this.f30650h = c4690Nh;
        this.f30644b = c4952Yg;
        this.f30653k = c4586j9;
        this.f30646d = c4695Nm;
        this.f30647e = c4879Vf;
        this.f30648f = c5515v6;
        this.f30649g = c4935y;
        this.f30654l = c5023be;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c4952Yg.m20020b().getApiKey());
        this.f30645c = orCreatePublicLogger;
        c4952Yg.m20037a(new C5454sk(orCreatePublicLogger, "Crash Environment"));
        if (AbstractC5362p3.m20900a(c4952Yg.m20020b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f30652j = c4851Ub;
    }

    /* renamed from: a */
    public void mo19314a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f30645c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f30645c.info("Put error environment pair <%s, %s>", str, str2);
        C4365A8 c4365a8 = this.f30644b.f31116c;
        c4365a8.f29849b.m21050b(c4365a8.f29848a, str, str2);
    }

    /* renamed from: b */
    public final void m19735b(Map<String, String> map) {
        if (AbstractC5182hn.m20514a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            mo19314a(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: c */
    public final void m19736c(String str) {
        if (this.f30644b.mo19831f()) {
            return;
        }
        this.f30650h.f30525d.m20404c();
        C5195ib c5195ib = this.f30651i;
        c5195ib.f31930a.removeCallbacks(c5195ib.f31932c, c5195ib.f31931b.f30644b.f31090b.getApiKey());
        this.f30644b.f31118e = true;
        C4690Nh c4690Nh = this.f30650h;
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4("", str, 3, 0, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f30645c.info("Clear app environment", new Object[0]);
        C4690Nh c4690Nh = this.f30650h;
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        C4821T5 c4821t5M20141n = C5013b4.m20141n();
        C4782Re c4782Re = new C4782Re(c4952Yg.f31089a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c4952Yg.f31090b);
        synchronized (c4952Yg) {
            str = c4952Yg.f31119f;
        }
        c4690Nh.m19661a(new C4737Pg(c4821t5M20141n, false, 1, null, new C4952Yg(c4782Re, counterConfiguration, str)));
    }

    /* renamed from: d */
    public final void m19737d(String str) {
        this.f30650h.f30525d.m20403b();
        C5195ib c5195ib = this.f30651i;
        C5195ib.m20574a(c5195ib.f31930a, c5195ib.f31931b, c5195ib.f31932c);
        C4690Nh c4690Nh = this.f30650h;
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4("", str, 6400, 0, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
        this.f30644b.f31118e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    /* renamed from: k */
    public String mo19738k() {
        return "[BaseReporter]";
    }

    /* renamed from: l */
    public void mo19739l() {
        String str;
        C4543He c4543He;
        C4690Nh c4690Nh = this.f30650h;
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        C4639Le c4639Le = c4952Yg.f31117d;
        synchronized (c4952Yg) {
            str = c4952Yg.f31119f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c4952Yg.f31090b.getApiKey());
        Set set = AbstractC5443s9.f32553a;
        JSONObject jSONObject = new JSONObject();
        if (c4639Le != null && (c4543He = c4639Le.f30448a) != null) {
            try {
                jSONObject.put("preloadInfo", c4543He.m19473c());
            } catch (Throwable unused) {
            }
        }
        String string = jSONObject.toString();
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(string, "", 6144, 0, orCreatePublicLogger);
        c5013b4.mo19857c(str);
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f30645c.info("Pause session", new Object[0]);
        m19736c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f30645c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f30645c.info("Put app environment: <%s, %s>", str, str2);
        C4690Nh c4690Nh = this.f30650h;
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        C4821T5 c4821t5M20140b = C5013b4.m20140b(str, str2);
        C4782Re c4782Re = new C4782Re(c4952Yg.f31089a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c4952Yg.f31090b);
        synchronized (c4952Yg) {
            str3 = c4952Yg.f31119f;
        }
        c4690Nh.m19661a(new C4737Pg(c4821t5M20140b, false, 1, null, new C4952Yg(c4782Re, counterConfiguration, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        String str;
        this.f30645c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        C4690Nh c4690Nh = this.f30650h;
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        for (C4833Th c4833Th : eCommerceEvent.toProto()) {
            C5013b4 c5013b4 = new C5013b4(LoggerStorage.getOrCreatePublicLogger(c4952Yg.f31090b.getApiKey()));
            EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
            c5013b4.f30764d = 41000;
            c5013b4.f30762b = c5013b4.m20148e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) c4833Th.f30788a)));
            c5013b4.f30767g = c4833Th.f30789b.getBytesTruncated();
            C4782Re c4782Re = new C4782Re(c4952Yg.f31089a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(c4952Yg.f31090b);
            synchronized (c4952Yg) {
                str = c4952Yg.f31119f;
            }
            c4690Nh.m19661a(new C4737Pg(c5013b4, false, 1, null, new C4952Yg(c4782Re, counterConfiguration, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        C4855Uf c4855Uf = new C4855Uf(str, m19733a(th));
        C4690Nh c4690Nh = this.f30650h;
        byte[] byteArray = MessageNano.toByteArray(this.f30647e.fromModel(c4855Uf));
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(byteArray, str, 5892, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
        this.f30645c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f30645c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        C4690Nh c4690Nh = this.f30650h;
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4("", str, 1, 0, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        String str;
        C5077di c5077di = AbstractC4723P2.f30598a;
        c5077di.getClass();
        C5307mn c5307mnMo19211a = c5077di.mo19211a(revenue);
        if (!c5307mnMo19211a.f32232a) {
            this.f30645c.warning("Passed revenue is not valid. Reason: " + c5307mnMo19211a.f32233b, new Object[0]);
            return;
        }
        C4690Nh c4690Nh = this.f30650h;
        C5102ei c5102ei = new C5102ei(revenue, this.f30645c);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        C5013b4 c5013b4M20139a = C5013b4.m20139a(LoggerStorage.getOrCreatePublicLogger(c4952Yg.f31090b.getApiKey()), c5102ei);
        C4782Re c4782Re = new C4782Re(c4952Yg.f31089a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c4952Yg.f31090b);
        synchronized (c4952Yg) {
            str = c4952Yg.f31119f;
        }
        c4690Nh.m19661a(new C4737Pg(c5013b4M20139a, false, 1, null, new C4952Yg(c4782Re, counterConfiguration, str)));
        this.f30645c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        C4671Mm c4671MmM19732a = AbstractC4743Pm.m19732a(th, new C4815T(null, null, this.f30652j.m19886b()), null, (String) this.f30653k.f30357a.m19817a(), (Boolean) this.f30653k.f30358b.m19817a());
        C4690Nh c4690Nh = this.f30650h;
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.f30525d.m20403b();
        c4690Nh.m19661a(c4690Nh.f30523b.m19704a(c4671MmM19732a, c4952Yg));
        this.f30645c.info("Unhandled exception received: " + c4671MmM19732a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        String str;
        C4982Zm c4982Zm = new C4982Zm(C4982Zm.f31228c);
        Iterator<UserProfileUpdate<? extends InterfaceC5007an>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC5007an userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            ((AbstractC5072dd) userProfileUpdatePatcher).f31485e = this.f30645c;
            userProfileUpdatePatcher.mo19457a(c4982Zm);
        }
        C5107en c5107en = new C5107en();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c4982Zm.f31229a.size(); i++) {
            SparseArray sparseArray = c4982Zm.f31229a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C5032bn) it2.next());
            }
        }
        c5107en.f31643a = (C5032bn[]) arrayList.toArray(new C5032bn[arrayList.size()]);
        C5307mn c5307mnMo19211a = f30642n.mo19211a(c5107en);
        if (!c5307mnMo19211a.f32232a) {
            this.f30645c.warning("UserInfo wasn't sent because " + c5307mnMo19211a.f32233b, new Object[0]);
            return;
        }
        C4690Nh c4690Nh = this.f30650h;
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        C4821T5 c4821t5M20137a = C5013b4.m20137a(c5107en);
        C4782Re c4782Re = new C4782Re(c4952Yg.f31089a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c4952Yg.f31090b);
        synchronized (c4952Yg) {
            str = c4952Yg.f31119f;
        }
        c4690Nh.m19661a(new C4737Pg(c4821t5M20137a, false, 1, null, new C4952Yg(c4782Re, counterConfiguration, str)));
        this.f30645c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        m19737d(null);
        this.f30645c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        this.f30645c.info("Send event buffer", new Object[0]);
        C4690Nh c4690Nh = this.f30650h;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        C5013b4 c5013b4 = new C5013b4("", "", 256, 0, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.f30644b.f31090b.setDataSendingEnabled(z);
        this.f30645c.info("Updated data sending enabled: %s", Boolean.valueOf(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        C4690Nh c4690Nh = this.f30650h;
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        c5013b4.f30776p = Collections.singletonMap(str, bArr);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        C4690Nh c4690Nh = this.f30650h;
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        C5013b4 c5013b4 = new C5013b4(LoggerStorage.getOrCreatePublicLogger(c4952Yg.f31090b.getApiKey()));
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c5013b4.f30764d = 40962;
        c5013b4.mo19857c(str);
        c5013b4.f30762b = c5013b4.m20148e(str);
        C4782Re c4782Re = new C4782Re(c4952Yg.f31089a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c4952Yg.f31090b);
        synchronized (c4952Yg) {
            str2 = c4952Yg.f31119f;
        }
        c4690Nh.m19661a(new C4737Pg(c5013b4, false, 1, null, new C4952Yg(c4782Re, counterConfiguration, str2)));
        this.f30645c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        String str;
        C4690Nh c4690Nh = this.f30650h;
        C4381B c4381b = new C4381B(adRevenue, z, this.f30645c);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        C5013b4 c5013b4M20138a = C5013b4.m20138a(LoggerStorage.getOrCreatePublicLogger(c4952Yg.f31090b.getApiKey()), c4381b);
        C4782Re c4782Re = new C4782Re(c4952Yg.f31089a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c4952Yg.f31090b);
        synchronized (c4952Yg) {
            str = c4952Yg.f31119f;
        }
        c4690Nh.m19661a(new C4737Pg(c5013b4M20138a, false, 1, null, new C4952Yg(c4782Re, counterConfiguration, str)));
        this.f30645c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC5020bb.m20174b(adRevenue.payload) + ", autoCollected=" + z + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4367Aa
    /* renamed from: b */
    public final void mo19187b(String str, String str2) {
        this.f30645c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C4690Nh c4690Nh = this.f30650h;
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(str2, str, 1, 0, publicLogger);
        c5013b4.f30772l = EnumC5243k9.JS;
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
    }

    /* renamed from: a */
    public final void m19734a(Map<String, String> map) {
        if (AbstractC5182hn.m20514a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public final C4671Mm m19733a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTrace;
        if (th == null) {
            stackTrace = null;
            th2 = null;
        } else if (th instanceof C4698O1) {
            stackTrace = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTrace = null;
        }
        return AbstractC4743Pm.m19732a(th2, new C4815T(null, null, this.f30652j.m19886b()), stackTrace != null ? Arrays.asList(stackTrace) : null, (String) this.f30653k.f30357a.m19817a(), (Boolean) this.f30653k.f30358b.m19817a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f30645c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C4690Nh c4690Nh = this.f30650h;
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(str2, str, 1, 0, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        C5490u6 c5490u6 = new C5490u6(new C4855Uf(str2, m19733a(th)), str);
        C4690Nh c4690Nh = this.f30650h;
        byte[] byteArray = MessageNano.toByteArray(this.f30648f.fromModel(c5490u6));
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(byteArray, str2, 5896, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
        this.f30645c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        C4671Mm c4671MmM20190a = this.f30654l.m20190a(pluginErrorDetails);
        C4690Nh c4690Nh = this.f30650h;
        C4429Cm c4429Cm = c4671MmM20190a.f30489a;
        String str = c4429Cm != null ? (String) WrapUtils.getOrDefault(c4429Cm.f29974a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f30646d.fromModel(c4671MmM20190a));
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(byteArray, str, 5891, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
        this.f30645c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4367Aa
    /* renamed from: b */
    public final boolean mo19188b() {
        return this.f30644b.mo19831f();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4707Oa, io.appmetrica.analytics.impl.InterfaceC4778Ra
    /* renamed from: a */
    public void mo19683a(C4671Mm c4671Mm) {
        C4690Nh c4690Nh = this.f30650h;
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.f30525d.m20403b();
        C4737Pg c4737PgM19704a = c4690Nh.f30523b.m19704a(c4671Mm, c4952Yg);
        C4952Yg c4952Yg2 = c4737PgM19704a.f30624e;
        InterfaceC4765Qk interfaceC4765Qk = c4690Nh.f30526e;
        if (interfaceC4765Qk != null) {
            c4952Yg2.f31090b.setUuid(((C4741Pk) interfaceC4765Qk).m19729g());
        } else {
            c4952Yg2.getClass();
        }
        c4690Nh.f30524c.m19697b(c4737PgM19704a);
        this.f30645c.info("Unhandled exception received: " + c4671Mm, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        C4690Nh c4690Nh = this.f30650h;
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c4690Nh.m19663a(new C5013b4("", str, 1, 0, publicLogger), this.f30644b, 1, map);
        PublicLogger publicLogger2 = this.f30645c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C4671Mm c4671MmM20190a;
        C5023be c5023be = this.f30654l;
        if (pluginErrorDetails != null) {
            c4671MmM20190a = c5023be.m20190a(pluginErrorDetails);
        } else {
            c5023be.getClass();
            c4671MmM20190a = null;
        }
        C4855Uf c4855Uf = new C4855Uf(str, c4671MmM20190a);
        C4690Nh c4690Nh = this.f30650h;
        byte[] byteArray = MessageNano.toByteArray(this.f30647e.fromModel(c4855Uf));
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(byteArray, str, 5896, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
        this.f30645c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4707Oa, io.appmetrica.analytics.impl.InterfaceC4778Ra
    /* renamed from: a */
    public final void mo19684a(C4815T c4815t) {
        C4911X c4911x = new C4911X(c4815t, (String) this.f30653k.f30357a.m19817a(), (Boolean) this.f30653k.f30358b.m19817a());
        C4690Nh c4690Nh = this.f30650h;
        byte[] byteArray = MessageNano.toByteArray(this.f30649g.fromModel(c4911x));
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(byteArray, "", 5968, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
        this.f30645c.info("Received ANR", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        if (f30641m.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        int type = moduleEvent.getType();
        String name = moduleEvent.getName();
        String value = moduleEvent.getValue();
        Map<String, Object> environment = moduleEvent.getEnvironment();
        Map<String, byte[]> extras = moduleEvent.getExtras();
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(value, name, 8192, type, publicLogger);
        c5013b4.f30763c = AbstractC5020bb.m20174b(environment);
        if (extras != null) {
            c5013b4.f30776p = extras;
        }
        this.f30650h.m19663a(c5013b4, this.f30644b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C4671Mm c4671MmM20190a;
        C5023be c5023be = this.f30654l;
        if (pluginErrorDetails != null) {
            c4671MmM20190a = c5023be.m20190a(pluginErrorDetails);
        } else {
            c5023be.getClass();
            c4671MmM20190a = null;
        }
        C5490u6 c5490u6 = new C5490u6(new C4855Uf(str2, c4671MmM20190a), str);
        C4690Nh c4690Nh = this.f30650h;
        byte[] byteArray = MessageNano.toByteArray(this.f30648f.fromModel(c5490u6));
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(byteArray, str2, 5896, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
        this.f30645c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4367Aa
    /* renamed from: a */
    public final void mo19186a(String str) {
        C4690Nh c4690Nh = this.f30650h;
        C4821T5 c4821t5M19840a = C4821T5.m19840a(str);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c4821t5M19840a, c4952Yg), c4952Yg, 1, null);
    }
}
