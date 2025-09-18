package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.m5 */
/* loaded from: classes2.dex */
public class C2919m5 extends AbstractC3068s5 {
    private final I8 b;
    private final Lm c;

    public C2919m5(C2744f4 c2744f4) {
        this(c2744f4, c2744f4.w(), Lm.c());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        C2744f4 c2744f4A = a();
        if (this.b.m() || this.b.n()) {
            return false;
        }
        if (c2744f4A.m().Q()) {
            this.c.b();
        }
        a().j().a();
        return false;
    }

    public C2919m5(C2744f4 c2744f4, I8 i8, Lm lm) {
        super(c2744f4);
        this.b = i8;
        this.c = lm;
    }
}
