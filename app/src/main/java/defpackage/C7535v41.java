package defpackage;

/* renamed from: v41 */
/* loaded from: classes.dex */
public final class C7535v41 extends DX {
    public final /* synthetic */ CX0 b;
    public final /* synthetic */ C0617Hr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7535v41(C0617Hr c0617Hr, CX0 cx0, CX0 cx02) {
        super(cx0);
        this.c = c0617Hr;
        this.b = cx02;
    }

    @Override // defpackage.DX, defpackage.CX0
    public final BX0 i(long j) {
        BX0 bx0I = this.b.i(j);
        EX0 ex0 = bx0I.a;
        long j2 = ex0.a;
        long j3 = this.c.b;
        EX0 ex02 = new EX0(j2, ex0.b + j3);
        EX0 ex03 = bx0I.b;
        return new BX0(ex02, new EX0(ex03.a, ex03.b + j3));
    }
}
