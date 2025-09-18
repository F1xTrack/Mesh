package defpackage;

/* renamed from: Er1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0385Er1 extends AbstractC1963Yy {
    public C0697Ir1 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0697Ir1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0385Er1(C0697Ir1 c0697Ir1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c0697Ir1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
