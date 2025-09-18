package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1771Wm implements InterfaceC1381Rm {
    public static final long f = TimeUnit.SECONDS.toNanos(2);
    public static final /* synthetic */ int g = 0;
    public final C6329om a;
    public final ExecutorC5715lY0 b;
    public final C20 c;
    public final InterfaceC7158t60 d;
    public final GQ0 e;

    public C1771Wm(C6329om c6329om, ExecutorC5715lY0 executorC5715lY0, C20 c20, GQ0 gq0) {
        this.a = c6329om;
        this.b = executorC5715lY0;
        this.c = c20;
        this.e = gq0;
        InterfaceC7158t60 interfaceC7158t60 = c6329om.p;
        Objects.requireNonNull(interfaceC7158t60);
        this.d = interfaceC7158t60;
    }

    @Override // defpackage.InterfaceC1381Rm
    public final InterfaceFutureC0750Jj0 a(TotalCaptureResult totalCaptureResult) {
        AbstractC0759Jm0.f("Camera2CapturePipeline");
        AtomicReference atomicReference = new AtomicReference();
        C0599Hl c0599HlB = AbstractC8171yQ1.b(new C6702qj(atomicReference, 1));
        QZ qzA = QZ.a(AbstractC8171yQ1.b(new C0515Gj(this, 2, atomicReference)));
        C1615Um c1615Um = new C1615Um(this, 1);
        qzA.getClass();
        ExecutorC5715lY0 executorC5715lY0 = this.b;
        RunnableC3467dr runnableC3467drR = AbstractC1500Sz1.r(AbstractC1500Sz1.r(AbstractC1500Sz1.r(AbstractC1500Sz1.r(AbstractC1500Sz1.r(qzA, c1615Um, executorC5715lY0), new C1615Um(this, 2), executorC5715lY0), new C0515Gj(this, 3, c0599HlB), executorC5715lY0), new C1615Um(this, 3), executorC5715lY0), new C1615Um(this, 4), executorC5715lY0);
        C0680Im c0680Im = new C0680Im(3);
        return AbstractC1500Sz1.r(runnableC3467drR, new C0136Bm1(20, c0680Im), QR1.a());
    }

    @Override // defpackage.InterfaceC1381Rm
    public final boolean b() {
        return false;
    }

    @Override // defpackage.InterfaceC1381Rm
    public final void c() {
        AbstractC0759Jm0.f("Camera2CapturePipeline");
        boolean zE = this.e.e();
        C6329om c6329om = this.a;
        if (zE) {
            c6329om.c(false);
        }
        c6329om.g.c(false).d(new A3(2), this.b);
        c6329om.g.a(false, true);
        C20 c20H = QR1.h();
        InterfaceC7158t60 interfaceC7158t60 = this.d;
        Objects.requireNonNull(interfaceC7158t60);
        c20H.execute(new G4(13, interfaceC7158t60));
    }
}
