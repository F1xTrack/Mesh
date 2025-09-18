package p000;

import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;

/* renamed from: Oj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8061Oj1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8581a;

    /* renamed from: b */
    public final /* synthetic */ Object f8582b;

    /* renamed from: c */
    public final /* synthetic */ long f8583c;

    /* renamed from: d */
    public final /* synthetic */ int f8584d;

    public /* synthetic */ RunnableC8061Oj1(C8165Qj1 c8165Qj1, int i, long j) {
        this.f8581a = 0;
        this.f8582b = c8165Qj1;
        this.f8584d = i;
        this.f8583c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.f8583c;
        Object obj = this.f8582b;
        int i = this.f8584d;
        switch (this.f8581a) {
            case 0:
                C8165Qj1 c8165Qj1 = (C8165Qj1) obj;
                c8165Qj1.getClass();
                int i2 = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE = ((SurfaceHolderCallbackC1285UQ) c8165Qj1.f9757b).f11780a.f13736r;
                C1514Y3 c1514y3M26330L = c7251zE.m26330L((C7604Fp0) c7251zE.f46734d.f9307e);
                c7251zE.m26334Q(c1514y3M26330L, 1018, new C6287kE(i, j, c1514y3M26330L));
                break;
            case 1:
                C8165Qj1 c8165Qj12 = (C8165Qj1) obj;
                c8165Qj12.getClass();
                int i3 = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE2 = ((SurfaceHolderCallbackC1285UQ) c8165Qj12.f9757b).f11780a.f13736r;
                C1514Y3 c1514y3M26330L2 = c7251zE2.m26330L((C7604Fp0) c7251zE2.f46734d.f9307e);
                c7251zE2.m26334Q(c1514y3M26330L2, 1021, new C6730rE(i, j, c1514y3M26330L2));
                break;
            default:
                ((AppComponentsBreadcrumbsIntegration) obj).m21508a(j, Integer.valueOf(i));
                break;
        }
    }

    public /* synthetic */ RunnableC8061Oj1(Object obj, long j, int i, int i2) {
        this.f8581a = i2;
        this.f8582b = obj;
        this.f8583c = j;
        this.f8584d = i;
    }
}
