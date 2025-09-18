package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.U4 */
/* loaded from: classes2.dex */
public abstract class AbstractC4844U4 extends AbstractC5489u5 {
    public AbstractC4844U4(BaseRequestConfig.ComponentLoader<Object, Object, C4726P5> componentLoader, C5155gl c5155gl, BaseRequestConfig.BaseRequestArguments<C4411C4, Object> baseRequestArguments) {
        super(componentLoader, c5155gl, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5489u5
    /* renamed from: a */
    public final void mo19538a(Object obj) {
        C4411C4 c4411c4 = (C4411C4) obj;
        synchronized (this) {
            super.mo19538a((Object) c4411c4);
        }
    }

    /* renamed from: a */
    public final synchronized void m19883a(C4411C4 c4411c4) {
        super.mo19538a((Object) c4411c4);
    }
}
