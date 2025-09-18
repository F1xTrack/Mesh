package p000;

/* renamed from: iQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9751iQ0 extends V70 {

    /* renamed from: d */
    public final transient C10007kQ0 f29125d;

    /* renamed from: e */
    public final transient C9879jQ0 f29126e;

    public C9751iQ0(C10007kQ0 c10007kQ0, C9879jQ0 c9879jQ0) {
        this.f29125d = c10007kQ0;
        this.f29126e = c9879jQ0;
    }

    @Override // p000.V70, p000.J70
    /* renamed from: b */
    public final P70 mo4159b() {
        return this.f29126e;
    }

    @Override // p000.J70, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f29125d.get(obj) != null;
    }

    @Override // p000.J70
    /* renamed from: d */
    public final int mo4160d(int i, Object[] objArr) {
        return this.f29126e.mo4160d(i, objArr);
    }

    @Override // p000.J70
    /* renamed from: q */
    public final boolean mo4164q() {
        return true;
    }

    @Override // p000.J70
    /* renamed from: r */
    public final AbstractC10168lg1 iterator() {
        return this.f29126e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29125d.f36501f;
    }
}
