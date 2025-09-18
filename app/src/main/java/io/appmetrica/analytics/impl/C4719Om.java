package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.Om */
/* loaded from: classes2.dex */
public final class C4719Om {

    /* renamed from: a */
    public final C5145gb f30590a;

    public C4719Om() {
        this(new C5145gb());
    }

    /* renamed from: a */
    public final C4737Pg m19704a(C4671Mm c4671Mm, C4952Yg c4952Yg) {
        String str;
        C4429Cm c4429Cm = c4671Mm.f30489a;
        String str2 = c4429Cm == null ? "" : (String) WrapUtils.getOrDefault(c4429Cm.f29974a, "");
        byte[] bArrFromModel = this.f30590a.fromModel(c4671Mm);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c4952Yg.f31090b.getApiKey());
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(bArrFromModel, str2, 5891, orCreatePublicLogger);
        c5013b4.f30763c = c4952Yg.m20039d();
        HashMap map = c5013b4.f31284q;
        C4782Re c4782Re = new C4782Re(c4952Yg.f31089a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c4952Yg.f31090b);
        synchronized (c4952Yg) {
            str = c4952Yg.f31119f;
        }
        return new C4737Pg(c5013b4, true, 1, map, new C4952Yg(c4782Re, counterConfiguration, str));
    }

    public C4719Om(C5145gb c5145gb) {
        this.f30590a = c5145gb;
    }
}
