package defpackage;

/* loaded from: classes2.dex */
public final class UT0 extends AbstractC1963Yy {
    public XT0 a;
    public C6930rv1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ XT0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UT0(XT0 xt0, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = xt0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
