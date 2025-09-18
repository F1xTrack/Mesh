package p000;

/* renamed from: Gv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7669Gv1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f3962a;

    /* renamed from: b */
    public final /* synthetic */ C8033Nv1 f3963b;

    /* renamed from: c */
    public int f3964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7669Gv1(C8033Nv1 c8033Nv1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f3963b = c8033Nv1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f3962a = obj;
        this.f3964c |= Integer.MIN_VALUE;
        Object objM5906b = this.f3963b.m5906b(null, this);
        return objM5906b == EnumC0817Mz.f7418a ? objM5906b : new PS0(objM5906b);
    }
}
