package defpackage;

/* loaded from: classes.dex */
public final class JF1 extends GF1 {
    public static final JF1 e = new JF1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public JF1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.GF1, defpackage.AbstractC7186tF1
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC7186tF1
    public final int d() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4079h22.b(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.AbstractC7186tF1
    public final int h() {
        return 0;
    }

    @Override // defpackage.AbstractC7186tF1
    public final boolean i() {
        return false;
    }

    @Override // defpackage.AbstractC7186tF1
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
