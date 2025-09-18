package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: Tz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1578Tz1 extends AbstractC6942rz1 {
    public final transient AbstractC5606kz1 c;
    public final transient Object[] d;
    public final transient int e;

    public C1578Tz1(AbstractC5606kz1 abstractC5606kz1, Object[] objArr, int i) {
        this.c = abstractC5606kz1;
        this.d = objArr;
        this.e = i;
    }

    @Override // defpackage.AbstractC7703vy1
    public final int b(Object[] objArr) {
        return i().b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // defpackage.AbstractC6942rz1
    public final AbstractC1185Oy1 r() {
        return new C1188Oz1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
