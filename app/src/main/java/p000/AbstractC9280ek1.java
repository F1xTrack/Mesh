package p000;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: ek1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9280ek1 {
    /* renamed from: a */
    public static WindowInsets m18027a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: b */
    public static WindowInsets m18028b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: c */
    public static void m18029c(View view) {
        view.requestApplyInsets();
    }
}
