package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: Ij0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0672Ij0 implements View.OnTouchListener {
    public static final int r = ViewConfiguration.getTapTimeout();
    public final C4186hc a;
    public final AccelerateInterpolator b;
    public final ListView c;
    public GR0 d;
    public final float[] e;
    public final float[] f;
    public final int g;
    public final int h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final C2118aM q;

    public ViewOnTouchListenerC0672Ij0(C2118aM c2118aM) {
        C4186hc c4186hc = new C4186hc();
        c4186hc.e = Long.MIN_VALUE;
        c4186hc.g = -1L;
        c4186hc.f = 0L;
        this.a = c4186hc;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr5;
        this.c = c2118aM;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = r;
        c4186hc.a = 500;
        c4186hc.b = 500;
        this.q = c2118aM;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.e
            r0 = r0[r7]
            float[] r1 = r3.f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.i
            r0 = r0[r7]
            float[] r1 = r3.j
            r1 = r1[r7]
            float[] r2 = r3.k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnTouchListenerC0672Ij0.a(float, float, float, int):float");
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.g;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.m) {
            this.o = false;
            return;
        }
        C4186hc c4186hc = this.a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - c4186hc.e);
        int i3 = c4186hc.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c4186hc.i = i;
        c4186hc.h = c4186hc.a(jCurrentAnimationTimeMillis);
        c4186hc.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        C2118aM c2118aM;
        int count;
        C4186hc c4186hc = this.a;
        float f = c4186hc.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c4186hc.c);
        if (iAbs == 0 || (count = (c2118aM = this.q).getCount()) == 0) {
            return false;
        }
        int childCount = c2118aM.getChildCount();
        int firstVisiblePosition = c2118aM.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i >= count && c2118aM.getChildAt(childCount - 1).getBottom() <= c2118aM.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c2118aM.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7c
        L16:
            r7.d()
            goto L7c
        L1a:
            r7.n = r2
            r7.l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            hc r9 = r7.a
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.o
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            GR0 r8 = r7.d
            if (r8 != 0) goto L60
            GR0 r8 = new GR0
            r9 = 4
            r8.<init>(r9, r7)
            r7.d = r8
        L60:
            r7.o = r2
            r7.m = r2
            boolean r8 = r7.l
            if (r8 != 0) goto L75
            int r8 = r7.h
            if (r8 <= 0) goto L75
            GR0 r9 = r7.d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = defpackage.AbstractC6897rk1.a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            GR0 r8 = r7.d
            r8.run()
        L7a:
            r7.l = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnTouchListenerC0672Ij0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
