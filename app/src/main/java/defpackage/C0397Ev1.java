package defpackage;

/* renamed from: Ev1 */
/* loaded from: classes2.dex */
public final class C0397Ev1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C1098Nv1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397Ev1(C1098Nv1 c1098Nv1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c1098Nv1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == EnumC1030Mz.a ? objA : new PS0(objA);
    }
}
