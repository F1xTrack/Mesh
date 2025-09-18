package defpackage;

/* renamed from: ss1 */
/* loaded from: classes2.dex */
public final class C7112ss1 extends AbstractC1963Yy {
    public C0622Hs1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0622Hs1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7112ss1(C0622Hs1 c0622Hs1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = c0622Hs1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
