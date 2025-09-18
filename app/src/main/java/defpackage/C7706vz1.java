package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: vz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7706vz1 extends AbstractC1575Ty1 {
    public final transient C0954Lz1 c;
    public final transient Object[] d;
    public final transient int e;

    public C7706vz1(C0954Lz1 c0954Lz1, Object[] objArr, int i) {
        this.c = c0954Lz1;
        this.d = objArr;
        this.e = i;
    }

    @Override // defpackage.AbstractC2424by1
    public final int b(Object[] objArr) {
        AbstractC7512uy1 c6370oz1 = this.b;
        if (c6370oz1 == null) {
            c6370oz1 = new C6370oz1(this);
            this.b = c6370oz1;
        }
        return c6370oz1.b(objArr);
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
        AbstractC7512uy1 c6370oz1 = this.b;
        if (c6370oz1 == null) {
            c6370oz1 = new C6370oz1(this);
            this.b = c6370oz1;
        }
        return c6370oz1.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
