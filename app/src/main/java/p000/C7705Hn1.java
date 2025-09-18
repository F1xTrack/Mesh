package p000;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: Hn1 */
/* loaded from: classes.dex */
public final class C7705Hn1 {

    /* renamed from: a */
    public AbstractC7653Gn1 f4508a;

    public C7705Hn1(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4508a = new C7601Fn1(M21.m5231k(i, interpolator, j));
        } else {
            this.f4508a = new C7497Dn1(i, interpolator, j);
        }
    }
}
