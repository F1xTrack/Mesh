package defpackage;

/* loaded from: classes.dex */
public final class B11 extends AbstractC1963Yy {
    public I11 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ I11 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B11(I11 i11, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = i11;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
