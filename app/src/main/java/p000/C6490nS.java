package p000;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;
import ru.mes.dnevnik.R;

/* renamed from: nS */
/* loaded from: classes.dex */
public final class C6490nS extends AbstractC7579Fc1 {

    /* renamed from: C */
    public static final String[] f38312C = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: B */
    public final int f38313B;

    public C6490nS(int i) {
        this();
        this.f38313B = i;
    }

    /* renamed from: L */
    public static void m23141L(C8099Pc1 c8099Pc1) {
        int visibility = c8099Pc1.f9198b.getVisibility();
        HashMap map = c8099Pc1.f9197a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c8099Pc1.f9198b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: N */
    public static float m23142N(C8099Pc1 c8099Pc1, float f) {
        Float f2;
        return (c8099Pc1 == null || (f2 = (Float) c8099Pc1.f9197a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C9284em1 m23143O(p000.C8099Pc1 r8, p000.C8099Pc1 r9) {
        /*
            em1 r0 = new em1
            r0.<init>()
            r1 = 0
            r0.f26833a = r1
            r0.f26834b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f9197a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f26835c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f26837e = r6
            goto L33
        L2f:
            r0.f26835c = r3
            r0.f26837e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f9197a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f26836d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f26838f = r2
            goto L56
        L52:
            r0.f26836d = r3
            r0.f26838f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f26835c
            int r9 = r0.f26836d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f26837e
            android.view.ViewGroup r4 = r0.f26838f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f26834b = r1
            r0.f26833a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f26834b = r2
            r0.f26833a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f26838f
            if (r8 != 0) goto L81
            r0.f26834b = r1
            r0.f26833a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f26837e
            if (r8 != 0) goto L9f
            r0.f26834b = r2
            r0.f26833a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f26836d
            if (r8 != 0) goto L95
            r0.f26834b = r2
            r0.f26833a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f26835c
            if (r8 != 0) goto L9f
            r0.f26834b = r1
            r0.f26833a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6490nS.m23143O(Pc1, Pc1):em1");
    }

    /* renamed from: M */
    public final ObjectAnimator m23144M(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC11966zl1.f46983a.mo3151c(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC11966zl1.f46984b, f2);
        C6427mS c6427mS = new C6427mS(view);
        objectAnimatorOfFloat.addListener(c6427mS);
        m2708q().m2694a(c6427mS);
        return objectAnimatorOfFloat;
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: f */
    public final void mo2697f(C8099Pc1 c8099Pc1) {
        m23141L(c8099Pc1);
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: i */
    public final void mo2700i(C8099Pc1 c8099Pc1) {
        m23141L(c8099Pc1);
        View view = c8099Pc1.f9198b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC11966zl1.f46983a.mo3150b(view)) : Float.valueOf(0.0f);
        }
        c8099Pc1.f9197a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (m23143O(m2707p(r3, false), m2710t(r3, false)).f26833a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0202  */
    @Override // p000.AbstractC7579Fc1
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator mo2704m(android.view.ViewGroup r21, p000.C8099Pc1 r22, p000.C8099Pc1 r23) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6490nS.mo2704m(android.view.ViewGroup, Pc1, Pc1):android.animation.Animator");
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: s */
    public final String[] mo2709s() {
        return f38312C;
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: u */
    public final boolean mo2711u(C8099Pc1 c8099Pc1, C8099Pc1 c8099Pc12) {
        if (c8099Pc1 == null && c8099Pc12 == null) {
            return false;
        }
        if (c8099Pc1 != null && c8099Pc12 != null && c8099Pc12.f9197a.containsKey("android:visibility:visibility") != c8099Pc1.f9197a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C9284em1 c9284em1M23143O = m23143O(c8099Pc1, c8099Pc12);
        if (c9284em1M23143O.f26833a) {
            return c9284em1M23143O.f26835c == 0 || c9284em1M23143O.f26836d == 0;
        }
        return false;
    }

    public C6490nS() {
        this.f38313B = 3;
    }
}
