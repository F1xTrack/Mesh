package p000;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public abstract class KY1 {
    /* renamed from: a */
    public static float m4671a(float f, float f2, float f3) {
        float f4 = f / (f3 / 2.0f);
        float f5 = f2 / 2.0f;
        if (f4 < 1.0f) {
            return (f5 * f4 * f4 * f4) + 0.0f;
        }
        float f6 = f4 - 2.0f;
        return (((f6 * f6 * f6) + 2.0f) * f5) + 0.0f;
    }

    /* renamed from: b */
    public static void m4672b(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC9646hb1.m18840a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC9902jb1 viewOnLongClickListenerC9902jb1 = ViewOnLongClickListenerC9902jb1.f35264k;
        if (viewOnLongClickListenerC9902jb1 != null && viewOnLongClickListenerC9902jb1.f35266a == view) {
            ViewOnLongClickListenerC9902jb1.m22075b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC9902jb1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC9902jb1 viewOnLongClickListenerC9902jb12 = ViewOnLongClickListenerC9902jb1.f35265l;
        if (viewOnLongClickListenerC9902jb12 != null && viewOnLongClickListenerC9902jb12.f35266a == view) {
            viewOnLongClickListenerC9902jb12.m22076a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
