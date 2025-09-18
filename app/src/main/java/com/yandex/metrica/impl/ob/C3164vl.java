package com.yandex.metrica.impl.ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.vl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3164vl extends Zk<C2662bm> {
    public C3164vl(C2662bm c2662bm) {
        this(c2662bm, new Wk(102400, 200));
    }

    @Override // com.yandex.metrica.impl.ob.Zk
    public List a(C2662bm c2662bm) {
        return c2662bm.h;
    }

    @Override // com.yandex.metrica.impl.ob.Zk
    public int b(C2662bm c2662bm) {
        return c2662bm.a;
    }

    public C3164vl(C2662bm c2662bm, Wk wk) {
        super(c2662bm, wk);
    }
}
