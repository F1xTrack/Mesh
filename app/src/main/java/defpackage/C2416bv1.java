package defpackage;

import java.util.List;

/* renamed from: bv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2416bv1 extends AbstractC1963Yy {
    public C8071xu1 a;
    public Object b;
    public Object c;
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C8071xu1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2416bv1(C8071xu1 c8071xu1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.f = c8071xu1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return C8071xu1.a(this.f, null, this);
    }
}
