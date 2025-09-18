package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Gg */
/* loaded from: classes2.dex */
public final class C4521Gg extends AbstractC5200ig {

    /* renamed from: b */
    public final C4615Ke f30180b;

    /* renamed from: c */
    public final C5482tn f30181c;

    /* renamed from: d */
    public final SafePackageManager f30182d;

    /* renamed from: e */
    public final TimeProvider f30183e;

    public C4521Gg(C5139g5 c5139g5) {
        this(c5139g5, c5139g5.m20430u(), C5244ka.m20614h().m20632q(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        C5139g5 c5139g5 = this.f31942a;
        if (this.f30181c.m21105d()) {
            return false;
        }
        C4821T5 c4821t5M19836a = ((C4473Eg) c5139g5.f31733l.m21113a()).f30082f ? C4821T5.m19836a(c4821t5, EnumC4898Wa.EVENT_TYPE_APP_UPDATE) : C4821T5.m19836a(c4821t5, EnumC4898Wa.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f30182d.getInstallerPackageName(c5139g5.f31722a, c5139g5.f31723b.f31144a), ""));
            C4615Ke c4615Ke = this.f30180b;
            c4615Ke.f30474h.mo19398a(c4615Ke.f30467a);
            jSONObject.put("preloadInfo", ((C4543He) c4615Ke.m19632c()).m19472b());
        } catch (Throwable unused) {
        }
        c4821t5M19836a.setValue(jSONObject.toString());
        C5193i9 c5193i9 = c5139g5.f31736o;
        c5193i9.m20572a(c4821t5M19836a, C4859Uj.m19888a(c5193i9.f31919c.m19892b(c4821t5M19836a), c4821t5M19836a.f30769i));
        C5482tn c5482tn = this.f30181c;
        synchronized (c5482tn) {
            C5507un c5507un = c5482tn.f32656a;
            c5507un.m21152a(c5507un.m21151a().put("init_event_done", true));
        }
        this.f30181c.m21097a(this.f30183e.currentTimeMillis());
        return false;
    }

    public C4521Gg(C5139g5 c5139g5, C5482tn c5482tn, C4615Ke c4615Ke, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c5139g5);
        this.f30181c = c5482tn;
        this.f30180b = c4615Ke;
        this.f30182d = safePackageManager;
        this.f30183e = systemTimeProvider;
    }
}
