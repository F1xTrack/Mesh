package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* renamed from: io.appmetrica.analytics.impl.mg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4721mg implements Consumer {
    public final C4968x0 a;
    public final Function b;
    public final /* synthetic */ C4745ng c;

    public C4721mg(C4745ng c4745ng, C4968x0 c4968x0, Function<String, T5> function) {
        this.c = c4745ng;
        this.a = c4968x0;
        this.b = function;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) {
        C4745ng c4745ng = this.c;
        C4968x0 c4968x0 = this.a;
        String str2 = c4968x0.a;
        String str3 = c4968x0.b;
        int i = c4968x0.d;
        Integer numValueOf = Integer.valueOf(i);
        C4968x0 c4968x02 = this.a;
        String str4 = c4968x02.e;
        C4518e4 c4518e4 = new C4518e4(str2, str3, numValueOf, str4, c4968x02.c);
        T5 t5 = (T5) this.b.apply(str);
        D4 d4 = new D4(new C4435al(), new C4(), null);
        c4745ng.c.a(c4518e4, d4).a(t5, d4);
        c4745ng.c.a(i, str3, str4);
    }
}
