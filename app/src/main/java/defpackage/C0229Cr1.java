package defpackage;

/* renamed from: Cr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0229Cr1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0697Ir1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0229Cr1(C0697Ir1 c0697Ir1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c0697Ir1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
