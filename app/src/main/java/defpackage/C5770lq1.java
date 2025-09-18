package defpackage;

/* renamed from: lq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5770lq1 extends AbstractC1963Yy {
    public C1629Uq1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1629Uq1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5770lq1(C1629Uq1 c1629Uq1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = c1629Uq1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
