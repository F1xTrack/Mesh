package defpackage;

/* renamed from: nZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6100nZ0 extends AbstractC1963Yy {
    public C6291oZ0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C6291oZ0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6100nZ0(C6291oZ0 c6291oZ0, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = c6291oZ0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
