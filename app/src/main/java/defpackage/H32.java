package defpackage;

/* loaded from: classes.dex */
public final class H32 extends CY1 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e = 1;

    public H32(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC5619l22.b(i, this.e);
        Object obj = this.c[i + i + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
