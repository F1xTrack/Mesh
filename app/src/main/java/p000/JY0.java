package p000;

/* loaded from: classes.dex */
public final class JY0 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f5599a;

    /* renamed from: b */
    public int f5600b;

    /* renamed from: c */
    public final /* synthetic */ C7017vW f5601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JY0(C7017vW c7017vW, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f5601c = c7017vW;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f5599a = obj;
        this.f5600b |= Integer.MIN_VALUE;
        return this.f5601c.emit(null, this);
    }
}
