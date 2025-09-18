package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: hc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9647hc0 extends AbstractC10543oc0 implements Iterable {

    /* renamed from: a */
    public final ArrayList f28481a = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C9647hc0) && ((C9647hc0) obj).f28481a.equals(this.f28481a));
    }

    public final int hashCode() {
        return this.f28481a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f28481a.iterator();
    }
}
