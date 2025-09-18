package defpackage;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class O0 extends AbstractList implements List, InterfaceC7832we0 {
    public abstract int b();

    public abstract Object d(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return d(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
