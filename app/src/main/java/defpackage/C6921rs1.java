package defpackage;

/* renamed from: rs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6921rs1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C1155Oo1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6921rs1(C1155Oo1 c1155Oo1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c1155Oo1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == EnumC1030Mz.a ? objA : new C1785Wq1((String) objA);
    }
}
