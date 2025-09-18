package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: fF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9346fF1 extends UD1 {

    /* renamed from: c */
    public final transient C10754qF1 f27121c;

    /* renamed from: d */
    public final transient Object[] f27122d;

    /* renamed from: e */
    public final transient int f27123e = 1;

    public C9346fF1(C10754qF1 c10754qF1, Object[] objArr) {
        this.f27121c = c10754qF1;
        this.f27122d = objArr;
    }

    @Override // p000.AbstractC11262uD1
    /* renamed from: b */
    public final int mo4582b(int i, Object[] objArr) {
        KD1 c8829bF1 = this.f11696b;
        if (c8829bF1 == null) {
            c8829bF1 = new C8829bF1(this);
            this.f11696b = c8829bF1;
        }
        return c8829bF1.mo4582b(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f27121c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        KD1 c8829bF1 = this.f11696b;
        if (c8829bF1 == null) {
            c8829bF1 = new C8829bF1(this);
            this.f11696b = c8829bF1;
        }
        return c8829bF1.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27123e;
    }
}
