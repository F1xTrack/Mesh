package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.yj */
/* loaded from: classes2.dex */
public final class C5603yj implements InterfaceC5471tc {
    @Override // io.appmetrica.analytics.impl.InterfaceC5471tc
    /* renamed from: a */
    public final void mo21078a(Context context) {
        AbstractC4813Sl abstractC4813SlM19787a = C4789Rl.m19787a(C5255kl.class);
        ProtobufStateStorage<Object> protobufStateStorageMo19602a = abstractC4813SlM19787a.mo19602a(context, abstractC4813SlM19787a.mo19604d(context));
        C5255kl c5255kl = (C5255kl) protobufStateStorageMo19602a.read();
        C5230jl c5230jlM20660a = c5255kl.m20660a(c5255kl.f32098m);
        c5230jlM20660a.f32010o = 0L;
        protobufStateStorageMo19602a.save(new C5255kl(c5230jlM20660a));
    }
}
