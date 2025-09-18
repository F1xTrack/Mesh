package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* renamed from: io.sentry.E1 */
/* loaded from: classes2.dex */
public enum EnumC5762E1 implements InterfaceC6058l0 {
    SESSION,
    BUFFER;

    @Override // io.sentry.InterfaceC6058l0
    public void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) throws IOException {
        interfaceC5749A0.mo13811d(name().toLowerCase(Locale.ROOT));
    }
}
