package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: d32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3320d32 extends L02 {
    public final transient C6614qF1 c;
    public final transient Object[] d;
    public final transient int e = 1;

    public C3320d32(C6614qF1 c6614qF1, Object[] objArr) {
        this.c = c6614qF1;
        this.d = objArr;
    }

    @Override // defpackage.AbstractC7228tT1
    public final int b(Object[] objArr) {
        CY1 c8289z22 = this.b;
        if (c8289z22 == null) {
            c8289z22 = new C8289z22(this);
            this.b = c8289z22;
        }
        return c8289z22.b(objArr);
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
        CY1 c8289z22 = this.b;
        if (c8289z22 == null) {
            c8289z22 = new C8289z22(this);
            this.b = c8289z22;
        }
        return c8289z22.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
