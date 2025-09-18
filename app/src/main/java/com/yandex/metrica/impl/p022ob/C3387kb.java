package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import java.math.BigDecimal;
import kotlin.Pair;

/* renamed from: com.yandex.metrica.impl.ob.kb */
/* loaded from: classes2.dex */
public class C3387kb implements InterfaceC3230ea<BigDecimal, C2906Rf.e> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public BigDecimal mo13846a(C2906Rf.e eVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2906Rf.e mo13847b(BigDecimal bigDecimal) {
        Pair pairM16881a = C3632tm.m16881a(bigDecimal);
        C3606sm c3606sm = new C3606sm(((Number) pairM16881a.f36702a).longValue(), ((Number) pairM16881a.f36703b).intValue());
        C2906Rf.e eVar = new C2906Rf.e();
        eVar.f22144b = c3606sm.m16801b();
        eVar.f22145c = c3606sm.m16800a();
        return eVar;
    }
}
