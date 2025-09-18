package p000;

/* renamed from: vq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11468vq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C7347Aq1 f44556a;

    /* renamed from: b */
    public Object f44557b;

    /* renamed from: c */
    public /* synthetic */ Object f44558c;

    /* renamed from: d */
    public final /* synthetic */ C7347Aq1 f44559d;

    /* renamed from: e */
    public int f44560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11468vq1(C7347Aq1 c7347Aq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f44559d = c7347Aq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f44558c = obj;
        this.f44560e |= Integer.MIN_VALUE;
        return this.f44559d.m354g(null, this);
    }
}
