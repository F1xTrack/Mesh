package defpackage;

/* renamed from: k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5416k extends AbstractC1963Yy {
    public byte[] a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0318Dv0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5416k(C0318Dv0 c0318Dv0, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = c0318Dv0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.r(null, null, null, null, null, this);
    }
}
