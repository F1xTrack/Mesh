package p000;

import java.util.Iterator;

/* renamed from: Zz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8665Zz1 extends AbstractC10974rz1 {

    /* renamed from: c */
    public final transient AbstractC10078kz1 f15269c;

    /* renamed from: d */
    public final transient C9208eA1 f15270d;

    public C8665Zz1(AbstractC10078kz1 abstractC10078kz1, C9208eA1 c9208eA1) {
        this.f15269c = abstractC10078kz1;
        this.f15270d = c9208eA1;
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: b */
    public final int mo3657b(Object[] objArr) {
        return this.f15270d.mo3657b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15269c.get(obj) != null;
    }

    @Override // p000.AbstractC10974rz1, p000.AbstractC11484vy1
    /* renamed from: i */
    public final AbstractC8091Oy1 mo6191i() {
        return this.f15270d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f15270d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((C9848jA1) this.f15269c).f34958f;
    }
}
