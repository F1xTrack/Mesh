package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class CI extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ EI f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CI(EI ei, int i) {
        super(0);
        this.e = i;
        this.f = ei;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        EI ei = this.f;
        switch (this.e) {
            case 0:
                C4317iI c4317iI = C4317iI.m;
                InterfaceC5578kq0.a.getClass();
                C3808fd0 c3808fd0 = C3808fd0.o;
                EnumC8453zv0 enumC8453zv0 = EnumC8453zv0.a;
                return ei.i(c4317iI, c3808fd0);
            default:
                ei.g.getClass();
                HI hi = ei.j;
                O90.f(hi, "classDescriptor");
                List listB = hi.n.b();
                O90.e(listB, "getSupertypes(...)");
                return listB;
        }
    }
}
