package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes2.dex */
class Pa implements InterfaceC3226y8 {
    private final InterfaceC3226y8 a;

    public Pa(Context context, D8 d8, InterfaceC3226y8 interfaceC3226y8) {
        this.a = interfaceC3226y8;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3226y8
    public void a(String str, byte[] bArr) {
        this.a.a(str, bArr);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3226y8
    public void b(String str) {
        this.a.b(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3226y8
    public byte[] a(String str) {
        return this.a.a(str);
    }
}
