package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.C1742a;

/* renamed from: sQ1 */
/* loaded from: classes.dex */
public abstract class AbstractC11032sQ1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m24739a(Activity activity, EnumC7382Bi0 enumC7382Bi0) {
        O90.m5968f(activity, "activity");
        O90.m5968f(enumC7382Bi0, "event");
        if (activity instanceof InterfaceC7902Li0) {
            AbstractC7538Ei0 lifecycle = ((InterfaceC7902Li0) activity).getLifecycle();
            if (lifecycle instanceof C1742a) {
                ((C1742a) lifecycle).m10126e(enumC7382Bi0);
            }
        }
    }

    /* renamed from: b */
    public static void m24740b(Activity activity) {
        O90.m5968f(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            C9881jR0.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C9881jR0());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC10009kR0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0034  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m24741c(p000.HS0 r3, p000.C10777qR0 r4) {
        /*
            java.lang.String r0 = "request"
            p000.O90.m5968f(r4, r0)
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            int r2 = r3.f4298d
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
            K20 r0 = r3.f4300f
            java.lang.String r2 = "Expires"
            java.lang.String r0 = r0.m4524b(r2)
            if (r0 != 0) goto L3f
            r0 = 0
        L3f:
            if (r0 != 0) goto L5b
            al r0 = r3.m3427m()
            r2 = -1
            int r0 = r0.f15671c
            if (r0 != r2) goto L5b
            al r0 = r3.m3427m()
            boolean r0 = r0.f15674f
            if (r0 != 0) goto L5b
            al r0 = r3.m3427m()
            boolean r0 = r0.f15673e
            if (r0 != 0) goto L5b
            return r1
        L5b:
            al r3 = r3.m3427m()
            boolean r3 = r3.f15670b
            if (r3 != 0) goto L76
            al r3 = r4.f40875f
            if (r3 != 0) goto L71
            int r3 = p000.C1684al.f15668n
            K20 r3 = r4.f40872c
            al r3 = p000.YP1.m9295b(r3)
            r4.f40875f = r3
        L71:
            boolean r3 = r3.f15670b
            if (r3 != 0) goto L76
            r1 = 1
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11032sQ1.m24741c(HS0, qR0):boolean");
    }
}
