package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.EnumSet;

/* renamed from: zb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11946zb1 {

    /* renamed from: a */
    public static final float[] f46885a = new float[2];

    /* renamed from: b */
    public static final PointF f46886b = new PointF();

    /* renamed from: c */
    public static final float[] f46887c = new float[2];

    /* renamed from: d */
    public static final Matrix f46888d = new Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static int m26475a(float f, float f2, ViewGroup viewGroup, float[] fArr) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View viewM26477c = m26477c(fArr, viewGroup, null);
        View view = viewM26477c;
        if (viewM26477c == null) {
            return id;
        }
        while (view != 0 && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        if (view != 0) {
            return view instanceof QJ0 ? ((QJ0) view).reactTagForTouch(fArr[0], fArr[1]) : view.getId();
        }
        return id;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r6 < (r13.getHeight() - r4.bottom)) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.View m26476b(float[] r12, android.view.View r13, java.util.EnumSet r14, java.util.ArrayList r15) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11946zb1.m26476b(float[], android.view.View, java.util.EnumSet, java.util.ArrayList):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static View m26477c(float[] fArr, View view, ArrayList arrayList) {
        XB0 pointerEvents = view instanceof InterfaceC9743iM0 ? ((InterfaceC9743iM0) view).getPointerEvents() : XB0.f13610e;
        if (!view.isEnabled()) {
            if (pointerEvents == XB0.f13610e) {
                pointerEvents = XB0.f13608c;
            } else if (pointerEvents == XB0.f13609d) {
                pointerEvents = XB0.f13607b;
            }
        }
        if (pointerEvents == XB0.f13607b) {
            return null;
        }
        XB0 xb0 = XB0.f13609d;
        EnumC11692xb1 enumC11692xb1 = EnumC11692xb1.f45706a;
        if (pointerEvents == xb0) {
            View viewM26476b = m26476b(fArr, view, EnumSet.of(enumC11692xb1), arrayList);
            if (viewM26476b != null && arrayList != null) {
                arrayList.add(new C11819yb1(view.getId(), view));
            }
            return viewM26476b;
        }
        XB0 xb02 = XB0.f13608c;
        EnumC11692xb1 enumC11692xb12 = EnumC11692xb1.f45707b;
        if (pointerEvents == xb02) {
            View viewM26476b2 = m26476b(fArr, view, EnumSet.of(enumC11692xb12), arrayList);
            if (viewM26476b2 != null) {
                if (arrayList != null) {
                    arrayList.add(new C11819yb1(view.getId(), view));
                }
                return viewM26476b2;
            }
            if (!(view instanceof QJ0) || !m26478d(view, fArr[0], fArr[1]) || ((QJ0) view).reactTagForTouch(fArr[0], fArr[1]) == view.getId()) {
                return null;
            }
            if (arrayList != null) {
                arrayList.add(new C11819yb1(view.getId(), view));
            }
            return view;
        }
        if (pointerEvents != XB0.f13610e) {
            pointerEvents.toString();
            AbstractC3929dS.m17683p("ReactNative");
        }
        if ((view instanceof RJ0) && m26478d(view, fArr[0], fArr[1]) && ((RJ0) view).interceptsTouchEvent(fArr[0], fArr[1])) {
            if (arrayList != null) {
                arrayList.add(new C11819yb1(view.getId(), view));
            }
            return view;
        }
        View viewM26476b3 = m26476b(fArr, view, EnumSet.of(enumC11692xb1, enumC11692xb12), arrayList);
        if (viewM26476b3 != null && arrayList != null) {
            arrayList.add(new C11819yb1(view.getId(), view));
        }
        return viewM26476b3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static boolean m26478d(View view, float f, float f2) {
        if (view instanceof InterfaceC11657xK0) {
            InterfaceC11657xK0 interfaceC11657xK0 = (InterfaceC11657xK0) view;
            if (interfaceC11657xK0.getHitSlopRect() != null) {
                Rect hitSlopRect = interfaceC11657xK0.getHitSlopRect();
                return f >= ((float) (-hitSlopRect.left)) && f < ((float) (view.getWidth() + hitSlopRect.right)) && f2 >= ((float) (-hitSlopRect.top)) && f2 < ((float) (view.getHeight() + hitSlopRect.bottom));
            }
        }
        return f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }
}
