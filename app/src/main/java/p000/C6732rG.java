package p000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* renamed from: rG */
/* loaded from: classes.dex */
public final class C6732rG implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a */
    public final F20 f41401a = F20.m2487a();

    /* renamed from: b */
    public final int f41402b;

    /* renamed from: c */
    public final int f41403c;

    /* renamed from: d */
    public final EnumC0769MD f41404d;

    /* renamed from: e */
    public final AbstractC1841cL f41405e;

    /* renamed from: f */
    public final boolean f41406f;

    /* renamed from: g */
    public final WC0 f41407g;

    public C6732rG(int i, int i2, C7830Jy0 c7830Jy0) {
        this.f41402b = i;
        this.f41403c = i2;
        this.f41404d = (EnumC0769MD) c7830Jy0.m4482c(C3984eL.f26663f);
        this.f41405e = (AbstractC1841cL) c7830Jy0.m4482c(AbstractC1841cL.f17437f);
        C11864yy0 c11864yy0 = C3984eL.f26667j;
        this.f41406f = c7830Jy0.m4482c(c11864yy0) != null && ((Boolean) c7830Jy0.m4482c(c11864yy0)).booleanValue();
        this.f41407g = (WC0) c7830Jy0.m4482c(C3984eL.f26664g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f41401a.m2488b(this.f41402b, this.f41403c, this.f41406f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f41404d == EnumC0769MD.f7035b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C6669qG());
        Size size = imageInfo.getSize();
        int width = this.f41402b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f41403c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fMo10449b = this.f41405e.mo10449b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fMo10449b);
        int iRound2 = Math.round(fMo10449b * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        WC0 wc0 = this.f41407g;
        if (wc0 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((wc0 == WC0.f13058a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
