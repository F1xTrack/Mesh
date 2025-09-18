package defpackage;

/* renamed from: su1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7118su1 extends AbstractC1963Yy {
    public C6446pN0 a;
    public boolean b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C6446pN0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7118su1(C6446pN0 c6446pN0, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.e = c6446pN0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.j(false, this);
    }
}
