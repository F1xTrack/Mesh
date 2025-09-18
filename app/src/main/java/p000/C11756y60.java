package p000;

import android.graphics.Bitmap;

/* renamed from: y60 */
/* loaded from: classes.dex */
public final class C11756y60 {

    /* renamed from: c */
    public static final C11756y60 f46087c;

    /* renamed from: a */
    public final Bitmap.Config f46088a;

    /* renamed from: b */
    public final Bitmap.Config f46089b;

    static {
        C4238iN c4238iN = new C4238iN((char) 0, 17);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        c4238iN.f29113b = config;
        c4238iN.f29114c = config;
        f46087c = new C11756y60(c4238iN);
    }

    public C11756y60(C4238iN c4238iN) {
        this.f46088a = (Bitmap.Config) c4238iN.f29113b;
        this.f46089b = (Bitmap.Config) c4238iN.f29114c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11756y60.class != obj.getClass()) {
            return false;
        }
        C11756y60 c11756y60 = (C11756y60) obj;
        return this.f46088a == c11756y60.f46088a && this.f46089b == c11756y60.f46089b;
    }

    public final int hashCode() {
        int iOrdinal = (this.f46088a.ordinal() - 552645669) * 31;
        Bitmap.Config config = this.f46089b;
        return (iOrdinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDecodeOptions{");
        C8539Xo1 c8539Xo1M2121d = EI1.m2121d(this);
        c8539Xo1M2121d.m9143l(String.valueOf(100), "minDecodeIntervalMs");
        c8539Xo1M2121d.m9143l(String.valueOf(Integer.MAX_VALUE), "maxDimensionPx");
        c8539Xo1M2121d.m9142k("decodePreviewFrame", false);
        c8539Xo1M2121d.m9142k("useLastFrameForPreview", false);
        c8539Xo1M2121d.m9142k("useEncodedImageForPreview", false);
        c8539Xo1M2121d.m9142k("decodeAllFrames", false);
        c8539Xo1M2121d.m9142k("forceStaticImage", false);
        c8539Xo1M2121d.m9143l(this.f46088a.name(), "bitmapConfigName");
        c8539Xo1M2121d.m9143l(this.f46089b.name(), "animatedBitmapConfigName");
        c8539Xo1M2121d.m9143l(null, "customImageDecoder");
        c8539Xo1M2121d.m9143l(null, "bitmapTransformation");
        c8539Xo1M2121d.m9143l(null, "colorSpace");
        return AbstractC1374Vq.m8593l(sb, c8539Xo1M2121d.toString(), "}");
    }
}
