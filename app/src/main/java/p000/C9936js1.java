package p000;

/* renamed from: js1 */
/* loaded from: classes2.dex */
public final class C9936js1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C7819Js1 f35432a;

    /* renamed from: b */
    public String f35433b;

    /* renamed from: c */
    public /* synthetic */ Object f35434c;

    /* renamed from: d */
    public final /* synthetic */ C7819Js1 f35435d;

    /* renamed from: e */
    public int f35436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9936js1(C7819Js1 c7819Js1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f35435d = c7819Js1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f35434c = obj;
        this.f35436e |= Integer.MIN_VALUE;
        Object objM4461a = this.f35435d.m4461a(null, this);
        return objM4461a == EnumC0817Mz.f7418a ? objM4461a : new PS0(objM4461a);
    }
}
