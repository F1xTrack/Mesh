package p000;

import java.util.ArrayList;

/* renamed from: l8 */
/* loaded from: classes2.dex */
public final class C6344l8 extends ArrayList implements InterfaceC7737Id1 {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof AbstractC10804qe1) {
            return super.contains((AbstractC10804qe1) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof AbstractC10804qe1) {
            return super.indexOf((AbstractC10804qe1) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof AbstractC10804qe1) {
            return super.lastIndexOf((AbstractC10804qe1) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof AbstractC10804qe1) {
            return super.remove((AbstractC10804qe1) obj);
        }
        return false;
    }
}
