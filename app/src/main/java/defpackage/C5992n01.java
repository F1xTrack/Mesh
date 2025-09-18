package defpackage;

/* renamed from: n01, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5992n01 extends AbstractC1963Yy {
    public C6183o01 a;
    public InterfaceC6853rW b;
    public C6374p01 c;
    public InterfaceC1115Ob0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C6183o01 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5992n01(C6183o01 c6183o01, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.f = c6183o01;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        C6183o01.g(this.f, null, this);
        return EnumC1030Mz.a;
    }
}
