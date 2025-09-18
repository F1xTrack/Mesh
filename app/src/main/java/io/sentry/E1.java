package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public enum E1 implements InterfaceC5141l0 {
    SESSION,
    BUFFER;

    @Override // io.sentry.InterfaceC5141l0
    public void serialize(A0 a0, ILogger iLogger) throws IOException {
        a0.d(name().toLowerCase(Locale.ROOT));
    }
}
