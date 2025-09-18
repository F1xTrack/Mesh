package io.sentry;

import java.io.File;

/* renamed from: io.sentry.o */
/* loaded from: classes2.dex */
public abstract class AbstractC6070o {

    /* renamed from: a */
    public final C5760E f34257a;

    /* renamed from: b */
    public final ILogger f34258b;

    /* renamed from: c */
    public final long f34259c;

    /* renamed from: d */
    public final C5815W1 f34260d;

    public AbstractC6070o(C5760E c5760e, ILogger iLogger, long j, int i) {
        this.f34257a = c5760e;
        this.f34258b = iLogger;
        this.f34259c = j;
        this.f34260d = new C5815W1(new C6023h(i));
    }

    /* renamed from: a */
    public abstract boolean mo21359a(String str);

    /* renamed from: b */
    public abstract void mo21360b(File file, C6193y c6193y);
}
