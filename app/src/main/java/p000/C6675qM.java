package p000;

/* renamed from: qM */
/* loaded from: classes2.dex */
public final class C6675qM extends AbstractC6386lo {

    /* renamed from: d */
    public final boolean f40796d;

    public C6675qM(Throwable th, boolean z) {
        this("recorder-error", AbstractC1374Vq.m8590i("An error occurred while recording a video! ", z ? "The output file was generated, so the recording may be valid." : "The output file was generated but the recording will not be valid, so you should delete the file.", " ", th != null ? th.getMessage() : null), z, th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6675qM(String str, String str2, boolean z, Throwable th) {
        super("capture", str, str2, th);
        O90.m5968f(str2, "message");
        this.f40796d = z;
    }

    public C6675qM(Throwable th) {
        this("no-data", AbstractC7222ym.m26234k("The Video Recording failed because no data was received! (", th != null ? th.getMessage() : null, ") Did you stop the recording before any Frames arrived?"), false, th);
    }
}
