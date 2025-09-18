package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import p000.AbstractC7038vr;

/* renamed from: io.appmetrica.analytics.impl.Zd */
/* loaded from: classes2.dex */
public final class C4973Zd implements Converter {
    /* renamed from: a */
    public final String m20082a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(String str) {
        if ("native".equals(str)) {
            str = "JVM";
        }
        return str.getBytes(AbstractC7038vr.f44561a);
    }
}
