package defpackage;

import java.util.List;

/* renamed from: Lg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0897Lg0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ InterfaceC1200Pd1 f;
    public final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0897Lg0(InterfaceC5578kq0 interfaceC5578kq0, C0733Jd1 c0733Jd1, InterfaceC1200Pd1 interfaceC1200Pd1, List list, boolean z) {
        super(1);
        this.f = interfaceC1200Pd1;
        this.g = list;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                O90.f((C1130Og0) obj, "refiner");
                this.f.a();
                break;
            default:
                O90.f((C1130Og0) obj, "kotlinTypeRefiner");
                this.f.a();
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0897Lg0(C0733Jd1 c0733Jd1, InterfaceC1200Pd1 interfaceC1200Pd1, List list, boolean z) {
        super(1);
        this.f = interfaceC1200Pd1;
        this.g = list;
    }
}
