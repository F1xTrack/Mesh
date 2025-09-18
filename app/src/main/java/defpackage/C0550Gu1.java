package defpackage;

/* renamed from: Gu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0550Gu1 extends AbstractC1963Yy {
    public C1173Ou1 a;
    public InterfaceC0935Lt0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1173Ou1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0550Gu1(C1173Ou1 c1173Ou1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c1173Ou1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
