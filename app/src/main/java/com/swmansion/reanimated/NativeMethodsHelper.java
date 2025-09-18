package com.swmansion.reanimated;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import com.swmansion.reanimated.NativeMethodsHelper;
import p000.AbstractC11406vL1;
import p000.BK0;
import p000.PM0;
import p000.ViewGroupOnHierarchyChangeListenerC10767qM0;
import p000.YQ1;

/* loaded from: classes2.dex */
public class NativeMethodsHelper {
    private static void computeBoundingBox(View view, int[] iArr) {
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, rectF);
        iArr[0] = Math.round(rectF.left);
        iArr[1] = Math.round(rectF.top);
        iArr[2] = Math.round(rectF.right - rectF.left);
        iArr[3] = Math.round(rectF.bottom - rectF.top);
    }

    private static ViewGroupOnHierarchyChangeListenerC10767qM0 findScrollView(PM0 pm0) {
        for (int i = 0; i < pm0.getChildCount(); i++) {
            if (pm0.getChildAt(i) instanceof ViewGroupOnHierarchyChangeListenerC10767qM0) {
                return (ViewGroupOnHierarchyChangeListenerC10767qM0) pm0.getChildAt(i);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scrollTo$0(View view, int i, int i2) {
        ((BK0) view).smoothScrollTo(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scrollTo$1(View view, int i, int i2) {
        ((ViewGroupOnHierarchyChangeListenerC10767qM0) view).smoothScrollTo(i, i2);
    }

    private static void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public static float[] measure(View view) {
        View view2 = (View) YQ1.m9298b(view);
        if (view2 == null) {
            float[] fArr = new float[6];
            fArr[0] = -1234567.0f;
            return fArr;
        }
        int[] iArr = new int[4];
        computeBoundingBox(view2, iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        computeBoundingBox(view, iArr);
        iArr[0] = iArr[0] - i;
        iArr[1] = iArr[1] - i2;
        float[] fArr2 = new float[6];
        fArr2[0] = AbstractC11406vL1.m25402a(view.getLeft());
        fArr2[1] = AbstractC11406vL1.m25402a(view.getTop());
        for (int i3 = 2; i3 < 6; i3++) {
            fArr2[i3] = AbstractC11406vL1.m25402a(iArr[i3 - 2]);
        }
        return fArr2;
    }

    public static void scrollTo(final View view, double d, double d2, boolean z) {
        final int iRound = Math.round(AbstractC11406vL1.m25403b((float) d));
        final int iRound2 = Math.round(AbstractC11406vL1.m25403b((float) d2));
        boolean z2 = view instanceof BK0;
        if (!z2) {
            if (view instanceof PM0) {
                view = findScrollView((PM0) view);
            }
            if (!(view instanceof ViewGroupOnHierarchyChangeListenerC10767qM0)) {
                return;
            }
        }
        if (!z) {
            view.scrollTo(iRound, iRound2);
        } else if (z2) {
            final int i = 0;
            view.post(new Runnable() { // from class: ou0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            NativeMethodsHelper.lambda$scrollTo$0(view, iRound, iRound2);
                            break;
                        default:
                            NativeMethodsHelper.lambda$scrollTo$1(view, iRound, iRound2);
                            break;
                    }
                }
            });
        } else {
            final int i2 = 1;
            view.post(new Runnable() { // from class: ou0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            NativeMethodsHelper.lambda$scrollTo$0(view, iRound, iRound2);
                            break;
                        default:
                            NativeMethodsHelper.lambda$scrollTo$1(view, iRound, iRound2);
                            break;
                    }
                }
            });
        }
    }
}
