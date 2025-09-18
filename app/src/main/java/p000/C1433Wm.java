package p000;

import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Wm */
/* loaded from: classes.dex */
public final class C1433Wm implements InterfaceC1118Rm {

    /* renamed from: f */
    public static final long f13393f = TimeUnit.SECONDS.toNanos(2);

    /* renamed from: g */
    public static final /* synthetic */ int f13394g = 0;

    /* renamed from: a */
    public final C6573om f13395a;

    /* renamed from: b */
    public final ExecutorC10151lY0 f13396b;

    /* renamed from: c */
    public final C20 f13397c;

    /* renamed from: d */
    public final InterfaceC11119t60 f13398d;

    /* renamed from: e */
    public final GQ0 f13399e;

    public C1433Wm(C6573om c6573om, ExecutorC10151lY0 executorC10151lY0, C20 c20, GQ0 gq0) {
        this.f13395a = c6573om;
        this.f13396b = executorC10151lY0;
        this.f13397c = c20;
        this.f13399e = gq0;
        InterfaceC11119t60 interfaceC11119t60 = c6573om.f39244p;
        Objects.requireNonNull(interfaceC11119t60);
        this.f13398d = interfaceC11119t60;
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: a */
    public final InterfaceFutureC7800Jj0 mo4404a(TotalCaptureResult totalCaptureResult) {
        AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
        AtomicReference atomicReference = new AtomicReference();
        C0489Hl c0489HlM26149b = AbstractC11797yQ1.m26149b(new C6698qj(atomicReference, 1));
        C1043QZ c1043qzM6727a = C1043QZ.m6727a(AbstractC11797yQ1.m26149b(new C0424Gj(this, 2, atomicReference)));
        C1307Um c1307Um = new C1307Um(this, 1);
        c1043qzM6727a.getClass();
        ExecutorC10151lY0 executorC10151lY0 = this.f13396b;
        RunnableC3953dr runnableC3953drM7495r = AbstractC8301Sz1.m7495r(AbstractC8301Sz1.m7495r(AbstractC8301Sz1.m7495r(AbstractC8301Sz1.m7495r(AbstractC8301Sz1.m7495r(c1043qzM6727a, c1307Um, executorC10151lY0), new C1307Um(this, 2), executorC10151lY0), new C0424Gj(this, 3, c0489HlM26149b), executorC10151lY0), new C1307Um(this, 3), executorC10151lY0), new C1307Um(this, 4), executorC10151lY0);
        C0553Im c0553Im = new C0553Im(3);
        return AbstractC8301Sz1.m7495r(runnableC3953drM7495r, new C7391Bm1(20, c0553Im), QR1.m6703a());
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: b */
    public final boolean mo4405b() {
        return false;
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: c */
    public final void mo4406c() {
        AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
        boolean zM3060e = this.f13399e.m3060e();
        C6573om c6573om = this.f13395a;
        if (zM3060e) {
            c6573om.m23545c(false);
        }
        c6573om.f39235g.m3077c(false).mo2494d(new RunnableC0004A3(2), this.f13396b);
        c6573om.f39235g.m3075a(false, true);
        C20 c20M6710h = QR1.m6710h();
        InterfaceC11119t60 interfaceC11119t60 = this.f13398d;
        Objects.requireNonNull(interfaceC11119t60);
        c20M6710h.execute(new RunnableC0383G4(13, interfaceC11119t60));
    }
}
