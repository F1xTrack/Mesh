package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* renamed from: io.sentry.n1 */
/* loaded from: classes2.dex */
public enum EnumC6069n1 implements InterfaceC6058l0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    @Override // io.sentry.InterfaceC6058l0
    public void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) throws IOException {
        interfaceC5749A0.mo13811d(name().toLowerCase(Locale.ROOT));
    }
}
