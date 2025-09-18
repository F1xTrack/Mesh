package io.appmetrica.analytics.impl;

import defpackage.AbstractC7287tn0;
import defpackage.AbstractC8259yu;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class F8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Map<String, byte[]> map) {
        H8 h8 = new H8();
        G8[] g8Arr = new G8[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            G8 g8 = new G8();
            g8.a = (String) entry.getKey();
            g8.b = (byte[]) entry.getValue();
            g8Arr[i] = g8;
            i = i2;
        }
        h8.a = g8Arr;
        return MessageNano.toByteArray(h8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(byte[] bArr) {
        G8[] g8Arr = ((H8) MessageNano.mergeFrom(new H8(), bArr)).a;
        int iB = AbstractC7287tn0.b(g8Arr.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (G8 g8 : g8Arr) {
            linkedHashMap.put(g8.a, g8.b);
        }
        return linkedHashMap;
    }
}
