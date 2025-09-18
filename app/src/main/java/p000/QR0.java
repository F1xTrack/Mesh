package p000;

/* loaded from: classes.dex */
public interface QR0 {
    void onCaptureBufferLost(RR0 rr0, long j, int i);

    void onCaptureCompleted(RR0 rr0, InterfaceC7034vn interfaceC7034vn);

    void onCaptureFailed(RR0 rr0, C6702qn c6702qn);

    void onCaptureProgressed(RR0 rr0, InterfaceC7034vn interfaceC7034vn);

    void onCaptureSequenceAborted(int i);

    void onCaptureSequenceCompleted(int i, long j);

    void onCaptureStarted(RR0 rr0, long j, long j2);
}
