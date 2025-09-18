package p000;

import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* renamed from: Yp1 */
/* loaded from: classes.dex */
public abstract class AbstractC8593Yp1 {

    /* renamed from: a */
    public static final C7616Fv0 f14552a = new C7616Fv0(13);

    /* renamed from: a */
    public static AbstractC10784qU1 m9385a(int i) {
        return i != 0 ? i != 1 ? new GT0() : new C3913dC() : new GT0();
    }

    /* renamed from: b */
    public static void m9386b(View view, C10439no0 c10439no0) {
        C6613pN c6613pN = c10439no0.f38516a.f37932b;
        if (c6613pN == null || !c6613pN.f40036a) {
            return;
        }
        float fM18614i = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            fM18614i += AbstractC9536gk1.m18614i((View) parent);
        }
        C10311mo0 c10311mo0 = c10439no0.f38516a;
        if (c10311mo0.f37942l != fM18614i) {
            c10311mo0.f37942l = fM18614i;
            c10439no0.m23241m();
        }
    }
}
