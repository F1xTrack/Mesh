package defpackage;

/* renamed from: fq1 */
/* loaded from: classes2.dex */
public final class C3848fq1 extends AbstractC1963Yy {
    public C1473Sq1 a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1473Sq1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3848fq1(C1473Sq1 c1473Sq1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c1473Sq1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(false, this);
    }
}
