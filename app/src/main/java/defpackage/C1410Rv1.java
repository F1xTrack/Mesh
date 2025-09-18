package defpackage;

/* renamed from: Rv1 */
/* loaded from: classes2.dex */
public final class C1410Rv1 extends AbstractC1963Yy {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1644Uv1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410Rv1(C1644Uv1 c1644Uv1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c1644Uv1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0, this);
    }
}
