package defpackage;

/* loaded from: classes2.dex */
public final class A41 extends AbstractC1963Yy {
    public B41 a;
    public InterfaceC6853rW b;
    public C41 c;
    public InterfaceC1115Ob0 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ B41 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A41(B41 b41, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.g = b41;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        this.g.collect(null, this);
        return EnumC1030Mz.a;
    }
}
