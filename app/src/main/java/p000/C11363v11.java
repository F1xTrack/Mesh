package p000;

/* renamed from: v11 */
/* loaded from: classes.dex */
public final class C11363v11 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f44088a;

    /* renamed from: b */
    public int f44089b;

    /* renamed from: c */
    public final /* synthetic */ C6915tu f44090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11363v11(C6915tu c6915tu, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f44090c = c6915tu;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f44088a = obj;
        this.f44089b |= Integer.MIN_VALUE;
        return this.f44090c.emit(null, this);
    }
}
