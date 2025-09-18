package p000;

/* renamed from: pq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10700pq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C7347Aq1 f40412a;

    /* renamed from: b */
    public String f40413b;

    /* renamed from: c */
    public boolean f40414c;

    /* renamed from: d */
    public /* synthetic */ Object f40415d;

    /* renamed from: e */
    public final /* synthetic */ C7347Aq1 f40416e;

    /* renamed from: f */
    public int f40417f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10700pq1(C7347Aq1 c7347Aq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f40416e = c7347Aq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f40415d = obj;
        this.f40417f |= Integer.MIN_VALUE;
        return this.f40416e.m350c(null, this);
    }
}
