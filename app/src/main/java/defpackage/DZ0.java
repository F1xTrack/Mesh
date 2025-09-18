package defpackage;

/* loaded from: classes.dex */
public final class DZ0 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ FZ0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DZ0(FZ0 fz0, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = fz0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, this);
    }
}
