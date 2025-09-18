package io.appmetrica.analytics.impl;

import defpackage.AbstractC7680vr;
import defpackage.AbstractC8259yu;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4548fa implements K9 {
    public final F8 a = new F8();

    public final C4423a9[] a(byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return new C4423a9[0];
        }
        Map<String, byte[]> model = this.a.toModel(bArr);
        C4423a9[] c4423a9Arr = new C4423a9[model.size()];
        for (Object obj : model.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C4423a9 c4423a9 = new C4423a9();
            c4423a9.a = ((String) entry.getKey()).getBytes(AbstractC7680vr.a);
            c4423a9.b = (byte[]) entry.getValue();
            c4423a9Arr[i] = c4423a9;
            i = i2;
        }
        return c4423a9Arr;
    }
}
