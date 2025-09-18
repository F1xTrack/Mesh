package defpackage;

import java.util.Iterator;

/* renamed from: jF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5277jF1 extends UD1 {
    public final transient C6614qF1 c;
    public final transient C6041nF1 d;

    public C5277jF1(C6614qF1 c6614qF1, C6041nF1 c6041nF1) {
        this.c = c6614qF1;
        this.d = c6041nF1;
    }

    @Override // defpackage.AbstractC7371uD1
    public final int b(int i, Object[] objArr) {
        return this.d.b(i, objArr);
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
        return 1;
    }
}
