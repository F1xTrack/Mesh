package p000;

/* renamed from: v41 */
/* loaded from: classes.dex */
public final class C11372v41 extends AbstractC0223DX {

    /* renamed from: b */
    public final /* synthetic */ CX0 f44136b;

    /* renamed from: c */
    public final /* synthetic */ C0495Hr f44137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11372v41(C0495Hr c0495Hr, CX0 cx0, CX0 cx02) {
        super(cx0);
        this.f44137c = c0495Hr;
        this.f44136b = cx02;
    }

    @Override // p000.AbstractC0223DX, p000.CX0
    /* renamed from: i */
    public final BX0 mo414i(long j) {
        BX0 bx0Mo414i = this.f44136b.mo414i(j);
        EX0 ex0 = bx0Mo414i.f867a;
        long j2 = ex0.f2738a;
        long j3 = this.f44137c.f4553b;
        EX0 ex02 = new EX0(j2, ex0.f2739b + j3);
        EX0 ex03 = bx0Mo414i.f868b;
        return new BX0(ex02, new EX0(ex03.f2738a, ex03.f2739b + j3));
    }
}
