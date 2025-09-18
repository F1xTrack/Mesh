package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: Fc1 */
/* loaded from: classes.dex */
public abstract class AbstractC7579Fc1 implements Cloneable {

    /* renamed from: k */
    public ArrayList f3346k;

    /* renamed from: l */
    public ArrayList f3347l;

    /* renamed from: m */
    public InterfaceC7527Ec1[] f3348m;

    /* renamed from: v */
    public UY1 f3357v;

    /* renamed from: x */
    public static final Animator[] f3333x = new Animator[0];

    /* renamed from: y */
    public static final int[] f3334y = {2, 1, 3, 4};

    /* renamed from: z */
    public static final S20 f3335z = new S20(22);

    /* renamed from: A */
    public static final ThreadLocal f3332A = new ThreadLocal();

    /* renamed from: a */
    public final String f3336a = getClass().getName();

    /* renamed from: b */
    public long f3337b = -1;

    /* renamed from: c */
    public long f3338c = -1;

    /* renamed from: d */
    public TimeInterpolator f3339d = null;

    /* renamed from: e */
    public final ArrayList f3340e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f3341f = new ArrayList();

    /* renamed from: g */
    public C8071Oo1 f3342g = new C8071Oo1(15);

    /* renamed from: h */
    public C8071Oo1 f3343h = new C8071Oo1(15);

    /* renamed from: i */
    public C7943Mc1 f3344i = null;

    /* renamed from: j */
    public final int[] f3345j = f3334y;

    /* renamed from: n */
    public final ArrayList f3349n = new ArrayList();

    /* renamed from: o */
    public Animator[] f3350o = f3333x;

    /* renamed from: p */
    public int f3351p = 0;

    /* renamed from: q */
    public boolean f3352q = false;

    /* renamed from: r */
    public boolean f3353r = false;

    /* renamed from: s */
    public AbstractC7579Fc1 f3354s = null;

    /* renamed from: t */
    public ArrayList f3355t = null;

    /* renamed from: u */
    public ArrayList f3356u = new ArrayList();

    /* renamed from: w */
    public S20 f3358w = f3335z;

