package p000;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: iq */
/* loaded from: classes.dex */
public final class C6200iq {

    /* renamed from: a */
    public final C1373Vp f34757a;

    public C6200iq() {
        HashSet hashSet = new HashSet();
        C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
        ArrayList arrayList = new ArrayList();
        C7872Kt0 c7872Kt0M4776a = C7872Kt0.m4776a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        C7882Ky0 c7882Ky0M4786a = C7882Ky0.m4786a(c7612Ft0M2812b);
        ArrayList arrayList3 = new ArrayList(arrayList);
        C10996s81 c10996s81 = C10996s81.f42278b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c7872Kt0M4776a.f42279a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.f34757a = new C1373Vp(arrayList2, c7882Ky0M4786a, -1, false, arrayList3, false, new C10996s81(arrayMap), null);
    }
}
