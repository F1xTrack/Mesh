package defpackage;

/* renamed from: Xu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1875Xu1 extends AbstractC1963Yy {
    public C1173Ou1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1173Ou1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1875Xu1(C1173Ou1 c1173Ou1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = c1173Ou1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return C1173Ou1.b(this.c, this);
    }
}
