package defpackage;

/* renamed from: vs1 */
/* loaded from: classes2.dex */
public final class C7685vs1 extends AbstractC1963Yy {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0622Hs1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7685vs1(C0622Hs1 c0622Hs1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c0622Hs1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
