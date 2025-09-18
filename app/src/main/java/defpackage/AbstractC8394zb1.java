package defpackage;

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
public abstract class AbstractC8394zb1 {
    public static final float[] a = new float[2];
    public static final PointF b = new PointF();
    public static final float[] c = new float[2];
    public static final Matrix d = new Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(float f, float f2, ViewGroup viewGroup, float[] fArr) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View viewC = c(fArr, viewGroup, null);
        View view = viewC;
        if (viewC == null) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.View b(float[] r12, android.view.View r13, java.util.EnumSet r14, java.util.ArrayList r15) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8394zb1.b(float[], android.view.View, java.util.EnumSet, java.util.ArrayList):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View c(float[] fArr, View view, ArrayList arrayList) {
        XB0 pointerEvents = view instanceof InterfaceC4330iM0 ? ((InterfaceC4330iM0) view).getPointerEvents() : XB0.e;
        if (!view.isEnabled()) {
            if (pointerEvents == XB0.e) {
                pointerEvents = XB0.c;
            } else if (pointerEvents == XB0.d) {
                pointerEvents = XB0.b;
            }
        }
        if (pointerEvents == XB0.b) {
            return null;
        }
        XB0 xb0 = XB0.d;
        EnumC8014xb1 enumC8014xb1 = EnumC8014xb1.a;
        if (pointerEvents == xb0) {
            View viewB = b(fArr, view, EnumSet.of(enumC8014xb1), arrayList);
            if (viewB != null && arrayList != null) {
                arrayList.add(new C8204yb1(view.getId(), view));
            }
            return viewB;
        }
        XB0 xb02 = XB0.c;
        EnumC8014xb1 enumC8014xb12 = EnumC8014xb1.b;
        if (pointerEvents == xb02) {
            View viewB2 = b(fArr, view, EnumSet.of(enumC8014xb12), arrayList);
            if (viewB2 != null) {
                if (arrayList != null) {
                    arrayList.add(new C8204yb1(view.getId(), view));
                }
                return viewB2;
            }
            if (!(view instanceof QJ0) || !d(view, fArr[0], fArr[1]) || ((QJ0) view).reactTagForTouch(fArr[0], fArr[1]) == view.getId()) {
                return null;
            }
            if (arrayList != null) {
                arrayList.add(new C8204yb1(view.getId(), view));
            }
            return view;
        }
        if (pointerEvents != XB0.e) {
            pointerEvents.toString();
            AbstractC3393dS.p("ReactNative");
        }
        if ((view instanceof RJ0) && d(view, fArr[0], fArr[1]) && ((RJ0) view).interceptsTouchEvent(fArr[0], fArr[1])) {
            if (arrayList != null) {
                arrayList.add(new C8204yb1(view.getId(), view));
            }
            return view;
        }
        View viewB3 = b(fArr, view, EnumSet.of(enumC8014xb1, enumC8014xb12), arrayList);
        if (viewB3 != null && arrayList != null) {
            arrayList.add(new C8204yb1(view.getId(), view));
        }
        return viewB3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(View view, float f, float f2) {
        if (view instanceof InterfaceC7962xK0) {
            InterfaceC7962xK0 interfaceC7962xK0 = (InterfaceC7962xK0) view;
            if (interfaceC7962xK0.getHitSlopRect() != null) {
                Rect hitSlopRect = interfaceC7962xK0.getHitSlopRect();
                return f >= ((float) (-hitSlopRect.left)) && f < ((float) (view.getWidth() + hitSlopRect.right)) && f2 >= ((float) (-hitSlopRect.top)) && f2 < ((float) (view.getHeight() + hitSlopRect.bottom));
            }
        }
        return f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }
}
