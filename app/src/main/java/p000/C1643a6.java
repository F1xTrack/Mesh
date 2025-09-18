package p000;

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

/* renamed from: a6 */
/* loaded from: classes.dex */
public final class C1643a6 implements InterfaceC7516Dx0 {

    /* renamed from: a */
    public final /* synthetic */ int f15308a;

    /* renamed from: b */
    public final /* synthetic */ Object f15309b;

    public /* synthetic */ C1643a6(int i, Object obj) {
        this.f15308a = i;
        this.f15309b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC7516Dx0
    /* renamed from: k */
    public final C8433Vn1 mo1953k(View view, C8433Vn1 c8433Vn1) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        boolean z2;
        C8433Vn1 c8433Vn1M8556f = c8433Vn1;
        Object obj = this.f15309b;
        switch (this.f15308a) {
            case 0:
                C4032f6 c4032f6 = (C4032f6) obj;
                c4032f6.getClass();
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                C8433Vn1 c8433Vn12 = c4032f6.getFitsSystemWindows() ? c8433Vn1M8556f : null;
                if (!Objects.equals(c4032f6.f27057g, c8433Vn12)) {
                    c4032f6.f27057g = c8433Vn12;
                    if (c4032f6.f27071u != null && c4032f6.getTopInset() > 0) {
                        i = 1;
                    }
                    c4032f6.setWillNotDraw(i ^ 1);
                    c4032f6.requestLayout();
                }
                return c8433Vn1M8556f;
            case 1:
                int iM8555d = c8433Vn1.m8555d();
                LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) obj;
                layoutInflaterFactory2C0448H6.getClass();
                int iM8555d2 = c8433Vn1.m8555d();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0448H6.f4104v;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    z = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0448H6.f4104v.getLayoutParams();
                    if (layoutInflaterFactory2C0448H6.f4104v.isShown()) {
                        if (layoutInflaterFactory2C0448H6.f4087c0 == null) {
                            layoutInflaterFactory2C0448H6.f4087c0 = new Rect();
                            layoutInflaterFactory2C0448H6.f4088d0 = new Rect();
                        }
                        Rect rect = layoutInflaterFactory2C0448H6.f4087c0;
                        Rect rect2 = layoutInflaterFactory2C0448H6.f4088d0;
                        rect.set(c8433Vn1.m8553b(), c8433Vn1.m8555d(), c8433Vn1.m8554c(), c8433Vn1.m8552a());
                        ViewGroup viewGroup = layoutInflaterFactory2C0448H6.f4059A;
                        if (Build.VERSION.SDK_INT >= 29) {
                            boolean z3 = AbstractC7337Al1.f354a;
                            AbstractC11839yl1.m26220a(viewGroup, rect, rect2);
                        } else {
                            if (!AbstractC7337Al1.f354a) {
                                AbstractC7337Al1.f354a = true;
                                try {
                                    Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    AbstractC7337Al1.f355b = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        AbstractC7337Al1.f355b.setAccessible(true);
                                    }
                                } catch (NoSuchMethodException unused) {
                                }
                            }
                            Method method = AbstractC7337Al1.f355b;
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
                        ViewGroup viewGroup2 = layoutInflaterFactory2C0448H6.f4059A;
                        WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                        C8433Vn1 c8433Vn1M18871a = AbstractC9664hk1.m18871a(viewGroup2);
                        int iM8553b = c8433Vn1M18871a == null ? 0 : c8433Vn1M18871a.m8553b();
                        int iM8554c = c8433Vn1M18871a == null ? 0 : c8433Vn1M18871a.m8554c();
                        if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                            z2 = false;
                        } else {
                            marginLayoutParams.topMargin = i;
                            marginLayoutParams.leftMargin = i2;
                            marginLayoutParams.rightMargin = i3;
                            z2 = true;
                        }
                        Context context = layoutInflaterFactory2C0448H6.f4091k;
                        if (i <= 0 || layoutInflaterFactory2C0448H6.f4061C != null) {
                            View view2 = layoutInflaterFactory2C0448H6.f4061C;
                            if (view2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                int i4 = marginLayoutParams2.height;
                                int i5 = marginLayoutParams.topMargin;
                                if (i4 != i5 || marginLayoutParams2.leftMargin != iM8553b || marginLayoutParams2.rightMargin != iM8554c) {
                                    marginLayoutParams2.height = i5;
                                    marginLayoutParams2.leftMargin = iM8553b;
                                    marginLayoutParams2.rightMargin = iM8554c;
                                    layoutInflaterFactory2C0448H6.f4061C.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view3 = new View(context);
                            layoutInflaterFactory2C0448H6.f4061C = view3;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = iM8553b;
                            layoutParams.rightMargin = iM8554c;
                            layoutInflaterFactory2C0448H6.f4059A.addView(layoutInflaterFactory2C0448H6.f4061C, -1, layoutParams);
                        }
                        View view4 = layoutInflaterFactory2C0448H6.f4061C;
                        z = view4 != null;
                        if (z && view4.getVisibility() != 0) {
                            View view5 = layoutInflaterFactory2C0448H6.f4061C;
                            view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? AbstractC0691Ky.m4783a(context, R.color.abc_decor_view_status_guard_light) : AbstractC0691Ky.m4783a(context, R.color.abc_decor_view_status_guard));
                        }
                        if (!layoutInflaterFactory2C0448H6.f4066H && z) {
                            iM8555d2 = 0;
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
                        layoutInflaterFactory2C0448H6.f4104v.setLayoutParams(marginLayoutParams);
                    }
                }
                View view6 = layoutInflaterFactory2C0448H6.f4061C;
                if (view6 != null) {
                    view6.setVisibility(z ? 0 : 8);
                }
                if (iM8555d != iM8555d2) {
                    c8433Vn1M8556f = c8433Vn1M8556f.m8556f(c8433Vn1.m8553b(), iM8555d2, c8433Vn1.m8554c(), c8433Vn1.m8552a());
                }
                return AbstractC10944rk1.m24477i(view, c8433Vn1M8556f);
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!Objects.equals(coordinatorLayout.f16083m, c8433Vn1M8556f)) {
                    coordinatorLayout.f16083m = c8433Vn1M8556f;
                    boolean z4 = c8433Vn1.m8555d() > 0;
                    coordinatorLayout.f16084n = z4;
                    coordinatorLayout.setWillNotDraw(!z4 && coordinatorLayout.getBackground() == null);
                    C8277Sn1 c8277Sn1 = c8433Vn1M8556f.f12756a;
                    if (!c8277Sn1.mo6142m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap3 = AbstractC10944rk1.f41842a;
                            if (!childAt.getFitsSystemWindows() || ((C6588oz) childAt.getLayoutParams()).f39405a == null || !c8277Sn1.mo6142m()) {
                                i++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return c8433Vn1M8556f;
        }
    }
}
