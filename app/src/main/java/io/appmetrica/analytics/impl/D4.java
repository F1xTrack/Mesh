package io.appmetrica.analytics.impl;

import android.os.ResultReceiver;

/* loaded from: classes2.dex */
public final class D4 {
    public final C4435al a;
    public final C4 b;
    public final ResultReceiver c;

    public D4(Y3 y3) {
        this(new C4435al(y3), new C4(y3.b(), y3.a().a()), y3.a().c());
    }

    public D4(C4435al c4435al, C4 c4, ResultReceiver resultReceiver) {
        this.a = c4435al;
        this.b = c4;
        this.c = resultReceiver;
    }
}
