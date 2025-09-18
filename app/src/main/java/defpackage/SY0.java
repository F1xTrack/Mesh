package defpackage;

/* loaded from: classes.dex */
public final class SY0 extends AbstractC1963Yy {
    public TY0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ TY0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SY0(TY0 ty0, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = ty0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return TY0.a(this.c, this);
    }
}
