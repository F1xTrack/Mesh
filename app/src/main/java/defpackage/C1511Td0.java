package defpackage;

/* renamed from: Td0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1511Td0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ InterfaceC8042xl e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1511Td0(InterfaceC8042xl interfaceC8042xl, int i) {
        super(0);
        this.e = interfaceC8042xl;
        this.f = i;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        Object obj = this.e.f0().get(this.f);
        O90.e(obj, "get(...)");
        return (InterfaceC2464cA0) obj;
    }
}
