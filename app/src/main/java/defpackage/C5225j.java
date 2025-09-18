package defpackage;

import javax.crypto.spec.GCMParameterSpec;

/* renamed from: j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5225j extends AbstractC1963Yy {
    public C0318Dv0 a;
    public String b;
    public GCMParameterSpec c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C0318Dv0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5225j(C0318Dv0 c0318Dv0, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.e = c0318Dv0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.q(null, null, false, null, null, this);
    }
}
