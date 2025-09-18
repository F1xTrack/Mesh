package defpackage;

/* renamed from: qq1 */
/* loaded from: classes2.dex */
public final class C6725qq1 extends AbstractC1963Yy {
    public C1551Tq1 a;
    public InterfaceC0935Lt0 b;
    public NV1 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C1551Tq1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6725qq1(C1551Tq1 c1551Tq1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.e = c1551Tq1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
