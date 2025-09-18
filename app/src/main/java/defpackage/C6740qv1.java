package defpackage;

/* renamed from: qv1 */
/* loaded from: classes2.dex */
public final class C6740qv1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C8074xv1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6740qv1(C8074xv1 c8074xv1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c8074xv1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, null, this);
        return objA == EnumC1030Mz.a ? objA : new PS0(objA);
    }
}
