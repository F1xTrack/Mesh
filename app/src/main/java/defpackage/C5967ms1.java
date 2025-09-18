package defpackage;

/* renamed from: ms1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5967ms1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ K81 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5967ms1(K81 k81, int i) {
        super(1);
        this.e = i;
        this.f = k81;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                Throwable th = (Throwable) obj;
                O90.f(th, "error");
                this.f.a(th);
                break;
            case 1:
                this.f.b(obj);
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                O90.f(th2, "error");
                this.f.a(th2);
                break;
            default:
                this.f.b(obj);
                break;
        }
        return C1518Tf1.a;
    }
}
