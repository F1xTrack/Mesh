package defpackage;

/* renamed from: zt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8448zt1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C6845rT0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8448zt1(C6845rT0 c6845rT0, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c6845rT0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, this);
        return objB == EnumC1030Mz.a ? objB : new PS0(objB);
    }
}
