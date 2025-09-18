package p000;

import java.util.Iterator;

/* renamed from: zz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11994zz1 extends AbstractC8351Ty1 {

    /* renamed from: c */
    public final transient C7937Lz1 f47120c;

    /* renamed from: d */
    public final transient C7573Ez1 f47121d;

    public C11994zz1(C7937Lz1 c7937Lz1, C7573Ez1 c7573Ez1) {
        this.f47120c = c7937Lz1;
        this.f47121d = c7573Ez1;
    }

    @Override // p000.AbstractC8919by1
    /* renamed from: b */
    public final int mo10549b(Object[] objArr) {
        return this.f47121d.mo10549b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f47120c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f47121d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47120c.f6959f;
    }
}
