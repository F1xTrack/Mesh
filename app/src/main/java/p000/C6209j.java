package p000;

import javax.crypto.spec.GCMParameterSpec;

/* renamed from: j */
/* loaded from: classes2.dex */
public final class C6209j extends AbstractC1571Yy {

    /* renamed from: a */
    public C7512Dv0 f34830a;

    /* renamed from: b */
    public String f34831b;

    /* renamed from: c */
    public GCMParameterSpec f34832c;

    /* renamed from: d */
    public /* synthetic */ Object f34833d;

    /* renamed from: e */
    public final /* synthetic */ C7512Dv0 f34834e;

    /* renamed from: f */
    public int f34835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6209j(C7512Dv0 c7512Dv0, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f34834e = c7512Dv0;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f34833d = obj;
        this.f34835f |= Integer.MIN_VALUE;
        return this.f34834e.m1944q(null, null, false, null, null, this);
    }
}
