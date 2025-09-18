package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class GO implements Iterable {
    public final ArrayList a;

    public GO(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
