package defpackage;

/* renamed from: Ls1 */
/* loaded from: classes2.dex */
public final class C0933Ls1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C6924rt1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0933Ls1(C6924rt1 c6924rt1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c6924rt1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return C6924rt1.a(this.b, this);
    }
}
