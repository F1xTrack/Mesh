package defpackage;

/* renamed from: vr1 */
/* loaded from: classes2.dex */
public final class C7682vr1 extends AbstractC1963Yy {
    public C1320Qr1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1320Qr1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7682vr1(C1320Qr1 c1320Qr1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = c1320Qr1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
