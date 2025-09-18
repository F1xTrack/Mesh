package p000;

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
public abstract class AbstractC6525o0 {

    /* renamed from: e */
    public static final HashMap f38662e = AbstractC10889rJ0.m24255b(J90.f5362b, new LinearInterpolator(), J90.f5363c, new AccelerateInterpolator(), J90.f5364d, new DecelerateInterpolator(), J90.f5365e, new AccelerateDecelerateInterpolator());

    /* renamed from: a */
    public Interpolator f38663a;

    /* renamed from: b */
    public int f38664b;

    /* renamed from: c */
    public EnumC1263U4 f38665c;

    /* renamed from: d */
    public int f38666d;

    /* renamed from: a */
    public final Animation m23293a(View view, int i, int i2, int i3, int i4) {
        if (!mo23169d()) {
            return null;
        }
        Animation animationMo23168b = mo23168b(view, i, i2, i3, i4);
        if (animationMo23168b != null) {
            animationMo23168b.setDuration(this.f38666d);
            animationMo23168b.setStartOffset(this.f38664b);
            animationMo23168b.setInterpolator(this.f38663a);
        }
        return animationMo23168b;
    }

    /* renamed from: b */
    public abstract Animation mo23168b(View view, int i, int i2, int i3, int i4);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0120  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23294c(int r5, com.facebook.react.bridge.ReadableMap r6) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC6525o0.m23294c(int, com.facebook.react.bridge.ReadableMap):void");
    }

    /* renamed from: d */
    public abstract boolean mo23169d();
}
