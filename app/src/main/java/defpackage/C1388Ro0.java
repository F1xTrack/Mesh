package defpackage;

/* renamed from: Ro0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1388Ro0 extends Exception {
    public final String a;
    public final boolean b;
    public final C1076No0 c;
    public final String d;

    public C1388Ro0(C6666qX c6666qX, C1778Wo0 c1778Wo0, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + c6666qX, c1778Wo0, c6666qX.m, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public C1388Ro0(String str, Throwable th, String str2, boolean z, C1076No0 c1076No0, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = c1076No0;
        this.d = str3;
    }
}
