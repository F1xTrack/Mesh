package defpackage;

import java.util.List;

/* renamed from: i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4263i1 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4263i1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(C7304tt.r((C2005Zm) this.f, ((InterfaceC1009Ms) this.g).i((Z01) this.h), (Z01) this.i));
            default:
                List listE = AbstractC8259yu.e((NA0) this.f);
                new MO(new C8243yo1((C0844Ko1) this.g, (String) this.h, 2, listE), (ES1) this.i).run();
                return C1518Tf1.a;
        }
    }
}
