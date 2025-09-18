package p000;

/* renamed from: Ro0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8226Ro0 extends Exception {

    /* renamed from: a */
    public final String f10429a;

    /* renamed from: b */
    public final boolean f10430b;

    /* renamed from: c */
    public final C8018No0 f10431c;

    /* renamed from: d */
    public final String f10432d;

    public C8226Ro0(C6686qX c6686qX, C8486Wo0 c8486Wo0, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + c6686qX, c8486Wo0, c6686qX.f40974m, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public C8226Ro0(String str, Throwable th, String str2, boolean z, C8018No0 c8018No0, String str3) {
        super(str, th);
        this.f10429a = str2;
        this.f10430b = z;
        this.f10431c = c8018No0;
        this.f10432d = str3;
    }
}
