package defpackage;

import java.util.Iterator;

/* renamed from: q32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6578q32 extends L02 {
    public final transient C6614qF1 c;
    public final transient H32 d;

    public C6578q32(C6614qF1 c6614qF1, H32 h32) {
        this.c = c6614qF1;
        this.d = h32;
    }

    @Override // defpackage.AbstractC7228tT1
    public final int b(Object[] objArr) {
        return this.d.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.c.getClass();
        return 1;
    }
}
