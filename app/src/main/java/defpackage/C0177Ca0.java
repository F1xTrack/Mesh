package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Ca0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0177Ca0 {
    public static final int[] j = {0, 0};
    public HashMap a;
    public HashMap b;
    public final ViewGroup i;
    public final HashSet d = new HashSet();
    public int e = -1;
    public int f = -1;
    public int g = 0;
    public int h = 0;
    public final HashMap c = new HashMap();

    public C0177Ca0(ViewGroup viewGroup) {
        this.i = viewGroup;
    }

    public static void a(String str, UB0 ub0, MotionEvent motionEvent, ArrayList arrayList, InterfaceC7405uP interfaceC7405uP) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            interfaceC7405uP.g(VB0.d(str, ((C8204yb1) it.next()).a, ub0, motionEvent));
        }
    }

    public static ArrayList b(List list, WB0 wb0, WB0 wb02, boolean z) {
        ArrayList arrayList = new ArrayList(list);
        if (z) {
            return arrayList;
        }
        boolean z2 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            View view = ((C8204yb1) list.get(size)).b;
            if (!z2 && !BL1.a(view, wb02) && !BL1.a(view, wb0)) {
                arrayList.remove(size);
            } else if (!z2 && BL1.a(view, wb02)) {
                z2 = true;
            }
        }
        return arrayList;
    }

    public static boolean e(List list, WB0 wb0, WB0 wb02) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8204yb1 c8204yb1 = (C8204yb1) it.next();
            if (BL1.a(c8204yb1.b, wb0) || BL1.a(c8204yb1.b, wb02)) {
                return true;
            }
        }
        return false;
    }

    public final void c(int i, UB0 ub0, MotionEvent motionEvent, InterfaceC7405uP interfaceC7405uP) {
        WB0 wb0;
        WB0 wb02;
        int i2 = ub0.b;
        HashMap map = ub0.f;
        List arrayList = i != -1 ? (List) map.get(Integer.valueOf(i2)) : new ArrayList();
        HashMap map2 = this.a;
        List arrayList2 = (map2 == null || !map2.containsKey(Integer.valueOf(i2))) ? new ArrayList() : (List) this.a.get(Integer.valueOf(i2));
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int iMin = Math.min(arrayList.size(), arrayList2.size());
            wb0 = WB0.j;
            wb02 = WB0.h;
            if (i3 >= iMin || !((C8204yb1) arrayList.get((arrayList.size() - 1) - i3)).equals(arrayList2.get((arrayList2.size() - 1) - i3))) {
                break;
            }
            View view = ((C8204yb1) arrayList.get((arrayList.size() - 1) - i3)).b;
            if (!z && BL1.a(view, wb02)) {
                z = true;
            }
            if (!z2 && BL1.a(view, wb0)) {
                z2 = true;
            }
            i3++;
        }
        if (i3 < Math.max(arrayList.size(), arrayList2.size())) {
            this.g = (this.g + 1) % Integer.MAX_VALUE;
            if (arrayList2.size() > 0) {
                int i4 = ((C8204yb1) arrayList2.get(0)).a;
                if (e(arrayList2, WB0.o, WB0.p)) {
                    interfaceC7405uP.g(VB0.d("topPointerOut", i4, ub0, motionEvent));
                }
                ArrayList arrayListB = b(arrayList2.subList(0, arrayList2.size() - i3), WB0.i, wb0, z2);
                if (arrayListB.size() > 0) {
                    a("topPointerLeave", ub0, motionEvent, arrayListB, interfaceC7405uP);
                }
            }
            if (e(arrayList, WB0.q, WB0.r)) {
                interfaceC7405uP.g(VB0.d("topPointerOver", i, ub0, motionEvent));
            }
            ArrayList arrayListB2 = b(arrayList.subList(0, arrayList.size() - i3), WB0.g, wb02, z);
            if (arrayListB2.size() > 0) {
                Collections.reverse(arrayListB2);
                a("topPointerEnter", ub0, motionEvent, arrayListB2, interfaceC7405uP);
            }
        }
        HashMap map3 = new HashMap(map);
        if (i == -1) {
            map3.remove(Integer.valueOf(i2));
        }
        this.a = map3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v56, types: [java.util.List] */
    public void d(MotionEvent motionEvent, InterfaceC7405uP interfaceC7405uP, boolean z) {
        int[] iArr;
        ViewGroup viewGroup;
        int i;
        View view;
        HashSet hashSet;
        ArrayList arrayList;
        int i2;
        float[] fArr;
        char c;
        char c2;
        int i3;
        int i4 = 2;
        if (this.e != -1) {
        }
        int actionMasked = motionEvent.getActionMasked();
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        HashSet hashSet2 = this.d;
        if (actionMasked == 0) {
            this.f = motionEvent.getPointerId(0);
        } else if (actionMasked == 7) {
            hashSet2.add(Integer.valueOf(pointerId));
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        int i5 = 0;
        while (true) {
            int pointerCount = motionEvent.getPointerCount();
            iArr = j;
            viewGroup = this.i;
            if (i5 >= pointerCount) {
                break;
            }
            float x = motionEvent.getX(i5);
            float y = motionEvent.getY(i5);
            float[] fArr2 = new float[i4];
            fArr2[0] = x;
            fArr2[1] = y;
            float f = fArr2[0];
            float f2 = fArr2[1];
            float[] fArr3 = AbstractC8394zb1.a;
            UiThreadUtil.assertOnUiThread();
            HashSet hashSet3 = hashSet2;
            float[] fArr4 = new float[i4];
            fArr4[0] = f;
            fArr4[1] = f2;
            ArrayList arrayList2 = new ArrayList();
            View viewC = AbstractC8394zb1.c(fArr4, viewGroup, arrayList2);
            int i6 = actionMasked;
            if (viewC != null) {
                View view2 = viewC;
                int i7 = 0;
                while (view2 != null && view2.getId() <= 0) {
                    view2 = (View) view2.getParent();
                    i7++;
                }
                arrayList2 = arrayList2;
                if (i7 > 0) {
                    arrayList2 = arrayList2.subList(i7, arrayList2.size());
                }
                i3 = pointerId;
                int iReactTagForTouch = view2 instanceof QJ0 ? ((QJ0) view2).reactTagForTouch(fArr4[0], fArr4[1]) : view2.getId();
                if (iReactTagForTouch != view2.getId()) {
                    arrayList2.add(0, new C8204yb1(iReactTagForTouch, null));
                }
            } else {
                i3 = pointerId;
            }
            int pointerId2 = motionEvent.getPointerId(i5);
            map.put(Integer.valueOf(pointerId2), fArr4);
            map2.put(Integer.valueOf(pointerId2), arrayList2);
            map3.put(Integer.valueOf(pointerId2), fArr2);
            Integer numValueOf = Integer.valueOf(pointerId2);
            viewGroup.getLocationOnScreen(iArr);
            map4.put(numValueOf, new float[]{fArr2[0] + iArr[0], fArr2[1] + iArr[1]});
            i5++;
            hashSet2 = hashSet3;
            actionMasked = i6;
            pointerId = i3;
            i4 = 2;
        }
        int i8 = actionMasked;
        int i9 = pointerId;
        HashSet hashSet4 = hashSet2;
        UB0 ub0 = new UB0(this.f, i9, this.h, OZ1.e(viewGroup), map, map2, map3, map4, hashSet4);
        boolean z2 = z && motionEvent.getActionMasked() == 10;
        if (z2) {
            HashMap map5 = this.a;
            List list = map5 != null ? (List) map5.get(Integer.valueOf(i9)) : null;
            if (list == null || list.isEmpty()) {
                return;
            }
            C8204yb1 c8204yb1 = (C8204yb1) list.get(list.size() - 1);
            i = c8204yb1.a;
            map2.put(Integer.valueOf(i9), new ArrayList());
            view = c8204yb1.b;
        } else {
            List list2 = (List) map2.get(Integer.valueOf(i9));
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            C8204yb1 c8204yb12 = (C8204yb1) list2.get(0);
            i = c8204yb12.a;
            view = c8204yb12.b;
        }
        c(i, ub0, motionEvent, interfaceC7405uP);
        WB0 wb0 = WB0.d;
        WB0 wb02 = WB0.c;
        HashMap map6 = this.c;
        switch (i8) {
            case 0:
            case 5:
                hashSet = hashSet4;
                List list3 = (List) map2.get(Integer.valueOf(i9));
                this.g = (this.g + 1) % Integer.MAX_VALUE;
                if (!hashSet.contains(Integer.valueOf(i9))) {
                    if (e(list3, WB0.q, WB0.r)) {
                        interfaceC7405uP.g(VB0.d("topPointerOver", i, ub0, motionEvent));
                    }
                    ArrayList arrayListB = b(list3, WB0.g, WB0.h, false);
                    Collections.reverse(arrayListB);
                    a("topPointerEnter", ub0, motionEvent, arrayListB, interfaceC7405uP);
                }
                if (e(list3, wb02, wb0)) {
                    map6.put(Integer.valueOf(i9), new ArrayList(list3));
                }
                if (e(list3, WB0.e, WB0.f)) {
                    interfaceC7405uP.g(VB0.d("topPointerDown", i, ub0, motionEvent));
                }
                this.b = new HashMap(ub0.g);
                this.h = motionEvent.getButtonState();
                hashSet.retainAll(this.b.keySet());
                break;
            case 1:
            case 6:
                this.g = (this.g + 1) % Integer.MAX_VALUE;
                List<C8204yb1> list4 = (List) map2.get(Integer.valueOf(i9));
                if (e(list4, WB0.m, WB0.n)) {
                    interfaceC7405uP.g(VB0.d("topPointerUp", i, ub0, motionEvent));
                }
                hashSet = hashSet4;
                if (!hashSet.contains(Integer.valueOf(i9))) {
                    if (e(list4, WB0.o, WB0.p)) {
                        interfaceC7405uP.g(VB0.d("topPointerOut", i, ub0, motionEvent));
                    }
                    a("topPointerLeave", ub0, motionEvent, b(list4, WB0.i, WB0.j, false), interfaceC7405uP);
                }
                List list5 = (List) map6.remove(Integer.valueOf(i9));
                if (list5 != null && e(list4, wb02, wb0)) {
                    if (list5.isEmpty() || list4.isEmpty()) {
                        arrayList = new ArrayList();
                    } else {
                        HashSet hashSet5 = new HashSet(list5);
                        ArrayList arrayList3 = new ArrayList();
                        for (C8204yb1 c8204yb13 : list4) {
                            if (hashSet5.contains(c8204yb13)) {
                                arrayList3.add(c8204yb13);
                            }
                        }
                        arrayList = arrayList3;
                    }
                    if (!arrayList.isEmpty()) {
                        interfaceC7405uP.g(VB0.d("topClick", ((C8204yb1) arrayList.get(0)).a, ub0, motionEvent));
                    }
                }
                if (motionEvent.getActionMasked() == 1) {
                    this.f = -1;
                }
                hashSet.remove(Integer.valueOf(i9));
                this.b = new HashMap(ub0.g);
                this.h = motionEvent.getButtonState();
                hashSet.retainAll(this.b.keySet());
                break;
            case 2:
                g(i, ub0, motionEvent, interfaceC7405uP);
                hashSet = hashSet4;
                this.b = new HashMap(ub0.g);
                this.h = motionEvent.getButtonState();
                hashSet.retainAll(this.b.keySet());
                break;
            case 3:
                UN1.b(this.e == -1, "Expected to not have already sent a cancel for this gesture");
                List list6 = (List) map2.get(Integer.valueOf(i9));
                if (list6.isEmpty() || view == null) {
                    i2 = -1;
                } else {
                    if (e(list6, WB0.a, WB0.b)) {
                        int i10 = ((C8204yb1) list6.get(0)).a;
                        Rect rect = new Rect(0, 0, 1, 1);
                        viewGroup.offsetDescendantRectToMyCoords(view, rect);
                        int[] iArr2 = {rect.top, rect.left};
                        float f3 = iArr2[0];
                        float f4 = iArr2[1];
                        HashMap map7 = new HashMap(map);
                        HashMap map8 = new HashMap(map3);
                        HashMap map9 = new HashMap(map4);
                        float[] fArr5 = {f3, f4};
                        Iterator it = map7.entrySet().iterator();
                        while (it.hasNext()) {
                            ((Map.Entry) it.next()).setValue(fArr5);
                        }
                        float[] fArr6 = {0.0f, 0.0f};
                        Iterator it2 = map8.entrySet().iterator();
                        while (it2.hasNext()) {
                            ((Map.Entry) it2.next()).setValue(fArr6);
                        }
                        viewGroup.getLocationOnScreen(iArr);
                        float[] fArr7 = {fArr5[0] + iArr[0], fArr5[1] + iArr[1]};
                        Iterator it3 = map9.entrySet().iterator();
                        while (it3.hasNext()) {
                            ((Map.Entry) it3.next()).setValue(fArr7);
                        }
                        UB0 ub02 = new UB0(ub0.a, ub0.b, ub0.c, ub0.d, map7, new HashMap(map2), map8, map9, new HashSet(ub0.i));
                        UN1.c(interfaceC7405uP);
                        interfaceC7405uP.g(VB0.d("topPointerCancel", i10, ub02, motionEvent));
                    }
                    this.g = (this.g + 1) % Integer.MAX_VALUE;
                    i2 = -1;
                    this.f = -1;
                }
                c(i2, ub0, motionEvent, interfaceC7405uP);
                hashSet = hashSet4;
                this.b = new HashMap(ub0.g);
                this.h = motionEvent.getButtonState();
                hashSet.retainAll(this.b.keySet());
                break;
            case 4:
            case 8:
            default:
                AbstractC3393dS.p("ReactNative");
                break;
            case 7:
                float[] fArr8 = (float[]) map3.get(Integer.valueOf(i9));
                HashMap map10 = this.b;
                if (map10 == null || !map10.containsKey(Integer.valueOf(i9))) {
                    c = 0;
                    c2 = 1;
                    fArr = new float[]{0.0f, 0.0f};
                } else {
                    fArr = (float[]) this.b.get(Integer.valueOf(i9));
                    c = 0;
                    c2 = 1;
                }
                if (Math.abs(fArr[c] - fArr8[c]) > 0.1f || Math.abs(fArr[c2] - fArr8[c2]) > 0.1f) {
                    g(i, ub0, motionEvent, interfaceC7405uP);
                    hashSet = hashSet4;
                    this.b = new HashMap(ub0.g);
                    this.h = motionEvent.getButtonState();
                    hashSet.retainAll(this.b.keySet());
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                if (z2) {
                    g(i, ub0, motionEvent, interfaceC7405uP);
                }
                hashSet = hashSet4;
                this.b = new HashMap(ub0.g);
                this.h = motionEvent.getButtonState();
                hashSet.retainAll(this.b.keySet());
                break;
        }
    }

    public final void f(ViewGroup viewGroup, MotionEvent motionEvent, InterfaceC7405uP interfaceC7405uP) {
        if (this.e != -1 || viewGroup == null) {
            return;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        this.i.getLocationOnScreen(new int[2]);
        motionEventObtain.setLocation(motionEvent.getRawX() - r1[0], motionEvent.getRawY() - r1[1]);
        motionEventObtain.setAction(3);
        d(motionEventObtain, interfaceC7405uP, false);
        this.e = viewGroup.getId();
    }

    public final void g(int i, UB0 ub0, MotionEvent motionEvent, InterfaceC7405uP interfaceC7405uP) {
        if (e((List) ub0.f.get(Integer.valueOf(ub0.b)), WB0.k, WB0.l)) {
            short s = (short) (65535 & this.g);
            VB0 vb0 = (VB0) VB0.g.i();
            if (vb0 == null) {
                vb0 = new VB0();
            }
            UN1.c(motionEvent);
            vb0.c("topPointerMove", i, ub0, motionEvent, s);
            interfaceC7405uP.g(vb0);
        }
    }
}
