package p000;

import java.util.List;

/* renamed from: CI */
/* loaded from: classes2.dex */
public final class C0145CI extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f1299e;

    /* renamed from: f */
    public final /* synthetic */ C0271EI f1300f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0145CI(C0271EI c0271ei, int i) {
        super(0);
        this.f1299e = i;
        this.f1300f = c0271ei;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        C0271EI c0271ei = this.f1300f;
        switch (this.f1299e) {
            case 0:
                C4233iI c4233iI = C4233iI.f29058m;
                InterfaceC10059kq0.f36722a.getClass();
                C9393fd0 c9393fd0 = C9393fd0.f27289o;
                EnumC11985zv0 enumC11985zv0 = EnumC11985zv0.f47094a;
                return c0271ei.m6931i(c4233iI, c9393fd0);
            default:
                c0271ei.f2595g.getClass();
                C0460HI c0460hi = c0271ei.f2598j;
                O90.m5968f(c0460hi, "classDescriptor");
                List listMo5276b = c0460hi.f4213n.mo5276b();
                O90.m5967e(listMo5276b, "getSupertypes(...)");
                return listMo5276b;
        }
    }
}
