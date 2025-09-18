package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public abstract class KY1 {
    public static float a(float f, float f2, float f3) {
        float f4 = f / (f3 / 2.0f);
        float f5 = f2 / 2.0f;
        if (f4 < 1.0f) {
            return (f5 * f4 * f4 * f4) + 0.0f;
        }
        float f6 = f4 - 2.0f;
        return (((f6 * f6 * f6) + 2.0f) * f5) + 0.0f;
    }

    public static void b(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC4185hb1.a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC5343jb1 viewOnLongClickListenerC5343jb1 = ViewOnLongClickListenerC5343jb1.k;
        if (viewOnLongClickListenerC5343jb1 != null && viewOnLongClickListenerC5343jb1.a == view) {
            ViewOnLongClickListenerC5343jb1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC5343jb1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC5343jb1 viewOnLongClickListenerC5343jb12 = ViewOnLongClickListenerC5343jb1.l;
        if (viewOnLongClickListenerC5343jb12 != null && viewOnLongClickListenerC5343jb12.a == view) {
            viewOnLongClickListenerC5343jb12.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
