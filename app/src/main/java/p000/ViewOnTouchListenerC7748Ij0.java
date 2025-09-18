package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: Ij0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC7748Ij0 implements View.OnTouchListener {

    /* renamed from: r */
    public static final int f5095r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    public final C4190hc f5096a;

    /* renamed from: b */
    public final AccelerateInterpolator f5097b;

    /* renamed from: c */
    public final ListView f5098c;

    /* renamed from: d */
    public GR0 f5099d;

    /* renamed from: e */
    public final float[] f5100e;

    /* renamed from: f */
    public final float[] f5101f;

    /* renamed from: g */
    public final int f5102g;

    /* renamed from: h */
    public final int f5103h;

    /* renamed from: i */
    public final float[] f5104i;

    /* renamed from: j */
    public final float[] f5105j;

    /* renamed from: k */
    public final float[] f5106k;

    /* renamed from: l */
    public boolean f5107l;

    /* renamed from: m */
    public boolean f5108m;

    /* renamed from: n */
    public boolean f5109n;

    /* renamed from: o */
    public boolean f5110o;

    /* renamed from: p */
    public boolean f5111p;

    /* renamed from: q */
    public final C1659aM f5112q;

    public ViewOnTouchListenerC7748Ij0(C1659aM c1659aM) {
        C4190hc c4190hc = new C4190hc();
        c4190hc.f28476e = Long.MIN_VALUE;
        c4190hc.f28478g = -1L;
        c4190hc.f28477f = 0L;
        this.f5096a = c4190hc;
        this.f5097b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f5100e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5101f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f5104i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f5105j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5106k = fArr5;
        this.f5098c = c1659aM;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f5102g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f5103h = f5095r;
        c4190hc.f28472a = 500;
        c4190hc.f28473b = 500;
        this.f5112q = c1659aM;
    }

    /* renamed from: b */
    public static float m3976b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m3977a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f5100e
            r0 = r0[r7]
            float[] r1 = r3.f5101f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = m3976b(r0, r2, r1)
            float r1 = r3.m3978c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.m3978c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f5097b
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
            float r4 = m3976b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f5104i
            r0 = r0[r7]
            float[] r1 = r3.f5105j
            r1 = r1[r7]
            float[] r2 = r3.f5106k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = m3976b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = m3976b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnTouchListenerC7748Ij0.m3977a(float, float, float, int):float");
    }

    /* renamed from: c */
    public final float m3978c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f5102g;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f5110o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void m3979d() {
        int i = 0;
        if (this.f5108m) {
            this.f5110o = false;
            return;
        }
        C4190hc c4190hc = this.f5096a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - c4190hc.f28476e);
        int i3 = c4190hc.f28473b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c4190hc.f28480i = i;
        c4190hc.f28479h = c4190hc.m18841a(jCurrentAnimationTimeMillis);
        c4190hc.f28478g = jCurrentAnimationTimeMillis;
    }

    /* renamed from: e */
    public final boolean m3980e() {
        C1659aM c1659aM;
        int count;
        C4190hc c4190hc = this.f5096a;
        float f = c4190hc.f28475d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c4190hc.f28474c);
        if (iAbs == 0 || (count = (c1659aM = this.f5112q).getCount()) == 0) {
            return false;
        }
        int childCount = c1659aM.getChildCount();
        int firstVisiblePosition = c1659aM.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i >= count && c1659aM.getChildAt(childCount - 1).getBottom() <= c1659aM.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c1659aM.getChildAt(0).getTop() >= 0) {
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
            boolean r0 = r7.f5111p
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
            r7.m3979d()
            goto L7c
        L1a:
            r7.f5109n = r2
            r7.f5107l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f5098c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m3977a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m3977a(r9, r8, r3, r2)
            hc r9 = r7.f5096a
            r9.f28474c = r0
            r9.f28475d = r8
            boolean r8 = r7.f5110o
            if (r8 != 0) goto L7c
            boolean r8 = r7.m3980e()
            if (r8 == 0) goto L7c
            GR0 r8 = r7.f5099d
            if (r8 != 0) goto L60
            GR0 r8 = new GR0
            r9 = 4
            r8.<init>(r9, r7)
            r7.f5099d = r8
        L60:
            r7.f5110o = r2
            r7.f5108m = r2
            boolean r8 = r7.f5107l
            if (r8 != 0) goto L75
            int r8 = r7.f5103h
            if (r8 <= 0) goto L75
            GR0 r9 = r7.f5099d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = p000.AbstractC10944rk1.f41842a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            GR0 r8 = r7.f5099d
            r8.run()
        L7a:
            r7.f5107l = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnTouchListenerC7748Ij0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
