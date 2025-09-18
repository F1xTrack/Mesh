package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.jg */
/* loaded from: classes2.dex */
public final class C4649jg implements Consumer {
    public final /* synthetic */ C4745ng a;

    public C4649jg(C4745ng c4745ng) {
        this.a = c4745ng;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        C4525eb c4525eb = (C4525eb) obj;
        C4745ng c4745ng = this.a;
        String str = c4525eb.h;
        String str2 = c4525eb.e;
        Integer num = c4525eb.f;
        String str3 = c4525eb.g;
        C4518e4 c4518e4 = new C4518e4(str, str2, num, str3, c4525eb.i);
        String str4 = c4525eb.b;
        byte[] bArr = c4525eb.a;
        int i = c4525eb.c;
        HashMap map = c4525eb.d;
        String str5 = c4525eb.j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(bArr, str4, 5889, orCreatePublicLogger);
        c4443b4.q = map;
        c4443b4.g = i;
        c4443b4.c = str5;
        D4 d4 = new D4(new C4435al(), new C4(), null);
        c4745ng.c.a(c4518e4, d4).a(c4443b4, d4);
        c4745ng.c.a(num.intValue(), str2, str3);
    }
}
