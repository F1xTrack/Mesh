package p000;

/* renamed from: mq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10316mq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C7347Aq1 f37961a;

    /* renamed from: b */
    public /* synthetic */ Object f37962b;

    /* renamed from: c */
    public final /* synthetic */ C7347Aq1 f37963c;

    /* renamed from: d */
    public int f37964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10316mq1(C7347Aq1 c7347Aq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f37963c = c7347Aq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f37962b = obj;
        this.f37964d |= Integer.MIN_VALUE;
        return this.f37963c.m348a(this);
    }
}
