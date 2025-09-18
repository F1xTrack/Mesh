package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;
import java.math.BigDecimal;
import kotlin.Pair;

/* renamed from: com.yandex.metrica.impl.ob.kb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2875kb implements InterfaceC2725ea<BigDecimal, Rf.e> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public BigDecimal a(Rf.e eVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rf.e b(BigDecimal bigDecimal) {
        Pair pairA = C3110tm.a(bigDecimal);
        C3085sm c3085sm = new C3085sm(((Number) pairA.a).longValue(), ((Number) pairA.b).intValue());
        Rf.e eVar = new Rf.e();
        eVar.b = c3085sm.b();
        eVar.c = c3085sm.a();
        return eVar;
    }
}
