package defpackage;

/* renamed from: nq1 */
/* loaded from: classes2.dex */
public final class C6152nq1 extends AbstractC1963Yy {
    public C1551Tq1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1551Tq1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6152nq1(C1551Tq1 c1551Tq1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = c1551Tq1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
