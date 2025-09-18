package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.jn */
/* loaded from: classes2.dex */
public final class C5232jn implements InterfaceC4539Ha {
    @Override // io.appmetrica.analytics.impl.InterfaceC4539Ha
    /* renamed from: a */
    public final String mo19466a(Context context) {
        ProtobufStateStorage<Object> protobufStateStorageMo19602a;
        C5255kl c5255kl;
        try {
            AbstractC4813Sl abstractC4813SlM19787a = C4789Rl.m19787a(C5255kl.class);
            if (abstractC4813SlM19787a != null && (protobufStateStorageMo19602a = abstractC4813SlM19787a.mo19602a(context, abstractC4813SlM19787a.mo19603c(context))) != null && (c5255kl = (C5255kl) protobufStateStorageMo19602a.read()) != null) {
                return c5255kl.f32086a;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
