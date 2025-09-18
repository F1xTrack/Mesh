package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: Js0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0777Js0 {
    public final HashMap a = new HashMap();
    public final ArrayList b;
    public volatile boolean c;

    public C0777Js0(ArrayList arrayList, List list) {
        new HashMap();
        this.b = new ArrayList();
        this.c = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            D90 d90 = (D90) it.next();
            Iterator it2 = d90.a().iterator();
            while (it2.hasNext()) {
                this.a.put((Class) it2.next(), d90);
            }
        }
        Iterator it3 = list.iterator();
        if (it3.hasNext()) {
            throw AbstractC8235ym.d(it3);
        }
    }

    public final synchronized void a() {
        if (!this.c) {
            b();
            this.c = true;
        }
    }

    public final void b() {
        ArrayList arrayList = new ArrayList(this.a.values());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() != null) {
                arrayList.add((D90) weakReference.get());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((D90) it2.next()).b(this);
        }
    }
}
