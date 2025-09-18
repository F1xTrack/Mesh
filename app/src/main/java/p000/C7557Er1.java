package p000;

/* renamed from: Er1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7557Er1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C7765Ir1 f2928a;

    /* renamed from: b */
    public String f2929b;

    /* renamed from: c */
    public /* synthetic */ Object f2930c;

    /* renamed from: d */
    public final /* synthetic */ C7765Ir1 f2931d;

    /* renamed from: e */
    public int f2932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7557Er1(C7765Ir1 c7765Ir1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f2931d = c7765Ir1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f2930c = obj;
        this.f2932e |= Integer.MIN_VALUE;
        return this.f2931d.m4052c(null, this);
    }
}
