package io.appmetrica.analytics.impl;

import defpackage.AbstractC7680vr;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes2.dex */
public final class Zd implements Converter {
    public final String a(byte[] bArr) {
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
        return str.getBytes(AbstractC7680vr.a);
    }
}
