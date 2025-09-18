package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Pe1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8103Pe1 extends GZ1 {
    /* renamed from: k */
    public static Font m6391k(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM6392l = m6392l(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM6392l2 = m6392l(fontStyle, font2.getStyle());
            if (iM6392l2 < iM6392l) {
                font = font2;
                iM6392l = iM6392l2;
            }
        }
        return font;
    }

    /* renamed from: l */
    public static int m6392l(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p000.GZ1
    /* renamed from: b */
    public final Typeface mo3089b(Context context, C4185hX c4185hX, Resources resources, int i) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (C4248iX c4248iX : c4185hX.f28444a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c4248iX.f29303f).setWeight(c4248iX.f29299b).setSlant(c4248iX.f29300c ? 1 : 0).setTtcIndex(c4248iX.f29302e).setFontVariationSettings(c4248iX.f29301d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m6391k(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000.GZ1
    /* renamed from: c */
    public final Typeface mo3090c(Context context, C6369lX[] c6369lXArr, int i) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C6369lX c6369lX : c6369lXArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c6369lX.f37093a, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c6369lX.f37095c).setSlant(c6369lX.f37096d ? 1 : 0).setTtcIndex(c6369lX.f37094b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m6391k(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000.GZ1
    /* renamed from: d */
    public final Typeface mo3091d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p000.GZ1
    /* renamed from: e */
    public final Typeface mo3092e(Context context, Resources resources, int i, String str, int i2) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000.GZ1
    /* renamed from: f */
    public final C6369lX mo3093f(int i, C6369lX[] c6369lXArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
