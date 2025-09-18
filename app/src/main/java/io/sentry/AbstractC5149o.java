package io.sentry;

import java.io.File;

/* renamed from: io.sentry.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5149o {
    public final E a;
    public final ILogger b;
    public final long c;
    public final W1 d;

    public AbstractC5149o(E e, ILogger iLogger, long j, int i) {
        this.a = e;
        this.b = iLogger;
        this.c = j;
        this.d = new W1(new C5128h(i));
    }

    public abstract boolean a(String str);

    public abstract void b(File file, C5185y c5185y);
}
