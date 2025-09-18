package defpackage;

/* renamed from: b9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2270b9 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3336d9 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2270b9(C3336d9 c3336d9, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c3336d9;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return C3336d9.d(this.b, null, null, null, this);
    }
}
