package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: Hn1 */
/* loaded from: classes.dex */
public final class C0607Hn1 {
    public AbstractC0529Gn1 a;

    public C0607Hn1(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new C0451Fn1(M21.k(i, interpolator, j));
        } else {
            this.a = new C0295Dn1(i, interpolator, j);
        }
    }
}
