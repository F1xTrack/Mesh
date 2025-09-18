package io.sentry.android.replay;

import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.sentry.android.replay.p */
/* loaded from: classes2.dex */
public final class C5956p extends CopyOnWriteArrayList {

    /* renamed from: a */
    public final /* synthetic */ C5957q f34006a;

    public C5956p(C5957q c5957q) {
        this.f34006a = c5957q;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        InterfaceC5944f interfaceC5944f = (InterfaceC5944f) obj;
        C5957q c5957q = this.f34006a;
        synchronized (c5957q.f34008b) {
            Iterator it = c5957q.f34010d.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (interfaceC5944f != null) {
                    interfaceC5944f.mo21668a(view, true);
                }
            }
        }
        return super.add(interfaceC5944f);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC5944f) {
            return super.contains((InterfaceC5944f) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC5944f) {
            return super.indexOf((InterfaceC5944f) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC5944f) {
            return super.lastIndexOf((InterfaceC5944f) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC5944f) {
            return super.remove((InterfaceC5944f) obj);
        }
        return false;
    }
}
