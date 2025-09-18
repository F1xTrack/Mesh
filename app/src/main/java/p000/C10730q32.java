package p000;

import java.util.Iterator;

/* renamed from: q32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10730q32 extends L02 {

    /* renamed from: c */
    public final transient C10754qF1 f40572c;

    /* renamed from: d */
    public final transient H32 f40573d;

    public C10730q32(C10754qF1 c10754qF1, H32 h32) {
        this.f40572c = c10754qF1;
        this.f40573d = h32;
    }

    @Override // p000.AbstractC11166tT1
    /* renamed from: b */
    public final int mo1209b(Object[] objArr) {
        return this.f40573d.mo1209b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f40572c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f40573d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f40572c.getClass();
        return 1;
    }
}
