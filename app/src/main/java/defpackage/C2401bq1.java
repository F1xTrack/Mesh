package defpackage;

/* renamed from: bq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2401bq1 extends AbstractC1963Yy {
    public C1629Uq1 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1629Uq1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401bq1(C1629Uq1 c1629Uq1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c1629Uq1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
