package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.if */
/* loaded from: classes2.dex */
public final class RunnableC5199if implements Runnable {

    /* renamed from: a */
    public final File f31938a;

    /* renamed from: b */
    public final Function f31939b;

    /* renamed from: c */
    public final Consumer f31940c;

    /* renamed from: d */
    public final Consumer f31941d;

    public RunnableC5199if(File file, Function function, Consumer consumer, Consumer consumer2) {
        this.f31938a = file;
        this.f31939b = function;
        this.f31940c = consumer;
        this.f31941d = consumer2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f31938a.exists()) {
            try {
                Object objApply = this.f31939b.apply(this.f31938a);
                if (objApply != null) {
                    this.f31941d.consume(objApply);
                }
            } catch (Throwable unused) {
            }
            this.f31940c.consume(this.f31938a);
        }
    }
}
