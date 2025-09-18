package p000;

import android.graphics.RectF;
import android.util.SizeF;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/* renamed from: Vz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8456Vz0 {

    /* renamed from: a */
    public final C11891zA0 f12900a;

    /* renamed from: b */
    public int f12901b;

    /* renamed from: c */
    public float f12902c;

    /* renamed from: d */
    public float f12903d;

    /* renamed from: e */
    public float f12904e;

    /* renamed from: f */
    public float f12905f;

    /* renamed from: g */
    public float f12906g;

    /* renamed from: h */
    public float f12907h;

    /* renamed from: i */
    public final RectF f12908i = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: j */
    public final int f12909j;

    public C8456Vz0(C11891zA0 c11891zA0) {
        this.f12900a = c11891zA0;
        this.f12909j = (int) TypedValue.applyDimension(1, 20, c11891zA0.getContext().getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public final int m8645a(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        C7988Mz0 c7988Mz0;
        C7988Mz0 c7988Mz02;
        boolean z2;
        int i7 = 0;
        for (int i8 = i2; i8 <= i3; i8++) {
            for (int i9 = i4; i9 <= i5; i9++) {
                float f = this.f12904e;
                float f2 = this.f12905f;
                float f3 = i9 * f;
                float f4 = i8 * f2;
                float f5 = this.f12906g;
                float f6 = this.f12907h;
                if (f3 + f > 1.0f) {
                    f = 1.0f - f3;
                }
                if (f4 + f2 > 1.0f) {
                    f2 = 1.0f - f4;
                }
                float f7 = f5 * f;
                float f8 = f6 * f2;
                RectF rectF = new RectF(f3, f4, f + f3, f2 + f4);
                if (f7 <= 0.0f || f8 <= 0.0f) {
                    z = false;
                } else {
                    C8071Oo1 c8071Oo1 = this.f12900a.f45937d;
                    int i10 = this.f12901b;
                    c8071Oo1.getClass();
                    C7988Mz0 c7988Mz03 = new C7988Mz0(i, null, rectF, false, 0);
                    synchronized (c8071Oo1.f8630d) {
                        try {
                            Iterator it = ((PriorityQueue) c8071Oo1.f8627a).iterator();
                            while (true) {
                                c7988Mz0 = null;
                                if (!it.hasNext()) {
                                    c7988Mz02 = null;
                                    break;
                                }
                                c7988Mz02 = (C7988Mz0) it.next();
                                if (c7988Mz02.equals(c7988Mz03)) {
                                    break;
                                }
                            }
                            z = true;
                            if (c7988Mz02 != null) {
                                ((PriorityQueue) c8071Oo1.f8627a).remove(c7988Mz02);
                                c7988Mz02.f7426e = i10;
                                ((PriorityQueue) c8071Oo1.f8628b).offer(c7988Mz02);
                                z2 = true;
                            } else {
                                Iterator it2 = ((PriorityQueue) c8071Oo1.f8628b).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    C7988Mz0 c7988Mz04 = (C7988Mz0) it2.next();
                                    if (c7988Mz04.equals(c7988Mz03)) {
                                        c7988Mz0 = c7988Mz04;
                                        break;
                                    }
                                }
                                z2 = c7988Mz0 != null;
                            }
                        } finally {
                        }
                    }
                    if (!z2) {
                        C11891zA0 c11891zA0 = this.f12900a;
                        c11891zA0.f45948o.m17989a(i, f7, f8, rectF, false, this.f12901b, c11891zA0.f45924D);
                    }
                    this.f12901b++;
                }
                if (z) {
                    i7++;
                }
                if (i7 >= i6) {
                    return i7;
                }
            }
        }
        return i7;
    }

    /* renamed from: b */
    public final void m8646b() {
        float f;
        float f2;
        float fM26055f;
        float width;
        float height;
        float f3;
        float f4;
        float f5;
        int i;
        boolean z;
        float width2;
        float height2;
        this.f12901b = 1;
        float currentXOffset = this.f12900a.getCurrentXOffset();
        if (currentXOffset > 0.0f) {
            currentXOffset = 0.0f;
        }
        this.f12902c = -currentXOffset;
        float currentYOffset = this.f12900a.getCurrentYOffset();
        if (currentYOffset > 0.0f) {
            currentYOffset = 0.0f;
        }
        this.f12903d = -currentYOffset;
        float f6 = this.f12909j;
        float f7 = -this.f12902c;
        float f8 = f7 + f6;
        float width3 = (f7 - this.f12900a.getWidth()) - f6;
        float f9 = -this.f12903d;
        float f10 = f9 + f6;
        float height3 = (f9 - this.f12900a.getHeight()) - f6;
        if (f8 > 0.0f) {
            f8 = 0.0f;
        }
        float f11 = -f8;
        if (f10 > 0.0f) {
            f10 = 0.0f;
        }
        float f12 = -f10;
        if (width3 > 0.0f) {
            width3 = 0.0f;
        }
        float f13 = -width3;
        if (height3 > 0.0f) {
            height3 = 0.0f;
        }
        float f14 = -height3;
        C11891zA0 c11891zA0 = this.f12900a;
        boolean z2 = c11891zA0.f45957x;
        float f15 = z2 ? f12 : f11;
        float f16 = z2 ? f14 : f13;
        int iM26053d = c11891zA0.f45940g.m26053d(f15, c11891zA0.getZoom());
        int iM26053d2 = c11891zA0.f45940g.m26053d(f16, c11891zA0.getZoom());
        int i2 = (iM26053d2 - iM26053d) + 1;
        LinkedList<C8404Uz0> linkedList = new LinkedList();
        int i3 = iM26053d;
        while (i3 <= iM26053d2) {
            C8404Uz0 c8404Uz0 = new C8404Uz0();
            C11649xG0 c11649xG0 = new C11649xG0(7);
            c8404Uz0.f12272b = c11649xG0;
            C11649xG0 c11649xG02 = new C11649xG0(8);
            c8404Uz0.f12273c = c11649xG02;
            C11649xG0 c11649xG03 = new C11649xG0(8);
            c8404Uz0.f12274d = c11649xG03;
            c8404Uz0.f12271a = i3;
            if (i3 != iM26053d) {
                f = f11;
                f2 = f13;
                if (i3 == iM26053d2) {
                    fM26055f = c11891zA0.f45940g.m26055f(c11891zA0.getZoom(), i3);
                    if (c11891zA0.f45957x) {
                        f5 = fM26055f;
                        fM26055f = f;
                    } else {
                        f5 = f12;
                    }
                    f3 = f5;
                    f4 = f12;
                    height = f14;
                } else {
                    fM26055f = c11891zA0.f45940g.m26055f(c11891zA0.getZoom(), i3);
                    SizeF sizeFM26057h = c11891zA0.f45940g.m26057h(c11891zA0.getZoom(), i3);
                    if (c11891zA0.f45957x) {
                        height = sizeFM26057h.getHeight() + fM26055f;
                        f3 = fM26055f;
                        f4 = f12;
                        fM26055f = f;
                    } else {
                        width = sizeFM26057h.getWidth() + fM26055f;
                        f3 = f12;
                        f4 = f3;
                        height = f14;
                    }
                }
                width = f2;
            } else if (i2 == 1) {
                fM26055f = f11;
                f = fM26055f;
                f2 = f13;
                width = f2;
                f3 = f12;
                f4 = f3;
                height = f14;
            } else {
                f = f11;
                float fM26055f2 = c11891zA0.f45940g.m26055f(c11891zA0.getZoom(), i3);
                f2 = f13;
                SizeF sizeFM26057h2 = c11891zA0.f45940g.m26057h(c11891zA0.getZoom(), i3);
                if (c11891zA0.f45957x) {
                    height2 = sizeFM26057h2.getHeight() + fM26055f2;
                    width2 = f2;
                } else {
                    width2 = sizeFM26057h2.getWidth() + fM26055f2;
                    height2 = f14;
                }
                width = width2;
                f3 = f12;
                f4 = f3;
                height = height2;
                fM26055f = f;
            }
            float f17 = f14;
            SizeF sizeFM26056g = c11891zA0.f45940g.m26056g(c8404Uz0.f12271a);
            float width4 = 1.0f / sizeFM26056g.getWidth();
            float height4 = ((1.0f / sizeFM26056g.getHeight()) * 256.0f) / c11891zA0.getZoom();
            float zoom = (width4 * 256.0f) / c11891zA0.getZoom();
            int i4 = iM26053d;
            int i5 = i2;
            c11649xG0.f45508b = ((int) ((1.0f / height4) + 16384.999999999996d)) - 16384;
            c11649xG0.f45509c = ((int) ((1.0f / zoom) + 16384.999999999996d)) - 16384;
            SizeF sizeFM26057h3 = c11891zA0.f45940g.m26057h(c11891zA0.getZoom(), c8404Uz0.f12271a);
            float height5 = sizeFM26057h3.getHeight() / c11649xG0.f45508b;
            float width5 = sizeFM26057h3.getWidth() / c11649xG0.f45509c;
            float fM26058i = c11891zA0.f45940g.m26058i(c11891zA0.getZoom(), i3);
            if (c11891zA0.f45957x) {
                i = iM26053d2;
                c11649xG02.f45508b = AbstractC8137Pv1.m6488a(Math.abs(f3 - c11891zA0.f45940g.m26055f(c11891zA0.getZoom(), c8404Uz0.f12271a)) / height5);
                float f18 = fM26055f - fM26058i;
                if (f18 < 0.0f) {
                    f18 = 0.0f;
                }
                c11649xG02.f45509c = AbstractC8137Pv1.m6488a(f18 / width5);
                c11649xG03.f45508b = ((int) ((Math.abs(height - c11891zA0.f45940g.m26055f(c11891zA0.getZoom(), c8404Uz0.f12271a)) / height5) + 16384.999999999996d)) - 16384;
                float f19 = width - fM26058i;
                if (f19 < 0.0f) {
                    f19 = 0.0f;
                }
                c11649xG03.f45509c = AbstractC8137Pv1.m6488a(f19 / width5);
                z = false;
            } else {
                i = iM26053d2;
                c11649xG02.f45509c = AbstractC8137Pv1.m6488a(Math.abs(fM26055f - c11891zA0.f45940g.m26055f(c11891zA0.getZoom(), c8404Uz0.f12271a)) / width5);
                float f20 = f3 - fM26058i;
                if (f20 < 0.0f) {
                    f20 = 0.0f;
                }
                c11649xG02.f45508b = AbstractC8137Pv1.m6488a(f20 / height5);
                c11649xG03.f45509c = AbstractC8137Pv1.m6488a(Math.abs(width - c11891zA0.f45940g.m26055f(c11891zA0.getZoom(), c8404Uz0.f12271a)) / width5);
                float f21 = height - fM26058i;
                z = false;
                if (f21 < 0.0f) {
                    f21 = 0.0f;
                }
                c11649xG03.f45508b = AbstractC8137Pv1.m6488a(f21 / height5);
            }
            linkedList.add(c8404Uz0);
            i3++;
            f11 = f;
            f13 = f2;
            f12 = f4;
            f14 = f17;
            iM26053d = i4;
            i2 = i5;
            iM26053d2 = i;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            int i6 = ((C8404Uz0) it.next()).f12271a;
            SizeF sizeFM26056g2 = this.f12900a.f45940g.m26056g(i6);
            float width6 = sizeFM26056g2.getWidth() * 0.3f;
            float height6 = sizeFM26056g2.getHeight() * 0.3f;
            C8071Oo1 c8071Oo1 = this.f12900a.f45937d;
            RectF rectF = this.f12908i;
            c8071Oo1.getClass();
            C7988Mz0 c7988Mz0 = new C7988Mz0(i6, null, rectF, true, 0);
            synchronized (((ArrayList) c8071Oo1.f8629c)) {
                try {
                    Iterator it2 = ((ArrayList) c8071Oo1.f8629c).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((C7988Mz0) it2.next()).equals(c7988Mz0)) {
                                break;
                            }
                        } else {
                            C11891zA0 c11891zA02 = this.f12900a;
                            c11891zA02.f45948o.m17989a(i6, width6, height6, this.f12908i, true, 0, c11891zA02.f45924D);
                            break;
                        }
                    }
                } finally {
                }
            }
        }
        int iM8645a = 0;
        for (C8404Uz0 c8404Uz02 : linkedList) {
            C11649xG0 c11649xG04 = c8404Uz02.f12272b;
            float f22 = 1.0f / c11649xG04.f45509c;
            this.f12904e = f22;
            float f23 = 1.0f / c11649xG04.f45508b;
            this.f12905f = f23;
            this.f12906g = 256.0f / f22;
            this.f12907h = 256.0f / f23;
            int i7 = c8404Uz02.f12271a;
            C11649xG0 c11649xG05 = c8404Uz02.f12273c;
            int i8 = c11649xG05.f45508b;
            C11649xG0 c11649xG06 = c8404Uz02.f12274d;
            iM8645a += m8645a(i7, i8, c11649xG06.f45508b, c11649xG05.f45509c, c11649xG06.f45509c, 120 - iM8645a);
            if (iM8645a >= 120) {
                return;
            }
        }
    }
}
