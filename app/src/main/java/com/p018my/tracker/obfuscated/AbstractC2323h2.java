package com.p018my.tracker.obfuscated;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.my.tracker.obfuscated.h2 */
/* loaded from: classes2.dex */
public abstract class AbstractC2323h2 {

    /* renamed from: a */
    final SparseArray f19976a = new SparseArray(20);

    /* renamed from: b */
    final SparseArray f19977b = new SparseArray(20);

    /* renamed from: a */
    public final ArrayList m13188a() {
        int size = this.f19977b.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((InterfaceC2315f2) this.f19977b.valueAt(i));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final int m13190b() {
        return this.f19976a.size();
    }

    /* renamed from: a */
    public final String m13187a(boolean z) {
        return z ? "[FOREGROUND] " : "[BACKGROUND] ";
    }

    /* renamed from: b */
    public final boolean m13191b(int i) {
        return this.f19976a.get(i) != null;
    }

    /* renamed from: a */
    public final InterfaceC2311e2 m13186a(int i) {
        InterfaceC2311e2 interfaceC2311e2 = (InterfaceC2311e2) this.f19977b.get(i);
        if (interfaceC2311e2 != null) {
            return interfaceC2311e2;
        }
        C2319g2 c2319g2 = new C2319g2(i);
        this.f19977b.put(i, c2319g2);
        return c2319g2;
    }

    /* renamed from: a */
    public final void m13189a(long j) {
        for (int i = 0; i < this.f19976a.size(); i++) {
            ((InterfaceC2378v1) this.f19976a.valueAt(i)).mo13520b(j);
        }
    }
}
