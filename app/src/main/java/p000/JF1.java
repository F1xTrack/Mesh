package p000;

/* loaded from: classes.dex */
public final class JF1 extends GF1 {

    /* renamed from: e */
    public static final JF1 f5427e = new JF1(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f5428c;

    /* renamed from: d */
    public final transient int f5429d;

    public JF1(int i, Object[] objArr) {
        this.f5428c = objArr;
        this.f5429d = i;
    }

    @Override // p000.GF1, p000.AbstractC11138tF1
    /* renamed from: b */
    public final int mo3018b(Object[] objArr) {
        Object[] objArr2 = this.f5428c;
        int i = this.f5429d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.AbstractC11138tF1
    /* renamed from: d */
    public final int mo571d() {
        return this.f5429d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC9575h22.m18703b(i, this.f5429d);
        Object obj = this.f5428c[i];
        obj.getClass();
        return obj;
    }

    @Override // p000.AbstractC11138tF1
    /* renamed from: h */
    public final int mo572h() {
        return 0;
    }

    @Override // p000.AbstractC11138tF1
    /* renamed from: i */
    public final boolean mo573i() {
        return false;
    }

    @Override // p000.AbstractC11138tF1
    /* renamed from: k */
    public final Object[] mo574k() {
        return this.f5428c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5429d;
    }
}
