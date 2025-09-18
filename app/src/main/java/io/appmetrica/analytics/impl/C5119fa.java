package io.appmetrica.analytics.impl;

import java.util.Map;
import p000.AbstractC7038vr;
import p000.AbstractC7230yu;

/* renamed from: io.appmetrica.analytics.impl.fa */
/* loaded from: classes2.dex */
public final class C5119fa implements InterfaceC4610K9 {

    /* renamed from: a */
    public final C4489F8 f31677a = new C4489F8();

    /* renamed from: a */
    public final C4993a9[] m20381a(byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return new C4993a9[0];
        }
        Map<String, byte[]> model = this.f31677a.toModel(bArr);
        C4993a9[] c4993a9Arr = new C4993a9[model.size()];
        for (Object obj : model.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C4993a9 c4993a9 = new C4993a9();
            c4993a9.f31251a = ((String) entry.getKey()).getBytes(AbstractC7038vr.f44561a);
            c4993a9.f31252b = (byte[]) entry.getValue();
            c4993a9Arr[i] = c4993a9;
            i = i2;
        }
        return c4993a9Arr;
    }
}
