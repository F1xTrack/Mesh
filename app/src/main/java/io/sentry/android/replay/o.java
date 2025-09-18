package io.sentry.android.replay;

import android.view.View;
import defpackage.O90;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o extends ArrayList {
    public final /* synthetic */ q a;

    public o(q qVar) {
        this.a = qVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        View view = (View) obj;
        O90.f(view, "element");
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(view, true);
        }
        return super.add(view);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        O90.f(collection, "elements");
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                fVar.a((View) it2.next(), true);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof View) {
            return super.contains((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof View) {
            return super.indexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof View) {
            return super.lastIndexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof View) {
            return super.remove((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = super.remove(i);
        O90.e(objRemove, "super.removeAt(index)");
        View view = (View) objRemove;
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(view, false);
        }
        return view;
    }
}
