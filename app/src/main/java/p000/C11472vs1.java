package p000;

/* renamed from: vs1 */
/* loaded from: classes2.dex */
public final class C11472vs1 extends AbstractC1571Yy {

    /* renamed from: a */
    public Object f44575a;

    /* renamed from: b */
    public Object f44576b;

    /* renamed from: c */
    public /* synthetic */ Object f44577c;

    /* renamed from: d */
    public final /* synthetic */ C7715Hs1 f44578d;

    /* renamed from: e */
    public int f44579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11472vs1(C7715Hs1 c7715Hs1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f44578d = c7715Hs1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f44577c = obj;
        this.f44579e |= Integer.MIN_VALUE;
        return this.f44578d.m3638b(null, this);
    }
}
