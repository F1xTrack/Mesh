package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.TimeUnit;

/* renamed from: Ym, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1927Ym implements InterfaceC1381Rm {
    public static final long g = TimeUnit.SECONDS.toNanos(2);
    public static final /* synthetic */ int h = 0;
    public final C6329om a;
    public final int b;
    public boolean c = false;
    public final ExecutorC5715lY0 d;
    public final C20 e;
    public final boolean f;

    public C1927Ym(C6329om c6329om, int i, ExecutorC5715lY0 executorC5715lY0, C20 c20, boolean z) {
        this.a = c6329om;
        this.b = i;
        this.d = executorC5715lY0;
        this.e = c20;
        this.f = z;
    }

    @Override // defpackage.InterfaceC1381Rm
    public final InterfaceFutureC0750Jj0 a(TotalCaptureResult totalCaptureResult) {
        C2005Zm.j(totalCaptureResult, this.b);
        AbstractC0759Jm0.f("Camera2CapturePipeline");
        if (C2005Zm.j(totalCaptureResult, this.b)) {
            if (!this.a.q) {
                AbstractC0759Jm0.f("Camera2CapturePipeline");
                this.c = true;
                QZ qzA = QZ.a(AbstractC8171yQ1.b(new C1849Xm(this, 0)));
                C1849Xm c1849Xm = new C1849Xm(this, 1);
                ExecutorC5715lY0 executorC5715lY0 = this.d;
                qzA.getClass();
                RunnableC3467dr runnableC3467drR = AbstractC1500Sz1.r(AbstractC1500Sz1.r(qzA, c1849Xm, executorC5715lY0), new C1849Xm(this, 2), this.d);
                C0680Im c0680Im = new C0680Im(4);
                return AbstractC1500Sz1.r(runnableC3467drR, new C0136Bm1(20, c0680Im), QR1.a());
            }
            AbstractC0759Jm0.f("Camera2CapturePipeline");
        }
        return AbstractC1500Sz1.g(Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC1381Rm
    public final boolean b() {
        return this.b == 0;
    }

    @Override // defpackage.InterfaceC1381Rm
    public final void c() {
        if (this.c) {
            C6329om c6329om = this.a;
            c6329om.i.a(null, false);
            AbstractC0759Jm0.f("Camera2CapturePipeline");
            if (this.f) {
                c6329om.g.a(false, true);
            }
        }
    }
}
