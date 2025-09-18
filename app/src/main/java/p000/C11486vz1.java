package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: vz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11486vz1 extends AbstractC8351Ty1 {

    /* renamed from: c */
    public final transient C7937Lz1 f44628c;

    /* renamed from: d */
    public final transient Object[] f44629d;

    /* renamed from: e */
    public final transient int f44630e;

    public C11486vz1(C7937Lz1 c7937Lz1, Object[] objArr, int i) {
        this.f44628c = c7937Lz1;
        this.f44629d = objArr;
        this.f44630e = i;
    }

    @Override // p000.AbstractC8919by1
    /* renamed from: b */
    public final int mo10549b(Object[] objArr) {
        AbstractC11356uy1 c10590oz1 = this.f11607b;
        if (c10590oz1 == null) {
            c10590oz1 = new C10590oz1(this);
            this.f11607b = c10590oz1;
        }
        return c10590oz1.mo10549b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f44628c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC11356uy1 c10590oz1 = this.f11607b;
        if (c10590oz1 == null) {
            c10590oz1 = new C10590oz1(this);
            this.f11607b = c10590oz1;
        }
        return c10590oz1.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f44630e;
    }
}
