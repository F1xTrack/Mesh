package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.a;

/* renamed from: sQ1 */
/* loaded from: classes.dex */
public abstract class AbstractC7028sQ1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0123Bi0 enumC0123Bi0) {
        O90.f(activity, "activity");
        O90.f(enumC0123Bi0, "event");
        if (activity instanceof InterfaceC0903Li0) {
            AbstractC0357Ei0 lifecycle = ((InterfaceC0903Li0) activity).getLifecycle();
            if (lifecycle instanceof a) {
                ((a) lifecycle).e(enumC0123Bi0);
            }
        }
    }

    public static void b(Activity activity) {
        O90.f(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            C5312jR0.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C5312jR0());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC5503kR0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(defpackage.HS0 r3, defpackage.C6649qR0 r4) {
        /*
            java.lang.String r0 = "request"
            defpackage.O90.f(r4, r0)
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            int r2 = r3.d
            if (r2 == r0) goto L5b
            r0 = 410(0x19a, float:5.75E-43)
            if (r2 == r0) goto L5b
            r0 = 414(0x19e, float:5.8E-43)
            if (r2 == r0) goto L5b
            r0 = 501(0x1f5, float:7.02E-43)
            if (r2 == r0) goto L5b
            r0 = 203(0xcb, float:2.84E-43)
            if (r2 == r0) goto L5b
            r0 = 204(0xcc, float:2.86E-43)
            if (r2 == r0) goto L5b
            r0 = 307(0x133, float:4.3E-43)
            if (r2 == r0) goto L34
            r0 = 308(0x134, float:4.32E-43)
            if (r2 == r0) goto L5b
            r0 = 404(0x194, float:5.66E-43)
            if (r2 == r0) goto L5b
            r0 = 405(0x195, float:5.68E-43)
            if (r2 == r0) goto L5b
            switch(r2) {
                case 300: goto L5b;
                case 301: goto L5b;
                case 302: goto L34;
                default: goto L33;
            }
        L33:
            return r1
        L34:
            K20 r0 = r3.f
            java.lang.String r2 = "Expires"
            java.lang.String r0 = r0.b(r2)
            if (r0 != 0) goto L3f
            r0 = 0
        L3f:
            if (r0 != 0) goto L5b
            al r0 = r3.m()
            r2 = -1
            int r0 = r0.c
            if (r0 != r2) goto L5b
            al r0 = r3.m()
            boolean r0 = r0.f
            if (r0 != 0) goto L5b
            al r0 = r3.m()
            boolean r0 = r0.e
            if (r0 != 0) goto L5b
            return r1
        L5b:
            al r3 = r3.m()
            boolean r3 = r3.b
            if (r3 != 0) goto L76
            al r3 = r4.f
            if (r3 != 0) goto L71
            int r3 = defpackage.C2193al.n
            K20 r3 = r4.c
            al r3 = defpackage.YP1.b(r3)
            r4.f = r3
        L71:
            boolean r3 = r3.b
            if (r3 != 0) goto L76
            r1 = 1
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7028sQ1.c(HS0, qR0):boolean");
    }
}
