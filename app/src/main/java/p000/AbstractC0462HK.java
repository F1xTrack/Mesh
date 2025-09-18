package p000;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* renamed from: HK */
/* loaded from: classes.dex */
public abstract class AbstractC0462HK {
    /* renamed from: a */
    public static DisplayCutout m3345a(Rect rect, List<Rect> list) {
        return new DisplayCutout(rect, list);
    }

    /* renamed from: b */
    public static List<Rect> m3346b(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* renamed from: c */
    public static int m3347c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: d */
    public static int m3348d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: e */
    public static int m3349e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: f */
    public static int m3350f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
