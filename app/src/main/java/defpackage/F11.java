package defpackage;

/* loaded from: classes.dex */
public final class F11 extends AbstractC1963Yy {
    public I11 a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ I11 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F11(I11 i11, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.e = i11;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.i(null, null, this);
    }
}
