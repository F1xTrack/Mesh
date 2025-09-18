package defpackage;

/* renamed from: x11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7904x11 extends AbstractC1963Yy {
    public Object a;
    public I11 b;
    public C5592kv c;
    public /* synthetic */ Object d;
    public final /* synthetic */ I11 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7904x11(I11 i11, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.e = i11;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return I11.b(this.e, null, this);
    }
}
