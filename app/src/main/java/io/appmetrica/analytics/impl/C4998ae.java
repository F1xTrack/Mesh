package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import p000.AbstractC7038vr;

/* renamed from: io.appmetrica.analytics.impl.ae */
/* loaded from: classes2.dex */
public final class C4998ae implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4917X5[] fromModel(Map<String, String> map) {
        int size = map.size();
        C4917X5[] c4917x5Arr = new C4917X5[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            c4917x5Arr[i2] = new C4917X5();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C4917X5 c4917x5 = c4917x5Arr[i];
            String key = entry.getKey();
            Charset charset = AbstractC7038vr.f44561a;
            c4917x5.f31013a = key.getBytes(charset);
            c4917x5Arr[i].f31014b = entry.getValue().getBytes(charset);
            i++;
        }
        return c4917x5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final Map<String, String> m20121a(C4917X5[] c4917x5Arr) {
        throw new UnsupportedOperationException();
    }
}
