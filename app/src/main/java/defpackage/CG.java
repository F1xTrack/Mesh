package defpackage;

import android.transition.Transition;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.v;

/* loaded from: classes.dex */
public final class CG extends e {
    public final Object c;
    public final boolean d;
    public final Object e;

    public CG(v vVar, C0923Lp c0923Lp, boolean z, boolean z2) {
        super(vVar, c0923Lp);
        int i = vVar.a;
        Fragment fragment = vVar.c;
        this.c = i == 2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.d = vVar.a == 2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.e = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    public final CY c() {
        Object obj = this.c;
        CY cyD = d(obj);
        Object obj2 = this.e;
        CY cyD2 = d(obj2);
        if (cyD == null || cyD2 == null || cyD == cyD2) {
            return cyD == null ? cyD2 : cyD;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final CY d(Object obj) {
        if (obj == null) {
            return null;
        }
        AY ay = AbstractC7623vY.a;
        if (obj instanceof Transition) {
            return ay;
        }
        CY cy = AbstractC7623vY.b;
        if (cy != null && cy.e(obj)) {
            return cy;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.c + " is not a valid framework Transition or AndroidX Transition");
    }
}
