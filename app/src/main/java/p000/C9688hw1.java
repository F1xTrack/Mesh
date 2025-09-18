package p000;

/* renamed from: hw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9688hw1 extends AbstractC1571Yy {

    /* renamed from: a */
    public String f28687a;

    /* renamed from: b */
    public /* synthetic */ Object f28688b;

    /* renamed from: c */
    public final /* synthetic */ C10641pN0 f28689c;

    /* renamed from: d */
    public int f28690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9688hw1(C10641pN0 c10641pN0, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f28689c = c10641pN0;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f28688b = obj;
        this.f28690d |= Integer.MIN_VALUE;
        Object objM23758i = this.f28689c.m23758i(null, this);
        return objM23758i == EnumC0817Mz.f7418a ? objM23758i : new PS0(objM23758i);
    }
}
