package p000;

import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.TimeUnit;

/* renamed from: Ym */
/* loaded from: classes.dex */
public final class C1559Ym implements InterfaceC1118Rm {

    /* renamed from: g */
    public static final long f14506g = TimeUnit.SECONDS.toNanos(2);

    /* renamed from: h */
    public static final /* synthetic */ int f14507h = 0;

    /* renamed from: a */
    public final C6573om f14508a;

    /* renamed from: b */
    public final int f14509b;

    /* renamed from: c */
    public boolean f14510c = false;

    /* renamed from: d */
    public final ExecutorC10151lY0 f14511d;

    /* renamed from: e */
    public final C20 f14512e;

    /* renamed from: f */
    public final boolean f14513f;

    public C1559Ym(C6573om c6573om, int i, ExecutorC10151lY0 executorC10151lY0, C20 c20, boolean z) {
        this.f14508a = c6573om;
        this.f14509b = i;
        this.f14511d = executorC10151lY0;
        this.f14512e = c20;
        this.f14513f = z;
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: a */
    public final InterfaceFutureC7800Jj0 mo4404a(TotalCaptureResult totalCaptureResult) {
        C1622Zm.m9587j(totalCaptureResult, this.f14509b);
        AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
        if (C1622Zm.m9587j(totalCaptureResult, this.f14509b)) {
            if (!this.f14508a.f39245q) {
                AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
                this.f14510c = true;
                C1043QZ c1043qzM6727a = C1043QZ.m6727a(AbstractC11797yQ1.m26149b(new C1496Xm(this, 0)));
                C1496Xm c1496Xm = new C1496Xm(this, 1);
                ExecutorC10151lY0 executorC10151lY0 = this.f14511d;
                c1043qzM6727a.getClass();
                RunnableC3953dr runnableC3953drM7495r = AbstractC8301Sz1.m7495r(AbstractC8301Sz1.m7495r(c1043qzM6727a, c1496Xm, executorC10151lY0), new C1496Xm(this, 2), this.f14511d);
                C0553Im c0553Im = new C0553Im(4);
                return AbstractC8301Sz1.m7495r(runnableC3953drM7495r, new C7391Bm1(20, c0553Im), QR1.m6703a());
            }
            AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
        }
        return AbstractC8301Sz1.m7484g(Boolean.FALSE);
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: b */
    public final boolean mo4405b() {
        return this.f14509b == 0;
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: c */
    public final void mo4406c() {
        if (this.f14510c) {
            C6573om c6573om = this.f14508a;
            c6573om.f39237i.m24945a(null, false);
            AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
            if (this.f14513f) {
                c6573om.f39235g.m3075a(false, true);
            }
        }
    }
}
