package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* renamed from: og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6311og extends AbstractC6181o0 {
    @Override // defpackage.AbstractC6181o0
    public final Animation b(View view, int i, int i2, int i3, int i4) {
        U4 u4 = this.c;
        if (u4 == null) {
            throw new C2262b60("Missing animated property from animation config");
        }
        int iOrdinal = u4.ordinal();
        if (iOrdinal == 0) {
            return new C6366oy0(view, e() ? view.getAlpha() : 0.0f, e() ? 0.0f : view.getAlpha());
        }
        if (iOrdinal == 1) {
            return new ScaleAnimation(e() ? 1.0f : 0.0f, e() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
        }
        if (iOrdinal == 2) {
            return new ScaleAnimation(1.0f, 1.0f, e() ? 1.0f : 0.0f, e() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
        }
        if (iOrdinal == 3) {
            float f = e() ? 1.0f : 0.0f;
            float f2 = e() ? 0.0f : 1.0f;
            return new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        }
        throw new C2262b60("Missing animation for property : " + this.c);
    }

    @Override // defpackage.AbstractC6181o0
    public final boolean d() {
        return this.d > 0 && this.c != null;
    }

    public abstract boolean e();
}
