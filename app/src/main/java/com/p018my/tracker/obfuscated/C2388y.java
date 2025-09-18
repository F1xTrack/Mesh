package com.p018my.tracker.obfuscated;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.my.tracker.obfuscated.y */
/* loaded from: classes2.dex */
public class C2388y {

    /* renamed from: a */
    final SparseArray f20164a = new SparseArray(50);

    /* renamed from: c */
    private InterfaceC2376v m13556c(int i) {
        C2384x c2384x = new C2384x(i);
        this.f20164a.put(i, c2384x);
        return c2384x;
    }

    /* renamed from: a */
    public ArrayList m13557a() {
        AbstractC2391y2.m13568a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: start collecting count based TimeSpents");
        int size = this.f20164a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((InterfaceC2380w) this.f20164a.valueAt(i));
        }
        this.f20164a.clear();
        AbstractC2391y2.m13568a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: collected " + arrayList.size() + " count based TimeSpents");
        return arrayList;
    }

    /* renamed from: b */
    public void m13559b(int i) {
        InterfaceC2376v interfaceC2376vM13556c = (InterfaceC2376v) this.f20164a.get(i);
        if (interfaceC2376vM13556c != null) {
            AbstractC2391y2.m13568a("TimeSpentCore: CountBasedTimeSpentsManager: found existed count based record with id = " + i);
        } else {
            AbstractC2391y2.m13568a("TimeSpentCore: CountBasedTimeSpentsManager: not found existed count based record with id = " + i + ", creating new");
            interfaceC2376vM13556c = m13556c(i);
        }
        interfaceC2376vM13556c.mo13517f();
        AbstractC2391y2.m13574c("TimeSpent: incremented count based TimeSpent, id = " + i + ", count = " + interfaceC2376vM13556c.mo13516d());
    }

    /* renamed from: a */
    public boolean m13558a(int i) {
        return this.f20164a.get(i) != null;
    }
}
