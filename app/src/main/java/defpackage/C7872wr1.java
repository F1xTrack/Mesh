package defpackage;

/* renamed from: wr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7872wr1 extends AbstractC1963Yy {
    public C0697Ir1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0697Ir1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7872wr1(C0697Ir1 c0697Ir1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = c0697Ir1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
