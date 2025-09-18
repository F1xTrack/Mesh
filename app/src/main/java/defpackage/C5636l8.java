package defpackage;

import java.util.ArrayList;

/* renamed from: l8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5636l8 extends ArrayList implements InterfaceC0655Id1 {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof AbstractC6689qe1) {
            return super.contains((AbstractC6689qe1) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof AbstractC6689qe1) {
            return super.indexOf((AbstractC6689qe1) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof AbstractC6689qe1) {
            return super.lastIndexOf((AbstractC6689qe1) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof AbstractC6689qe1) {
            return super.remove((AbstractC6689qe1) obj);
        }
        return false;
    }
}
