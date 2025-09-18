package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC11205tn0;
import p000.AbstractC7230yu;

/* renamed from: io.appmetrica.analytics.impl.F8 */
/* loaded from: classes2.dex */
public final class C4489F8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Map<String, byte[]> map) {
        C4537H8 c4537h8 = new C4537H8();
        C4513G8[] c4513g8Arr = new C4513G8[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C4513G8 c4513g8 = new C4513G8();
            c4513g8.f30165a = (String) entry.getKey();
            c4513g8.f30166b = (byte[]) entry.getValue();
            c4513g8Arr[i] = c4513g8;
            i = i2;
        }
        c4537h8.f30246a = c4513g8Arr;
        return MessageNano.toByteArray(c4537h8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(byte[] bArr) {
        C4513G8[] c4513g8Arr = ((C4537H8) MessageNano.mergeFrom(new C4537H8(), bArr)).f30246a;
        int iM24983b = AbstractC11205tn0.m24983b(c4513g8Arr.length);
        if (iM24983b < 16) {
            iM24983b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
        for (C4513G8 c4513g8 : c4513g8Arr) {
            linkedHashMap.put(c4513g8.f30165a, c4513g8.f30166b);
        }
        return linkedHashMap;
    }
}
