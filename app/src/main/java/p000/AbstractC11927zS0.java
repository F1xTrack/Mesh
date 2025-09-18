package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: zS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11927zS0 {
    /* renamed from: a */
    public static Drawable m26438a(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    /* renamed from: b */
    public static Drawable m26439b(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }
}
