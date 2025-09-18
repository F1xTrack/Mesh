package p000;

import java.util.List;

/* renamed from: Lg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7898Lg0 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f6796e = 0;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC8101Pd1 f6797f;

    /* renamed from: g */
    public final /* synthetic */ List f6798g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7898Lg0(InterfaceC10059kq0 interfaceC10059kq0, C7789Jd1 c7789Jd1, InterfaceC8101Pd1 interfaceC8101Pd1, List list, boolean z) {
        super(1);
        this.f6797f = interfaceC8101Pd1;
        this.f6798g = list;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f6796e) {
            case 0:
                O90.m5968f((C8054Og0) obj, "refiner");
                this.f6797f.mo1962a();
                break;
            default:
                O90.m5968f((C8054Og0) obj, "kotlinTypeRefiner");
                this.f6797f.mo1962a();
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7898Lg0(C7789Jd1 c7789Jd1, InterfaceC8101Pd1 interfaceC8101Pd1, List list, boolean z) {
        super(1);
        this.f6797f = interfaceC8101Pd1;
        this.f6798g = list;
    }
}
