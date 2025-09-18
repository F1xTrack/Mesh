package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.v5 */
/* loaded from: classes2.dex */
public class C3143v5 extends AbstractC3068s5 {
    private final I8 b;

    public C3143v5(C2744f4 c2744f4) {
        this(c2744f4, c2744f4.w());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        C2744f4 c2744f4A = a();
        if (this.b.m()) {
            return false;
        }
        if (!this.b.n()) {
            c2744f4A.r().a(C2864k0.b(c2864k0));
        }
        this.b.a(true);
        return false;
    }

    public C3143v5(C2744f4 c2744f4, I8 i8) {
        super(c2744f4);
        this.b = i8;
    }
}
