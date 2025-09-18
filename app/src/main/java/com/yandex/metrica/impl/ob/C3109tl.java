package com.yandex.metrica.impl.ob;

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
class C3109tl {
    private static final List<Class> l;
    private static final List<Class> m;
    private final TreeSet<Float> a = new TreeSet<>();
    private final List<El> b = new ArrayList();
    private final C2661bl c;
    private final List<Fl> d;
    private final List<Rk> e;
    private final C2886km f;
    private final Tk g;
    private final C2662bm h;
    private final C2712dm i;
    private final Xl j;
    private final C2936mm k;

    static {
        ArrayList arrayList = new ArrayList();
        l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        m = arrayList2;
        arrayList.add(ListView.class);
        arrayList.add(GridView.class);
        a(arrayList, "androidx.recyclerview.widget.RecyclerView");
        a(arrayList, "androidx.viewpager.widget.ViewPager");
        a(arrayList, "androidx.viewpager2.widget.ViewPager2");
        a(arrayList2, "androidx.coordinatorlayout.widget.CoordinatorLayout");
        a(arrayList2, "androidx.drawerlayout.widget.DrawerLayout");
        a(arrayList2, "androidx.slidingpanelayout.widget.SlidingPaneLayout");
        a(arrayList2, "androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        a(arrayList2, "androidx.core.widget.NestedScrollView");
        a(arrayList2, "androidx.constraintlayout.widget.ConstraintLayout");
        a(arrayList2, "androidx.appcompat.widget.ContentFrameLayout");
        arrayList2.add(AbsoluteLayout.class);
        arrayList2.add(FrameLayout.class);
        arrayList2.add(LinearLayout.class);
        arrayList2.add(RelativeLayout.class);
        arrayList2.add(TableLayout.class);
        arrayList2.add(ScrollView.class);
        arrayList2.add(GridLayout.class);
    }

    public C3109tl(C2662bm c2662bm, C2886km c2886km, Tk tk, C2661bl c2661bl, List<Fl> list, List<Rk> list2, C2712dm c2712dm, Xl xl, C2936mm c2936mm) {
        this.h = c2662bm;
        this.f = c2886km;
        this.g = tk;
        this.c = c2661bl;
        this.d = list;
        this.e = list2;
        this.i = c2712dm;
        this.j = xl;
        this.k = c2936mm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x00b7, code lost:
    
        r1 = r1.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.ob.C3059rl a(com.yandex.metrica.impl.ob.Wl r22, android.view.View r23, int r24) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C3109tl.a(com.yandex.metrica.impl.ob.Wl, android.view.View, int):com.yandex.metrica.impl.ob.rl");
    }

    public C3059rl b(Wl wl, View view, int i) {
        try {
            if (this.j.a(view)) {
                return null;
            }
            return a(wl, view, i);
        } catch (Throwable th) {
            this.i.a("ui_parsing_view", th);
            return null;
        }
    }

    public final List<El> b() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00de A[LOOP:0: B:113:0x00d8->B:115:0x00de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.ob.Wl a(android.widget.TextView r20, java.lang.String r21, java.lang.String r22, int r23, boolean r24, com.yandex.metrica.impl.ob.Wl.a r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C3109tl.a(android.widget.TextView, java.lang.String, java.lang.String, int, boolean, com.yandex.metrica.impl.ob.Wl$a):com.yandex.metrica.impl.ob.Wl");
    }

    public TreeSet<Float> a() {
        return this.a;
    }

    public List<View> a(View view, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int iMin = Math.min(this.g.a(i), viewGroup.getChildCount());
                for (int i2 = 0; i2 < iMin; i2++) {
                    arrayList.add(viewGroup.getChildAt(i2));
                }
            }
        } catch (Throwable th) {
            this.i.a("ui_parsing_children", th);
        }
        return arrayList;
    }

    private boolean a(List<Class> list, View view) {
        Iterator<Class> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    private static void a(List<Class> list, String str) {
        Class clsB = B2.b(str);
        if (clsB != null) {
            list.add(clsB);
        }
    }
}
