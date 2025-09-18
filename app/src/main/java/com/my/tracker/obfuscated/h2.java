package com.my.tracker.obfuscated;

import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class h2 {
    final SparseArray a = new SparseArray(20);
    final SparseArray b = new SparseArray(20);

    public final ArrayList a() {
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((f2) this.b.valueAt(i));
        }
        return arrayList;
    }

    public final int b() {
        return this.a.size();
    }

    public final String a(boolean z) {
        return z ? "[FOREGROUND] " : "[BACKGROUND] ";
    }

    public final boolean b(int i) {
        return this.a.get(i) != null;
    }

    public final e2 a(int i) {
        e2 e2Var = (e2) this.b.get(i);
        if (e2Var != null) {
            return e2Var;
        }
        g2 g2Var = new g2(i);
        this.b.put(i, g2Var);
        return g2Var;
    }

    public final void a(long j) {
        for (int i = 0; i < this.a.size(); i++) {
            ((v1) this.a.valueAt(i)).b(j);
        }
    }
}
