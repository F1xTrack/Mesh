package p000;

/* renamed from: lQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10135lQ0 extends V70 {

    /* renamed from: i */
    public static final Object[] f37050i;

    /* renamed from: j */
    public static final C10135lQ0 f37051j;

    /* renamed from: d */
    public final transient Object[] f37052d;

    /* renamed from: e */
    public final transient int f37053e;

    /* renamed from: f */
    public final transient Object[] f37054f;

    /* renamed from: g */
    public final transient int f37055g;

    /* renamed from: h */
    public final transient int f37056h;

    static {
        Object[] objArr = new Object[0];
        f37050i = objArr;
        f37051j = new C10135lQ0(0, 0, 0, objArr, objArr);
    }

    public C10135lQ0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f37052d = objArr;
        this.f37053e = i;
        this.f37054f = objArr2;
        this.f37055g = i2;
        this.f37056h = i3;
    }

    @Override // p000.J70, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f37054f;
            if (objArr.length != 0) {
                int iM4132b = J12.m4132b(obj);
                while (true) {
                    int i = iM4132b & this.f37055g;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM4132b = i + 1;
                }
            }
        }
        return false;
    }

    @Override // p000.J70
    /* renamed from: d */
    public final int mo4160d(int i, Object[] objArr) {
        Object[] objArr2 = this.f37052d;
        int i2 = this.f37056h;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p000.J70
    /* renamed from: h */
    public final Object[] mo4161h() {
        return this.f37052d;
    }

    @Override // p000.V70, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f37053e;
    }

    @Override // p000.J70
    /* renamed from: i */
    public final int mo4162i() {
        return this.f37056h;
    }

    @Override // p000.J70
    /* renamed from: k */
    public final int mo4163k() {
        return 0;
    }

    @Override // p000.J70
    /* renamed from: q */
    public final boolean mo4164q() {
        return false;
    }

    @Override // p000.J70
    /* renamed from: r */
    public final AbstractC10168lg1 iterator() {
        return mo4159b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f37056h;
    }

    @Override // p000.V70
    /* renamed from: v */
    public final P70 mo8309v() {
        return P70.m6232s(this.f37056h, this.f37052d);
    }
}
