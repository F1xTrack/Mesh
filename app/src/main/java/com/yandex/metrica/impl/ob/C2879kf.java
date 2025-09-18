package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.kf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2879kf implements InterfaceC2929mf {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2929mf
    public byte[] a(Xe xe, C2856jh c2856jh) {
        return !TextUtils.isEmpty(xe.b) ? O2.c(xe.b) : new byte[0];
    }
}
