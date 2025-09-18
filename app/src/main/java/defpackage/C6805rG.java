package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* renamed from: rG */
/* loaded from: classes.dex */
public final class C6805rG implements ImageDecoder$OnHeaderDecodedListener {
    public final F20 a = F20.a();
    public final int b;
    public final int c;
    public final MD d;
    public final AbstractC2496cL e;
    public final boolean f;
    public final WC0 g;

    public C6805rG(int i, int i2, C0795Jy0 c0795Jy0) {
        this.b = i;
        this.c = i2;
        this.d = (MD) c0795Jy0.c(C3562eL.f);
        this.e = (AbstractC2496cL) c0795Jy0.c(AbstractC2496cL.f);
        C8272yy0 c8272yy0 = C3562eL.j;
        this.f = c0795Jy0.c(c8272yy0) != null && ((Boolean) c0795Jy0.c(c8272yy0)).booleanValue();
        this.g = (WC0) c0795Jy0.c(C3562eL.g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.a.b(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == MD.b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C6615qG());
        Size size = imageInfo.getSize();
        int width = this.b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(fB * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        WC0 wc0 = this.g;
        if (wc0 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((wc0 == WC0.a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
