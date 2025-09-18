package p000;

import java.util.Map;

/* renamed from: hQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9623hQ0 extends V70 {

    /* renamed from: d */
    public final transient C10007kQ0 f28416d;

    /* renamed from: e */
    public final transient Object[] f28417e;

    /* renamed from: f */
    public final transient int f28418f;

    public C9623hQ0(C10007kQ0 c10007kQ0, Object[] objArr, int i) {
        this.f28416d = c10007kQ0;
        this.f28417e = objArr;
        this.f28418f = i;
    }

    @Override // p000.J70, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f28416d.get(key));
    }

    @Override // p000.J70
    /* renamed from: d */
    public final int mo4160d(int i, Object[] objArr) {
        return mo4159b().mo4160d(i, objArr);
    }

    @Override // p000.J70
    /* renamed from: q */
    public final boolean mo4164q() {
        return true;
    }

    @Override // p000.J70
    /* renamed from: r */
    public final AbstractC10168lg1 iterator() {
        return mo4159b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f28418f;
    }

    @Override // p000.V70
    /* renamed from: v */
    public final P70 mo8309v() {
        return new C9495gQ0(this);
    }
}
