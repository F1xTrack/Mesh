package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: jj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9917jj0 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f35348a;

    /* renamed from: b */
    public final /* synthetic */ C10301mj0 f35349b;

    public /* synthetic */ C9917jj0(C10301mj0 c10301mj0, int i) {
        this.f35348a = i;
        this.f35349b = c10301mj0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f35348a) {
            case 0:
                this.f35349b.clear();
                break;
            default:
                this.f35349b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C10173lj0 c10173lj0M22925b;
        switch (this.f35348a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C10301mj0 c10301mj0 = this.f35349b;
                c10301mj0.getClass();
                Object key = entry.getKey();
                C10173lj0 c10173lj0 = null;
                if (key != null) {
                    try {
                        c10173lj0M22925b = c10301mj0.m22925b(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    c10173lj0M22925b = null;
                }
                if (c10173lj0M22925b != null && Objects.equals(c10173lj0M22925b.f37266d, entry.getValue())) {
                    c10173lj0 = c10173lj0M22925b;
                }
                return c10173lj0 != null;
            default:
                return this.f35349b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f35348a) {
            case 0:
                return new C9661hj0(this.f35349b, 0);
            default:
                return new C9661hj0(this.f35349b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C10173lj0 c10173lj0M22925b;
        switch (this.f35348a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C10301mj0 c10301mj0 = this.f35349b;
                    c10301mj0.getClass();
                    Object key = entry.getKey();
                    C10173lj0 c10173lj0 = null;
                    if (key != null) {
                        try {
                            c10173lj0M22925b = c10301mj0.m22925b(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        c10173lj0M22925b = null;
                    }
                    if (c10173lj0M22925b != null && Objects.equals(c10173lj0M22925b.f37266d, entry.getValue())) {
                        c10173lj0 = c10173lj0M22925b;
                    }
                    if (c10173lj0 != null) {
                        c10301mj0.m22929f(c10173lj0, true);
                        break;
                    }
                }
                break;
            default:
                C10301mj0 c10301mj02 = this.f35349b;
                c10301mj02.getClass();
                C10173lj0 c10173lj0M22925b2 = null;
                if (obj != null) {
                    try {
                        c10173lj0M22925b2 = c10301mj02.m22925b(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c10173lj0M22925b2 != null) {
                    c10301mj02.m22929f(c10173lj0M22925b2, true);
                }
                if (c10173lj0M22925b2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f35348a) {
        }
        return this.f35349b.f37851d;
    }
}
