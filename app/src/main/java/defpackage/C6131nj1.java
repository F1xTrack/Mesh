package defpackage;


/* renamed from: nj1 */
/* loaded from: classes.dex */
public final class C6131nj1 extends AbstractC1676Vg0 implements InterfaceC6481pZ {
    public final /* synthetic */ C5217ix0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6131nj1(C5217ix0 c5217ix0) {
        super(3);
        this.e = c5217ix0;
    }

    @Override // defpackage.InterfaceC6481pZ
    public final Object b(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Exception exc = (Exception) obj2;
        String str2 = (String) obj3;
        O90.f(str, "errorString");
        O90.f(exc, Core.Event.Result.EXCEPTION);
        O90.f(str2, "errorCode");
        this.e.d(SP.e, new C2369bg(exc, str, str2, 1));
        return C1518Tf1.a;
    }
}
