package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* renamed from: Yp1 */
/* loaded from: classes.dex */
public abstract class AbstractC1938Yp1 {
    public static final C0474Fv0 a = new C0474Fv0(13);

    public static AbstractC6659qU1 a(int i) {
        return i != 0 ? i != 1 ? new GT0() : new C3345dC() : new GT0();
    }

    public static void b(View view, C6145no0 c6145no0) {
        C6445pN c6445pN = c6145no0.a.b;
        if (c6445pN == null || !c6445pN.a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            fI += AbstractC4021gk1.i((View) parent);
        }
        C5954mo0 c5954mo0 = c6145no0.a;
        if (c5954mo0.l != fI) {
            c5954mo0.l = fI;
            c6145no0.m();
        }
    }
}
