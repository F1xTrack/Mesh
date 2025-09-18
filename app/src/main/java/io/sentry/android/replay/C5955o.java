package io.sentry.android.replay;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p000.O90;

/* renamed from: io.sentry.android.replay.o */
/* loaded from: classes2.dex */
public final class C5955o extends ArrayList {

    /* renamed from: a */
    public final /* synthetic */ C5957q f34005a;

    public C5955o(C5957q c5957q) {
        this.f34005a = c5957q;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        View view = (View) obj;
        O90.m5968f(view, "element");
        Iterator it = this.f34005a.f34009c.iterator();
        while (it.hasNext()) {
            ((InterfaceC5944f) it.next()).mo21668a(view, true);
        }
        return super.add(view);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        O90.m5968f(collection, "elements");
        Iterator it = this.f34005a.f34009c.iterator();
        while (it.hasNext()) {
            InterfaceC5944f interfaceC5944f = (InterfaceC5944f) it.next();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                interfaceC5944f.mo21668a((View) it2.next(), true);
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
        O90.m5967e(objRemove, "super.removeAt(index)");
        View view = (View) objRemove;
        Iterator it = this.f34005a.f34009c.iterator();
        while (it.hasNext()) {
            ((InterfaceC5944f) it.next()).mo21668a(view, false);
        }
        return view;
    }
}
