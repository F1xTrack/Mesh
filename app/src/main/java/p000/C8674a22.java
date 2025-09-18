package p000;

/* renamed from: a22 */
/* loaded from: classes.dex */
public final class C8674a22 extends CY1 {

    /* renamed from: e */
    public static final C8674a22 f15294e = new C8674a22(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f15295c;

    /* renamed from: d */
    public final transient int f15296d;

    public C8674a22(int i, Object[] objArr) {
        this.f15295c = objArr;
        this.f15296d = i;
    }

    @Override // p000.CY1, p000.AbstractC11166tT1
    /* renamed from: b */
    public final int mo1209b(Object[] objArr) {
        Object[] objArr2 = this.f15295c;
        int i = this.f15296d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.AbstractC11166tT1
    /* renamed from: d */
    public final int mo9665d() {
        return this.f15296d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC10087l22.m22340b(i, this.f15296d);
        Object obj = this.f15295c[i];
        obj.getClass();
        return obj;
    }

    @Override // p000.AbstractC11166tT1
    /* renamed from: h */
    public final int mo9666h() {
        return 0;
    }

    @Override // p000.AbstractC11166tT1
    /* renamed from: i */
    public final Object[] mo9667i() {
        return this.f15295c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15296d;
    }
}
