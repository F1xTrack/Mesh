package defpackage;

/* renamed from: sW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7044sW extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C4332iN c;
    public C4332iN d;
    public InterfaceC6853rW e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7044sW(C4332iN c4332iN, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.c = c4332iN;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
