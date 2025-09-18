package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.InterfaceC2615Fn;

/* renamed from: com.yandex.metrica.impl.ob.Qn */
/* loaded from: classes2.dex */
public class C2890Qn<V, M extends InterfaceC2615Fn> implements InterfaceC2615Fn {

    /* renamed from: a */
    public final V f22084a;

    /* renamed from: b */
    public final M f22085b;

    public C2890Qn(V v, M m) {
        this.f22084a = v;
        this.f22085b = m;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2615Fn
    /* renamed from: a */
    public int mo14051a() {
        return this.f22085b.mo14051a();
    }

    public String toString() {
        return "TrimmingResult{value=" + this.f22084a + ", metaInfo=" + this.f22085b + '}';
    }
}
