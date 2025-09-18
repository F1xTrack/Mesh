package p000;

import android.view.View;
import android.view.WindowInsetsController;

/* renamed from: mk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10304mk1 {
    /* renamed from: a */
    public static int m22937a(View view) {
        return view.getImportantForContentCapture();
    }

    /* renamed from: b */
    public static CharSequence m22938b(View view) {
        return view.getStateDescription();
    }

    /* renamed from: c */
    public static C8771ao1 m22939c(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new C8771ao1(windowInsetsController);
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m22940d(View view) {
        return view.isImportantForContentCapture();
    }

    /* renamed from: e */
    public static void m22941e(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    /* renamed from: f */
    public static void m22942f(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
