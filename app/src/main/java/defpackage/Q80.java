package defpackage;

/* loaded from: classes.dex */
public final class Q80 extends AbstractC1963Yy {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C5806m12 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q80(C5806m12 c5806m12, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = c5806m12;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
