package defpackage;

import android.graphics.Bitmap;

/* renamed from: y60 */
/* loaded from: classes.dex */
public final class C8110y60 {
    public static final C8110y60 c;
    public final Bitmap.Config a;
    public final Bitmap.Config b;

    static {
        C4332iN c4332iN = new C4332iN((char) 0, 17);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        c4332iN.b = config;
        c4332iN.c = config;
        c = new C8110y60(c4332iN);
    }

    public C8110y60(C4332iN c4332iN) {
        this.a = (Bitmap.Config) c4332iN.b;
        this.b = (Bitmap.Config) c4332iN.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8110y60.class != obj.getClass()) {
            return false;
        }
        C8110y60 c8110y60 = (C8110y60) obj;
        return this.a == c8110y60.a && this.b == c8110y60.b;
    }

    public final int hashCode() {
        int iOrdinal = (this.a.ordinal() - 552645669) * 31;
        Bitmap.Config config = this.b;
        return (iOrdinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDecodeOptions{");
        C1857Xo1 c1857Xo1D = EI1.d(this);
        c1857Xo1D.l(String.valueOf(100), "minDecodeIntervalMs");
        c1857Xo1D.l(String.valueOf(Integer.MAX_VALUE), "maxDimensionPx");
        c1857Xo1D.k("decodePreviewFrame", false);
        c1857Xo1D.k("useLastFrameForPreview", false);
        c1857Xo1D.k("useEncodedImageForPreview", false);
        c1857Xo1D.k("decodeAllFrames", false);
        c1857Xo1D.k("forceStaticImage", false);
        c1857Xo1D.l(this.a.name(), "bitmapConfigName");
        c1857Xo1D.l(this.b.name(), "animatedBitmapConfigName");
        c1857Xo1D.l(null, "customImageDecoder");
        c1857Xo1D.l(null, "bitmapTransformation");
        c1857Xo1D.l(null, "colorSpace");
        return AbstractC1705Vq.l(sb, c1857Xo1D.toString(), "}");
    }
}
