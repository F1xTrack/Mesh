package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: d32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9066d32 extends L02 {

    /* renamed from: c */
    public final transient C10754qF1 f25787c;

    /* renamed from: d */
    public final transient Object[] f25788d;

    /* renamed from: e */
    public final transient int f25789e = 1;

    public C9066d32(C10754qF1 c10754qF1, Object[] objArr) {
        this.f25787c = c10754qF1;
        this.f25788d = objArr;
    }

    @Override // p000.AbstractC11166tT1
    /* renamed from: b */
    public final int mo1209b(Object[] objArr) {
        CY1 c11876z22 = this.f6451b;
        if (c11876z22 == null) {
            c11876z22 = new C11876z22(this);
            this.f6451b = c11876z22;
        }
        return c11876z22.mo1209b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f25787c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        CY1 c11876z22 = this.f6451b;
        if (c11876z22 == null) {
            c11876z22 = new C11876z22(this);
            this.f6451b = c11876z22;
        }
        return c11876z22.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25789e;
    }
}
