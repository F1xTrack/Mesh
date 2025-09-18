package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.io.IOException;

/* renamed from: io.sentry.rrweb.c */
/* loaded from: classes2.dex */
public enum EnumC6132c implements InterfaceC6058l0 {
    DomContentLoaded,
    Load,
    FullSnapshot,
    IncrementalSnapshot,
    Meta,
    Custom,
    Plugin;

    @Override // io.sentry.InterfaceC6058l0
    public void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) throws IOException {
        interfaceC5749A0.mo13809b(ordinal());
    }
}
