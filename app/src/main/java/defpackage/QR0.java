package defpackage;

/* loaded from: classes.dex */
public interface QR0 {
    void onCaptureBufferLost(RR0 rr0, long j, int i);

    void onCaptureCompleted(RR0 rr0, InterfaceC7668vn interfaceC7668vn);

    void onCaptureFailed(RR0 rr0, C6714qn c6714qn);

    void onCaptureProgressed(RR0 rr0, InterfaceC7668vn interfaceC7668vn);

    void onCaptureSequenceAborted(int i);

    void onCaptureSequenceCompleted(int i, long j);

    void onCaptureStarted(RR0 rr0, long j, long j2);
}
