package defpackage;

import android.graphics.RectF;
import android.util.SizeF;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/* renamed from: Vz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1733Vz0 {
    public final C8312zA0 a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public final RectF i = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public final int j;

    public C1733Vz0(C8312zA0 c8312zA0) {
        this.a = c8312zA0;
        this.j = (int) TypedValue.applyDimension(1, 20, c8312zA0.getContext().getResources().getDisplayMetrics());
    }

    public final int a(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        C1031Mz0 c1031Mz0;
        C1031Mz0 c1031Mz02;
        boolean z2;
        int i7 = 0;
        for (int i8 = i2; i8 <= i3; i8++) {
            for (int i9 = i4; i9 <= i5; i9++) {
                float f = this.e;
                float f2 = this.f;
                float f3 = i9 * f;
                float f4 = i8 * f2;
                float f5 = this.g;
                float f6 = this.h;
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
                    C1155Oo1 c1155Oo1 = this.a.d;
                    int i10 = this.b;
                    c1155Oo1.getClass();
                    C1031Mz0 c1031Mz03 = new C1031Mz0(i, null, rectF, false, 0);
                    synchronized (c1155Oo1.d) {
                        try {
                            Iterator it = ((PriorityQueue) c1155Oo1.a).iterator();
                            while (true) {
                                c1031Mz0 = null;
                                if (!it.hasNext()) {
                                    c1031Mz02 = null;
                                    break;
                                }
                                c1031Mz02 = (C1031Mz0) it.next();
                                if (c1031Mz02.equals(c1031Mz03)) {
                                    break;
                                }
                            }
                            z = true;
                            if (c1031Mz02 != null) {
                                ((PriorityQueue) c1155Oo1.a).remove(c1031Mz02);
                                c1031Mz02.e = i10;
                                ((PriorityQueue) c1155Oo1.b).offer(c1031Mz02);
                                z2 = true;
                            } else {
                                Iterator it2 = ((PriorityQueue) c1155Oo1.b).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    C1031Mz0 c1031Mz04 = (C1031Mz0) it2.next();
                                    if (c1031Mz04.equals(c1031Mz03)) {
                                        c1031Mz0 = c1031Mz04;
                                        break;
                                    }
                                }
                                z2 = c1031Mz0 != null;
                            }
                        } finally {
                        }
                    }
                    if (!z2) {
                        C8312zA0 c8312zA0 = this.a;
                        c8312zA0.o.a(i, f7, f8, rectF, false, this.b, c8312zA0.D);
                    }
                    this.b++;
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

    public final void b() {
        float f;
        float f2;
        float f3;
        float width;
        float height;
        float f4;
        float f5;
        float f6;
        int i;
        boolean z;
        float width2;
        float height2;
        this.b = 1;
        float currentXOffset = this.a.getCurrentXOffset();
        if (currentXOffset > 0.0f) {
            currentXOffset = 0.0f;
        }
        this.c = -currentXOffset;
        float currentYOffset = this.a.getCurrentYOffset();
        if (currentYOffset > 0.0f) {
            currentYOffset = 0.0f;
        }
        this.d = -currentYOffset;
        float f7 = this.j;
        float f8 = -this.c;
        float f9 = f8 + f7;
        float width3 = (f8 - this.a.getWidth()) - f7;
        float f10 = -this.d;
        float f11 = f10 + f7;
        float height3 = (f10 - this.a.getHeight()) - f7;
        if (f9 > 0.0f) {
            f9 = 0.0f;
        }
        float f12 = -f9;
        if (f11 > 0.0f) {
            f11 = 0.0f;
        }
        float f13 = -f11;
        if (width3 > 0.0f) {
            width3 = 0.0f;
        }
        float f14 = -width3;
        if (height3 > 0.0f) {
            height3 = 0.0f;
        }
        float f15 = -height3;
        C8312zA0 c8312zA0 = this.a;
        boolean z2 = c8312zA0.x;
        float f16 = z2 ? f13 : f12;
        float f17 = z2 ? f15 : f14;
        int iD = c8312zA0.g.d(f16, c8312zA0.getZoom());
        int iD2 = c8312zA0.g.d(f17, c8312zA0.getZoom());
        int i2 = (iD2 - iD) + 1;
        LinkedList<C1655Uz0> linkedList = new LinkedList();
        int i3 = iD;
        while (i3 <= iD2) {
            C1655Uz0 c1655Uz0 = new C1655Uz0();
            C7950xG0 c7950xG0 = new C7950xG0(7);
            c1655Uz0.b = c7950xG0;
            C7950xG0 c7950xG02 = new C7950xG0(8);
            c1655Uz0.c = c7950xG02;
            C7950xG0 c7950xG03 = new C7950xG0(8);
            c1655Uz0.d = c7950xG03;
            c1655Uz0.a = i3;
            if (i3 != iD) {
                f = f12;
                f2 = f14;
                if (i3 == iD2) {
                    f3 = c8312zA0.g.f(c8312zA0.getZoom(), i3);
                    if (c8312zA0.x) {
                        f6 = f3;
                        f3 = f;
                    } else {
                        f6 = f13;
                    }
                    f4 = f6;
                    f5 = f13;
                    height = f15;
                } else {
                    f3 = c8312zA0.g.f(c8312zA0.getZoom(), i3);
                    SizeF sizeFH = c8312zA0.g.h(c8312zA0.getZoom(), i3);
                    if (c8312zA0.x) {
                        height = sizeFH.getHeight() + f3;
                        f4 = f3;
                        f5 = f13;
                        f3 = f;
                    } else {
                        width = sizeFH.getWidth() + f3;
                        f4 = f13;
                        f5 = f4;
                        height = f15;
                    }
                }
                width = f2;
            } else if (i2 == 1) {
                f3 = f12;
                f = f3;
                f2 = f14;
                width = f2;
                f4 = f13;
                f5 = f4;
                height = f15;
            } else {
                f = f12;
                float f18 = c8312zA0.g.f(c8312zA0.getZoom(), i3);
                f2 = f14;
                SizeF sizeFH2 = c8312zA0.g.h(c8312zA0.getZoom(), i3);
                if (c8312zA0.x) {
                    height2 = sizeFH2.getHeight() + f18;
                    width2 = f2;
                } else {
                    width2 = sizeFH2.getWidth() + f18;
                    height2 = f15;
                }
                width = width2;
                f4 = f13;
                f5 = f4;
                height = height2;
                f3 = f;
            }
            float f19 = f15;
            SizeF sizeFG = c8312zA0.g.g(c1655Uz0.a);
            float width4 = 1.0f / sizeFG.getWidth();
            float height4 = ((1.0f / sizeFG.getHeight()) * 256.0f) / c8312zA0.getZoom();
            float zoom = (width4 * 256.0f) / c8312zA0.getZoom();
            int i4 = iD;
            int i5 = i2;
            c7950xG0.b = ((int) ((1.0f / height4) + 16384.999999999996d)) - 16384;
            c7950xG0.c = ((int) ((1.0f / zoom) + 16384.999999999996d)) - 16384;
            SizeF sizeFH3 = c8312zA0.g.h(c8312zA0.getZoom(), c1655Uz0.a);
            float height5 = sizeFH3.getHeight() / c7950xG0.b;
            float width5 = sizeFH3.getWidth() / c7950xG0.c;
            float fI = c8312zA0.g.i(c8312zA0.getZoom(), i3);
            if (c8312zA0.x) {
                i = iD2;
                c7950xG02.b = AbstractC1254Pv1.a(Math.abs(f4 - c8312zA0.g.f(c8312zA0.getZoom(), c1655Uz0.a)) / height5);
                float f20 = f3 - fI;
                if (f20 < 0.0f) {
                    f20 = 0.0f;
                }
                c7950xG02.c = AbstractC1254Pv1.a(f20 / width5);
                c7950xG03.b = ((int) ((Math.abs(height - c8312zA0.g.f(c8312zA0.getZoom(), c1655Uz0.a)) / height5) + 16384.999999999996d)) - 16384;
                float f21 = width - fI;
                if (f21 < 0.0f) {
                    f21 = 0.0f;
                }
                c7950xG03.c = AbstractC1254Pv1.a(f21 / width5);
                z = false;
            } else {
                i = iD2;
                c7950xG02.c = AbstractC1254Pv1.a(Math.abs(f3 - c8312zA0.g.f(c8312zA0.getZoom(), c1655Uz0.a)) / width5);
                float f22 = f4 - fI;
                if (f22 < 0.0f) {
                    f22 = 0.0f;
                }
                c7950xG02.b = AbstractC1254Pv1.a(f22 / height5);
                c7950xG03.c = AbstractC1254Pv1.a(Math.abs(width - c8312zA0.g.f(c8312zA0.getZoom(), c1655Uz0.a)) / width5);
                float f23 = height - fI;
                z = false;
                if (f23 < 0.0f) {
                    f23 = 0.0f;
                }
                c7950xG03.b = AbstractC1254Pv1.a(f23 / height5);
            }
            linkedList.add(c1655Uz0);
            i3++;
            f12 = f;
            f14 = f2;
            f13 = f5;
            f15 = f19;
            iD = i4;
            i2 = i5;
            iD2 = i;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            int i6 = ((C1655Uz0) it.next()).a;
            SizeF sizeFG2 = this.a.g.g(i6);
            float width6 = sizeFG2.getWidth() * 0.3f;
            float height6 = sizeFG2.getHeight() * 0.3f;
            C1155Oo1 c1155Oo1 = this.a.d;
            RectF rectF = this.i;
            c1155Oo1.getClass();
            C1031Mz0 c1031Mz0 = new C1031Mz0(i6, null, rectF, true, 0);
            synchronized (((ArrayList) c1155Oo1.c)) {
                try {
                    Iterator it2 = ((ArrayList) c1155Oo1.c).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((C1031Mz0) it2.next()).equals(c1031Mz0)) {
                                break;
                            }
                        } else {
                            C8312zA0 c8312zA02 = this.a;
                            c8312zA02.o.a(i6, width6, height6, this.i, true, 0, c8312zA02.D);
                            break;
                        }
                    }
                } finally {
                }
            }
        }
        int iA = 0;
        for (C1655Uz0 c1655Uz02 : linkedList) {
            C7950xG0 c7950xG04 = c1655Uz02.b;
            float f24 = 1.0f / c7950xG04.c;
            this.e = f24;
            float f25 = 1.0f / c7950xG04.b;
            this.f = f25;
            this.g = 256.0f / f24;
            this.h = 256.0f / f25;
            int i7 = c1655Uz02.a;
            C7950xG0 c7950xG05 = c1655Uz02.c;
            int i8 = c7950xG05.b;
            C7950xG0 c7950xG06 = c1655Uz02.d;
            iA += a(i7, i8, c7950xG06.b, c7950xG05.c, c7950xG06.c, 120 - iA);
            if (iA >= 120) {
                return;
            }
        }
    }
}
