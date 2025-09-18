package p000;

/* loaded from: classes.dex */
public final class H32 extends CY1 {

    /* renamed from: c */
    public final transient Object[] f4035c;

    /* renamed from: d */
    public final transient int f4036d;

    /* renamed from: e */
    public final transient int f4037e = 1;

    public H32(int i, Object[] objArr) {
        this.f4035c = objArr;
        this.f4036d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC10087l22.m22340b(i, this.f4037e);
        Object obj = this.f4035c[i + i + this.f4036d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4037e;
    }
}
