package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: rz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6940rz implements Iterable {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public Set c = Collections.emptySet();
    public List d = Collections.emptyList();

    public final int b(OL ol) {
        int iIntValue;
        synchronized (this.a) {
            try {
                iIntValue = this.b.containsKey(ol) ? ((Integer) this.b.get(ol)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public final void d(OL ol) {
        synchronized (this.a) {
            try {
                Integer num = (Integer) this.b.get(ol);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(ol);
                this.d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.b.remove(ol);
                    HashSet hashSet = new HashSet(this.c);
                    hashSet.remove(ol);
                    this.c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.b.put(ol, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
