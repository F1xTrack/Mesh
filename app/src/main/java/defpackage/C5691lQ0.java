package defpackage;

/* renamed from: lQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5691lQ0 extends V70 {
    public static final Object[] i;
    public static final C5691lQ0 j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new C5691lQ0(0, 0, 0, objArr, objArr);
    }

    public C5691lQ0(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // defpackage.J70, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iB = J12.b(obj);
                while (true) {
                    int i2 = iB & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.J70
    public final int d(int i2, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i3 = this.h;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // defpackage.J70
    public final Object[] h() {
        return this.d;
    }

    @Override // defpackage.V70, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.J70
    public final int i() {
        return this.h;
    }

    @Override // defpackage.J70
    public final int k() {
        return 0;
    }

    @Override // defpackage.J70
    public final boolean q() {
        return false;
    }

    @Override // defpackage.J70
    /* renamed from: r */
    public final AbstractC5740lg1 iterator() {
        return b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // defpackage.V70
    public final P70 v() {
        return P70.s(this.h, this.d);
    }
}
