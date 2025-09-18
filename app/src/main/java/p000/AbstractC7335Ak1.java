package p000;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: Ak1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7335Ak1 {

    /* renamed from: a */
    public static final ThreadLocal f347a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f348b = new ThreadLocal();

    /* renamed from: a */
    public static void m314a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            m314a(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
