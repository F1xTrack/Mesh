package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* renamed from: io.appmetrica.analytics.impl.mg */
/* loaded from: classes2.dex */
public final class C5300mg implements Consumer {

    /* renamed from: a */
    public final C5559x0 f32224a;

    /* renamed from: b */
    public final Function f32225b;

    /* renamed from: c */
    public final /* synthetic */ C5325ng f32226c;

    public C5300mg(C5325ng c5325ng, C5559x0 c5559x0, Function<String, C4821T5> function) {
        this.f32226c = c5325ng;
        this.f32224a = c5559x0;
        this.f32225b = function;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) {
        C5325ng c5325ng = this.f32226c;
        C5559x0 c5559x0 = this.f32224a;
        String str2 = c5559x0.f32787a;
        String str3 = c5559x0.f32788b;
        int i = c5559x0.f32790d;
        Integer numValueOf = Integer.valueOf(i);
        C5559x0 c5559x02 = this.f32224a;
        String str4 = c5559x02.f32791e;
        C5088e4 c5088e4 = new C5088e4(str2, str3, numValueOf, str4, c5559x02.f32789c);
        C4821T5 c4821t5 = (C4821T5) this.f32225b.apply(str);
        C4436D4 c4436d4 = new C4436D4(new C5005al(), new C4411C4(), null);
        c5325ng.f32295c.m20901a(c5088e4, c4436d4).mo19487a(c4821t5, c4436d4);
        c5325ng.f32295c.m20902a(i, str3, str4);
    }
}
