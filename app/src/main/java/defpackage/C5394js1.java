package defpackage;

/* renamed from: js1 */
/* loaded from: classes2.dex */
public final class C5394js1 extends AbstractC1963Yy {
    public C0778Js1 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0778Js1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5394js1(C0778Js1 c0778Js1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c0778Js1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objA = this.d.a(null, this);
        return objA == EnumC1030Mz.a ? objA : new PS0(objA);
    }
}
