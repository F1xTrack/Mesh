package p000;

import android.view.View;
import android.view.ViewParent;

/* renamed from: nl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10434nl1 {
    /* renamed from: a */
    public static boolean m23215a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    /* renamed from: b */
    public static boolean m23216b(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    /* renamed from: c */
    public static void m23217c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    /* renamed from: d */
    public static void m23218d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    /* renamed from: e */
    public static void m23219e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    /* renamed from: f */
    public static boolean m23220f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    /* renamed from: g */
    public static void m23221g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
