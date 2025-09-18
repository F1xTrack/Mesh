package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: CY */
/* loaded from: classes.dex */
public abstract class AbstractC0161CY {
    /* renamed from: d */
    public static void m1206d(List list, View view) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (AbstractC9536gk1.m18616k(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) == childAt) {
                                break;
                            } else {
                                i4++;
                            }
                        } else if (AbstractC9536gk1.m18616k(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static void m1207g(View view, Rect rect) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: h */
    public static boolean m1208h(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo204a(View view, Object obj);

    /* renamed from: b */
    public abstract void mo205b(Object obj, ArrayList arrayList);

    /* renamed from: c */
    public abstract void mo206c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo207e(Object obj);

    /* renamed from: f */
    public abstract Object mo208f(Object obj);

    /* renamed from: i */
    public abstract Object mo209i(Object obj, Object obj2, Object obj3);

    /* renamed from: j */
    public abstract Object mo210j(Object obj, Object obj2);

    /* renamed from: k */
    public abstract void mo211k(Object obj, View view, ArrayList arrayList);

    /* renamed from: l */
    public abstract void mo212l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    /* renamed from: m */
    public abstract void mo213m(View view, Object obj);

    /* renamed from: n */
    public abstract void mo214n(Object obj, Rect rect);

    /* renamed from: o */
    public abstract void mo215o(Object obj, C0744Lp c0744Lp, RunnableC3973eA runnableC3973eA);

    /* renamed from: p */
    public abstract void mo216p(Object obj, View view, ArrayList arrayList);

    /* renamed from: q */
    public abstract void mo217q(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: r */
    public abstract Object mo218r(Object obj);
}
