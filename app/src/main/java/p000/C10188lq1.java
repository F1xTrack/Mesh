package p000;

/* renamed from: lq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10188lq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C8387Uq1 f37312a;

    /* renamed from: b */
    public /* synthetic */ Object f37313b;

    /* renamed from: c */
    public final /* synthetic */ C8387Uq1 f37314c;

    /* renamed from: d */
    public int f37315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10188lq1(C8387Uq1 c8387Uq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f37314c = c8387Uq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f37313b = obj;
        this.f37315d |= Integer.MIN_VALUE;
        return this.f37314c.m8189c(null, this);
    }
}
