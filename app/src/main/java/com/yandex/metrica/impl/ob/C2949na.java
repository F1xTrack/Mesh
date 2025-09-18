package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import defpackage.EnumC5388jq1;

/* renamed from: com.yandex.metrica.impl.ob.na, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2949na implements InterfaceC2725ea {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.k.a.b.C0017a b(Hc hc) {
        C2880kg.k.a.b.C0017a c0017a = new C2880kg.k.a.b.C0017a();
        c0017a.b = hc.b;
        c0017a.c = hc.c;
        int iOrdinal = hc.a.ordinal();
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
        c0017a.d = i;
        return c0017a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Hc a(C2880kg.k.a.b.C0017a c0017a) {
        EnumC5388jq1 enumC5388jq1;
        int i = c0017a.d;
        if (i == 1) {
            enumC5388jq1 = EnumC5388jq1.b;
        } else if (i == 2) {
            enumC5388jq1 = EnumC5388jq1.c;
        } else if (i != 3) {
            enumC5388jq1 = EnumC5388jq1.a;
        } else {
            enumC5388jq1 = EnumC5388jq1.d;
        }
        return new Hc(enumC5388jq1, c0017a.b, c0017a.c);
    }
}
