package p000;

/* renamed from: fq1 */
/* loaded from: classes2.dex */
public final class C9420fq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C8283Sq1 f27412a;

    /* renamed from: b */
    public boolean f27413b;

    /* renamed from: c */
    public /* synthetic */ Object f27414c;

    /* renamed from: d */
    public final /* synthetic */ C8283Sq1 f27415d;

    /* renamed from: e */
    public int f27416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9420fq1(C8283Sq1 c8283Sq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f27415d = c8283Sq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f27414c = obj;
        this.f27416e |= Integer.MIN_VALUE;
        return this.f27415d.m7454a(false, this);
    }
}
