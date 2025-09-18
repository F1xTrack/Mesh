package p000;

/* renamed from: Zs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8651Zs1 extends AbstractC1571Yy {

    /* renamed from: a */
    public U41 f15189a;

    /* renamed from: b */
    public /* synthetic */ Object f15190b;

    /* renamed from: c */
    public final /* synthetic */ U41 f15191c;

    /* renamed from: d */
    public int f15192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8651Zs1(U41 u41, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f15191c = u41;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f15190b = obj;
        this.f15192d |= Integer.MIN_VALUE;
        return this.f15191c.m7881m(null, this);
    }
}
