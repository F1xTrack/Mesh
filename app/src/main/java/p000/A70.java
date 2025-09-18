package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract class A70 {
    /* renamed from: a */
    public static ColorStateList m62a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    /* renamed from: b */
    public static PorterDuff.Mode m63b(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* renamed from: c */
    public static void m64c(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* renamed from: d */
    public static void m65d(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
