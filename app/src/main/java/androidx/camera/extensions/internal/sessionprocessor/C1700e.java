package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import p000.AbstractC9104dM1;
import p000.C0827N8;
import p000.C10996s81;
import p000.C11544wR0;
import p000.C1356VY;
import p000.C4238iN;
import p000.C6702qn;
import p000.InterfaceC7034vn;
import p000.QR0;
import p000.RR0;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.e */
/* loaded from: classes.dex */
public final class C1700e implements QR0 {

    /* renamed from: a */
    public boolean f15984a = false;

    /* renamed from: b */
    public boolean f15985b = false;

    /* renamed from: c */
    public final /* synthetic */ C1356VY f15986c;

    /* renamed from: d */
    public final /* synthetic */ int f15987d;

    /* renamed from: e */
    public final /* synthetic */ C10996s81 f15988e;

    /* renamed from: f */
    public final /* synthetic */ C1703h f15989f;

    public C1700e(int i, C1356VY c1356vy, C10996s81 c10996s81, C1703h c1703h) {
        this.f15989f = c1703h;
        this.f15986c = c1356vy;
        this.f15987d = i;
        this.f15988e = c10996s81;
    }

    @Override // p000.QR0
    public final /* synthetic */ void onCaptureBufferLost(RR0 rr0, long j, int i) {
    }

    @Override // p000.QR0
    public final void onCaptureCompleted(RR0 rr0, InterfaceC7034vn interfaceC7034vn) {
        C4238iN c4238iN = (C4238iN) interfaceC7034vn;
        CaptureResult captureResult = (CaptureResult) c4238iN.f29114c;
        AbstractC9104dM1.m17545d("Cannot get capture TotalCaptureResult from the cameraCaptureResult ", captureResult instanceof TotalCaptureResult);
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) captureResult;
        C11544wR0 c11544wR0 = (C11544wR0) rr0;
        if (this.f15989f.f16001k != null) {
            synchronized (this.f15989f.f27846e) {
                try {
                    if (!this.f15989f.f16013w.containsKey(Integer.valueOf(this.f15987d))) {
                        this.f15989f.f16013w.put(Integer.valueOf(this.f15987d), Long.valueOf(((C4238iN) interfaceC7034vn).getTimestamp()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f15989f.f16001k.notifyCaptureResult(totalCaptureResult, c11544wR0.f44869d);
            return;
        }
        this.f15989f.f16010t = false;
        if (this.f15989f.f16009s == null) {
            return;
        }
        C1356VY c1356vy = this.f15986c;
        c4238iN.getTimestamp();
        c1356vy.f12613d = new C0827N8(this.f15988e, 5, (CaptureResult) c4238iN.f29114c);
        this.f15986c.mo8496g();
    }

    @Override // p000.QR0
    public final void onCaptureFailed(RR0 rr0, C6702qn c6702qn) {
        if (this.f15984a) {
            return;
        }
        this.f15984a = true;
        this.f15986c.mo8492d();
        this.f15989f.f16010t = false;
    }

    @Override // p000.QR0
    public final /* synthetic */ void onCaptureProgressed(RR0 rr0, InterfaceC7034vn interfaceC7034vn) {
    }

    @Override // p000.QR0
    public final void onCaptureSequenceAborted(int i) {
        this.f15989f.f16010t = false;
    }

    @Override // p000.QR0
    public final /* synthetic */ void onCaptureSequenceCompleted(int i, long j) {
    }

    @Override // p000.QR0
    public final void onCaptureStarted(RR0 rr0, long j, long j2) {
        if (this.f15985b) {
            return;
        }
        this.f15985b = true;
        this.f15986c.mo8499i();
    }
}
