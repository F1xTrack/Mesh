package p000;

import java.util.AbstractList;
import java.util.List;

/* renamed from: O0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0882O0 extends AbstractList implements List, InterfaceC11570we0 {
    /* renamed from: b */
    public abstract int mo5922b();

    /* renamed from: d */
    public abstract Object mo5923d(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo5923d(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo5922b();
    }
}
