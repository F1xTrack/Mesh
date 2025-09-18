package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* renamed from: yB1 */
/* loaded from: classes.dex */
public abstract class AbstractC8126yB1 {
    public static final int[] a = {R.attr.state_enabled, R.attr.state_pressed};

    public static C8067xt0 a(String str, String str2, AbstractC7221tR0 abstractC7221tR0) {
        StringBuilder sbO = AbstractC8235ym.o("form-data; name=");
        C1859Xp0 c1859Xp0 = C8257yt0.e;
        AbstractC7556vB1.a(sbO, str);
        if (str2 != null) {
            sbO.append("; filename=");
            AbstractC7556vB1.a(sbO, str2);
        }
        String string = sbO.toString();
        O90.e(string, "StringBuilder().apply(builderAction).toString()");
        J20 j20 = new J20();
        j20.f("Content-Disposition", string);
        K20 k20G = j20.g();
        if (k20G.b("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (k20G.b("Content-Length") == null) {
            return new C8067xt0(k20G, abstractC7221tR0);
        }
        throw new IllegalArgumentException("Unexpected header: Content-Length");
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(a, 0));
        }
        return colorStateList;
    }
}
