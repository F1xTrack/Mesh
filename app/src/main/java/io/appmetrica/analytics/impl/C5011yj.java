package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.yj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5011yj implements InterfaceC4884tc {
    @Override // io.appmetrica.analytics.impl.InterfaceC4884tc
    public final void a(Context context) {
        Sl slA = Rl.a(C4678kl.class);
        ProtobufStateStorage<Object> protobufStateStorageA = slA.a(context, slA.d(context));
        C4678kl c4678kl = (C4678kl) protobufStateStorageA.read();
        C4654jl c4654jlA = c4678kl.a(c4678kl.m);
        c4654jlA.o = 0L;
        protobufStateStorageA.save(new C4678kl(c4654jlA));
    }
}
