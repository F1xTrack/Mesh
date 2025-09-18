package defpackage;

/* renamed from: iQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4342iQ0 extends V70 {
    public final transient C5500kQ0 d;
    public final transient C5309jQ0 e;

    public C4342iQ0(C5500kQ0 c5500kQ0, C5309jQ0 c5309jQ0) {
        this.d = c5500kQ0;
        this.e = c5309jQ0;
    }

    @Override // defpackage.V70, defpackage.J70
    public final P70 b() {
        return this.e;
    }

    @Override // defpackage.J70, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // defpackage.J70
    public final int d(int i, Object[] objArr) {
        return this.e.d(i, objArr);
    }

    @Override // defpackage.J70
    public final boolean q() {
        return true;
    }

    @Override // defpackage.J70
    /* renamed from: r */
    public final AbstractC5740lg1 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.f;
    }
}
