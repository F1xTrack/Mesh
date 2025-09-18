package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.io.IOException;
import java.util.Locale;

/* renamed from: io.sentry.protocol.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC5159e implements InterfaceC5141l0 {
    PORTRAIT,
    LANDSCAPE;

    @Override // io.sentry.InterfaceC5141l0
    public void serialize(A0 a0, ILogger iLogger) throws IOException {
        a0.d(toString().toLowerCase(Locale.ROOT));
    }
}
