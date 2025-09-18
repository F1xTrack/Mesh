package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: Js0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7818Js0 {

    /* renamed from: a */
    public final HashMap f5762a = new HashMap();

    /* renamed from: b */
    public final ArrayList f5763b;

    /* renamed from: c */
    public volatile boolean f5764c;

    public C7818Js0(ArrayList arrayList, List list) {
        new HashMap();
        this.f5763b = new ArrayList();
        this.f5764c = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            D90 d90 = (D90) it.next();
            Iterator it2 = d90.mo174a().iterator();
            while (it2.hasNext()) {
                this.f5762a.put((Class) it2.next(), d90);
            }
        }
        Iterator it3 = list.iterator();
        if (it3.hasNext()) {
            throw AbstractC7222ym.m26227d(it3);
        }
    }

    /* renamed from: a */
    public final synchronized void m4459a() {
        if (!this.f5764c) {
            m4460b();
            this.f5764c = true;
        }
    }

    /* renamed from: b */
    public final void m4460b() {
        ArrayList arrayList = new ArrayList(this.f5762a.values());
        Iterator it = this.f5763b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() != null) {
                arrayList.add((D90) weakReference.get());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((D90) it2.next()).mo175b(this);
        }
    }
}
