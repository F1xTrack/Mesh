package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* renamed from: jw */
/* loaded from: classes.dex */
public abstract class AbstractC6268jw {
    /* renamed from: a */
    public static ColorStateList m22121a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* renamed from: b */
    public static PorterDuff.Mode m22122b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    /* renamed from: c */
    public static void m22123c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* renamed from: d */
    public static void m22124d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
