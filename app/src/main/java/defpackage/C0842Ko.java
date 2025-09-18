package defpackage;

/* renamed from: Ko, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0842Ko extends AbstractC1963Yy {
    public C0920Lo a;
    public Object b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C0920Lo f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0842Ko(C0920Lo c0920Lo, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.f = c0920Lo;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
