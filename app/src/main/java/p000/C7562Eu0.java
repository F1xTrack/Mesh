package p000;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: Eu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7562Eu0 extends FrameLayout {

    /* renamed from: a */
    public Integer f2948a;

    /* renamed from: b */
    public boolean f2949b;

    /* renamed from: c */
    public int f2950c;

    /* renamed from: d */
    public float f2951d;

    /* renamed from: e */
    public float f2952e;

    /* renamed from: f */
    public boolean f2953f;

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p000.C10050kl1 getParentViewPager() {
        /*
            r3 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L1e
            boolean r1 = r0 instanceof p000.C10050kl1
            if (r1 != 0) goto L1e
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        L1e:
            boolean r1 = r0 instanceof p000.C10050kl1
            if (r1 == 0) goto L25
            r2 = r0
            kl1 r2 = (p000.C10050kl1) r2
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7562Eu0.getParentViewPager():kl1");
    }

    public final boolean getDidSetInitialIndex() {
        return this.f2949b;
    }

    public final Integer getInitialIndex() {
        return this.f2948a;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "e"
            p000.O90.m5968f(r11, r0)
            kl1 r0 = r10.getParentViewPager()
            if (r0 == 0) goto L14
            int r0 = r0.getOrientation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L15
        L14:
            r0 = 0
        L15:
            int r1 = r11.getAction()
            r2 = 1
            if (r1 != 0) goto L33
            float r1 = r11.getX()
            r10.f2951d = r1
            float r1 = r11.getY()
            r10.f2952e = r1
            if (r0 == 0) goto Ld0
            android.view.ViewParent r0 = r10.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            goto Ld0
        L33:
            int r1 = r11.getAction()
            r3 = 2
            if (r1 != r3) goto Ld0
            float r1 = r11.getX()
            float r3 = r10.f2951d
            float r1 = r1 - r3
            float r3 = r11.getY()
            float r4 = r10.f2952e
            float r3 = r3 - r4
            r4 = 0
            if (r0 != 0) goto L4c
            goto L54
        L4c:
            int r5 = r0.intValue()
            if (r5 != 0) goto L54
            r5 = r2
            goto L55
        L54:
            r5 = r4
        L55:
            float r6 = java.lang.Math.abs(r1)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r5 == 0) goto L61
            r9 = r8
            goto L62
        L61:
            r9 = r7
        L62:
            float r6 = r6 * r9
            float r9 = java.lang.Math.abs(r3)
            if (r5 == 0) goto L6a
            goto L6b
        L6a:
            r7 = r8
        L6b:
            float r9 = r9 * r7
            int r7 = r10.f2950c
            float r7 = (float) r7
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 > 0) goto L77
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 <= 0) goto Ld0
        L77:
            p000.GB1.m2968b(r10, r11)
            r10.f2953f = r2
            if (r0 != 0) goto L7f
            goto Ld0
        L7f:
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 <= 0) goto L85
            r6 = r2
            goto L86
        L85:
            r6 = r4
        L86:
            if (r5 != r6) goto L90
            android.view.ViewParent r0 = r10.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            goto Ld0
        L90:
            int r0 = r0.intValue()
            if (r5 == 0) goto L97
            goto L98
        L97:
            r1 = r3
        L98:
            float r1 = java.lang.Math.signum(r1)
            int r1 = (int) r1
            int r1 = -r1
            if (r0 == 0) goto Lb5
            if (r0 != r2) goto Laf
            android.view.View r0 = r10.getChild()
            if (r0 == 0) goto Lad
            boolean r0 = r0.canScrollVertically(r1)
            goto Lbf
        Lad:
            r0 = r4
            goto Lbf
        Laf:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        Lb5:
            android.view.View r0 = r10.getChild()
            if (r0 == 0) goto Lad
            boolean r0 = r0.canScrollHorizontally(r1)
        Lbf:
            if (r0 == 0) goto Lc9
            android.view.ViewParent r0 = r10.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            goto Ld0
        Lc9:
            android.view.ViewParent r0 = r10.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
        Ld0:
            boolean r11 = super.onInterceptTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7562Eu0.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "e");
        if (motionEvent.getActionMasked() == 1 && this.f2953f) {
            GB1.m2967a(this, motionEvent);
            this.f2953f = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDidSetInitialIndex(boolean z) {
        this.f2949b = z;
    }

    public final void setInitialIndex(Integer num) {
        this.f2948a = num;
    }
}
