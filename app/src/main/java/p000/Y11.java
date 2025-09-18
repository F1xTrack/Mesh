package p000;

/* loaded from: classes.dex */
public final class Y11 extends V70 {

    /* renamed from: d */
    public final transient Object f14098d;

    public Y11(Object obj) {
        obj.getClass();
        this.f14098d = obj;
    }

    @Override // p000.V70, p000.J70
    /* renamed from: b */
    public final P70 mo4159b() {
        return P70.m6229B(this.f14098d);
    }

    @Override // p000.J70, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14098d.equals(obj);
    }

    @Override // p000.J70
    /* renamed from: d */
    public final int mo4160d(int i, Object[] objArr) {
        objArr[i] = this.f14098d;
        return i + 1;
    }

    @Override // p000.V70, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14098d.hashCode();
    }

    @Override // p000.J70
    /* renamed from: q */
    public final boolean mo4164q() {
        return false;
    }

    @Override // p000.J70
    /* renamed from: r */
    public final AbstractC10168lg1 iterator() {
        C10411na0 c10411na0 = new C10411na0(0);
        c10411na0.f38381b = this.f14098d;
        return c10411na0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f14098d.toString() + ']';
    }
}
