package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: ij0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4398ij0 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ C5939mj0 b;

    public /* synthetic */ C4398ij0(C5939mj0 c5939mj0, int i) {
        this.a = i;
        this.b = c5939mj0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C5748lj0 c5748lj0A;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C5939mj0 c5939mj0 = this.b;
                c5939mj0.getClass();
                Object key = entry.getKey();
                C5748lj0 c5748lj0 = null;
                if (key != null) {
                    try {
                        c5748lj0A = c5939mj0.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    c5748lj0A = null;
                }
                if (c5748lj0A != null && Objects.equals(c5748lj0A.d, entry.getValue())) {
                    c5748lj0 = c5748lj0A;
                }
                return c5748lj0 != null;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new C4017gj0(this.b, 0);
            default:
                return new C4017gj0(this.b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C5748lj0 c5748lj0A;
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C5939mj0 c5939mj0 = this.b;
                    c5939mj0.getClass();
                    Object key = entry.getKey();
                    C5748lj0 c5748lj0 = null;
                    if (key != null) {
                        try {
                            c5748lj0A = c5939mj0.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        c5748lj0A = null;
                    }
                    if (c5748lj0A != null && Objects.equals(c5748lj0A.d, entry.getValue())) {
                        c5748lj0 = c5748lj0A;
                    }
                    if (c5748lj0 != null) {
                        c5939mj0.e(c5748lj0, true);
                        break;
                    }
                }
                break;
            default:
                C5939mj0 c5939mj02 = this.b;
                c5939mj02.getClass();
                C5748lj0 c5748lj0A2 = null;
                if (obj != null) {
                    try {
                        c5748lj0A2 = c5939mj02.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c5748lj0A2 != null) {
                    c5939mj02.e(c5748lj0A2, true);
                }
                if (c5748lj0A2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.d;
    }
}
