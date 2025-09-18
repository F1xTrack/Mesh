package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: As0 */
/* loaded from: classes2.dex */
public final class C7350As0 {

    /* renamed from: a */
    public final String f454a;

    /* renamed from: b */
    public final C6479nH f455b;

    /* renamed from: c */
    public final LinkedHashMap f456c;

    /* renamed from: d */
    public final ArrayList f457d;

    /* renamed from: e */
    public final LinkedHashMap f458e;

    /* renamed from: f */
    public final C7621Fx1 f459f;

    public C7350As0(String str, C6479nH c6479nH, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        O90.m5968f(linkedHashMap, "eventListeners");
        O90.m5968f(arrayList, "classData");
        this.f454a = str;
        this.f455b = c6479nH;
        this.f456c = linkedHashMap;
        this.f457d = arrayList;
        Object obj = c6479nH.f38227a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c6479nH.f38229c;
        this.f458e = linkedHashMap2;
        this.f459f = (C7621Fx1) c6479nH.f38230d;
        Iterator it = ((LinkedHashMap) c6479nH.f38228b).values().iterator();
        Iterator it2 = linkedHashMap2.values().iterator();
        O90.m5968f(it, "first");
        O90.m5968f(it2, "second");
    }
}
