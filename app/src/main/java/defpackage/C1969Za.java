package defpackage;

/* renamed from: Za, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1969Za extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ X11 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1969Za(X11 x11, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = x11;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, false, null, this);
    }
}
