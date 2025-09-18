package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: rz */
/* loaded from: classes.dex */
public final class C6794rz implements Iterable {

    /* renamed from: a */
    public final Object f42179a = new Object();

    /* renamed from: b */
    public final HashMap f42180b = new HashMap();

    /* renamed from: c */
    public Set f42181c = Collections.emptySet();

    /* renamed from: d */
    public List f42182d = Collections.emptyList();

    /* renamed from: b */
    public final int m24564b(C0903OL c0903ol) {
        int iIntValue;
        synchronized (this.f42179a) {
            try {
                iIntValue = this.f42180b.containsKey(c0903ol) ? ((Integer) this.f42180b.get(c0903ol)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    /* renamed from: d */
    public final void m24565d(C0903OL c0903ol) {
        synchronized (this.f42179a) {
            try {
                Integer num = (Integer) this.f42180b.get(c0903ol);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f42182d);
                arrayList.remove(c0903ol);
                this.f42182d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f42180b.remove(c0903ol);
                    HashSet hashSet = new HashSet(this.f42181c);
                    hashSet.remove(c0903ol);
                    this.f42181c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f42180b.put(c0903ol, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f42179a) {
            it = this.f42182d.iterator();
        }
        return it;
    }
}
