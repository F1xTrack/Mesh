package defpackage;

import java.util.Stack;

/* renamed from: vn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7669vn0 extends Stack {
    @Override // java.util.Stack
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8073xv0 push(C8073xv0 c8073xv0) {
        if (c8073xv0 != null) {
            return (C8073xv0) super.push(c8073xv0);
        }
        removeAllElements();
        return null;
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof C8073xv0 : true) {
            return super.contains((C8073xv0) obj);
        }
        return false;
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null ? obj instanceof C8073xv0 : true) {
            return super.indexOf((C8073xv0) obj);
        }
        return -1;
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof C8073xv0 : true) {
            return super.lastIndexOf((C8073xv0) obj);
        }
        return -1;
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof C8073xv0 : true) {
            return super.remove((C8073xv0) obj);
        }
        return false;
    }
}
