package p000;

/* renamed from: nZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10409nZ0 extends AbstractC1571Yy {

    /* renamed from: a */
    public C10537oZ0 f38365a;

    /* renamed from: b */
    public /* synthetic */ Object f38366b;

    /* renamed from: c */
    public final /* synthetic */ C10537oZ0 f38367c;

    /* renamed from: d */
    public int f38368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10409nZ0(C10537oZ0 c10537oZ0, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f38367c = c10537oZ0;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f38366b = obj;
        this.f38368d |= Integer.MIN_VALUE;
        return this.f38367c.m23502b(this);
    }
}
