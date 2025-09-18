package p000;

/* renamed from: ms1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10320ms1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f37972e;

    /* renamed from: f */
    public final /* synthetic */ K81 f37973f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10320ms1(K81 k81, int i) {
        super(1);
        this.f37972e = i;
        this.f37973f = k81;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f37972e) {
            case 0:
                Throwable th = (Throwable) obj;
                O90.m5968f(th, "error");
                this.f37973f.m4568a(th);
                break;
            case 1:
                this.f37973f.m4569b(obj);
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                O90.m5968f(th2, "error");
                this.f37973f.m4568a(th2);
                break;
            default:
                this.f37973f.m4569b(obj);
                break;
        }
        return C8313Tf1.f11463a;
    }
}
