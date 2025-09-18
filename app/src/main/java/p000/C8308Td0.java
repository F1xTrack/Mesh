package p000;

/* renamed from: Td0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8308Td0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ InterfaceC7158xl f11448e;

    /* renamed from: f */
    public final /* synthetic */ int f11449f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8308Td0(InterfaceC7158xl interfaceC7158xl, int i) {
        super(0);
        this.f11448e = interfaceC7158xl;
        this.f11449f = i;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        Object obj = this.f11448e.mo1221f0().get(this.f11449f);
        O90.m5967e(obj, "get(...)");
        return (InterfaceC8946cA0) obj;
    }
}
