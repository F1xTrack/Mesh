package defpackage;

/* renamed from: a22 */
/* loaded from: classes.dex */
public final class C2059a22 extends CY1 {
    public static final C2059a22 e = new C2059a22(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public C2059a22(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.CY1, defpackage.AbstractC7228tT1
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC7228tT1
    public final int d() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC5619l22.b(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.AbstractC7228tT1
    public final int h() {
        return 0;
    }

    @Override // defpackage.AbstractC7228tT1
    public final Object[] i() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
