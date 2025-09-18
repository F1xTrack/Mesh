package p000;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: rA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10871rA0 {
    /* renamed from: a */
    public static Interpolator m24166a(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    /* renamed from: b */
    public static Interpolator m24167b(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    /* renamed from: c */
    public static Interpolator m24168c(Path path) {
        return new PathInterpolator(path);
    }
}
