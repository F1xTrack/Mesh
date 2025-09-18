package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* loaded from: classes2.dex */
public final class jn implements Ha {
    @Override // io.appmetrica.analytics.impl.Ha
    public final String a(Context context) {
        ProtobufStateStorage<Object> protobufStateStorageA;
        C4678kl c4678kl;
        try {
            Sl slA = Rl.a(C4678kl.class);
            if (slA != null && (protobufStateStorageA = slA.a(context, slA.c(context))) != null && (c4678kl = (C4678kl) protobufStateStorageA.read()) != null) {
                return c4678kl.a;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
