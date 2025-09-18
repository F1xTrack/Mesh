package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2891R0;

/* renamed from: com.yandex.metrica.impl.ob.Q0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2867Q0<T> implements C2891R0.d {

    /* renamed from: a */
    protected final C2816O<T> f21964a;

    /* renamed from: b */
    private C2891R0 f21965b;

    public AbstractC2867Q0(long j, long j2) {
        this.f21964a = new C2816O<>(j, j2);
    }

    /* renamed from: a */
    public abstract long mo14802a(C3524pi c3524pi);

    /* renamed from: a */
    public T mo14757a() {
        C2891R0 c2891r0;
        if (mo14759b() && (c2891r0 = this.f21965b) != null) {
            c2891r0.m14963b();
        }
        if (this.f21964a.m14682c()) {
            this.f21964a.m14680a(null);
        }
        return this.f21964a.m14678a();
    }

    /* renamed from: a */
    public abstract boolean mo14804a(T t);

    /* renamed from: b */
    public abstract long mo14805b(C3524pi c3524pi);

    /* renamed from: b */
    public void mo14758b(T t) {
        if (mo14804a((AbstractC2867Q0<T>) t)) {
            this.f21964a.m14680a(t);
            C2891R0 c2891r0 = this.f21965b;
            if (c2891r0 != null) {
                c2891r0.m14962a();
            }
        }
    }

    /* renamed from: b */
    public abstract boolean mo14759b();

    /* renamed from: c */
    public void m14806c(C3524pi c3524pi) {
        this.f21964a.m14679a(mo14805b(c3524pi), mo14802a(c3524pi));
    }

    /* renamed from: a */
    public void m14803a(C2891R0 c2891r0) {
        this.f21965b = c2891r0;
    }
}
