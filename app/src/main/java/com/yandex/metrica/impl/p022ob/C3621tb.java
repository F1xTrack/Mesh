package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.InterfaceC2615Fn;

/* renamed from: com.yandex.metrica.impl.ob.tb */
/* loaded from: classes2.dex */
public class C3621tb<R, M extends InterfaceC2615Fn> implements InterfaceC2615Fn {

    /* renamed from: a */
    public final R f24816a;

    /* renamed from: b */
    public final M f24817b;

    public C3621tb(R r, M m) {
        this.f24816a = r;
        this.f24817b = m;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2615Fn
    /* renamed from: a */
    public int mo14051a() {
        return this.f24817b.mo14051a();
    }

    public String toString() {
        return "Result{result=" + this.f24816a + ", metaInfo=" + this.f24817b + '}';
    }
}
