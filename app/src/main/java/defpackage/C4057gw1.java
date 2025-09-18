package defpackage;

/* renamed from: gw1 */
/* loaded from: classes2.dex */
public final class C4057gw1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ A61 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4057gw1(A61 a61, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = a61;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == EnumC1030Mz.a ? objA : new PS0(objA);
    }
}
