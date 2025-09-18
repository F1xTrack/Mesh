package com.yandex.metrica.impl.p022ob;

import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.M9 */
/* loaded from: classes2.dex */
public final class C2776M9 extends AbstractC2751L9<C3210dg> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3025W9
    /* renamed from: a */
    public Object mo14195a() {
        return new C3210dg();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3025W9
    /* renamed from: a */
    public Object mo14196a(byte[] bArr) {
        C3210dg c3210dg = (C3210dg) AbstractC3219e.m15808a(new C3210dg(), bArr);
        O90.m5967e(c3210dg, "ClidsInfoProto.ClidsInfo.parseFrom(data)");
        return c3210dg;
    }
}
