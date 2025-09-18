package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class C7 implements InterfaceC2725ea<C2896l7, Of> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2896l7 a(Of of) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Of b(C2896l7 c2896l7) {
        Of of = new Of();
        String strA = c2896l7.a();
        String str = of.b;
        if (strA == null) {
            strA = str;
        }
        of.b = strA;
        String strC = c2896l7.c();
        String str2 = of.c;
        if (strC == null) {
            strC = str2;
        }
        of.c = strC;
        Integer numD = c2896l7.d();
        Integer numValueOf = Integer.valueOf(of.d);
        if (numD == null) {
            numD = numValueOf;
        }
        of.d = numD.intValue();
        Integer numB = c2896l7.b();
        Integer numValueOf2 = Integer.valueOf(of.g);
        if (numB == null) {
            numB = numValueOf2;
        }
        of.g = numB.intValue();
        String strE = c2896l7.e();
        String str3 = of.e;
        if (strE == null) {
            strE = str3;
        }
        of.e = strE;
        Boolean boolF = c2896l7.f();
        Boolean boolValueOf = Boolean.valueOf(of.f);
        if (boolF == null) {
            boolF = boolValueOf;
        }
        of.f = boolF.booleanValue();
        return of;
    }
}
