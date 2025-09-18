package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: fF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3737fF1 extends UD1 {
    public final transient C6614qF1 c;
    public final transient Object[] d;
    public final transient int e = 1;

    public C3737fF1(C6614qF1 c6614qF1, Object[] objArr) {
        this.c = c6614qF1;
        this.d = objArr;
    }

    @Override // defpackage.AbstractC7371uD1
    public final int b(int i, Object[] objArr) {
        KD1 c2290bF1 = this.b;
        if (c2290bF1 == null) {
            c2290bF1 = new C2290bF1(this);
            this.b = c2290bF1;
        }
        return c2290bF1.b(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        KD1 c2290bF1 = this.b;
        if (c2290bF1 == null) {
            c2290bF1 = new C2290bF1(this);
            this.b = c2290bF1;
        }
        return c2290bF1.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
