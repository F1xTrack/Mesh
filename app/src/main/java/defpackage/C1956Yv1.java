package defpackage;

/* renamed from: Yv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1956Yv1 extends AbstractC1963Yy {
    public T71 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ T71 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1956Yv1(T71 t71, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = t71;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.j(null, this);
    }
}
