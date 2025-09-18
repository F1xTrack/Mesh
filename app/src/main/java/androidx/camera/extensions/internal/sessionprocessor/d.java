package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import defpackage.AbstractC3377dM1;
import defpackage.C1591Ue;
import defpackage.C3664et;
import defpackage.C4332iN;
import defpackage.C6714qn;
import defpackage.InterfaceC3415dZ0;
import defpackage.InterfaceC7668vn;
import defpackage.MR;
import defpackage.N8;
import defpackage.QR0;
import defpackage.RR0;

/* loaded from: classes.dex */
public final class d implements QR0 {
    public final /* synthetic */ InterfaceC3415dZ0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ h c;

    public d(h hVar, InterfaceC3415dZ0 interfaceC3415dZ0, int i) {
        this.c = hVar;
        this.a = interfaceC3415dZ0;
        this.b = i;
    }

    @Override // defpackage.QR0
    public final /* synthetic */ void onCaptureBufferLost(RR0 rr0, long j, int i) {
    }

    @Override // defpackage.QR0
    public final void onCaptureCompleted(RR0 rr0, InterfaceC7668vn interfaceC7668vn) {
        CaptureResult captureResultT = ((C4332iN) interfaceC7668vn).t();
        AbstractC3377dM1.d("Cannot get TotalCaptureResult from the cameraCaptureResult ", captureResultT instanceof TotalCaptureResult);
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) captureResultT;
        if (this.c.l != null) {
            this.c.l.notifyCaptureResult(totalCaptureResult);
        } else {
            C1591Ue c1591Ue = C1591Ue.h;
            if (C3664et.d(c1591Ue) && MR.h(c1591Ue) && ((Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
                this.a.f(new N8(totalCaptureResult));
            }
        }
        if (this.c.m != null && this.c.m.process(totalCaptureResult) != null) {
            this.c.r(this.b, this.a);
        }
        this.a.g();
    }

    @Override // defpackage.QR0
    public final /* synthetic */ void onCaptureFailed(RR0 rr0, C6714qn c6714qn) {
    }

    @Override // defpackage.QR0
    public final /* synthetic */ void onCaptureProgressed(RR0 rr0, InterfaceC7668vn interfaceC7668vn) {
    }

    @Override // defpackage.QR0
    public final /* synthetic */ void onCaptureSequenceAborted(int i) {
    }

    @Override // defpackage.QR0
    public final /* synthetic */ void onCaptureSequenceCompleted(int i, long j) {
    }

    @Override // defpackage.QR0
    public final /* synthetic */ void onCaptureStarted(RR0 rr0, long j, long j2) {
    }
}
