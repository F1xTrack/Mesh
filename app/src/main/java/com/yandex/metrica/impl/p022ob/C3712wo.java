package com.yandex.metrica.impl.p022ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.wo */
/* loaded from: classes2.dex */
public class C3712wo implements InterfaceC3660uo<String> {

    /* renamed from: a */
    private final Map<String, ?> f25211a;

    public C3712wo(Map<String, ?> map) {
        this.f25211a = map;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3660uo
    /* renamed from: a */
    public C3608so mo14391a(String str) {
        String str2 = str;
        if (!this.f25211a.containsKey(str2)) {
            return C3608so.m16802a(this);
        }
        return C3608so.m16803a(this, "Failed to activate AppMetrica with provided apiKey ApiKey " + str2 + " has already been used by another reporter.");
    }
}
