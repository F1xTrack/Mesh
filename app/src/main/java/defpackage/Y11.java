package defpackage;

/* loaded from: classes.dex */
public final class Y11 extends V70 {
    public final transient Object d;

    public Y11(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // defpackage.V70, defpackage.J70
    public final P70 b() {
        return P70.B(this.d);
    }

    @Override // defpackage.J70, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.J70
    public final int d(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.V70, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.J70
    public final boolean q() {
        return false;
    }

    @Override // defpackage.J70
    /* renamed from: r */
    public final AbstractC5740lg1 iterator() {
        C6103na0 c6103na0 = new C6103na0(0);
        c6103na0.b = this.d;
        return c6103na0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
