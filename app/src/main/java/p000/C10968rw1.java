package p000;

/* renamed from: rw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10968rw1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f42167a;

    /* renamed from: b */
    public final /* synthetic */ C7397Bp1 f42168b;

    /* renamed from: c */
    public int f42169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10968rw1(C7397Bp1 c7397Bp1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f42168b = c7397Bp1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f42167a = obj;
        this.f42169c |= Integer.MIN_VALUE;
        Object objM889f = this.f42168b.m889f(null, null, this);
        return objM889f == EnumC0817Mz.f7418a ? objM889f : new PS0(objM889f);
    }
}
