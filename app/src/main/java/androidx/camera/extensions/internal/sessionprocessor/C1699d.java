package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import p000.AbstractC0783MR;
import p000.AbstractC9104dM1;
import p000.C0827N8;
import p000.C1299Ue;
import p000.C4018et;
import p000.C4238iN;
import p000.C6702qn;
import p000.InterfaceC7034vn;
import p000.InterfaceC9129dZ0;
import p000.QR0;
import p000.RR0;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.d */
/* loaded from: classes.dex */
public final class C1699d implements QR0 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9129dZ0 f15981a;

    /* renamed from: b */
    public final /* synthetic */ int f15982b;

    /* renamed from: c */
    public final /* synthetic */ C1703h f15983c;

    public C1699d(C1703h c1703h, InterfaceC9129dZ0 interfaceC9129dZ0, int i) {
        this.f15983c = c1703h;
        this.f15981a = interfaceC9129dZ0;
        this.f15982b = i;
    }

    @Override // p000.QR0
    public final /* synthetic */ void onCaptureBufferLost(RR0 rr0, long j, int i) {
    }

    @Override // p000.QR0
    public final void onCaptureCompleted(RR0 rr0, InterfaceC7034vn interfaceC7034vn) {
        CaptureResult captureResultMo403t = ((C4238iN) interfaceC7034vn).mo403t();
        AbstractC9104dM1.m17545d("Cannot get TotalCaptureResult from the cameraCaptureResult ", captureResultMo403t instanceof TotalCaptureResult);
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) captureResultMo403t;
        if (this.f15983c.f16002l != null) {
            this.f15983c.f16002l.notifyCaptureResult(totalCaptureResult);
        } else {
            C1299Ue c1299Ue = C1299Ue.f11947h;
            if (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue) && ((Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
                this.f15981a.mo8494f(new C0827N8(totalCaptureResult));
            }
        }
        if (this.f15983c.f16003m != null && this.f15983c.f16003m.process(totalCaptureResult) != null) {
            this.f15983c.m9924r(this.f15982b, this.f15981a);
        }
        this.f15981a.mo8496g();
    }

    @Override // p000.QR0
    public final /* synthetic */ void onCaptureFailed(RR0 rr0, C6702qn c6702qn) {
    }

    @Override // p000.QR0
    public final /* synthetic */ void onCaptureProgressed(RR0 rr0, InterfaceC7034vn interfaceC7034vn) {
    }

    @Override // p000.QR0
    public final /* synthetic */ void onCaptureSequenceAborted(int i) {
    }

    @Override // p000.QR0
    public final /* synthetic */ void onCaptureSequenceCompleted(int i, long j) {
    }

    @Override // p000.QR0
    public final /* synthetic */ void onCaptureStarted(RR0 rr0, long j, long j2) {
    }
}
