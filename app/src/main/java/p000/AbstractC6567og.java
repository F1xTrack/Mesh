package p000;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* renamed from: og */
/* loaded from: classes.dex */
public abstract class AbstractC6567og extends AbstractC6525o0 {
    @Override // p000.AbstractC6525o0
    /* renamed from: b */
    public final Animation mo23168b(View view, int i, int i2, int i3, int i4) {
        EnumC1263U4 enumC1263U4 = this.f38665c;
        if (enumC1263U4 == null) {
            throw new C8810b60("Missing animated property from animation config");
        }
        int iOrdinal = enumC1263U4.ordinal();
        if (iOrdinal == 0) {
            return new C10587oy0(view, mo18598e() ? view.getAlpha() : 0.0f, mo18598e() ? 0.0f : view.getAlpha());
        }
        if (iOrdinal == 1) {
            return new ScaleAnimation(mo18598e() ? 1.0f : 0.0f, mo18598e() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
        }
        if (iOrdinal == 2) {
            return new ScaleAnimation(1.0f, 1.0f, mo18598e() ? 1.0f : 0.0f, mo18598e() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
        }
        if (iOrdinal == 3) {
            float f = mo18598e() ? 1.0f : 0.0f;
            float f2 = mo18598e() ? 0.0f : 1.0f;
            return new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        }
        throw new C8810b60("Missing animation for property : " + this.f38665c);
    }

    @Override // p000.AbstractC6525o0
    /* renamed from: d */
    public final boolean mo23169d() {
        return this.f38666d > 0 && this.f38665c != null;
    }

    /* renamed from: e */
    public abstract boolean mo18598e();
}
