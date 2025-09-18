package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: Yk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1923Yk1 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        for (AbstractC1611Uk1 abstractC1611Uk1 : this.a.values()) {
            abstractC1611Uk1.c = true;
            HashMap map = abstractC1611Uk1.a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = abstractC1611Uk1.a.values().iterator();
                        while (it.hasNext()) {
                            AbstractC1611Uk1.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC1611Uk1.b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = abstractC1611Uk1.b.iterator();
                        while (it2.hasNext()) {
                            AbstractC1611Uk1.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            abstractC1611Uk1.b();
        }
        this.a.clear();
    }
}
