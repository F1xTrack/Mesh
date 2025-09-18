package defpackage;

/* loaded from: classes.dex */
public final class E11 extends AbstractC1963Yy {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ I11 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E11(I11 i11, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = i11;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
