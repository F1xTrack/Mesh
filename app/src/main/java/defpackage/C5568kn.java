package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: kn */
/* loaded from: classes.dex */
public final class C5568kn implements InterfaceC5934mh1 {
    public final JK b;

    public C5568kn(Context context) {
        this.b = JK.b(context);
    }

    @Override // defpackage.InterfaceC5934mh1
    public final InterfaceC7122sw a(EnumC5743lh1 enumC5743lh1, int i) {
        C5568kn c5568kn;
        C0468Ft0 c0468Ft0B = C0468Ft0.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        C0468Ft0 c0468Ft0B2 = C0468Ft0.b();
        ArrayList arrayList = new ArrayList();
        C0858Kt0 c0858Kt0A = C0858Kt0.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = enumC5743lh1.ordinal();
        int i2 = iOrdinal != 0 ? (iOrdinal == 3 && AbstractC7768wJ.a.z0(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i == 2 ? 5 : 1;
        C0572Hc c0572Hc = InterfaceC5361jh1.U0;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        C0873Ky0 c0873Ky0A = C0873Ky0.a(c0468Ft0B2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        C6974s81 c6974s81 = C6974s81.b;
        ArrayMap arrayMap = new ArrayMap();
        Iterator it = c0858Kt0A.a.keySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = it;
            String str = (String) it.next();
            arrayMap.put(str, c0858Kt0A.a.get(str));
            it = it2;
        }
        c0468Ft0B.e(c0572Hc, new C8194yY0(arrayList5, arrayList6, arrayList7, arrayList8, new C1702Vp(arrayList9, c0873Ky0A, i2, false, arrayList10, false, new C6974s81(arrayMap), null), null, null, 0, null));
        c0468Ft0B.e(InterfaceC5361jh1.W0, C5377jn.a);
        HashSet hashSet2 = new HashSet();
        C0468Ft0 c0468Ft0B3 = C0468Ft0.b();
        ArrayList arrayList11 = new ArrayList();
        C0858Kt0 c0858Kt0A2 = C0858Kt0.a();
        int iOrdinal2 = enumC5743lh1.ordinal();
        int i3 = iOrdinal2 != 0 ? (iOrdinal2 == 3 && AbstractC7768wJ.a.z0(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i == 2 ? 5 : 2;
        C0572Hc c0572Hc2 = InterfaceC5361jh1.V0;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        C0873Ky0 c0873Ky0A2 = C0873Ky0.a(c0468Ft0B3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        C6974s81 c6974s812 = C6974s81.b;
        ArrayMap arrayMap2 = new ArrayMap();
        for (String str2 : c0858Kt0A2.a.keySet()) {
            arrayMap2.put(str2, c0858Kt0A2.a.get(str2));
        }
        c0468Ft0B.e(c0572Hc2, new C1702Vp(arrayList12, c0873Ky0A2, i3, false, arrayList13, false, new C6974s81(arrayMap2), null));
        c0468Ft0B.e(InterfaceC5361jh1.X0, enumC5743lh1 == EnumC5743lh1.a ? C7920x60.b : C0602Hm.a);
        if (enumC5743lh1 == EnumC5743lh1.b) {
            c5568kn = this;
            c0468Ft0B.e(Y60.G0, c5568kn.b.e());
        } else {
            c5568kn = this;
        }
        c0468Ft0B.e(Y60.B0, Integer.valueOf(c5568kn.b.c(true).getRotation()));
        if (enumC5743lh1 == EnumC5743lh1.d || enumC5743lh1 == EnumC5743lh1.e) {
            c0468Ft0B.e(InterfaceC5361jh1.a1, Boolean.TRUE);
        }
        return C0873Ky0.a(c0468Ft0B);
    }
}
