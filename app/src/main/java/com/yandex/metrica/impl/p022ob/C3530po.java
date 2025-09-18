package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.po */
/* loaded from: classes2.dex */
public class C3530po implements InterfaceC3660uo<String> {

    /* renamed from: a */
    private final String f24520a;

    public C3530po(String str) {
        this.f24520a = str;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3660uo
    /* renamed from: a */
    public C3608so mo14391a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return C3608so.m16802a(this);
        }
        return C3608so.m16803a(this, this.f24520a + " is empty.");
    }
}
