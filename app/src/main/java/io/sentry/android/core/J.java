package io.sentry.android.core;

import android.os.FileObserver;
import defpackage.AbstractC1705Vq;
import defpackage.AbstractC8235ym;
import io.sentry.B0;
import io.sentry.C5185y;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import java.io.File;

/* loaded from: classes2.dex */
public final class J extends FileObserver {
    public final String a;
    public final B0 b;
    public final ILogger c;
    public final long d;

    public J(String str, B0 b0, ILogger iLogger, long j) {
        super(str);
        this.a = str;
        this.b = b0;
        io.sentry.config.a.D(iLogger, "Logger is required.");
        this.c = iLogger;
        this.d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (str == null || i != 8) {
            return;
        }
        EnumC5148n1 enumC5148n1 = EnumC5148n1.DEBUG;
        Integer numValueOf = Integer.valueOf(i);
        String str2 = this.a;
        ILogger iLogger = this.c;
        iLogger.k(enumC5148n1, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        C5185y c5185yB = io.sentry.config.a.b(new I(this.d, iLogger));
        String strL = AbstractC1705Vq.l(AbstractC8235ym.o(str2), File.separator, str);
        B0 b0 = this.b;
        b0.getClass();
        io.sentry.config.a.D(strL, "Path is required.");
        b0.b(new File(strL), c5185yB);
    }
}
