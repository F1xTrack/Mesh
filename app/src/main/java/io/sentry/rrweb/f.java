package io.sentry.rrweb;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.io.IOException;

/* loaded from: classes2.dex */
public enum f implements InterfaceC5141l0 {
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

    @Override // io.sentry.InterfaceC5141l0
    public void serialize(A0 a0, ILogger iLogger) throws IOException {
        a0.b(ordinal());
    }
}
