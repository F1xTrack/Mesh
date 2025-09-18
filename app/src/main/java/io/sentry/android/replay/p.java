package io.sentry.android.replay;

import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class p extends CopyOnWriteArrayList {
    public final /* synthetic */ q a;

    public p(q qVar) {
        this.a = qVar;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        f fVar = (f) obj;
        q qVar = this.a;
        synchronized (qVar.b) {
            Iterator it = qVar.d.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (fVar != null) {
                    fVar.a(view, true);
                }
            }
        }
        return super.add(fVar);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof f) {
            return super.contains((f) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof f) {
            return super.indexOf((f) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof f) {
            return super.lastIndexOf((f) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof f) {
            return super.remove((f) obj);
        }
        return false;
    }
}
