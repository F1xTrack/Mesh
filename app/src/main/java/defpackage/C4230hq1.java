package defpackage;

/* renamed from: hq1 */
/* loaded from: classes2.dex */
public final class C4230hq1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C1551Tq1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4230hq1(C1551Tq1 c1551Tq1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c1551Tq1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