    /* renamed from: c */
    public static void m2680c(C8071Oo1 c8071Oo1, View view, C8099Pc1 c8099Pc1) {
        ((C7119x8) c8071Oo1.f8627a).put(view, c8099Pc1);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c8071Oo1.f8628b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        String strM18616k = AbstractC9536gk1.m18616k(view);
        if (strM18616k != null) {
            C7119x8 c7119x8 = (C7119x8) c8071Oo1.f8630d;
            if (c7119x8.containsKey(strM18616k)) {
                c7119x8.put(strM18616k, null);
            } else {
                c7119x8.put(strM18616k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C7544El0 c7544El0 = (C7544El0) c8071Oo1.f8629c;
                if (c7544El0.f2881a) {
                    c7544El0.m2381i();
                }
                if (AbstractC7500Dp0.m1901b(c7544El0.f2882b, c7544El0.f2884d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c7544El0.m2383k(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c7544El0.m2382j(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c7544El0.m2383k(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: r */
    public static C7119x8 m2681r() {
        ThreadLocal threadLocal = f3332A;
        C7119x8 c7119x8 = (C7119x8) threadLocal.get();
        if (c7119x8 != null) {
            return c7119x8;
        }
        C7119x8 c7119x82 = new C7119x8();
        threadLocal.set(c7119x82);
        return c7119x82;
    }

    /* renamed from: w */
    public static boolean m2682w(C8099Pc1 c8099Pc1, C8099Pc1 c8099Pc12, String str) {
        Object obj = c8099Pc1.f9197a.get(str);
        Object obj2 = c8099Pc12.f9197a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo2683A(View view) {
        this.f3341f.remove(view);
    }

    /* renamed from: B */
    public void mo2684B(View view) {
        if (this.f3352q) {
            if (!this.f3353r) {
                ArrayList arrayList = this.f3349n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3350o);
                this.f3350o = f3333x;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f3350o = animatorArr;
                m2713x(this, C7754Im0.f5145f);
            }
            this.f3352q = false;
        }
    }

    /* renamed from: C */
    public void mo2685C() {
        m2692J();
        C7119x8 c7119x8M2681r = m2681r();
        Iterator it = this.f3356u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (c7119x8M2681r.containsKey(animator)) {
                m2692J();
                if (animator != null) {
                    animator.addListener(new C7423Cc1(this, c7119x8M2681r));
                    long j = this.f3338c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f3337b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f3339d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C3903d2(4, this));
                    animator.start();
                }
            }
        }
        this.f3356u.clear();
        m2706o();
    }

    /* renamed from: D */
    public void mo2686D(long j) {
        this.f3338c = j;
    }

    /* renamed from: E */
    public void mo2687E(UY1 uy1) {
        this.f3357v = uy1;
    }

    /* renamed from: F */
    public void mo2688F(TimeInterpolator timeInterpolator) {
        this.f3339d = timeInterpolator;
    }

    /* renamed from: G */
    public void mo2689G(S20 s20) {
        if (s20 == null) {
            this.f3358w = f3335z;
        } else {
            this.f3358w = s20;
        }
    }

    /* renamed from: I */
    public void mo2691I(long j) {
        this.f3337b = j;
    }

    /* renamed from: J */
    public final void m2692J() {
        if (this.f3351p == 0) {
            m2713x(this, C7754Im0.f5141b);
            this.f3353r = false;
        }
        this.f3351p++;
    }

    /* renamed from: K */
    public String mo2693K(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3338c != -1) {
            sb.append("dur(");
            sb.append(this.f3338c);
            sb.append(") ");
        }
        if (this.f3337b != -1) {
            sb.append("dly(");
            sb.append(this.f3337b);
            sb.append(") ");
        }
        if (this.f3339d != null) {
            sb.append("interp(");
            sb.append(this.f3339d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3340e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3341f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m2694a(InterfaceC7527Ec1 interfaceC7527Ec1) {
        if (this.f3355t == null) {
            this.f3355t = new ArrayList();
        }
        this.f3355t.add(interfaceC7527Ec1);
    }

    /* renamed from: b */
    public void mo2695b(View view) {
        this.f3341f.add(view);
    }

    /* renamed from: e */
    public void mo2696e() {
        ArrayList arrayList = this.f3349n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3350o);
        this.f3350o = f3333x;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f3350o = animatorArr;
        m2713x(this, C7754Im0.f5143d);
    }

    /* renamed from: f */
    public abstract void mo2697f(C8099Pc1 c8099Pc1);

    /* renamed from: g */
    public final void m2698g(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C8099Pc1 c8099Pc1 = new C8099Pc1(view);
            if (z) {
                mo2700i(c8099Pc1);
            } else {
                mo2697f(c8099Pc1);
            }
            c8099Pc1.f9199c.add(this);
            mo2699h(c8099Pc1);
            if (z) {
                m2680c(this.f3342g, view, c8099Pc1);
            } else {
                m2680c(this.f3343h, view, c8099Pc1);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m2698g(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* renamed from: i */
    public abstract void mo2700i(C8099Pc1 c8099Pc1);

    /* renamed from: j */
    public final void m2701j(ViewGroup viewGroup, boolean z) {
        m2702k(z);
        ArrayList arrayList = this.f3340e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3341f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m2698g(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C8099Pc1 c8099Pc1 = new C8099Pc1(viewFindViewById);
                if (z) {
                    mo2700i(c8099Pc1);
                } else {
                    mo2697f(c8099Pc1);
                }
                c8099Pc1.f9199c.add(this);
                mo2699h(c8099Pc1);
                if (z) {
                    m2680c(this.f3342g, viewFindViewById, c8099Pc1);
                } else {
                    m2680c(this.f3343h, viewFindViewById, c8099Pc1);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C8099Pc1 c8099Pc12 = new C8099Pc1(view);
            if (z) {
                mo2700i(c8099Pc12);
            } else {
                mo2697f(c8099Pc12);
            }
            c8099Pc12.f9199c.add(this);
            mo2699h(c8099Pc12);
            if (z) {
                m2680c(this.f3342g, view, c8099Pc12);
            } else {
                m2680c(this.f3343h, view, c8099Pc12);
            }
        }
    }

    /* renamed from: k */
    public final void m2702k(boolean z) {
        if (z) {
            ((C7119x8) this.f3342g.f8627a).clear();
            ((SparseArray) this.f3342g.f8628b).clear();
            ((C7544El0) this.f3342g.f8629c).m2379e();
        } else {
            ((C7119x8) this.f3343h.f8627a).clear();
            ((SparseArray) this.f3343h.f8628b).clear();
            ((C7544El0) this.f3343h.f8629c).m2379e();
        }
    }

    @Override // 
    /* renamed from: l */
    public AbstractC7579Fc1 clone() {
        try {
            AbstractC7579Fc1 abstractC7579Fc1 = (AbstractC7579Fc1) super.clone();
            abstractC7579Fc1.f3356u = new ArrayList();
            abstractC7579Fc1.f3342g = new C8071Oo1(15);
            abstractC7579Fc1.f3343h = new C8071Oo1(15);
            abstractC7579Fc1.f3346k = null;
            abstractC7579Fc1.f3347l = null;
            abstractC7579Fc1.f3354s = this;
            abstractC7579Fc1.f3355t = null;
            return abstractC7579Fc1;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    public Animator mo2704m(ViewGroup viewGroup, C8099Pc1 c8099Pc1, C8099Pc1 c8099Pc12) {
        return null;
    }

    /* renamed from: n */
    public void mo2705n(ViewGroup viewGroup, C8071Oo1 c8071Oo1, C8071Oo1 c8071Oo12, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        C8099Pc1 c8099Pc1;
        Animator animator;
        C8099Pc1 c8099Pc12;
        C7119x8 c7119x8M2681r = m2681r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m2708q().getClass();
        int i2 = 0;
        while (i2 < size) {
            C8099Pc1 c8099Pc13 = (C8099Pc1) arrayList.get(i2);
            C8099Pc1 c8099Pc14 = (C8099Pc1) arrayList2.get(i2);
            if (c8099Pc13 != null && !c8099Pc13.f9199c.contains(this)) {
                c8099Pc13 = null;
            }
            if (c8099Pc14 != null && !c8099Pc14.f9199c.contains(this)) {
                c8099Pc14 = null;
            }
            if ((c8099Pc13 != null || c8099Pc14 != null) && (c8099Pc13 == null || c8099Pc14 == null || mo2711u(c8099Pc13, c8099Pc14))) {
                Animator animatorMo2704m = mo2704m(viewGroup, c8099Pc13, c8099Pc14);
                if (animatorMo2704m != null) {
                    String str = this.f3336a;
                    if (c8099Pc14 != null) {
                        String[] strArrMo2709s = mo2709s();
                        view = c8099Pc14.f9198b;
                        if (strArrMo2709s != null && strArrMo2709s.length > 0) {
                            c8099Pc12 = new C8099Pc1(view);
                            C8099Pc1 c8099Pc15 = (C8099Pc1) ((C7119x8) c8071Oo12.f8627a).getOrDefault(view, null);
                            i = size;
                            if (c8099Pc15 != null) {
                                int i3 = 0;
                                while (i3 < strArrMo2709s.length) {
                                    HashMap map = c8099Pc12.f9197a;
                                    String str2 = strArrMo2709s[i3];
                                    map.put(str2, c8099Pc15.f9197a.get(str2));
                                    i3++;
                                    strArrMo2709s = strArrMo2709s;
                                }
                            }
                            int i4 = c7119x8M2681r.f6450c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = animatorMo2704m;
                                    break;
                                }
                                C7475Dc1 c7475Dc1 = (C7475Dc1) c7119x8M2681r.getOrDefault((Animator) c7119x8M2681r.m4827i(i5), null);
                                if (c7475Dc1.f2079c != null && c7475Dc1.f2077a == view && c7475Dc1.f2078b.equals(str) && c7475Dc1.f2079c.equals(c8099Pc12)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = animatorMo2704m;
                            c8099Pc12 = null;
                        }
                        animatorMo2704m = animator;
                        c8099Pc1 = c8099Pc12;
                    } else {
                        i = size;
                        view = c8099Pc13.f9198b;
                        c8099Pc1 = null;
                    }
                    if (animatorMo2704m != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C7475Dc1 c7475Dc12 = new C7475Dc1();
                        c7475Dc12.f2077a = view;
                        c7475Dc12.f2078b = str;
                        c7475Dc12.f2079c = c8099Pc1;
                        c7475Dc12.f2080d = windowId;
                        c7475Dc12.f2081e = this;
                        c7475Dc12.f2082f = animatorMo2704m;
                        c7119x8M2681r.put(animatorMo2704m, c7475Dc12);
                        this.f3356u.add(animatorMo2704m);
                    }
                }
                i2++;
                size = i;
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                C7475Dc1 c7475Dc13 = (C7475Dc1) c7119x8M2681r.getOrDefault((Animator) this.f3356u.get(sparseIntArray.keyAt(i6)), null);
                c7475Dc13.f2082f.setStartDelay(c7475Dc13.f2082f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: o */
    public final void m2706o() {
        int i = this.f3351p - 1;
        this.f3351p = i;
        if (i == 0) {
            m2713x(this, C7754Im0.f5142c);
            for (int i2 = 0; i2 < ((C7544El0) this.f3342g.f8629c).m2384l(); i2++) {
                View view = (View) ((C7544El0) this.f3342g.f8629c).m2385m(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C7544El0) this.f3343h.f8629c).m2384l(); i3++) {
                View view2 = (View) ((C7544El0) this.f3343h.f8629c).m2385m(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3353r = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x002d, code lost:
    
        if (r3 < 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x002f, code lost:
    
        if (r7 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0031, code lost:
    
        r6 = r5.f3347l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0034, code lost:
    
        r6 = r5.f3346k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x003d, code lost:
    
        return (p000.C8099Pc1) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return null;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C8099Pc1 m2707p(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            Mc1 r0 = r5.f3344i
            if (r0 == 0) goto L9
            Pc1 r6 = r0.m2707p(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f3346k
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f3347l
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            Pc1 r4 = (p000.C8099Pc1) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f9198b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.f3347l
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f3346k
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            Pc1 r1 = (p000.C8099Pc1) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC7579Fc1.m2707p(android.view.View, boolean):Pc1");
    }

    /* renamed from: q */
    public final AbstractC7579Fc1 m2708q() {
        C7943Mc1 c7943Mc1 = this.f3344i;
        return c7943Mc1 != null ? c7943Mc1.m2708q() : this;
    }

    /* renamed from: s */
    public String[] mo2709s() {
        return null;
    }

    /* renamed from: t */
    public final C8099Pc1 m2710t(View view, boolean z) {
        C7943Mc1 c7943Mc1 = this.f3344i;
        if (c7943Mc1 != null) {
            return c7943Mc1.m2710t(view, z);
        }
        return (C8099Pc1) ((C7119x8) (z ? this.f3342g : this.f3343h).f8627a).getOrDefault(view, null);
    }

    public final String toString() {
        return mo2693K("");
    }

    /* renamed from: u */
    public boolean mo2711u(C8099Pc1 c8099Pc1, C8099Pc1 c8099Pc12) {
        if (c8099Pc1 == null || c8099Pc12 == null) {
            return false;
        }
        String[] strArrMo2709s = mo2709s();
        if (strArrMo2709s == null) {
            Iterator it = c8099Pc1.f9197a.keySet().iterator();
            while (it.hasNext()) {
                if (m2682w(c8099Pc1, c8099Pc12, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrMo2709s) {
            if (!m2682w(c8099Pc1, c8099Pc12, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: v */
    public final boolean m2712v(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f3340e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3341f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* renamed from: x */
    public final void m2713x(AbstractC7579Fc1 abstractC7579Fc1, C7754Im0 c7754Im0) {
        AbstractC7579Fc1 abstractC7579Fc12 = this.f3354s;
        if (abstractC7579Fc12 != null) {
            abstractC7579Fc12.m2713x(abstractC7579Fc1, c7754Im0);
        }
        ArrayList arrayList = this.f3355t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3355t.size();
        InterfaceC7527Ec1[] interfaceC7527Ec1Arr = this.f3348m;
        if (interfaceC7527Ec1Arr == null) {
            interfaceC7527Ec1Arr = new InterfaceC7527Ec1[size];
        }
        this.f3348m = null;
        InterfaceC7527Ec1[] interfaceC7527Ec1Arr2 = (InterfaceC7527Ec1[]) this.f3355t.toArray(interfaceC7527Ec1Arr);
        for (int i = 0; i < size; i++) {
            InterfaceC7527Ec1 interfaceC7527Ec1 = interfaceC7527Ec1Arr2[i];
            switch (c7754Im0.f5146a) {
                case 24:
                    interfaceC7527Ec1.mo2337d(abstractC7579Fc1);
                    break;
                case 25:
                    interfaceC7527Ec1.mo2338e(abstractC7579Fc1);
                    break;
                case 26:
                    interfaceC7527Ec1.mo2340g(abstractC7579Fc1);
                    break;
                case 27:
                    interfaceC7527Ec1.mo2335b();
                    break;
                default:
                    interfaceC7527Ec1.mo2339f();
                    break;
            }
            interfaceC7527Ec1Arr2[i] = null;
        }
        this.f3348m = interfaceC7527Ec1Arr2;
    }

    /* renamed from: y */
    public void mo2714y(ViewGroup viewGroup) {
        if (this.f3353r) {
            return;
        }
        ArrayList arrayList = this.f3349n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3350o);
        this.f3350o = f3333x;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f3350o = animatorArr;
        m2713x(this, C7754Im0.f5144e);
        this.f3352q = true;
    }

    /* renamed from: z */
    public AbstractC7579Fc1 mo2715z(InterfaceC7527Ec1 interfaceC7527Ec1) {
        AbstractC7579Fc1 abstractC7579Fc1;
        ArrayList arrayList = this.f3355t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC7527Ec1) && (abstractC7579Fc1 = this.f3354s) != null) {
            abstractC7579Fc1.mo2715z(interfaceC7527Ec1);
        }
        if (this.f3355t.size() == 0) {
            this.f3355t = null;
        }
        return this;
    }

    /* renamed from: H */
    public void mo2690H() {
    }

    /* renamed from: h */
    public void mo2699h(C8099Pc1 c8099Pc1) {
    }
}
