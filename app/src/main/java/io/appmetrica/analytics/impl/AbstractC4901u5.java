package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.u5 */
/* loaded from: classes2.dex */
public abstract class AbstractC4901u5 implements InterfaceC4890ti {
    public BaseRequestConfig a;
    public final BaseRequestConfig.RequestConfigLoader b;
    public P5 c;

    public AbstractC4901u5(BaseRequestConfig.RequestConfigLoader<Object, P5> requestConfigLoader, C4583gl c4583gl, ArgumentsMerger<Object, Object> argumentsMerger) {
        this.b = requestConfigLoader;
        C4667ka.h().s().a(this);
        a(new P5(c4583gl, C4667ka.h().s(), C4667ka.h().p(), argumentsMerger));
    }

    public final synchronized void a(P5 p5) {
        this.c = p5;
    }

    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.c.componentArguments;
    }

    public final synchronized C4583gl c() {
        return this.c.a;
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final synchronized void e() {
        this.a = null;
    }

    public synchronized void a(Object obj) {
        if (!((ArgumentsMerger) this.c.componentArguments).compareWithOtherArguments(obj)) {
            a(new P5(c(), C4667ka.C.s(), C4667ka.C.p(), (ArgumentsMerger) ((ArgumentsMerger) this.c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(C4583gl c4583gl) {
        a(new P5(c4583gl, C4667ka.C.s(), C4667ka.C.p(), b()));
        e();
    }

    public final synchronized BaseRequestConfig a() {
        try {
            if (this.a == null) {
                this.a = this.b.load(this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
