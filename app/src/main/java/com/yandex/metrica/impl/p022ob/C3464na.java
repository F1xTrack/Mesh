package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import p000.EnumC9932jq1;

/* renamed from: com.yandex.metrica.impl.ob.na */
/* loaded from: classes2.dex */
public class C3464na implements InterfaceC3230ea {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.k.a.b.C7311a mo13847b(C2654Hc c2654Hc) {
        C3392kg.k.a.b.C7311a c7311a = new C3392kg.k.a.b.C7311a();
        c7311a.f24052b = c2654Hc.f21360b;
        c7311a.f24053c = c2654Hc.f21361c;
        int iOrdinal = c2654Hc.f21359a.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 0;
                }
            }
        }
        c7311a.f24054d = i;
        return c7311a;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2654Hc mo13846a(C3392kg.k.a.b.C7311a c7311a) {
        EnumC9932jq1 enumC9932jq1;
        int i = c7311a.f24054d;
        if (i == 1) {
            enumC9932jq1 = EnumC9932jq1.f35421b;
        } else if (i == 2) {
            enumC9932jq1 = EnumC9932jq1.f35422c;
        } else if (i != 3) {
            enumC9932jq1 = EnumC9932jq1.f35420a;
        } else {
            enumC9932jq1 = EnumC9932jq1.f35423d;
        }
        return new C2654Hc(enumC9932jq1, c7311a.f24052b, c7311a.f24053c);
    }
}
