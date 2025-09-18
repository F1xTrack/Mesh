package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: hc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4187hc0 extends AbstractC6300oc0 implements Iterable {
    public final ArrayList a = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4187hc0) && ((C4187hc0) obj).a.equals(this.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
