package defpackage;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.HashMap;

/* renamed from: o0 */
/* loaded from: classes.dex */
public abstract class AbstractC6181o0 {
    public static final HashMap e = AbstractC6815rJ0.b(J90.b, new LinearInterpolator(), J90.c, new AccelerateInterpolator(), J90.d, new DecelerateInterpolator(), J90.e, new AccelerateDecelerateInterpolator());
    public Interpolator a;
    public int b;
    public U4 c;
    public int d;

    public final Animation a(View view, int i, int i2, int i3, int i4) {
        if (!d()) {
            return null;
        }
        Animation animationB = b(view, i, i2, i3, i4);
        if (animationB != null) {
            animationB.setDuration(this.d);
            animationB.setStartOffset(this.b);
            animationB.setInterpolator(this.a);
        }
        return animationB;
    }

    public abstract Animation b(View view, int i, int i2, int i3, int i4);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r5, com.facebook.react.bridge.ReadableMap r6) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6181o0.c(int, com.facebook.react.bridge.ReadableMap):void");
    }

    public abstract boolean d();
}
