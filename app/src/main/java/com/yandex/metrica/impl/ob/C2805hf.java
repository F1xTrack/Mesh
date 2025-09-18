package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.hf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2805hf implements InterfaceC2929mf, Ve {
    @Override // com.yandex.metrica.impl.ob.Ve
    public int a(EnumC2937mn enumC2937mn) {
        return 2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2929mf
    public byte[] a(Xe xe, C2856jh c2856jh) {
        return TextUtils.isEmpty(xe.b) ? new byte[0] : Base64.decode(xe.b, 0);
    }
}
