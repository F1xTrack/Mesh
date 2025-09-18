package defpackage;

import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;

/* renamed from: Oj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1140Oj1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ RunnableC1140Oj1(C1296Qj1 c1296Qj1, int i, long j) {
        this.a = 0;
        this.b = c1296Qj1;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.c;
        Object obj = this.b;
        int i = this.d;
        switch (this.a) {
            case 0:
                C1296Qj1 c1296Qj1 = (C1296Qj1) obj;
                c1296Qj1.getClass();
                int i2 = AbstractC0277Dh1.a;
                C8323zE c8323zE = ((UQ) c1296Qj1.b).a.r;
                Y3 y3L = c8323zE.L((C0456Fp0) c8323zE.d.e);
                c8323zE.Q(y3L, 1018, new C5463kE(i, j, y3L));
                break;
            case 1:
                C1296Qj1 c1296Qj12 = (C1296Qj1) obj;
                c1296Qj12.getClass();
                int i3 = AbstractC0277Dh1.a;
                C8323zE c8323zE2 = ((UQ) c1296Qj12.b).a.r;
                Y3 y3L2 = c8323zE2.L((C0456Fp0) c8323zE2.d.e);
                c8323zE2.Q(y3L2, 1021, new C6799rE(i, j, y3L2));
                break;
            default:
                ((AppComponentsBreadcrumbsIntegration) obj).a(j, Integer.valueOf(i));
                break;
        }
    }

    public /* synthetic */ RunnableC1140Oj1(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = j;
        this.d = i;
    }
}
