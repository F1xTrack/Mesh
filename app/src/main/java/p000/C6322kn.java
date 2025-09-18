package p000;

import android.content.Context;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: kn */
/* loaded from: classes.dex */
public final class C6322kn implements InterfaceC10298mh1 {

    /* renamed from: b */
    public final C0588JK f36692b;

    public C6322kn(Context context) {
        this.f36692b = C0588JK.m4281b(context);
    }

    @Override // p000.InterfaceC10298mh1
    /* renamed from: a */
    public final InterfaceC6854sw mo6364a(EnumC10170lh1 enumC10170lh1, int i) {
        C6322kn c6322kn;
        C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        C7612Ft0 c7612Ft0M2812b2 = C7612Ft0.m2812b();
        ArrayList arrayList = new ArrayList();
        C7872Kt0 c7872Kt0M4776a = C7872Kt0.m4776a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = enumC10170lh1.ordinal();
        int i2 = iOrdinal != 0 ? (iOrdinal == 3 && AbstractC7067wJ.f44776a.m17864z0(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i == 2 ? 5 : 1;
        C0480Hc c0480Hc = InterfaceC9914jh1.f35324U0;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        C7882Ky0 c7882Ky0M4786a = C7882Ky0.m4786a(c7612Ft0M2812b2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        C10996s81 c10996s81 = C10996s81.f42278b;
        ArrayMap arrayMap = new ArrayMap();
        Iterator it = c7872Kt0M4776a.f42279a.keySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = it;
            String str = (String) it.next();
            arrayMap.put(str, c7872Kt0M4776a.f42279a.get(str));
            it = it2;
        }
        c7612Ft0M2812b.m2815e(c0480Hc, new C11812yY0(arrayList5, arrayList6, arrayList7, arrayList8, new C1373Vp(arrayList9, c7882Ky0M4786a, i2, false, arrayList10, false, new C10996s81(arrayMap), null), null, null, 0, null));
        c7612Ft0M2812b.m2815e(InterfaceC9914jh1.f35326W0, C6259jn.f35377a);
        HashSet hashSet2 = new HashSet();
        C7612Ft0 c7612Ft0M2812b3 = C7612Ft0.m2812b();
        ArrayList arrayList11 = new ArrayList();
        C7872Kt0 c7872Kt0M4776a2 = C7872Kt0.m4776a();
        int iOrdinal2 = enumC10170lh1.ordinal();
        int i3 = iOrdinal2 != 0 ? (iOrdinal2 == 3 && AbstractC7067wJ.f44776a.m17864z0(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i == 2 ? 5 : 2;
        C0480Hc c0480Hc2 = InterfaceC9914jh1.f35325V0;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        C7882Ky0 c7882Ky0M4786a2 = C7882Ky0.m4786a(c7612Ft0M2812b3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        C10996s81 c10996s812 = C10996s81.f42278b;
        ArrayMap arrayMap2 = new ArrayMap();
        for (String str2 : c7872Kt0M4776a2.f42279a.keySet()) {
            arrayMap2.put(str2, c7872Kt0M4776a2.f42279a.get(str2));
        }
        c7612Ft0M2812b.m2815e(c0480Hc2, new C1373Vp(arrayList12, c7882Ky0M4786a2, i3, false, arrayList13, false, new C10996s81(arrayMap2), null));
        c7612Ft0M2812b.m2815e(InterfaceC9914jh1.f35327X0, enumC10170lh1 == EnumC10170lh1.f37251a ? C11629x60.f45366b : C0490Hm.f4485a);
        if (enumC10170lh1 == EnumC10170lh1.f37252b) {
            c6322kn = this;
            c7612Ft0M2812b.m2815e(Y60.f14165G0, c6322kn.f36692b.m4285e());
        } else {
            c6322kn = this;
        }
        c7612Ft0M2812b.m2815e(Y60.f14160B0, Integer.valueOf(c6322kn.f36692b.m4284c(true).getRotation()));
        if (enumC10170lh1 == EnumC10170lh1.f37254d || enumC10170lh1 == EnumC10170lh1.f37255e) {
            c7612Ft0M2812b.m2815e(InterfaceC9914jh1.f35330a1, Boolean.TRUE);
        }
        return C7882Ky0.m4786a(c7612Ft0M2812b);
    }
}
