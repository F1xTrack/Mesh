package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: As0 */
/* loaded from: classes2.dex */
public final class C0075As0 {
    public final String a;
    public final C6045nH b;
    public final LinkedHashMap c;
    public final ArrayList d;
    public final LinkedHashMap e;
    public final C0481Fx1 f;

    public C0075As0(String str, C6045nH c6045nH, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        O90.f(linkedHashMap, "eventListeners");
        O90.f(arrayList, "classData");
        this.a = str;
        this.b = c6045nH;
        this.c = linkedHashMap;
        this.d = arrayList;
        Object obj = c6045nH.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c6045nH.c;
        this.e = linkedHashMap2;
        this.f = (C0481Fx1) c6045nH.d;
        Iterator it = ((LinkedHashMap) c6045nH.b).values().iterator();
        Iterator it2 = linkedHashMap2.values().iterator();
        O90.f(it, "first");
        O90.f(it2, "second");
    }
}
