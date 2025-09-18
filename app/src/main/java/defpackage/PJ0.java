package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class PJ0 {
    public static final Rect a = new Rect();

    public static void a(ViewGroup viewGroup, Rect rect) {
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            rect.setEmpty();
            return;
        }
        if (parent instanceof OJ0) {
            OJ0 oj0 = (OJ0) parent;
            if (oj0.getRemoveClippedSubviews()) {
                Rect rect2 = a;
                oj0.getClippingRect(rect2);
                if (!rect2.intersect(viewGroup.getLeft(), viewGroup.getTop() + ((int) viewGroup.getTranslationY()), viewGroup.getRight(), viewGroup.getBottom() + ((int) viewGroup.getTranslationY()))) {
                    rect.setEmpty();
                    return;
                }
                rect2.offset(-viewGroup.getLeft(), -viewGroup.getTop());
                rect2.offset(-((int) viewGroup.getTranslationX()), -((int) viewGroup.getTranslationY()));
                rect2.offset(viewGroup.getScrollX(), viewGroup.getScrollY());
                rect.set(rect2);
                return;
            }
        }
        viewGroup.getDrawingRect(rect);
    }
}
