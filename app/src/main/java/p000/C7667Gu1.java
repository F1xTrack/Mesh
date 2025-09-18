package p000;

/* renamed from: Gu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7667Gu1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C8083Ou1 f3956a;

    /* renamed from: b */
    public InterfaceC7924Lt0 f3957b;

    /* renamed from: c */
    public /* synthetic */ Object f3958c;

    /* renamed from: d */
    public final /* synthetic */ C8083Ou1 f3959d;

    /* renamed from: e */
    public int f3960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7667Gu1(C8083Ou1 c8083Ou1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f3959d = c8083Ou1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f3958c = obj;
        this.f3960e |= Integer.MIN_VALUE;
        return this.f3959d.m6185a(this);
    }
}
