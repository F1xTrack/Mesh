package io.appmetrica.analytics.impl;

import defpackage.AbstractC7680vr;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ae, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4428ae implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5[] fromModel(Map<String, String> map) {
        int size = map.size();
        X5[] x5Arr = new X5[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            x5Arr[i2] = new X5();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            X5 x5 = x5Arr[i];
            String key = entry.getKey();
            Charset charset = AbstractC7680vr.a;
            x5.a = key.getBytes(charset);
            x5Arr[i].b = entry.getValue().getBytes(charset);
            i++;
        }
        return x5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, String> a(X5[] x5Arr) {
        throw new UnsupportedOperationException();
    }
}
