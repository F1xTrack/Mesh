package p000;

/* renamed from: su1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11092su1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C10641pN0 f42713a;

    /* renamed from: b */
    public boolean f42714b;

    /* renamed from: c */
    public int f42715c;

    /* renamed from: d */
    public /* synthetic */ Object f42716d;

    /* renamed from: e */
    public final /* synthetic */ C10641pN0 f42717e;

    /* renamed from: f */
    public int f42718f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11092su1(C10641pN0 c10641pN0, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f42717e = c10641pN0;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f42716d = obj;
        this.f42718f |= Integer.MIN_VALUE;
        return this.f42717e.m23759j(false, this);
    }
}
