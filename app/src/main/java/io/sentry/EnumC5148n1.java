package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* renamed from: io.sentry.n1 */
/* loaded from: classes2.dex */
public enum EnumC5148n1 implements InterfaceC5141l0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    @Override // io.sentry.InterfaceC5141l0
    public void serialize(A0 a0, ILogger iLogger) throws IOException {
        a0.d(name().toLowerCase(Locale.ROOT));
    }
}
