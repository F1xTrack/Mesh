package p000;

/* renamed from: kw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10072kw1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f36763a;

    /* renamed from: b */
    public final /* synthetic */ C10339n11 f36764b;

    /* renamed from: c */
    public int f36765c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10072kw1(C10339n11 c10339n11, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f36764b = c10339n11;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f36763a = obj;
        this.f36765c |= Integer.MIN_VALUE;
        Object objM23042c = this.f36764b.m23042c(null, this);
        return objM23042c == EnumC0817Mz.f7418a ? objM23042c : new PS0(objM23042c);
    }
}
