package p000;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import java.io.IOException;
import java.io.InputStream;
import kotlin.KotlinVersion;

/* renamed from: c12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8927c12 {
    /* renamed from: a */
    public static RenderEffect m10563a(ColorMatrix colorMatrix, RenderEffect renderEffect) {
        if (renderEffect == null) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            O90.m5965c(renderEffectCreateColorFilterEffect);
            return renderEffectCreateColorFilterEffect;
        }
        RenderEffect renderEffectCreateColorFilterEffect2 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffect);
        O90.m5965c(renderEffectCreateColorFilterEffect2);
        return renderEffectCreateColorFilterEffect2;
    }

    /* renamed from: b */
    public static ColorMatrix m10564b(float f) {
        float f2 = ((-(f / 2.0f)) + 0.5f) * KotlinVersion.MAX_COMPONENT_VALUE;
        return new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, f2, 0.0f, f, 0.0f, 0.0f, f2, 0.0f, 0.0f, f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    /* renamed from: c */
    public static ColorMatrix m10565c(float f) {
        float f2 = 1 - f;
        float f3 = 0.7152f - (f2 * 0.7152f);
        float f4 = 0.0722f - (f2 * 0.0722f);
        float f5 = 0.2126f - (f2 * 0.2126f);
        return new ColorMatrix(new float[]{(0.7874f * f2) + 0.2126f, f3, f4, 0.0f, 0.0f, f5, (0.2848f * f2) + 0.7152f, f4, 0.0f, 0.0f, f5, f3, (f2 * 0.9278f) + 0.0722f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    /* renamed from: d */
    public static ColorMatrix m10566d(float f) {
        double radians = Math.toRadians(f);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f2 = 0.715f - (fCos * 0.715f);
        float f3 = fSin * 0.715f;
        float f4 = 0.072f - (fCos * 0.072f);
        float f5 = 0.213f - (fCos * 0.213f);
        return new ColorMatrix(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f2 - f3, (fSin * 0.928f) + f4, 0.0f, 0.0f, (0.143f * fSin) + f5, (0.14f * fSin) + (0.285f * fCos) + 0.715f, f4 - (0.283f * fSin), 0.0f, 0.0f, f5 - (0.787f * fSin), f2 + f3, (fSin * 0.072f) + (fCos * 0.928f) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    /* renamed from: e */
    public static ColorMatrix m10567e(float f) {
        float f2 = 1 - (2 * f);
        float f3 = f * KotlinVersion.MAX_COMPONENT_VALUE;
        return new ColorMatrix(new float[]{f2, 0.0f, 0.0f, 0.0f, f3, 0.0f, f2, 0.0f, 0.0f, f3, 0.0f, 0.0f, f2, 0.0f, f3, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    /* renamed from: f */
    public static ColorMatrix m10568f(float f) {
        float f2 = 1 - f;
        return new ColorMatrix(new float[]{(0.607f * f2) + 0.393f, 0.769f - (f2 * 0.769f), 0.189f - (f2 * 0.189f), 0.0f, 0.0f, 0.349f - (f2 * 0.349f), (0.314f * f2) + 0.686f, 0.168f - (f2 * 0.168f), 0.0f, 0.0f, 0.272f - (f2 * 0.272f), 0.534f - (f2 * 0.534f), (f2 * 0.869f) + 0.131f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    /* renamed from: g */
    public static int m10569g(InterfaceC9286en1 interfaceC9286en1) {
        if ((((interfaceC9286en1.mo4741a() << 16) & (-65536)) | (interfaceC9286en1.mo4741a() & 65535)) != 1380533830) {
            return 7;
        }
        interfaceC9286en1.mo4747g();
        if ((((interfaceC9286en1.mo4741a() << 16) & (-65536)) | (interfaceC9286en1.mo4741a() & 65535)) != 1464156752) {
            return 7;
        }
        int iMo4741a = ((interfaceC9286en1.mo4741a() << 16) & (-65536)) | (interfaceC9286en1.mo4741a() & 65535);
        if (iMo4741a == 1448097824) {
            return 1;
        }
        if (iMo4741a == 1448097868) {
            interfaceC9286en1.mo4747g();
            return (interfaceC9286en1.mo4744d() & 8) != 0 ? 3 : 2;
        }
        if (iMo4741a != 1448097880) {
            return 7;
        }
        interfaceC9286en1.mo4747g();
        int iMo4744d = interfaceC9286en1.mo4744d();
        if ((iMo4744d & 2) != 0) {
            return 6;
        }
        return (iMo4744d & 16) != 0 ? 5 : 4;
    }

    /* renamed from: h */
    public static int m10570h(InputStream inputStream, C11967zm0 c11967zm0) throws IOException {
        if (inputStream == null) {
            return 7;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C10515oO0(inputStream, c11967zm0);
        }
        inputStream.mark(21);
        try {
            return m10569g(new C10641pN0(10, inputStream));
        } finally {
            inputStream.reset();
        }
    }

    /* renamed from: i */
    public static boolean m10571i(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }
}
