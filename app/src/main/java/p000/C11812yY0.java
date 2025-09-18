package p000;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: yY0 */
/* loaded from: classes.dex */
public final class C11812yY0 {

    /* renamed from: j */
    public static final List f46297j = Arrays.asList(1, 5, 3);

    /* renamed from: a */
    public final ArrayList f46298a;

    /* renamed from: b */
    public final C7214ye f46299b;

    /* renamed from: c */
    public final List f46300c;

    /* renamed from: d */
    public final List f46301d;

    /* renamed from: e */
    public final List f46302e;

    /* renamed from: f */
    public final InterfaceC11558wY0 f46303f;

    /* renamed from: g */
    public final C1373Vp f46304g;

    /* renamed from: h */
    public final int f46305h;

    /* renamed from: i */
    public final InputConfiguration f46306i;

    public C11812yY0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C1373Vp c1373Vp, InterfaceC11558wY0 interfaceC11558wY0, InputConfiguration inputConfiguration, int i, C7214ye c7214ye) {
        this.f46298a = arrayList;
        this.f46300c = Collections.unmodifiableList(arrayList2);
        this.f46301d = Collections.unmodifiableList(arrayList3);
        this.f46302e = Collections.unmodifiableList(arrayList4);
        this.f46303f = interfaceC11558wY0;
        this.f46304g = c1373Vp;
        this.f46306i = inputConfiguration;
        this.f46305h = i;
        this.f46299b = c7214ye;
    }

    /* renamed from: a */
    public static C11812yY0 m26163a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
        ArrayList arrayList5 = new ArrayList();
        C7872Kt0 c7872Kt0M4776a = C7872Kt0.m4776a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        C7882Ky0 c7882Ky0M4786a = C7882Ky0.m4786a(c7612Ft0M2812b);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        C10996s81 c10996s81 = C10996s81.f42278b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c7872Kt0M4776a.f42279a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new C11812yY0(arrayList, arrayList2, arrayList3, arrayList4, new C1373Vp(arrayList6, c7882Ky0M4786a, -1, false, arrayList7, false, new C10996s81(arrayMap), null), null, null, 0, null);
    }

    /* renamed from: b */
    public final List m26164b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f46298a.iterator();
        while (it.hasNext()) {
            C7214ye c7214ye = (C7214ye) it.next();
            arrayList.add(c7214ye.f46367a);
            Iterator it2 = c7214ye.f46368b.iterator();
            while (it2.hasNext()) {
                arrayList.add((AbstractC4232iH) it2.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
