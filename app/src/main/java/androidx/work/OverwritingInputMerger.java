package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p000.C7249zC;
import p000.C7621Fx1;
import p000.F80;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends F80 {
    @Override // p000.F80
    /* renamed from: a */
    public final C7249zC mo2495a(ArrayList arrayList) throws Throwable {
        C7621Fx1 c7621Fx1 = new C7621Fx1(13);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((C7249zC) it.next()).f46722a));
        }
        c7621Fx1.m2859w(map);
        C7249zC c7249zC = new C7249zC((HashMap) c7621Fx1.f3494a);
        C7249zC.m26327c(c7249zC);
        return c7249zC;
    }
}
