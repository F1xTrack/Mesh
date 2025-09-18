package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.io.IOException;

/* renamed from: io.sentry.rrweb.f */
/* loaded from: classes2.dex */
public enum EnumC6135f implements InterfaceC6058l0 {
    MouseUp,
    MouseDown,
    Click,
    ContextMenu,
    DblClick,
    Focus,
    Blur,
    TouchStart,
    TouchMove_Departed,
    TouchEnd,
    TouchCancel;

    @Override // io.sentry.InterfaceC6058l0
    public void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) throws IOException {
        interfaceC5749A0.mo13809b(ordinal());
    }
}
