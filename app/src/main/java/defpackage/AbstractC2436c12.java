package defpackage;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import java.io.IOException;
import java.io.InputStream;
import kotlin.KotlinVersion;

/* renamed from: c12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2436c12 {
    public static RenderEffect a(ColorMatrix colorMatrix, RenderEffect renderEffect) {
        if (renderEffect == null) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            O90.c(renderEffectCreateColorFilterEffect);
            return renderEffectCreateColorFilterEffect;
        }
        RenderEffect renderEffectCreateColorFilterEffect2 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffect);
        O90.c(renderEffectCreateColorFilterEffect2);
        return renderEffectCreateColorFilterEffect2;
    }

    public static ColorMatrix b(float f) {
        float f2 = ((-(f / 2.0f)) + 0.5f) * KotlinVersion.MAX_COMPONENT_VALUE;
        return new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, f2, 0.0f, f, 0.0f, 0.0f, f2, 0.0f, 0.0f, f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static ColorMatrix c(float f) {
        float f2 = 1 - f;
        float f3 = 0.7152f - (f2 * 0.7152f);
        float f4 = 0.0722f - (f2 * 0.0722f);
        float f5 = 0.2126f - (f2 * 0.2126f);
        return new ColorMatrix(new float[]{(0.7874f * f2) + 0.2126f, f3, f4, 0.0f, 0.0f, f5, (0.2848f * f2) + 0.7152f, f4, 0.0f, 0.0f, f5, f3, (f2 * 0.9278f) + 0.0722f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static ColorMatrix d(float f) {
        double radians = Math.toRadians(f);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f2 = 0.715f - (fCos * 0.715f);
        float f3 = fSin * 0.715f;
        float f4 = 0.072f - (fCos * 0.072f);
        float f5 = 0.213f - (fCos * 0.213f);
        return new ColorMatrix(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f2 - f3, (fSin * 0.928f) + f4, 0.0f, 0.0f, (0.143f * fSin) + f5, (0.14f * fSin) + (0.285f * fCos) + 0.715f, f4 - (0.283f * fSin), 0.0f, 0.0f, f5 - (0.787f * fSin), f2 + f3, (fSin * 0.072f) + (fCos * 0.928f) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static ColorMatrix e(float f) {
        float f2 = 1 - (2 * f);
        float f3 = f * KotlinVersion.MAX_COMPONENT_VALUE;
        return new ColorMatrix(new float[]{f2, 0.0f, 0.0f, 0.0f, f3, 0.0f, f2, 0.0f, 0.0f, f3, 0.0f, 0.0f, f2, 0.0f, f3, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static ColorMatrix f(float f) {
        float f2 = 1 - f;
        return new ColorMatrix(new float[]{(0.607f * f2) + 0.393f, 0.769f - (f2 * 0.769f), 0.189f - (f2 * 0.189f), 0.0f, 0.0f, 0.349f - (f2 * 0.349f), (0.314f * f2) + 0.686f, 0.168f - (f2 * 0.168f), 0.0f, 0.0f, 0.272f - (f2 * 0.272f), 0.534f - (f2 * 0.534f), (f2 * 0.869f) + 0.131f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static int g(InterfaceC3648en1 interfaceC3648en1) {
        if ((((interfaceC3648en1.a() << 16) & (-65536)) | (interfaceC3648en1.a() & 65535)) != 1380533830) {
            return 7;
        }
        interfaceC3648en1.g();
        if ((((interfaceC3648en1.a() << 16) & (-65536)) | (interfaceC3648en1.a() & 65535)) != 1464156752) {
            return 7;
        }
        int iA = ((interfaceC3648en1.a() << 16) & (-65536)) | (interfaceC3648en1.a() & 65535);
        if (iA == 1448097824) {
            return 1;
        }
        if (iA == 1448097868) {
            interfaceC3648en1.g();
            return (interfaceC3648en1.d() & 8) != 0 ? 3 : 2;
        }
        if (iA != 1448097880) {
            return 7;
        }
        interfaceC3648en1.g();
        int iD = interfaceC3648en1.d();
        if ((iD & 2) != 0) {
            return 6;
        }
        return (iD & 16) != 0 ? 5 : 4;
    }

    public static int h(InputStream inputStream, C8426zm0 c8426zm0) throws IOException {
        if (inputStream == null) {
            return 7;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C6258oO0(inputStream, c8426zm0);
        }
        inputStream.mark(21);
        try {
            return g(new C6446pN0(10, inputStream));
        } finally {
            inputStream.reset();
        }
    }

    public static boolean i(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }
}
