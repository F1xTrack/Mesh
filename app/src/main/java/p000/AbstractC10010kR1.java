package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: kR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10010kR1 {
    /* renamed from: a */
    public static C9505gV0 m22211a(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new C9505gV0();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                O90.m5967e(str, "key");
                map.put(str, bundle2.get(str));
            }
            return new C9505gV0(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            O90.m5966d(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new C9505gV0(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:285:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0558  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C9196e41 m22212b(p000.C0428Gn r13) {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10010kR1.m22212b(Gn):e41");
    }
}
