package defpackage;

/* renamed from: hw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4248hw1 extends AbstractC1963Yy {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C6446pN0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4248hw1(C6446pN0 c6446pN0, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = c6446pN0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objI = this.c.i(null, this);
        return objI == EnumC1030Mz.a ? objI : new PS0(objI);
    }
}
