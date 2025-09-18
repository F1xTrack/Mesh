package defpackage;

/* renamed from: qM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6633qM extends AbstractC5762lo {
    public final boolean d;

    public C6633qM(Throwable th, boolean z) {
        this("recorder-error", AbstractC1705Vq.i("An error occurred while recording a video! ", z ? "The output file was generated, so the recording may be valid." : "The output file was generated but the recording will not be valid, so you should delete the file.", " ", th != null ? th.getMessage() : null), z, th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6633qM(String str, String str2, boolean z, Throwable th) {
        super("capture", str, str2, th);
        O90.f(str2, "message");
        this.d = z;
    }

    public C6633qM(Throwable th) {
        this("no-data", AbstractC8235ym.k("The Video Recording failed because no data was received! (", th != null ? th.getMessage() : null, ") Did you stop the recording before any Frames arrived?"), false, th);
    }
}
