package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: ij0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9789ij0 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f29422a;

    /* renamed from: b */
    public final /* synthetic */ C10301mj0 f29423b;

    public /* synthetic */ C9789ij0(C10301mj0 c10301mj0, int i) {
        this.f29422a = i;
        this.f29423b = c10301mj0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f29422a) {
            case 0:
                this.f29423b.clear();
                break;
            default:
                this.f29423b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C10173lj0 c10173lj0M22924a;
        switch (this.f29422a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C10301mj0 c10301mj0 = this.f29423b;
                c10301mj0.getClass();
                Object key = entry.getKey();
                C10173lj0 c10173lj0 = null;
                if (key != null) {
                    try {
                        c10173lj0M22924a = c10301mj0.m22924a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    c10173lj0M22924a = null;
                }
                if (c10173lj0M22924a != null && Objects.equals(c10173lj0M22924a.f37266d, entry.getValue())) {
                    c10173lj0 = c10173lj0M22924a;
                }
                return c10173lj0 != null;
            default:
                return this.f29423b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f29422a) {
            case 0:
                return new C9533gj0(this.f29423b, 0);
            default:
                return new C9533gj0(this.f29423b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C10173lj0 c10173lj0M22924a;
        switch (this.f29422a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C10301mj0 c10301mj0 = this.f29423b;
                    c10301mj0.getClass();
                    Object key = entry.getKey();
                    C10173lj0 c10173lj0 = null;
                    if (key != null) {
                        try {
                            c10173lj0M22924a = c10301mj0.m22924a(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        c10173lj0M22924a = null;
                    }
                    if (c10173lj0M22924a != null && Objects.equals(c10173lj0M22924a.f37266d, entry.getValue())) {
                        c10173lj0 = c10173lj0M22924a;
                    }
                    if (c10173lj0 != null) {
                        c10301mj0.m22928e(c10173lj0, true);
                        break;
                    }
                }
                break;
            default:
                C10301mj0 c10301mj02 = this.f29423b;
                c10301mj02.getClass();
                C10173lj0 c10173lj0M22924a2 = null;
                if (obj != null) {
                    try {
                        c10173lj0M22924a2 = c10301mj02.m22924a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c10173lj0M22924a2 != null) {
                    c10301mj02.m22928e(c10173lj0M22924a2, true);
                }
                if (c10173lj0M22924a2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f29422a) {
        }
        return this.f29423b.f37851d;
    }
}
