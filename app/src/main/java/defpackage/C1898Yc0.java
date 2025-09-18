package defpackage;

/* renamed from: Yc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1898Yc0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C1559Tt0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1898Yc0(C1559Tt0 c1559Tt0, int i) {
        super(1);
        this.e = i;
        this.f = c1559Tt0;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                InterfaceC5578kq0 interfaceC5578kq0 = (InterfaceC5578kq0) obj;
                O90.f(interfaceC5578kq0, "it");
                return interfaceC5578kq0.a(this.f, EnumC8453zv0.a);
            default:
                InterfaceC5578kq0 interfaceC5578kq02 = (InterfaceC5578kq0) obj;
                O90.f(interfaceC5578kq02, "it");
                return interfaceC5578kq02.e(this.f, EnumC8453zv0.e);
        }
    }
}
