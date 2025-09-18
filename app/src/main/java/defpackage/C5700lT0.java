package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5700lT0 {
    public final ArrayList a;
    public int b;

    public C5700lT0() {
        this.a = new ArrayList();
        this.b = 128;
    }

    public synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.a));
    }

    public boolean b() {
        return this.b < this.a.size();
    }

    public synchronized boolean c(List list) {
        this.a.clear();
        int size = list.size();
        int i = this.b;
        if (size <= i) {
            return this.a.addAll(list);
        }
        return this.a.addAll(list.subList(0, i));
    }

    public C5700lT0(ArrayList arrayList) {
        this.a = arrayList;
    }
}
