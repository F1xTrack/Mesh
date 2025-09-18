package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2845P3;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.Q3 */
/* loaded from: classes2.dex */
public final class C2870Q3 extends AbstractC2542D0<C2845P3.a> {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2542D0
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo13976a(C2845P3.a aVar, C2845P3.a aVar2) {
        if (!C2968U2.m15250b(aVar2.m14761b())) {
            if (C2968U2.m15250b(aVar.m14761b())) {
                return false;
            }
            if (aVar.mo14053a() == EnumC2567E0.APP) {
                int iIntValue = m13975a().m14144a(aVar.mo14053a()).intValue();
                Integer numM14144a = m13975a().m14144a(aVar2.mo14053a());
                O90.m5967e(numM14144a, "priorities[oldData.source]");
                if (O90.m5970h(iIntValue, numM14144a.intValue()) < 0) {
                    return false;
                }
            } else {
                int iIntValue2 = m13975a().m14144a(aVar.mo14053a()).intValue();
                Integer numM14144a2 = m13975a().m14144a(aVar2.mo14053a());
                O90.m5967e(numM14144a2, "priorities[oldData.source]");
                if (O90.m5970h(iIntValue2, numM14144a2.intValue()) <= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
