package defpackage;

import java.util.Map;

/* renamed from: hQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4151hQ0 extends V70 {
    public final transient C5500kQ0 d;
    public final transient Object[] e;
    public final transient int f;

    public C4151hQ0(C5500kQ0 c5500kQ0, Object[] objArr, int i) {
        this.d = c5500kQ0;
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.J70, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // defpackage.J70
    public final int d(int i, Object[] objArr) {
        return b().d(i, objArr);
    }

    @Override // defpackage.J70
    public final boolean q() {
        return true;
    }

    @Override // defpackage.J70
    /* renamed from: r */
    public final AbstractC5740lg1 iterator() {
        return b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // defpackage.V70
    public final P70 v() {
        return new C3960gQ0(this);
    }
}
