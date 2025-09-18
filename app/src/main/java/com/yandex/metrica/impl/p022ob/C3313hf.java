package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.hf */
/* loaded from: classes2.dex */
public class C3313hf implements InterfaceC3443mf, InterfaceC3005Ve {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3005Ve
    /* renamed from: a */
    public int mo15308a(EnumC3451mn enumC3451mn) {
        return 2;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3443mf
    /* renamed from: a */
    public byte[] mo14848a(C3055Xe c3055Xe, C3367jh c3367jh) {
        return TextUtils.isEmpty(c3055Xe.f22787b) ? new byte[0] : Base64.decode(c3055Xe.f22787b, 0);
    }
}
