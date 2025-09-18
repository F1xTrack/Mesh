package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: a6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2070a6 implements InterfaceC0324Dx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2070a6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC0324Dx0
    public final C1698Vn1 k(View view, C1698Vn1 c1698Vn1) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        boolean z2;
        C1698Vn1 c1698Vn1F = c1698Vn1;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                C3708f6 c3708f6 = (C3708f6) obj;
                c3708f6.getClass();
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                C1698Vn1 c1698Vn12 = c3708f6.getFitsSystemWindows() ? c1698Vn1F : null;
                if (!Objects.equals(c3708f6.g, c1698Vn12)) {
                    c3708f6.g = c1698Vn12;
                    if (c3708f6.u != null && c3708f6.getTopInset() > 0) {
                        i = 1;
                    }
                    c3708f6.setWillNotDraw(i ^ 1);
                    c3708f6.requestLayout();
                }
                return c1698Vn1F;
            case 1:
                int iD = c1698Vn1.d();
                H6 h6 = (H6) obj;
                h6.getClass();
                int iD2 = c1698Vn1.d();
                ActionBarContextView actionBarContextView = h6.v;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    z = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) h6.v.getLayoutParams();
                    if (h6.v.isShown()) {
                        if (h6.c0 == null) {
                            h6.c0 = new Rect();
                            h6.d0 = new Rect();
                        }
                        Rect rect = h6.c0;
                        Rect rect2 = h6.d0;
                        rect.set(c1698Vn1.b(), c1698Vn1.d(), c1698Vn1.c(), c1698Vn1.a());
                        ViewGroup viewGroup = h6.A;
                        if (Build.VERSION.SDK_INT >= 29) {
                            boolean z3 = AbstractC0055Al1.a;
                            AbstractC8234yl1.a(viewGroup, rect, rect2);
                        } else {
                            if (!AbstractC0055Al1.a) {
                                AbstractC0055Al1.a = true;
                                try {
                                    Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    AbstractC0055Al1.b = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        AbstractC0055Al1.b.setAccessible(true);
                                    }
                                } catch (NoSuchMethodException unused) {
                                }
                            }
                            Method method = AbstractC0055Al1.b;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup, rect, rect2);
                                } catch (Exception unused2) {
                                }
                            }
                        }
                        int i = rect.top;
                        int i2 = rect.left;
                        int i3 = rect.right;
                        ViewGroup viewGroup2 = h6.A;
                        WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
                        C1698Vn1 c1698Vn1A = AbstractC4212hk1.a(viewGroup2);
                        int iB = c1698Vn1A == null ? 0 : c1698Vn1A.b();
                        int iC = c1698Vn1A == null ? 0 : c1698Vn1A.c();
                        if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                            z2 = false;
                        } else {
                            marginLayoutParams.topMargin = i;
                            marginLayoutParams.leftMargin = i2;
                            marginLayoutParams.rightMargin = i3;
                            z2 = true;
                        }
                        Context context = h6.k;
                        if (i <= 0 || h6.C != null) {
                            View view2 = h6.C;
                            if (view2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                int i4 = marginLayoutParams2.height;
                                int i5 = marginLayoutParams.topMargin;
                                if (i4 != i5 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                                    marginLayoutParams2.height = i5;
                                    marginLayoutParams2.leftMargin = iB;
                                    marginLayoutParams2.rightMargin = iC;
                                    h6.C.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view3 = new View(context);
                            h6.C = view3;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = iB;
                            layoutParams.rightMargin = iC;
                            h6.A.addView(h6.C, -1, layoutParams);
                        }
                        View view4 = h6.C;
                        z = view4 != null;
                        if (z && view4.getVisibility() != 0) {
                            View view5 = h6.C;
                            view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? AbstractC0872Ky.a(context, R.color.abc_decor_view_status_guard_light) : AbstractC0872Ky.a(context, R.color.abc_decor_view_status_guard));
                        }
                        if (!h6.H && z) {
                            iD2 = 0;
                        }
                        z = z;
                        z = z2;
                    } else if (marginLayoutParams.topMargin != 0) {
                        marginLayoutParams.topMargin = 0;
                        z = false;
                    } else {
                        z = false;
                        z = false;
                    }
                    if (z) {
                        h6.v.setLayoutParams(marginLayoutParams);
                    }
                }
                View view6 = h6.C;
                if (view6 != null) {
                    view6.setVisibility(z ? 0 : 8);
                }
                if (iD != iD2) {
                    c1698Vn1F = c1698Vn1F.f(c1698Vn1.b(), iD2, c1698Vn1.c(), c1698Vn1.a());
                }
                return AbstractC6897rk1.i(view, c1698Vn1F);
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!Objects.equals(coordinatorLayout.m, c1698Vn1F)) {
                    coordinatorLayout.m = c1698Vn1F;
                    boolean z4 = c1698Vn1.d() > 0;
                    coordinatorLayout.n = z4;
                    coordinatorLayout.setWillNotDraw(!z4 && coordinatorLayout.getBackground() == null);
                    C1464Sn1 c1464Sn1 = c1698Vn1F.a;
                    if (!c1464Sn1.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap3 = AbstractC6897rk1.a;
                            if (!childAt.getFitsSystemWindows() || ((C6368oz) childAt.getLayoutParams()).a == null || !c1464Sn1.m()) {
                                i++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return c1698Vn1F;
        }
    }
}
