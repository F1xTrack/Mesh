package p000;

/* renamed from: wW */
/* loaded from: classes2.dex */
public final class C7080wW extends AbstractC1571Yy {

    /* renamed from: a */
    public C7143xW f44928a;

    /* renamed from: b */
    public Object f44929b;

    /* renamed from: c */
    public /* synthetic */ Object f44930c;

    /* renamed from: d */
    public final /* synthetic */ C7143xW f44931d;

    /* renamed from: e */
    public int f44932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7080wW(C7143xW c7143xW, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f44931d = c7143xW;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f44930c = obj;
        this.f44932e |= Integer.MIN_VALUE;
        return this.f44931d.emit(null, this);
    }
}
