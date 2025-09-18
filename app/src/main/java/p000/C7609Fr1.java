package p000;

/* renamed from: Fr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7609Fr1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C7765Ir1 f3449a;

    /* renamed from: b */
    public /* synthetic */ Object f3450b;

    /* renamed from: c */
    public final /* synthetic */ C7765Ir1 f3451c;

    /* renamed from: d */
    public int f3452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7609Fr1(C7765Ir1 c7765Ir1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f3451c = c7765Ir1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f3450b = obj;
        this.f3452d |= Integer.MIN_VALUE;
        return this.f3451c.m4051b(this);
    }
}
