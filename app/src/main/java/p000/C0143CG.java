package p000;

import android.transition.Transition;
import androidx.fragment.app.AbstractC1723e;
import androidx.fragment.app.C1740v;
import androidx.fragment.app.Fragment;

/* renamed from: CG */
/* loaded from: classes.dex */
public final class C0143CG extends AbstractC1723e {

    /* renamed from: c */
    public final Object f1283c;

    /* renamed from: d */
    public final boolean f1284d;

    /* renamed from: e */
    public final Object f1285e;

    public C0143CG(C1740v c1740v, C0744Lp c0744Lp, boolean z, boolean z2) {
        super(c1740v, c0744Lp);
        int i = c1740v.f16277a;
        Fragment fragment = c1740v.f16279c;
        this.f1283c = i == 2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.f1284d = c1740v.f16277a == 2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.f1285e = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    /* renamed from: c */
    public final AbstractC0161CY m1129c() {
        Object obj = this.f1283c;
        AbstractC0161CY abstractC0161CYM1130d = m1130d(obj);
        Object obj2 = this.f1285e;
        AbstractC0161CY abstractC0161CYM1130d2 = m1130d(obj2);
        if (abstractC0161CYM1130d == null || abstractC0161CYM1130d2 == null || abstractC0161CYM1130d == abstractC0161CYM1130d2) {
            return abstractC0161CYM1130d == null ? abstractC0161CYM1130d2 : abstractC0161CYM1130d;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f16181a.f16279c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    /* renamed from: d */
    public final AbstractC0161CY m1130d(Object obj) {
        if (obj == null) {
            return null;
        }
        C0035AY c0035ay = AbstractC7019vY.f44407a;
        if (obj instanceof Transition) {
            return c0035ay;
        }
        AbstractC0161CY abstractC0161CY = AbstractC7019vY.f44408b;
        if (abstractC0161CY != null && abstractC0161CY.mo207e(obj)) {
            return abstractC0161CY;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f16181a.f16279c + " is not a valid framework Transition or AndroidX Transition");
    }
}
