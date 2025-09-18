package com.yandex.metrica.impl.p022ob;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.yandex.metrica.impl.ob.tl */
/* loaded from: classes2.dex */
class C3631tl {

    /* renamed from: l */
    private static final List<Class> f24858l;

    /* renamed from: m */
    private static final List<Class> f24859m;

    /* renamed from: a */
    private final TreeSet<Float> f24860a = new TreeSet<>();

    /* renamed from: b */
    private final List<C2588El> f24861b = new ArrayList();

    /* renamed from: c */
    private final C3163bl f24862c;

    /* renamed from: d */
    private final List<InterfaceC2613Fl> f24863d;

    /* renamed from: e */
    private final List<InterfaceC2911Rk> f24864e;

    /* renamed from: f */
    private final C3398km f24865f;

    /* renamed from: g */
    private final C2961Tk f24866g;

    /* renamed from: h */
    private final C3164bm f24867h;

    /* renamed from: i */
    private final C3216dm f24868i;

    /* renamed from: j */
    private final C3062Xl f24869j;

    /* renamed from: k */
    private final C3450mm f24870k;

    static {
        ArrayList arrayList = new ArrayList();
        f24858l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f24859m = arrayList2;
        arrayList.add(ListView.class);
        arrayList.add(GridView.class);
        m16875a(arrayList, "androidx.recyclerview.widget.RecyclerView");
        m16875a(arrayList, "androidx.viewpager.widget.ViewPager");
        m16875a(arrayList, "androidx.viewpager2.widget.ViewPager2");
        m16875a(arrayList2, "androidx.coordinatorlayout.widget.CoordinatorLayout");
        m16875a(arrayList2, "androidx.drawerlayout.widget.DrawerLayout");
        m16875a(arrayList2, "androidx.slidingpanelayout.widget.SlidingPaneLayout");
        m16875a(arrayList2, "androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        m16875a(arrayList2, "androidx.core.widget.NestedScrollView");
        m16875a(arrayList2, "androidx.constraintlayout.widget.ConstraintLayout");
        m16875a(arrayList2, "androidx.appcompat.widget.ContentFrameLayout");
        arrayList2.add(AbsoluteLayout.class);
        arrayList2.add(FrameLayout.class);
        arrayList2.add(LinearLayout.class);
        arrayList2.add(RelativeLayout.class);
        arrayList2.add(TableLayout.class);
        arrayList2.add(ScrollView.class);
        arrayList2.add(GridLayout.class);
    }

    public C3631tl(C3164bm c3164bm, C3398km c3398km, C2961Tk c2961Tk, C3163bl c3163bl, List<InterfaceC2613Fl> list, List<InterfaceC2911Rk> list2, C3216dm c3216dm, C3062Xl c3062Xl, C3450mm c3450mm) {
        this.f24867h = c3164bm;
        this.f24865f = c3398km;
        this.f24866g = c2961Tk;
        this.f24862c = c3163bl;
        this.f24863d = list;
        this.f24864e = list2;
        this.f24868i = c3216dm;
        this.f24869j = c3062Xl;
        this.f24870k = c3450mm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x00b7, code lost:
    
        r1 = r1.mo13971a();
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x012d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.p022ob.C3579rl m16874a(com.yandex.metrica.impl.p022ob.C3037Wl r22, android.view.View r23, int r24) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3631tl.m16874a(com.yandex.metrica.impl.ob.Wl, android.view.View, int):com.yandex.metrica.impl.ob.rl");
    }

    /* renamed from: b */
    public C3579rl m16879b(C3037Wl c3037Wl, View view, int i) {
        try {
            if (this.f24869j.m15435a(view)) {
                return null;
            }
            return m16874a(c3037Wl, view, i);
        } catch (Throwable th) {
            this.f24868i.m15805a("ui_parsing_view", th);
            return null;
        }
    }

    /* renamed from: b */
    public final List<C2588El> m16880b() {
        return this.f24861b;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00de A[LOOP:0: B:113:0x00d8->B:115:0x00de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.p022ob.C3037Wl m16873a(android.widget.TextView r20, java.lang.String r21, java.lang.String r22, int r23, boolean r24, com.yandex.metrica.impl.p022ob.C3037Wl.a r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3631tl.m16873a(android.widget.TextView, java.lang.String, java.lang.String, int, boolean, com.yandex.metrica.impl.ob.Wl$a):com.yandex.metrica.impl.ob.Wl");
    }

    /* renamed from: a */
    public TreeSet<Float> m16878a() {
        return this.f24860a;
    }

    /* renamed from: a */
    public List<View> m16877a(View view, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int iMin = Math.min(this.f24866g.m15200a(i), viewGroup.getChildCount());
                for (int i2 = 0; i2 < iMin; i2++) {
                    arrayList.add(viewGroup.getChildAt(i2));
                }
            }
        } catch (Throwable th) {
            this.f24868i.m15805a("ui_parsing_children", th);
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m16876a(List<Class> list, View view) {
        Iterator<Class> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m16875a(List<Class> list, String str) {
        Class clsM13910b = C2494B2.m13910b(str);
        if (clsM13910b != null) {
            list.add(clsM13910b);
        }
    }
}
