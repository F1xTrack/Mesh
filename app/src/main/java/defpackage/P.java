package defpackage;

/* loaded from: classes2.dex */
public final class P extends AbstractC1963Yy {
    public NU0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1562Tu0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C1562Tu0 c1562Tu0, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.c = c1562Tu0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
