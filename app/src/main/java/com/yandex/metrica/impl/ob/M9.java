package com.yandex.metrica.impl.ob;

import defpackage.O90;

/* loaded from: classes2.dex */
public final class M9 extends L9<C2706dg> {
    @Override // com.yandex.metrica.impl.ob.W9
    public Object a() {
        return new C2706dg();
    }

    @Override // com.yandex.metrica.impl.ob.W9
    public Object a(byte[] bArr) {
        C2706dg c2706dg = (C2706dg) AbstractC2714e.a(new C2706dg(), bArr);
        O90.e(c2706dg, "ClidsInfoProto.ClidsInfo.parseFrom(data)");
        return c2706dg;
    }
}
