package defpackage;

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
public abstract class AbstractC0418Fc1 implements Cloneable {
    public ArrayList k;
    public ArrayList l;
    public InterfaceC0340Ec1[] m;
    public UY1 v;
    public static final Animator[] x = new Animator[0];
    public static final int[] y = {2, 1, 3, 4};
    public static final S20 z = new S20(22);
    public static final ThreadLocal A = new ThreadLocal();
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public C1155Oo1 g = new C1155Oo1(15);
    public C1155Oo1 h = new C1155Oo1(15);
    public C0963Mc1 i = null;
    public final int[] j = y;
    public final ArrayList n = new ArrayList();
    public Animator[] o = x;
    public int p = 0;
    public boolean q = false;
    public boolean r = false;
    public AbstractC0418Fc1 s = null;
    public ArrayList t = null;
    public ArrayList u = new ArrayList();
    public S20 w = z;

    public static void c(C1155Oo1 c1155Oo1, View view, C1197Pc1 c1197Pc1) {
        ((C7925x8) c1155Oo1.a).put(view, c1197Pc1);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c1155Oo1.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        String strK = AbstractC4021gk1.k(view);
        if (strK != null) {
            C7925x8 c7925x8 = (C7925x8) c1155Oo1.d;
            if (c7925x8.containsKey(strK)) {
                c7925x8.put(strK, null);
            } else {
                c7925x8.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0366El0 c0366El0 = (C0366El0) c1155Oo1.c;
                if (c0366El0.a) {
                    c0366El0.i();
                }
                if (AbstractC0300Dp0.b(c0366El0.b, c0366El0.d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0366El0.k(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c0366El0.j(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c0366El0.k(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C7925x8 r() {
        ThreadLocal threadLocal = A;
        C7925x8 c7925x8 = (C7925x8) threadLocal.get();
        if (c7925x8 != null) {
            return c7925x8;
        }
        C7925x8 c7925x82 = new C7925x8();
        threadLocal.set(c7925x82);
        return c7925x82;
    }

    public static boolean w(C1197Pc1 c1197Pc1, C1197Pc1 c1197Pc12, String str) {
        Object obj = c1197Pc1.a.get(str);
        Object obj2 = c1197Pc12.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        this.f.remove(view);
    }

    public void B(View view) {
        if (this.q) {
            if (!this.r) {
                ArrayList arrayList = this.n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
                this.o = x;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.o = animatorArr;
                x(this, C0681Im0.f);
            }
            this.q = false;
        }
    }

    public void C() {
        J();
        C7925x8 c7925x8R = r();
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (c7925x8R.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new C0184Cc1(this, c7925x8R));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C3313d2(4, this));
                    animator.start();
                }
            }
        }
        this.u.clear();
        o();
    }

    public void D(long j) {
        this.c = j;
    }

    public void E(UY1 uy1) {
        this.v = uy1;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void G(S20 s20) {
        if (s20 == null) {
            this.w = z;
        } else {
            this.w = s20;
        }
    }

    public void I(long j) {
        this.b = j;
    }

    public final void J() {
        if (this.p == 0) {
            x(this, C0681Im0.b);
            this.r = false;
        }
        this.p++;
    }

    public String K(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
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

    public void a(InterfaceC0340Ec1 interfaceC0340Ec1) {
        if (this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(interfaceC0340Ec1);
    }

    public void b(View view) {
        this.f.add(view);
    }

    public void e() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = x;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.o = animatorArr;
        x(this, C0681Im0.d);
    }

    public abstract void f(C1197Pc1 c1197Pc1);

    public final void g(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C1197Pc1 c1197Pc1 = new C1197Pc1(view);
            if (z2) {
                i(c1197Pc1);
            } else {
                f(c1197Pc1);
            }
            c1197Pc1.c.add(this);
            h(c1197Pc1);
            if (z2) {
                c(this.g, view, c1197Pc1);
            } else {
                c(this.h, view, c1197Pc1);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public abstract void i(C1197Pc1 c1197Pc1);

    public final void j(ViewGroup viewGroup, boolean z2) {
        k(z2);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            g(viewGroup, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C1197Pc1 c1197Pc1 = new C1197Pc1(viewFindViewById);
                if (z2) {
                    i(c1197Pc1);
                } else {
                    f(c1197Pc1);
                }
                c1197Pc1.c.add(this);
                h(c1197Pc1);
                if (z2) {
                    c(this.g, viewFindViewById, c1197Pc1);
                } else {
                    c(this.h, viewFindViewById, c1197Pc1);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C1197Pc1 c1197Pc12 = new C1197Pc1(view);
            if (z2) {
                i(c1197Pc12);
            } else {
                f(c1197Pc12);
            }
            c1197Pc12.c.add(this);
            h(c1197Pc12);
            if (z2) {
                c(this.g, view, c1197Pc12);
            } else {
                c(this.h, view, c1197Pc12);
            }
        }
    }

    public final void k(boolean z2) {
        if (z2) {
            ((C7925x8) this.g.a).clear();
            ((SparseArray) this.g.b).clear();
            ((C0366El0) this.g.c).e();
        } else {
            ((C7925x8) this.h.a).clear();
            ((SparseArray) this.h.b).clear();
            ((C0366El0) this.h.c).e();
        }
    }

    @Override // 
    /* renamed from: l */
    public AbstractC0418Fc1 clone() {
        try {
            AbstractC0418Fc1 abstractC0418Fc1 = (AbstractC0418Fc1) super.clone();
            abstractC0418Fc1.u = new ArrayList();
            abstractC0418Fc1.g = new C1155Oo1(15);
            abstractC0418Fc1.h = new C1155Oo1(15);
            abstractC0418Fc1.k = null;
            abstractC0418Fc1.l = null;
            abstractC0418Fc1.s = this;
            abstractC0418Fc1.t = null;
            return abstractC0418Fc1;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator m(ViewGroup viewGroup, C1197Pc1 c1197Pc1, C1197Pc1 c1197Pc12) {
        return null;
    }

    public void n(ViewGroup viewGroup, C1155Oo1 c1155Oo1, C1155Oo1 c1155Oo12, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        C1197Pc1 c1197Pc1;
        Animator animator;
        C1197Pc1 c1197Pc12;
        C7925x8 c7925x8R = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        q().getClass();
        int i2 = 0;
        while (i2 < size) {
            C1197Pc1 c1197Pc13 = (C1197Pc1) arrayList.get(i2);
            C1197Pc1 c1197Pc14 = (C1197Pc1) arrayList2.get(i2);
            if (c1197Pc13 != null && !c1197Pc13.c.contains(this)) {
                c1197Pc13 = null;
            }
            if (c1197Pc14 != null && !c1197Pc14.c.contains(this)) {
                c1197Pc14 = null;
            }
            if ((c1197Pc13 != null || c1197Pc14 != null) && (c1197Pc13 == null || c1197Pc14 == null || u(c1197Pc13, c1197Pc14))) {
                Animator animatorM = m(viewGroup, c1197Pc13, c1197Pc14);
                if (animatorM != null) {
                    String str = this.a;
                    if (c1197Pc14 != null) {
                        String[] strArrS = s();
                        view = c1197Pc14.b;
                        if (strArrS != null && strArrS.length > 0) {
                            c1197Pc12 = new C1197Pc1(view);
                            C1197Pc1 c1197Pc15 = (C1197Pc1) ((C7925x8) c1155Oo12.a).getOrDefault(view, null);
                            i = size;
                            if (c1197Pc15 != null) {
                                int i3 = 0;
                                while (i3 < strArrS.length) {
                                    HashMap map = c1197Pc12.a;
                                    String str2 = strArrS[i3];
                                    map.put(str2, c1197Pc15.a.get(str2));
                                    i3++;
                                    strArrS = strArrS;
                                }
                            }
                            int i4 = c7925x8R.c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = animatorM;
                                    break;
                                }
                                C0262Dc1 c0262Dc1 = (C0262Dc1) c7925x8R.getOrDefault((Animator) c7925x8R.i(i5), null);
                                if (c0262Dc1.c != null && c0262Dc1.a == view && c0262Dc1.b.equals(str) && c0262Dc1.c.equals(c1197Pc12)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = animatorM;
                            c1197Pc12 = null;
                        }
                        animatorM = animator;
                        c1197Pc1 = c1197Pc12;
                    } else {
                        i = size;
                        view = c1197Pc13.b;
                        c1197Pc1 = null;
                    }
                    if (animatorM != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C0262Dc1 c0262Dc12 = new C0262Dc1();
                        c0262Dc12.a = view;
                        c0262Dc12.b = str;
                        c0262Dc12.c = c1197Pc1;
                        c0262Dc12.d = windowId;
                        c0262Dc12.e = this;
                        c0262Dc12.f = animatorM;
                        c7925x8R.put(animatorM, c0262Dc12);
                        this.u.add(animatorM);
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
                C0262Dc1 c0262Dc13 = (C0262Dc1) c7925x8R.getOrDefault((Animator) this.u.get(sparseIntArray.keyAt(i6)), null);
                c0262Dc13.f.setStartDelay(c0262Dc13.f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            x(this, C0681Im0.c);
            for (int i2 = 0; i2 < ((C0366El0) this.g.c).l(); i2++) {
                View view = (View) ((C0366El0) this.g.c).m(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C0366El0) this.h.c).l(); i3++) {
                View view2 = (View) ((C0366El0) this.h.c).m(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.r = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x002d, code lost:
    
        if (r3 < 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x002f, code lost:
    
        if (r7 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0031, code lost:
    
        r6 = r5.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0034, code lost:
    
        r6 = r5.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x003d, code lost:
    
        return (defpackage.C1197Pc1) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C1197Pc1 p(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            Mc1 r0 = r5.i
            if (r0 == 0) goto L9
            Pc1 r6 = r0.p(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.k
            goto L10
        Le:
            java.util.ArrayList r0 = r5.l
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
            Pc1 r4 = (defpackage.C1197Pc1) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.b
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
            java.util.ArrayList r6 = r5.l
            goto L36
        L34:
            java.util.ArrayList r6 = r5.k
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            Pc1 r1 = (defpackage.C1197Pc1) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0418Fc1.p(android.view.View, boolean):Pc1");
    }

    public final AbstractC0418Fc1 q() {
        C0963Mc1 c0963Mc1 = this.i;
        return c0963Mc1 != null ? c0963Mc1.q() : this;
    }

    public String[] s() {
        return null;
    }

    public final C1197Pc1 t(View view, boolean z2) {
        C0963Mc1 c0963Mc1 = this.i;
        if (c0963Mc1 != null) {
            return c0963Mc1.t(view, z2);
        }
        return (C1197Pc1) ((C7925x8) (z2 ? this.g : this.h).a).getOrDefault(view, null);
    }

    public final String toString() {
        return K("");
    }

    public boolean u(C1197Pc1 c1197Pc1, C1197Pc1 c1197Pc12) {
        if (c1197Pc1 == null || c1197Pc12 == null) {
            return false;
        }
        String[] strArrS = s();
        if (strArrS == null) {
            Iterator it = c1197Pc1.a.keySet().iterator();
            while (it.hasNext()) {
                if (w(c1197Pc1, c1197Pc12, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrS) {
            if (!w(c1197Pc1, c1197Pc12, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean v(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void x(AbstractC0418Fc1 abstractC0418Fc1, C0681Im0 c0681Im0) {
        AbstractC0418Fc1 abstractC0418Fc12 = this.s;
        if (abstractC0418Fc12 != null) {
            abstractC0418Fc12.x(abstractC0418Fc1, c0681Im0);
        }
        ArrayList arrayList = this.t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.t.size();
        InterfaceC0340Ec1[] interfaceC0340Ec1Arr = this.m;
        if (interfaceC0340Ec1Arr == null) {
            interfaceC0340Ec1Arr = new InterfaceC0340Ec1[size];
        }
        this.m = null;
        InterfaceC0340Ec1[] interfaceC0340Ec1Arr2 = (InterfaceC0340Ec1[]) this.t.toArray(interfaceC0340Ec1Arr);
        for (int i = 0; i < size; i++) {
            InterfaceC0340Ec1 interfaceC0340Ec1 = interfaceC0340Ec1Arr2[i];
            switch (c0681Im0.a) {
                case 24:
                    interfaceC0340Ec1.d(abstractC0418Fc1);
                    break;
                case 25:
                    interfaceC0340Ec1.e(abstractC0418Fc1);
                    break;
                case 26:
                    interfaceC0340Ec1.g(abstractC0418Fc1);
                    break;
                case 27:
                    interfaceC0340Ec1.b();
                    break;
                default:
                    interfaceC0340Ec1.f();
                    break;
            }
            interfaceC0340Ec1Arr2[i] = null;
        }
        this.m = interfaceC0340Ec1Arr2;
    }

    public void y(ViewGroup viewGroup) {
        if (this.r) {
            return;
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = x;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.o = animatorArr;
        x(this, C0681Im0.e);
        this.q = true;
    }

    public AbstractC0418Fc1 z(InterfaceC0340Ec1 interfaceC0340Ec1) {
        AbstractC0418Fc1 abstractC0418Fc1;
        ArrayList arrayList = this.t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC0340Ec1) && (abstractC0418Fc1 = this.s) != null) {
            abstractC0418Fc1.z(interfaceC0340Ec1);
        }
        if (this.t.size() == 0) {
            this.t = null;
        }
        return this;
    }

    public void H() {
    }

    public void h(C1197Pc1 c1197Pc1) {
    }
}
