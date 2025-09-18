package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.io.IOException;
import java.util.Locale;

/* renamed from: io.sentry.protocol.e */
/* loaded from: classes2.dex */
public enum EnumC6089e implements InterfaceC6058l0 {
    PORTRAIT,
    LANDSCAPE;

    @Override // io.sentry.InterfaceC6058l0
    public void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) throws IOException {
        interfaceC5749A0.mo13811d(toString().toLowerCase(Locale.ROOT));
    }
}
