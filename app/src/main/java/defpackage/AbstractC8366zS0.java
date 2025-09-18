package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: zS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8366zS0 {
    public static Drawable a(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }
}
