package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class P0 extends AbstractSet implements Set, InterfaceC0657Ie0 {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
