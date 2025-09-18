package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.jg */
/* loaded from: classes2.dex */
public final class C5225jg implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C5325ng f31980a;

    public C5225jg(C5325ng c5325ng) {
        this.f31980a = c5325ng;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        C5095eb c5095eb = (C5095eb) obj;
        C5325ng c5325ng = this.f31980a;
        String str = c5095eb.f31583h;
        String str2 = c5095eb.f31580e;
        Integer num = c5095eb.f31581f;
        String str3 = c5095eb.f31582g;
        C5088e4 c5088e4 = new C5088e4(str, str2, num, str3, c5095eb.f31584i);
        String str4 = c5095eb.f31577b;
        byte[] bArr = c5095eb.f31576a;
        int i = c5095eb.f31578c;
        HashMap map = c5095eb.f31579d;
        String str5 = c5095eb.f31585j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(bArr, str4, 5889, orCreatePublicLogger);
        c5013b4.f31284q = map;
        c5013b4.f30767g = i;
        c5013b4.f30763c = str5;
        C4436D4 c4436d4 = new C4436D4(new C5005al(), new C4411C4(), null);
        c5325ng.f32295c.m20901a(c5088e4, c4436d4).mo19487a(c5013b4, c4436d4);
        c5325ng.f32295c.m20902a(num.intValue(), str2, str3);
    }
}
