package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Om {
    public final C4573gb a;

    public Om() {
        this(new C4573gb());
    }

    public final Pg a(Mm mm, Yg yg) {
        String str;
        Cm cm = mm.a;
        String str2 = cm == null ? "" : (String) WrapUtils.getOrDefault(cm.a, "");
        byte[] bArrFromModel = this.a.fromModel(mm);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(yg.b.getApiKey());
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(bArrFromModel, str2, 5891, orCreatePublicLogger);
        c4443b4.c = yg.d();
        HashMap map = c4443b4.q;
        Re re = new Re(yg.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(yg.b);
        synchronized (yg) {
            str = yg.f;
        }
        return new Pg(c4443b4, true, 1, map, new Yg(re, counterConfiguration, str));
    }

    public Om(C4573gb c4573gb) {
        this.a = c4573gb;
    }
}
