package p000;

/* renamed from: qv1 */
/* loaded from: classes2.dex */
public final class C10838qv1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f41250a;

    /* renamed from: b */
    public final /* synthetic */ C11732xv1 f41251b;

    /* renamed from: c */
    public int f41252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10838qv1(C11732xv1 c11732xv1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f41251b = c11732xv1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f41250a = obj;
        this.f41252c |= Integer.MIN_VALUE;
        Object objM26001a = this.f41251b.m26001a(null, null, this);
        return objM26001a == EnumC0817Mz.f7418a ? objM26001a : new PS0(objM26001a);
    }
}
