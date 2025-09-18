package p000;

/* renamed from: sq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11084sq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C7347Aq1 f42638a;

    /* renamed from: b */
    public /* synthetic */ Object f42639b;

    /* renamed from: c */
    public final /* synthetic */ C7347Aq1 f42640c;

    /* renamed from: d */
    public int f42641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11084sq1(C7347Aq1 c7347Aq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f42640c = c7347Aq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f42639b = obj;
        this.f42641d |= Integer.MIN_VALUE;
        return this.f42640c.m353f(this);
    }
}
