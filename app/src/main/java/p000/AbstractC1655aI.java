package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: aI */
/* loaded from: classes.dex */
public abstract class AbstractC1655aI {

    /* renamed from: a */
    public static final ThreadLocal f15457a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f15458b = new ThreadLocal();

    /* renamed from: a */
    public static void m9699a(ViewGroup viewGroup, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            m9699a(viewGroup, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
