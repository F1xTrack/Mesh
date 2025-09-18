package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.i */
/* loaded from: classes2.dex */
public final class C6093i implements InterfaceC6058l0 {

    /* renamed from: a */
    public final Number f34380a;

    /* renamed from: b */
    public final String f34381b;

    /* renamed from: c */
    public ConcurrentHashMap f34382c;

    public C6093i(Number number, String str) {
        this.f34380a = number;
        this.f34381b = str;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("value").mo13820m(this.f34380a);
        String str = this.f34381b;
        if (str != null) {
            interfaceC5749A0.mo13828u("unit").mo13811d(str);
        }
        ConcurrentHashMap concurrentHashMap = this.f34382c;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34382c, str2, interfaceC5749A0, str2, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
