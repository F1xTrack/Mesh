package com.yandex.metrica.impl.p022ob;

import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.Jm */
/* loaded from: classes2.dex */
public abstract class AbstractCallableC2714Jm<T> implements Callable<T> {
    /* renamed from: a */
    public abstract T mo14447a() throws Exception;

    @Override // java.util.concurrent.Callable
    public T call() {
        try {
            return mo14447a();
        } catch (Throwable unused) {
            return null;
        }
    }
}
