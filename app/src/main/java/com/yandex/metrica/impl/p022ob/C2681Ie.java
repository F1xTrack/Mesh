package com.yandex.metrica.impl.p022ob;

import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.Ie */
/* loaded from: classes2.dex */
public final class C2681Ie extends AbstractC2542D0<C2756Le> {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2542D0
    /* renamed from: a */
    public boolean mo13976a(C2756Le c2756Le, C2756Le c2756Le2) {
        C2756Le c2756Le3 = c2756Le;
        C2756Le c2756Le4 = c2756Le2;
        if (c2756Le3.f21640c) {
            if (c2756Le4.f21640c) {
                int iIntValue = m13975a().m14144a(c2756Le3.f21642e).intValue();
                Integer numM14144a = m13975a().m14144a(c2756Le4.f21642e);
                O90.m5967e(numM14144a, "priorities[oldData.source]");
                if (O90.m5970h(iIntValue, numM14144a.intValue()) > 0) {
                }
            }
            return true;
        }
        return false;
    }
}
