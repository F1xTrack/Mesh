package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;
import ru.mes.dnevnik.R;

/* renamed from: nS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6078nS extends AbstractC0418Fc1 {
    public static final String[] C = {"android:visibility:visibility", "android:visibility:parent"};
    public final int B;

    public C6078nS(int i) {
        this();
        this.B = i;
    }

    public static void L(C1197Pc1 c1197Pc1) {
        int visibility = c1197Pc1.b.getVisibility();
        HashMap map = c1197Pc1.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c1197Pc1.b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float N(C1197Pc1 c1197Pc1, float f) {
        Float f2;
        return (c1197Pc1 == null || (f2 = (Float) c1197Pc1.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C3645em1 O(defpackage.C1197Pc1 r8, defpackage.C1197Pc1 r9) {
        /*
            em1 r0 = new em1
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.b = r1
            r0.a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.b = r1
            r0.a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.b = r2
            r0.a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.b = r1
            r0.a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6078nS.O(Pc1, Pc1):em1");
    }

    public final ObjectAnimator M(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC8424zl1.a.c(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC8424zl1.b, f2);
        C5887mS c5887mS = new C5887mS(view);
        objectAnimatorOfFloat.addListener(c5887mS);
        q().a(c5887mS);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void f(C1197Pc1 c1197Pc1) {
        L(c1197Pc1);
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void i(C1197Pc1 c1197Pc1) {
        L(c1197Pc1);
        View view = c1197Pc1.b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC8424zl1.a.b(view)) : Float.valueOf(0.0f);
        }
        c1197Pc1.a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (O(p(r3, false), t(r3, false)).a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0202  */
    @Override // defpackage.AbstractC0418Fc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator m(android.view.ViewGroup r21, defpackage.C1197Pc1 r22, defpackage.C1197Pc1 r23) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6078nS.m(android.view.ViewGroup, Pc1, Pc1):android.animation.Animator");
    }

    @Override // defpackage.AbstractC0418Fc1
    public final String[] s() {
        return C;
    }

    @Override // defpackage.AbstractC0418Fc1
    public final boolean u(C1197Pc1 c1197Pc1, C1197Pc1 c1197Pc12) {
        if (c1197Pc1 == null && c1197Pc12 == null) {
            return false;
        }
        if (c1197Pc1 != null && c1197Pc12 != null && c1197Pc12.a.containsKey("android:visibility:visibility") != c1197Pc1.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C3645em1 c3645em1O = O(c1197Pc1, c1197Pc12);
        if (c3645em1O.a) {
            return c3645em1O.c == 0 || c3645em1O.d == 0;
        }
        return false;
    }

    public C6078nS() {
        this.B = 3;
    }
}
