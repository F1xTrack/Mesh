package defpackage;

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
public final class C8194yY0 {
    public static final List j = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final C8211ye b;
    public final List c;
    public final List d;
    public final List e;
    public final InterfaceC7814wY0 f;
    public final C1702Vp g;
    public final int h;
    public final InputConfiguration i;

    public C8194yY0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C1702Vp c1702Vp, InterfaceC7814wY0 interfaceC7814wY0, InputConfiguration inputConfiguration, int i, C8211ye c8211ye) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = interfaceC7814wY0;
        this.g = c1702Vp;
        this.i = inputConfiguration;
        this.h = i;
        this.b = c8211ye;
    }

    public static C8194yY0 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        C0468Ft0 c0468Ft0B = C0468Ft0.b();
        ArrayList arrayList5 = new ArrayList();
        C0858Kt0 c0858Kt0A = C0858Kt0.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        C0873Ky0 c0873Ky0A = C0873Ky0.a(c0468Ft0B);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        C6974s81 c6974s81 = C6974s81.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c0858Kt0A.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new C8194yY0(arrayList, arrayList2, arrayList3, arrayList4, new C1702Vp(arrayList6, c0873Ky0A, -1, false, arrayList7, false, new C6974s81(arrayMap), null), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            C8211ye c8211ye = (C8211ye) it.next();
            arrayList.add(c8211ye.a);
            Iterator it2 = c8211ye.b.iterator();
            while (it2.hasNext()) {
                arrayList.add((AbstractC4314iH) it2.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
