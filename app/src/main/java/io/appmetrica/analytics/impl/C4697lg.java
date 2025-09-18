package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.lg */
/* loaded from: classes2.dex */
public final class C4697lg implements Function {
    public final /* synthetic */ C4944w0 a;

    public C4697lg(C4944w0 c4944w0) {
        this.a = c4944w0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    public final Object apply(Object obj) {
        String str = (String) obj;
        C4944w0 c4944w0 = this.a;
        String str2 = c4944w0.c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c4944w0.f.a);
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str2);
        C4443b4 c4443b4 = new C4443b4("", "", 5898, 0, orCreatePublicLogger);
        if (str != null) {
            c4443b4.f(str);
        }
        c4443b4.m = bundle;
        c4443b4.c = this.a.f.f;
        return c4443b4;
    }
}
