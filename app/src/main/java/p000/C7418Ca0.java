package p000;

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
public class C7418Ca0 {

    /* renamed from: j */
    public static final int[] f1456j = {0, 0};

    /* renamed from: a */
    public HashMap f1457a;

    /* renamed from: b */
    public HashMap f1458b;

    /* renamed from: i */
    public final ViewGroup f1465i;

    /* renamed from: d */
    public final HashSet f1460d = new HashSet();

    /* renamed from: e */
    public int f1461e = -1;

    /* renamed from: f */
    public int f1462f = -1;

    /* renamed from: g */
    public int f1463g = 0;

    /* renamed from: h */
    public int f1464h = 0;

    /* renamed from: c */
    public final HashMap f1459c = new HashMap();

    public C7418Ca0(ViewGroup viewGroup) {
        this.f1465i = viewGroup;
    }

    /* renamed from: a */
    public static void m1237a(String str, UB0 ub0, MotionEvent motionEvent, ArrayList arrayList, InterfaceC6947uP interfaceC6947uP) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            interfaceC6947uP.mo11046g(VB0.m8325d(str, ((C11819yb1) it.next()).f46332a, ub0, motionEvent));
        }
    }

    /* renamed from: b */
    public static ArrayList m1238b(List list, WB0 wb0, WB0 wb02, boolean z) {
        ArrayList arrayList = new ArrayList(list);
        if (z) {
            return arrayList;
        }
        boolean z2 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            View view = ((C11819yb1) list.get(size)).f46333b;
            if (!z2 && !BL1.m668a(view, wb02) && !BL1.m668a(view, wb0)) {
                arrayList.remove(size);
            } else if (!z2 && BL1.m668a(view, wb02)) {
                z2 = true;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static boolean m1239e(List list, WB0 wb0, WB0 wb02) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C11819yb1 c11819yb1 = (C11819yb1) it.next();
            if (BL1.m668a(c11819yb1.f46333b, wb0) || BL1.m668a(c11819yb1.f46333b, wb02)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m1240c(int i, UB0 ub0, MotionEvent motionEvent, InterfaceC6947uP interfaceC6947uP) {
        WB0 wb0;
        WB0 wb02;
        int i2 = ub0.f11674b;
        HashMap map = ub0.f11678f;
        List arrayList = i != -1 ? (List) map.get(Integer.valueOf(i2)) : new ArrayList();
        HashMap map2 = this.f1457a;
        List arrayList2 = (map2 == null || !map2.containsKey(Integer.valueOf(i2))) ? new ArrayList() : (List) this.f1457a.get(Integer.valueOf(i2));
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int iMin = Math.min(arrayList.size(), arrayList2.size());
            wb0 = WB0.f13047j;
            wb02 = WB0.f13045h;
            if (i3 >= iMin || !((C11819yb1) arrayList.get((arrayList.size() - 1) - i3)).equals(arrayList2.get((arrayList2.size() - 1) - i3))) {
                break;
            }
            View view = ((C11819yb1) arrayList.get((arrayList.size() - 1) - i3)).f46333b;
            if (!z && BL1.m668a(view, wb02)) {
                z = true;
            }
            if (!z2 && BL1.m668a(view, wb0)) {
                z2 = true;
            }
            i3++;
        }
        if (i3 < Math.max(arrayList.size(), arrayList2.size())) {
            this.f1463g = (this.f1463g + 1) % Integer.MAX_VALUE;
            if (arrayList2.size() > 0) {
                int i4 = ((C11819yb1) arrayList2.get(0)).f46332a;
                if (m1239e(arrayList2, WB0.f13052o, WB0.f13053p)) {
                    interfaceC6947uP.mo11046g(VB0.m8325d("topPointerOut", i4, ub0, motionEvent));
                }
                ArrayList arrayListM1238b = m1238b(arrayList2.subList(0, arrayList2.size() - i3), WB0.f13046i, wb0, z2);
                if (arrayListM1238b.size() > 0) {
                    m1237a("topPointerLeave", ub0, motionEvent, arrayListM1238b, interfaceC6947uP);
                }
            }
            if (m1239e(arrayList, WB0.f13054q, WB0.f13055r)) {
                interfaceC6947uP.mo11046g(VB0.m8325d("topPointerOver", i, ub0, motionEvent));
            }
            ArrayList arrayListM1238b2 = m1238b(arrayList.subList(0, arrayList.size() - i3), WB0.f13044g, wb02, z);
            if (arrayListM1238b2.size() > 0) {
                Collections.reverse(arrayListM1238b2);
                m1237a("topPointerEnter", ub0, motionEvent, arrayListM1238b2, interfaceC6947uP);
            }
        }
        HashMap map3 = new HashMap(map);
        if (i == -1) {
            map3.remove(Integer.valueOf(i2));
        }
        this.f1457a = map3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v56, types: [java.util.List] */
    /* renamed from: d */
    public void m1241d(MotionEvent motionEvent, InterfaceC6947uP interfaceC6947uP, boolean z) {
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
        if (this.f1461e != -1) {
        }
        int actionMasked = motionEvent.getActionMasked();
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        HashSet hashSet2 = this.f1460d;
        if (actionMasked == 0) {
            this.f1462f = motionEvent.getPointerId(0);
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
            iArr = f1456j;
            viewGroup = this.f1465i;
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
            float[] fArr3 = AbstractC11946zb1.f46885a;
            UiThreadUtil.assertOnUiThread();
            HashSet hashSet3 = hashSet2;
            float[] fArr4 = new float[i4];
            fArr4[0] = f;
            fArr4[1] = f2;
            ArrayList arrayList2 = new ArrayList();
            View viewM26477c = AbstractC11946zb1.m26477c(fArr4, viewGroup, arrayList2);
            int i6 = actionMasked;
            if (viewM26477c != null) {
                View view2 = viewM26477c;
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
                    arrayList2.add(0, new C11819yb1(iReactTagForTouch, null));
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
        UB0 ub0 = new UB0(this.f1462f, i9, this.f1464h, OZ1.m6094e(viewGroup), map, map2, map3, map4, hashSet4);
        boolean z2 = z && motionEvent.getActionMasked() == 10;
        if (z2) {
            HashMap map5 = this.f1457a;
            List list = map5 != null ? (List) map5.get(Integer.valueOf(i9)) : null;
            if (list == null || list.isEmpty()) {
                return;
            }
            C11819yb1 c11819yb1 = (C11819yb1) list.get(list.size() - 1);
            i = c11819yb1.f46332a;
            map2.put(Integer.valueOf(i9), new ArrayList());
            view = c11819yb1.f46333b;
        } else {
            List list2 = (List) map2.get(Integer.valueOf(i9));
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            C11819yb1 c11819yb12 = (C11819yb1) list2.get(0);
            i = c11819yb12.f46332a;
            view = c11819yb12.f46333b;
        }
        m1240c(i, ub0, motionEvent, interfaceC6947uP);
        WB0 wb0 = WB0.f13041d;
        WB0 wb02 = WB0.f13040c;
        HashMap map6 = this.f1459c;
        switch (i8) {
            case 0:
            case 5:
                hashSet = hashSet4;
                List list3 = (List) map2.get(Integer.valueOf(i9));
                this.f1463g = (this.f1463g + 1) % Integer.MAX_VALUE;
                if (!hashSet.contains(Integer.valueOf(i9))) {
                    if (m1239e(list3, WB0.f13054q, WB0.f13055r)) {
                        interfaceC6947uP.mo11046g(VB0.m8325d("topPointerOver", i, ub0, motionEvent));
                    }
                    ArrayList arrayListM1238b = m1238b(list3, WB0.f13044g, WB0.f13045h, false);
                    Collections.reverse(arrayListM1238b);
                    m1237a("topPointerEnter", ub0, motionEvent, arrayListM1238b, interfaceC6947uP);
                }
                if (m1239e(list3, wb02, wb0)) {
                    map6.put(Integer.valueOf(i9), new ArrayList(list3));
                }
                if (m1239e(list3, WB0.f13042e, WB0.f13043f)) {
                    interfaceC6947uP.mo11046g(VB0.m8325d("topPointerDown", i, ub0, motionEvent));
                }
                this.f1458b = new HashMap(ub0.f11679g);
                this.f1464h = motionEvent.getButtonState();
                hashSet.retainAll(this.f1458b.keySet());
                break;
            case 1:
            case 6:
                this.f1463g = (this.f1463g + 1) % Integer.MAX_VALUE;
                List<C11819yb1> list4 = (List) map2.get(Integer.valueOf(i9));
                if (m1239e(list4, WB0.f13050m, WB0.f13051n)) {
                    interfaceC6947uP.mo11046g(VB0.m8325d("topPointerUp", i, ub0, motionEvent));
                }
                hashSet = hashSet4;
                if (!hashSet.contains(Integer.valueOf(i9))) {
                    if (m1239e(list4, WB0.f13052o, WB0.f13053p)) {
                        interfaceC6947uP.mo11046g(VB0.m8325d("topPointerOut", i, ub0, motionEvent));
                    }
                    m1237a("topPointerLeave", ub0, motionEvent, m1238b(list4, WB0.f13046i, WB0.f13047j, false), interfaceC6947uP);
                }
                List list5 = (List) map6.remove(Integer.valueOf(i9));
                if (list5 != null && m1239e(list4, wb02, wb0)) {
                    if (list5.isEmpty() || list4.isEmpty()) {
                        arrayList = new ArrayList();
                    } else {
                        HashSet hashSet5 = new HashSet(list5);
                        ArrayList arrayList3 = new ArrayList();
                        for (C11819yb1 c11819yb13 : list4) {
                            if (hashSet5.contains(c11819yb13)) {
                                arrayList3.add(c11819yb13);
                            }
                        }
                        arrayList = arrayList3;
                    }
                    if (!arrayList.isEmpty()) {
                        interfaceC6947uP.mo11046g(VB0.m8325d("topClick", ((C11819yb1) arrayList.get(0)).f46332a, ub0, motionEvent));
                    }
                }
                if (motionEvent.getActionMasked() == 1) {
                    this.f1462f = -1;
                }
                hashSet.remove(Integer.valueOf(i9));
                this.f1458b = new HashMap(ub0.f11679g);
                this.f1464h = motionEvent.getButtonState();
                hashSet.retainAll(this.f1458b.keySet());
                break;
            case 2:
                m1243g(i, ub0, motionEvent, interfaceC6947uP);
                hashSet = hashSet4;
                this.f1458b = new HashMap(ub0.f11679g);
                this.f1464h = motionEvent.getButtonState();
                hashSet.retainAll(this.f1458b.keySet());
                break;
            case 3:
                UN1.m7998b(this.f1461e == -1, "Expected to not have already sent a cancel for this gesture");
                List list6 = (List) map2.get(Integer.valueOf(i9));
                if (list6.isEmpty() || view == null) {
                    i2 = -1;
                } else {
                    if (m1239e(list6, WB0.f13038a, WB0.f13039b)) {
                        int i10 = ((C11819yb1) list6.get(0)).f46332a;
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
                        UB0 ub02 = new UB0(ub0.f11673a, ub0.f11674b, ub0.f11675c, ub0.f11676d, map7, new HashMap(map2), map8, map9, new HashSet(ub0.f11681i));
                        UN1.m7999c(interfaceC6947uP);
                        interfaceC6947uP.mo11046g(VB0.m8325d("topPointerCancel", i10, ub02, motionEvent));
                    }
                    this.f1463g = (this.f1463g + 1) % Integer.MAX_VALUE;
                    i2 = -1;
                    this.f1462f = -1;
                }
                m1240c(i2, ub0, motionEvent, interfaceC6947uP);
                hashSet = hashSet4;
                this.f1458b = new HashMap(ub0.f11679g);
                this.f1464h = motionEvent.getButtonState();
                hashSet.retainAll(this.f1458b.keySet());
                break;
            case 4:
            case 8:
            default:
                AbstractC3929dS.m17683p("ReactNative");
                break;
            case 7:
                float[] fArr8 = (float[]) map3.get(Integer.valueOf(i9));
                HashMap map10 = this.f1458b;
                if (map10 == null || !map10.containsKey(Integer.valueOf(i9))) {
                    c = 0;
                    c2 = 1;
                    fArr = new float[]{0.0f, 0.0f};
                } else {
                    fArr = (float[]) this.f1458b.get(Integer.valueOf(i9));
                    c = 0;
                    c2 = 1;
                }
                if (Math.abs(fArr[c] - fArr8[c]) > 0.1f || Math.abs(fArr[c2] - fArr8[c2]) > 0.1f) {
                    m1243g(i, ub0, motionEvent, interfaceC6947uP);
                    hashSet = hashSet4;
                    this.f1458b = new HashMap(ub0.f11679g);
                    this.f1464h = motionEvent.getButtonState();
                    hashSet.retainAll(this.f1458b.keySet());
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                if (z2) {
                    m1243g(i, ub0, motionEvent, interfaceC6947uP);
                }
                hashSet = hashSet4;
                this.f1458b = new HashMap(ub0.f11679g);
                this.f1464h = motionEvent.getButtonState();
                hashSet.retainAll(this.f1458b.keySet());
                break;
        }
    }

    /* renamed from: f */
    public final void m1242f(ViewGroup viewGroup, MotionEvent motionEvent, InterfaceC6947uP interfaceC6947uP) {
        if (this.f1461e != -1 || viewGroup == null) {
            return;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        this.f1465i.getLocationOnScreen(new int[2]);
        motionEventObtain.setLocation(motionEvent.getRawX() - r1[0], motionEvent.getRawY() - r1[1]);
        motionEventObtain.setAction(3);
        m1241d(motionEventObtain, interfaceC6947uP, false);
        this.f1461e = viewGroup.getId();
    }

    /* renamed from: g */
    public final void m1243g(int i, UB0 ub0, MotionEvent motionEvent, InterfaceC6947uP interfaceC6947uP) {
        if (m1239e((List) ub0.f11678f.get(Integer.valueOf(ub0.f11674b)), WB0.f13048k, WB0.f13049l)) {
            short s = (short) (65535 & this.f1463g);
            VB0 vb0 = (VB0) VB0.f12397g.mo4581i();
            if (vb0 == null) {
                vb0 = new VB0();
            }
            UN1.m7999c(motionEvent);
            vb0.m8328c("topPointerMove", i, ub0, motionEvent, s);
            interfaceC6947uP.mo11046g(vb0);
        }
    }
}
