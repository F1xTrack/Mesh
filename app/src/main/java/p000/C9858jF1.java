package p000;

import java.util.Iterator;

/* renamed from: jF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9858jF1 extends UD1 {

    /* renamed from: c */
    public final transient C10754qF1 f35010c;

    /* renamed from: d */
    public final transient C10370nF1 f35011d;

    public C9858jF1(C10754qF1 c10754qF1, C10370nF1 c10370nF1) {
        this.f35010c = c10754qF1;
        this.f35011d = c10370nF1;
    }

    @Override // p000.AbstractC11262uD1
    /* renamed from: b */
    public final int mo4582b(int i, Object[] objArr) {
        return this.f35011d.mo4582b(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f35010c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f35011d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
