package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import defpackage.AbstractC3377dM1;
import defpackage.C4332iN;
import defpackage.C6714qn;
import defpackage.C6974s81;
import defpackage.C7793wR0;
import defpackage.InterfaceC7668vn;
import defpackage.N8;
import defpackage.QR0;
import defpackage.RR0;
import defpackage.VY;

/* loaded from: classes.dex */
public final class e implements QR0 {
    public boolean a = false;
    public boolean b = false;
    public final /* synthetic */ VY c;
    public final /* synthetic */ int d;
    public final /* synthetic */ C6974s81 e;
    public final /* synthetic */ h f;

    public e(int i, VY vy, C6974s81 c6974s81, h hVar) {
        this.f = hVar;
        this.c = vy;
        this.d = i;
        this.e = c6974s81;
    }

    @Override // defpackage.QR0
    public final /* synthetic */ void onCaptureBufferLost(RR0 rr0, long j, int i) {
    }

    @Override // defpackage.QR0
    public final void onCaptureCompleted(RR0 rr0, InterfaceC7668vn interfaceC7668vn) {
        C4332iN c4332iN = (C4332iN) interfaceC7668vn;
        CaptureResult captureResult = (CaptureResult) c4332iN.c;
        AbstractC3377dM1.d("Cannot get capture TotalCaptureResult from the cameraCaptureResult ", captureResult instanceof TotalCaptureResult);
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) captureResult;
        C7793wR0 c7793wR0 = (C7793wR0) rr0;
        if (this.f.k != null) {
            synchronized (this.f.e) {
                try {
                    if (!this.f.w.containsKey(Integer.valueOf(this.d))) {
                        this.f.w.put(Integer.valueOf(this.d), Long.valueOf(((C4332iN) interfaceC7668vn).getTimestamp()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f.k.notifyCaptureResult(totalCaptureResult, c7793wR0.d);
            return;
        }
        this.f.t = false;
        if (this.f.s == null) {
            return;
        }
        VY vy = this.c;
        c4332iN.getTimestamp();
        vy.d = new N8(this.e, 5, (CaptureResult) c4332iN.c);
        this.c.g();
    }

    @Override // defpackage.QR0
    public final void onCaptureFailed(RR0 rr0, C6714qn c6714qn) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.c.d();
        this.f.t = false;
    }

    @Override // defpackage.QR0
    public final /* synthetic */ void onCaptureProgressed(RR0 rr0, InterfaceC7668vn interfaceC7668vn) {
    }

    @Override // defpackage.QR0
    public final void onCaptureSequenceAborted(int i) {
        this.f.t = false;
    }

    @Override // defpackage.QR0
    public final /* synthetic */ void onCaptureSequenceCompleted(int i, long j) {
    }

    @Override // defpackage.QR0
    public final void onCaptureStarted(RR0 rr0, long j, long j2) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.i();
    }
}
