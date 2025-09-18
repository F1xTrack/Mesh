package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: iq */
/* loaded from: classes.dex */
public final class C5196iq {
    public final C1702Vp a;

    public C5196iq() {
        HashSet hashSet = new HashSet();
        C0468Ft0 c0468Ft0B = C0468Ft0.b();
        ArrayList arrayList = new ArrayList();
        C0858Kt0 c0858Kt0A = C0858Kt0.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        C0873Ky0 c0873Ky0A = C0873Ky0.a(c0468Ft0B);
        ArrayList arrayList3 = new ArrayList(arrayList);
        C6974s81 c6974s81 = C6974s81.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c0858Kt0A.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.a = new C1702Vp(arrayList2, c0873Ky0A, -1, false, arrayList3, false, new C6974s81(arrayMap), null);
    }
}
