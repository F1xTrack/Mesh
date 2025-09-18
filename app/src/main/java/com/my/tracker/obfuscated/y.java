package com.my.tracker.obfuscated;

import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class y {
    final SparseArray a = new SparseArray(50);

    private v c(int i) {
        x xVar = new x(i);
        this.a.put(i, xVar);
        return xVar;
    }

    public ArrayList a() {
        y2.a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: start collecting count based TimeSpents");
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((w) this.a.valueAt(i));
        }
        this.a.clear();
        y2.a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: collected " + arrayList.size() + " count based TimeSpents");
        return arrayList;
    }

    public void b(int i) {
        v vVarC = (v) this.a.get(i);
        if (vVarC != null) {
            y2.a("TimeSpentCore: CountBasedTimeSpentsManager: found existed count based record with id = " + i);
        } else {
            y2.a("TimeSpentCore: CountBasedTimeSpentsManager: not found existed count based record with id = " + i + ", creating new");
            vVarC = c(i);
        }
        vVarC.f();
        y2.c("TimeSpent: incremented count based TimeSpent, id = " + i + ", count = " + vVarC.d());
    }

    public boolean a(int i) {
        return this.a.get(i) != null;
    }
}
