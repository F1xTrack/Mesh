package p000;

/* renamed from: Br1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7401Br1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f1057a;

    /* renamed from: b */
    public final /* synthetic */ C8025Nr1 f1058b;

    /* renamed from: c */
    public int f1059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7401Br1(C8025Nr1 c8025Nr1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f1058b = c8025Nr1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f1057a = obj;
        this.f1059c |= Integer.MIN_VALUE;
        Object objMo4455a = this.f1058b.mo4455a(this);
        return objMo4455a == EnumC0817Mz.f7418a ? objMo4455a : new PS0(objMo4455a);
    }
}
