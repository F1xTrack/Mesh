package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes2.dex */
public abstract class U4 extends AbstractC4901u5 {
    public U4(BaseRequestConfig.ComponentLoader<Object, Object, P5> componentLoader, C4583gl c4583gl, BaseRequestConfig.BaseRequestArguments<C4, Object> baseRequestArguments) {
        super(componentLoader, c4583gl, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4901u5
    public final void a(Object obj) {
        C4 c4 = (C4) obj;
        synchronized (this) {
            super.a((Object) c4);
        }
    }

    public final synchronized void a(C4 c4) {
        super.a((Object) c4);
    }
}
