package p000;

/* renamed from: gq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9548gq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C7347Aq1 f28059a;

    /* renamed from: b */
    public K81 f28060b;

    /* renamed from: c */
    public String f28061c;

    /* renamed from: d */
    public /* synthetic */ Object f28062d;

    /* renamed from: e */
    public final /* synthetic */ C7347Aq1 f28063e;

    /* renamed from: f */
    public int f28064f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9548gq1(C7347Aq1 c7347Aq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f28063e = c7347Aq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f28062d = obj;
        this.f28064f |= Integer.MIN_VALUE;
        return this.f28063e.m349b(null, this);
    }
}
