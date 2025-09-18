package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.wf */
/* loaded from: classes2.dex */
public class C3703wf implements InterfaceC3660uo<String> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3660uo
    /* renamed from: a */
    public C3608so mo14391a(String str) {
        String str2 = str;
        return str2 == null ? C3608so.m16803a(this, "key is null") : str2.startsWith("appmetrica") ? C3608so.m16803a(this, "key starts with appmetrica") : str2.length() > 200 ? C3608so.m16803a(this, "key length more then 200 characters") : C3608so.m16802a(this);
    }
}
