package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.x5 */
/* loaded from: classes2.dex */
public class C3198x5 extends AbstractC3068s5 {
    private final I8 b;

    public C3198x5(C2744f4 c2744f4) {
        super(c2744f4);
        this.b = c2744f4.w();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        C2744f4 c2744f4A = a();
        c2744f4A.e().toString();
        if (!this.b.m() || !c2744f4A.A()) {
            return false;
        }
        c2744f4A.r().d(C2864k0.a(c2864k0, c2744f4A));
        return false;
    }
}
