package p000;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: S4 */
/* loaded from: classes.dex */
public final class C1137S4 {

    /* renamed from: a */
    public static final ViewGroup.MarginLayoutParams f10574a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f10574a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* renamed from: a */
    public static boolean m7175a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m7175a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
