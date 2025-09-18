package p000;

import android.R;
import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class T00 {

    /* renamed from: l */
    public static final PointF f11087l = new PointF();

    /* renamed from: m */
    public static final float[] f11088m = new float[2];

    /* renamed from: n */
    public static final Matrix f11089n = new Matrix();

    /* renamed from: o */
    public static final float[] f11090o = new float[2];

    /* renamed from: p */
    public static final C0295Eg f11091p = new C0295Eg(14);

    /* renamed from: a */
    public final PH0 f11092a;

    /* renamed from: b */
    public final MH0 f11093b;

    /* renamed from: c */
    public float f11094c;

    /* renamed from: d */
    public final ArrayList f11095d;

    /* renamed from: e */
    public final ArrayList f11096e;

    /* renamed from: f */
    public final ArrayList f11097f;

    /* renamed from: g */
    public final HashSet f11098g;

    /* renamed from: h */
    public boolean f11099h;

    /* renamed from: i */
    public int f11100i;

    /* renamed from: j */
    public boolean f11101j;

    /* renamed from: k */
    public int f11102k;

    public T00(PH0 ph0, MH0 mh0, OJ1 oj1) {
        O90.m5968f(mh0, "handlerRegistry");
        this.f11092a = ph0;
        this.f11093b = mh0;
        this.f11095d = new ArrayList();
        this.f11096e = new ArrayList();
        this.f11097f = new ArrayList();
        this.f11098g = new HashSet();
    }

    /* renamed from: a */
    public final void m7507a() {
        ArrayList arrayList = this.f11096e;
        for (R00 r00 : AbstractC7167xu.m25982b0(arrayList)) {
            if (!r00.f9898H) {
                arrayList.remove(r00);
                this.f11098g.remove(Integer.valueOf(r00.f9903d));
            }
        }
    }

    /* renamed from: b */
    public final void m7508b() {
        ArrayList arrayList = this.f11095d;
        O90.m5968f(arrayList, "<this>");
        Iterator it = new C9501gT0(arrayList).iterator();
        while (true) {
            ListIterator listIterator = ((C9373fT0) it).f27211b;
            if (!listIterator.hasPrevious()) {
                AbstractC0246Du.m1924q(arrayList, C6228jI.f35020B);
                this.f11101j = false;
                return;
            }
            R00 r00 = (R00) listIterator.previous();
            if (NV1.m5732l(r00.f9905f) && !r00.f9898H) {
                r00.f9904e = null;
                r00.f9891A = null;
                Arrays.fill(r00.f9900a, -1);
                r00.f9901b = 0;
                r00.f9914o = 0;
                Q00[] q00Arr = r00.f9915p;
                AbstractC0576J8.m4184k(q00Arr, 0, q00Arr.length);
                r00.f9913n = 0;
                r00.mo723x();
                r00.f9897G = false;
                r00.f9898H = false;
                r00.f9896F = Integer.MAX_VALUE;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* renamed from: c */
    public final boolean m7509c(View view, float[] fArr, int i) {
        boolean z = false;
        for (ViewGroup parent = view.getParent(); parent != 0; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = parent;
                ArrayList arrayListM5293f = this.f11093b.m5293f(parent);
                if (arrayListM5293f != null) {
                    synchronized (arrayListM5293f) {
                        Iterator it = arrayListM5293f.iterator();
                        while (it.hasNext()) {
                            R00 r00 = (R00) it.next();
                            if (r00.f9909j && r00.m6868r(view, fArr[0], fArr[1])) {
                                m7511e(r00, viewGroup);
                                r00.m6852G(i);
                                z = true;
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b1  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m7510d(android.view.ViewGroup r10, float[] r11, int r12, android.view.MotionEvent r13) {
        /*
            r9 = this;
            int r0 = r10.getChildCount()
            r1 = 1
            int r0 = r0 - r1
        L6:
            r2 = -1
            r3 = 0
            if (r2 >= r0) goto Ld0
            android.view.View r2 = p000.OJ1.m6012i(r10, r0)
            int r4 = r2.getVisibility()
            if (r4 != 0) goto Lcc
            float r4 = r2.getAlpha()
            float r5 = r9.f11094c
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto Lcc
            android.graphics.PointF r4 = p000.T00.f11087l
            r5 = r11[r3]
            r6 = r11[r1]
            int r7 = r10.getScrollX()
            float r7 = (float) r7
            float r5 = r5 + r7
            int r7 = r2.getLeft()
            float r7 = (float) r7
            float r5 = r5 - r7
            int r7 = r10.getScrollY()
            float r7 = (float) r7
            float r6 = r6 + r7
            int r7 = r2.getTop()
            float r7 = (float) r7
            float r6 = r6 - r7
            android.graphics.Matrix r7 = r2.getMatrix()
            boolean r8 = r7.isIdentity()
            if (r8 != 0) goto L58
            float[] r8 = p000.T00.f11088m
            r8[r3] = r5
            r8[r1] = r6
            android.graphics.Matrix r5 = p000.T00.f11089n
            r7.invert(r5)
            r5.mapPoints(r8)
            r5 = r8[r3]
            r6 = r8[r1]
        L58:
            r4.set(r5, r6)
            r5 = r11[r3]
            r6 = r11[r1]
            float r7 = r4.x
            r11[r3] = r7
            float r4 = r4.y
            r11[r1] = r4
            boolean r4 = r2 instanceof android.view.ViewGroup
            if (r4 == 0) goto Lb1
            r4 = r2
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            boolean r7 = r4.getClipChildren()
            if (r7 == 0) goto L76
        L74:
            r4 = r1
            goto Lac
        L76:
            boolean r7 = r4 instanceof p000.ViewGroupOnHierarchyChangeListenerC10767qM0
            java.lang.String r8 = "visible"
            if (r7 == 0) goto L8b
            qM0 r4 = (p000.ViewGroupOnHierarchyChangeListenerC10767qM0) r4
            java.lang.String r4 = r4.getOverflow()
            boolean r4 = p000.O90.m5963a(r4, r8)
            if (r4 != 0) goto L89
            goto L74
        L89:
            r4 = r3
            goto Lac
        L8b:
            boolean r7 = r4 instanceof p000.BK0
            if (r7 == 0) goto L9c
            BK0 r4 = (p000.BK0) r4
            java.lang.String r4 = r4.getOverflow()
            boolean r4 = p000.O90.m5963a(r4, r8)
            if (r4 != 0) goto L89
            goto L74
        L9c:
            boolean r7 = r4 instanceof com.facebook.react.views.view.C1932a
            if (r7 == 0) goto L89
            com.facebook.react.views.view.a r4 = (com.facebook.react.views.view.C1932a) r4
            java.lang.String r4 = r4.getOverflow()
            java.lang.String r7 = "hidden"
            boolean r4 = p000.O90.m5963a(r4, r7)
        Lac:
            if (r4 == 0) goto Laf
            goto Lb1
        Laf:
            r4 = r3
            goto Lb2
        Lb1:
            r4 = r1
        Lb2:
            if (r4 == 0) goto Lc1
            r4 = r11[r3]
            r7 = r11[r1]
            boolean r4 = p000.NV1.m5740v(r2, r4, r7)
            if (r4 == 0) goto Lbf
            goto Lc1
        Lbf:
            r2 = r3
            goto Lc5
        Lc1:
            boolean r2 = r9.m7515i(r2, r11, r12, r13)
        Lc5:
            r11[r3] = r5
            r11[r1] = r6
            if (r2 == 0) goto Lcc
            return r1
        Lcc:
            int r0 = r0 + (-1)
            goto L6
        Ld0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.T00.m7510d(android.view.ViewGroup, float[], int, android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    public final void m7511e(R00 r00, View view) {
        ArrayList arrayList = this.f11095d;
        if (arrayList.contains(r00)) {
            return;
        }
        arrayList.add(r00);
        r00.f9897G = false;
        r00.f9898H = false;
        r00.f9896F = Integer.MAX_VALUE;
        if (r00.f9904e != null || r00.f9891A != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(r00.f9900a, -1);
        r00.f9901b = 0;
        r00.f9905f = 0;
        r00.f9904e = view;
        r00.f9891A = this;
        Activity activityM6849n = R00.m6849n(view.getContext());
        View viewFindViewById = activityM6849n != null ? activityM6849n.findViewById(R.id.content) : null;
        int[] iArr = r00.f9902c;
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(iArr);
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        r00.mo6870w();
    }

    /* renamed from: f */
    public final boolean m7512f(View view, float[] fArr, int i, MotionEvent motionEvent) {
        boolean z;
        ArrayList arrayListM5293f = this.f11093b.m5293f(view);
        if (arrayListM5293f != null) {
            synchronized (arrayListM5293f) {
                try {
                    Iterator it = arrayListM5293f.iterator();
                    z = false;
                    while (it.hasNext()) {
                        R00 r00 = (R00) it.next();
                        if (r00.f9909j && r00.m6868r(view, fArr[0], fArr[1]) && (!AbstractC7230yu.m26275f(10, 9, 7).contains(Integer.valueOf(motionEvent.getAction())) || (r00 instanceof N30))) {
                            m7511e(r00, view);
                            r00.m6852G(i);
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            z = false;
        }
        float width = view.getWidth();
        float f = fArr[0];
        if (0.0f <= f && f <= width) {
            float height = view.getHeight();
            float f2 = fArr[1];
            if (0.0f <= f2 && f2 <= height) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup ? (ViewGroup) parent : null) != null) {
                    Matrix matrix = view.getMatrix();
                    float[] fArr2 = f11088m;
                    fArr2[0] = 0.0f;
                    fArr2[1] = 0.0f;
                    matrix.mapPoints(fArr2);
                    float left = fArr2[0] + view.getLeft();
                    float top = fArr2[1] + view.getTop();
                    if ((left < 0.0f || left + view.getWidth() > r14.getWidth() || top < 0.0f || top + view.getHeight() > r14.getHeight()) && m7509c(view, fArr, i)) {
                        return true;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: g */
    public final void m7513g(View view, MotionEvent motionEvent) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!O90.m5963a(viewGroup, this.f11092a)) {
            m7513g(viewGroup, motionEvent);
        }
        if (viewGroup != null) {
            motionEvent.setLocation((motionEvent.getX() + viewGroup.getScrollX()) - view.getLeft(), (motionEvent.getY() + viewGroup.getScrollY()) - view.getTop());
        }
        if (view.getMatrix().isIdentity()) {
            return;
        }
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = f11089n;
        matrix.invert(matrix2);
        motionEvent.transform(matrix2);
    }

    /* renamed from: h */
    public final void m7514h(View view, PointF pointF) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!O90.m5963a(viewGroup, this.f11092a)) {
            m7514h(viewGroup, pointF);
        }
        if (viewGroup != null) {
            pointF.x += viewGroup.getScrollX() - view.getLeft();
            pointF.y += viewGroup.getScrollY() - view.getTop();
        }
        if (view.getMatrix().isIdentity()) {
            return;
        }
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = f11089n;
        matrix.invert(matrix2);
        float f = pointF.x;
        float[] fArr = f11090o;
        fArr[0] = f;
        fArr[1] = pointF.y;
        matrix2.mapPoints(fArr);
        pointF.x = fArr[0];
        pointF.y = fArr[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0028  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m7515i(android.view.View r6, float[] r7, int r8, android.view.MotionEvent r9) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.InterfaceC9743iM0
            if (r0 == 0) goto Lf
            r0 = r6
            iM0 r0 = (p000.InterfaceC9743iM0) r0
            XB0 r0 = r0.getPointerEvents()
            p000.O90.m5965c(r0)
            goto L11
        Lf:
            XB0 r0 = p000.XB0.f13610e
        L11:
            boolean r1 = r6.isEnabled()
            r2 = 1
            r3 = 3
            r4 = 2
            if (r1 != 0) goto L28
            XB0 r1 = p000.XB0.f13610e
            if (r0 != r1) goto L21
            YB0 r0 = p000.YB0.f14198b
            goto L45
        L21:
            XB0 r1 = p000.XB0.f13609d
            if (r0 != r1) goto L28
            YB0 r0 = p000.YB0.f14197a
            goto L45
        L28:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L43
            if (r0 == r2) goto L40
            if (r0 == r4) goto L3d
            if (r0 != r3) goto L37
            YB0 r0 = p000.YB0.f14200d
            goto L45
        L37:
            sg r6 = new sg
            r6.<init>()
            throw r6
        L3d:
            YB0 r0 = p000.YB0.f14199c
            goto L45
        L40:
            YB0 r0 = p000.YB0.f14198b
            goto L45
        L43:
            YB0 r0 = p000.YB0.f14197a
        L45:
            int r0 = r0.ordinal()
            r1 = 0
            if (r0 == 0) goto L7a
            if (r0 == r2) goto L9d
            if (r0 == r4) goto L82
            if (r0 != r3) goto L7c
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L5e
            r3 = r6
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            boolean r3 = r5.m7510d(r3, r7, r8, r9)
            goto L5f
        L5e:
            r3 = r1
        L5f:
            boolean r8 = r5.m7512f(r6, r7, r8, r9)
            if (r8 != 0) goto Lb6
            if (r3 != 0) goto Lb6
            if (r0 == 0) goto L6f
            android.graphics.drawable.Drawable r8 = r6.getBackground()
            if (r8 == 0) goto L7a
        L6f:
            r8 = r7[r1]
            r7 = r7[r2]
            boolean r6 = p000.NV1.m5740v(r6, r8, r7)
            if (r6 == 0) goto L7a
            goto Lb6
        L7a:
            r2 = r1
            goto Lb6
        L7c:
            sg r6 = new sg
            r6.<init>()
            throw r6
        L82:
            boolean r8 = r5.m7512f(r6, r7, r8, r9)
            if (r8 != 0) goto Lb6
            boolean r8 = r6 instanceof android.view.ViewGroup
            if (r8 == 0) goto L92
            android.graphics.drawable.Drawable r8 = r6.getBackground()
            if (r8 == 0) goto L7a
        L92:
            r8 = r7[r1]
            r7 = r7[r2]
            boolean r6 = p000.NV1.m5740v(r6, r8, r7)
            if (r6 == 0) goto L7a
            goto Lb6
        L9d:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lae
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r2 = r5.m7510d(r0, r7, r8, r9)
            if (r2 == 0) goto Lb6
            r5.m7512f(r6, r7, r8, r9)
            goto Lb6
        Lae:
            boolean r0 = r6 instanceof android.widget.EditText
            if (r0 == 0) goto L7a
            boolean r2 = r5.m7512f(r6, r7, r8, r9)
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.T00.m7515i(android.view.View, float[], int, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x006f, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x010d A[EDGE_INSN: B:222:0x010d->B:204:0x010d BREAK  A[LOOP:0: B:199:0x00f2->B:224:0x00f2], SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7516j(p000.R00 r10) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.T00.m7516j(R00):void");
    }
}
