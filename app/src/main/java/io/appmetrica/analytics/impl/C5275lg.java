package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.lg */
/* loaded from: classes2.dex */
public final class C5275lg implements Function {

    /* renamed from: a */
    public final /* synthetic */ C5534w0 f32150a;

    public C5275lg(C5534w0 c5534w0) {
        this.f32150a = c5534w0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    public final Object apply(Object obj) {
        String str = (String) obj;
        C5534w0 c5534w0 = this.f32150a;
        String str2 = c5534w0.f32748c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c5534w0.f32751f.f32787a);
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str2);
        C5013b4 c5013b4 = new C5013b4("", "", 5898, 0, orCreatePublicLogger);
        if (str != null) {
            c5013b4.m20149f(str);
        }
        c5013b4.f30773m = bundle;
        c5013b4.f30763c = this.f32150a.f32751f.f32792f;
        return c5013b4;
    }
}
