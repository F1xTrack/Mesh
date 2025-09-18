package p000;

/* renamed from: uW */
/* loaded from: classes2.dex */
public final class C6954uW extends AbstractC1571Yy {

    /* renamed from: a */
    public C7017vW f43708a;

    /* renamed from: b */
    public /* synthetic */ Object f43709b;

    /* renamed from: c */
    public final /* synthetic */ C7017vW f43710c;

    /* renamed from: d */
    public int f43711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6954uW(C7017vW c7017vW, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f43710c = c7017vW;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f43709b = obj;
        this.f43711d |= Integer.MIN_VALUE;
        return this.f43710c.emit(null, this);
    }
}
