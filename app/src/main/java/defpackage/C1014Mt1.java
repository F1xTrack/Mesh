package defpackage;

/* renamed from: Mt1 */
/* loaded from: classes2.dex */
public final class C1014Mt1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C1296Qj1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1014Mt1(C1296Qj1 c1296Qj1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c1296Qj1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, this);
        return objB == EnumC1030Mz.a ? objB : new PS0(objB);
    }
}
