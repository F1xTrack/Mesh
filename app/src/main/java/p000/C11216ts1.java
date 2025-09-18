package p000;

/* renamed from: ts1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11216ts1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f43388a;

    /* renamed from: b */
    public final /* synthetic */ C7715Hs1 f43389b;

    /* renamed from: c */
    public int f43390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11216ts1(C7715Hs1 c7715Hs1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f43389b = c7715Hs1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f43388a = obj;
        this.f43390c |= Integer.MIN_VALUE;
        return this.f43389b.m3639c(this);
    }
}
