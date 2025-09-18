package p000;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* renamed from: yB1 */
/* loaded from: classes.dex */
public abstract class AbstractC11767yB1 {

    /* renamed from: a */
    public static final int[] f46135a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: a */
    public static C11727xt0 m26091a(String str, String str2, AbstractC11161tR0 abstractC11161tR0) {
        StringBuilder sbM26238o = AbstractC7222ym.m26238o("form-data; name=");
        C8540Xp0 c8540Xp0 = C11854yt0.f46525e;
        AbstractC11386vB1.m25371a(sbM26238o, str);
        if (str2 != null) {
            sbM26238o.append("; filename=");
            AbstractC11386vB1.m25371a(sbM26238o, str2);
        }
        String string = sbM26238o.toString();
        O90.m5967e(string, "StringBuilder().apply(builderAction).toString()");
        J20 j20 = new J20();
        j20.m4139f("Content-Disposition", string);
        K20 k20M4140g = j20.m4140g();
        if (k20M4140g.m4524b("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (k20M4140g.m4524b("Content-Length") == null) {
            return new C11727xt0(k20M4140g, abstractC11161tR0);
        }
        throw new IllegalArgumentException("Unexpected header: Content-Length");
    }

    /* renamed from: b */
    public static ColorStateList m26092b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f46135a, 0));
        }
        return colorStateList;
    }
}
