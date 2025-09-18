package defpackage;

/* loaded from: classes.dex */
public final class RQ0 extends AbstractC1963Yy {
    public Object a;
    public InterfaceC0935Lt0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ UQ0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RQ0(UQ0 uq0, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = uq0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(this);
    }
}
