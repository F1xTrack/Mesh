package p000;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: Yk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8583Yk1 {

    /* renamed from: a */
    public final LinkedHashMap f14501a = new LinkedHashMap();

    /* renamed from: a */
    public final void m9352a() {
        for (AbstractC8375Uk1 abstractC8375Uk1 : this.f14501a.values()) {
            abstractC8375Uk1.f12021c = true;
            HashMap map = abstractC8375Uk1.f12019a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = abstractC8375Uk1.f12019a.values().iterator();
                        while (it.hasNext()) {
                            AbstractC8375Uk1.m8137a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC8375Uk1.f12020b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = abstractC8375Uk1.f12020b.iterator();
                        while (it2.hasNext()) {
                            AbstractC8375Uk1.m8137a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            abstractC8375Uk1.mo8138b();
        }
        this.f14501a.clear();
    }
}
