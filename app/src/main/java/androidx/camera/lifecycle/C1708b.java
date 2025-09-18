package androidx.camera.lifecycle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000.AbstractC9104dM1;
import p000.C0743Lo;
import p000.C1298Ud;
import p000.C1435Wo;
import p000.C1561Yo;
import p000.C8875bc1;
import p000.EnumC7434Ci0;
import p000.InterfaceC7902Li0;

/* renamed from: androidx.camera.lifecycle.b */
/* loaded from: classes.dex */
public final class C1708b {

    /* renamed from: f */
    public static final Object f16034f = new Object();

    /* renamed from: g */
    public static C1708b f16035g;

    /* renamed from: a */
    public final Object f16036a = new Object();

    /* renamed from: b */
    public final HashMap f16037b = new HashMap();

    /* renamed from: c */
    public final HashMap f16038c = new HashMap();

    /* renamed from: d */
    public final ArrayDeque f16039d = new ArrayDeque();

    /* renamed from: e */
    public C8875bc1 f16040e;

    /* renamed from: a */
    public final void m9934a(LifecycleCamera lifecycleCamera, Collection collection, C8875bc1 c8875bc1) {
        synchronized (this.f16036a) {
            try {
                boolean z = true;
                AbstractC9104dM1.m17546e(!collection.isEmpty());
                this.f16040e = c8875bc1;
                InterfaceC7902Li0 interfaceC7902Li0M9927i = lifecycleCamera.m9927i();
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c = m9936c(interfaceC7902Li0M9927i);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c == null) {
                    return;
                }
                Set set = (Set) this.f16038c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c);
                C8875bc1 c8875bc12 = this.f16040e;
                if (c8875bc12 == null || c8875bc12.f17088a != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        LifecycleCamera lifecycleCamera2 = (LifecycleCamera) this.f16037b.get((C1298Ud) it.next());
                        lifecycleCamera2.getClass();
                        if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.m9928p().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    lifecycleCamera.f16029c.m9369K();
                    lifecycleCamera.f16029c.m9368I();
                    lifecycleCamera.m9926d(collection);
                    if (((C0743Lo) interfaceC7902Li0M9927i).f6872q.f16309c.compareTo(EnumC7434Ci0.f1589d) < 0) {
                        z = false;
                    }
                    if (z) {
                        m9940g(interfaceC7902Li0M9927i);
                    }
                } catch (C1435Wo e) {
                    throw new IllegalArgumentException(e);
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final LifecycleCamera m9935b(C0743Lo c0743Lo, C1561Yo c1561Yo) {
        synchronized (this.f16036a) {
            try {
                AbstractC9104dM1.m17545d("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.f16037b.get(new C1298Ud(c0743Lo, c1561Yo.f14532e)) == null);
                LifecycleCamera lifecycleCamera = new LifecycleCamera(c0743Lo, c1561Yo);
                if (((ArrayList) c1561Yo.m9383z()).isEmpty()) {
                    lifecycleCamera.m9930r();
                }
                if (c0743Lo.f6872q.f16309c == EnumC7434Ci0.f1586a) {
                    return lifecycleCamera;
                }
                m9939f(lifecycleCamera);
                return lifecycleCamera;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final LifecycleCameraRepository$LifecycleCameraRepositoryObserver m9936c(InterfaceC7902Li0 interfaceC7902Li0) {
        synchronized (this.f16036a) {
            try {
                for (LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver : this.f16038c.keySet()) {
                    if (interfaceC7902Li0.equals(lifecycleCameraRepository$LifecycleCameraRepositoryObserver.f16032b)) {
                        return lifecycleCameraRepository$LifecycleCameraRepositoryObserver;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final Collection m9937d() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.f16036a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f16037b.values());
        }
        return collectionUnmodifiableCollection;
    }

    /* renamed from: e */
    public final boolean m9938e(InterfaceC7902Li0 interfaceC7902Li0) {
        synchronized (this.f16036a) {
            try {
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c = m9936c(interfaceC7902Li0);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c == null) {
                    return false;
                }
                Iterator it = ((Set) this.f16038c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f16037b.get((C1298Ud) it.next());
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.m9928p().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final void m9939f(LifecycleCamera lifecycleCamera) {
        synchronized (this.f16036a) {
            try {
                InterfaceC7902Li0 interfaceC7902Li0M9927i = lifecycleCamera.m9927i();
                C1561Yo c1561Yo = lifecycleCamera.f16029c;
                C1298Ud c1298Ud = new C1298Ud(interfaceC7902Li0M9927i, C1561Yo.m9362v(c1561Yo.f14544q, c1561Yo.f14545r));
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c = m9936c(interfaceC7902Li0M9927i);
                Set hashSet = lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c != null ? (Set) this.f16038c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c) : new HashSet();
                hashSet.add(c1298Ud);
                this.f16037b.put(c1298Ud, lifecycleCamera);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c == null) {
                    LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver = new LifecycleCameraRepository$LifecycleCameraRepositoryObserver(interfaceC7902Li0M9927i, this);
                    this.f16038c.put(lifecycleCameraRepository$LifecycleCameraRepositoryObserver, hashSet);
                    ((C0743Lo) interfaceC7902Li0M9927i).f6872q.mo2368a(lifecycleCameraRepository$LifecycleCameraRepositoryObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void m9940g(InterfaceC7902Li0 interfaceC7902Li0) {
        synchronized (this.f16036a) {
            try {
                if (m9938e(interfaceC7902Li0)) {
                    if (this.f16039d.isEmpty()) {
                        this.f16039d.push(interfaceC7902Li0);
                    } else {
                        C8875bc1 c8875bc1 = this.f16040e;
                        if (c8875bc1 == null || c8875bc1.f17088a != 2) {
                            InterfaceC7902Li0 interfaceC7902Li02 = (InterfaceC7902Li0) this.f16039d.peek();
                            if (!interfaceC7902Li0.equals(interfaceC7902Li02)) {
                                m9942i(interfaceC7902Li02);
                                this.f16039d.remove(interfaceC7902Li0);
                                this.f16039d.push(interfaceC7902Li0);
                            }
                        }
                    }
                    m9946m(interfaceC7902Li0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final void m9941h(InterfaceC7902Li0 interfaceC7902Li0) {
        synchronized (this.f16036a) {
            try {
                this.f16039d.remove(interfaceC7902Li0);
                m9942i(interfaceC7902Li0);
                if (!this.f16039d.isEmpty()) {
                    m9946m((InterfaceC7902Li0) this.f16039d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final void m9942i(InterfaceC7902Li0 interfaceC7902Li0) {
        synchronized (this.f16036a) {
            try {
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c = m9936c(interfaceC7902Li0);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c == null) {
                    return;
                }
                Iterator it = ((Set) this.f16038c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f16037b.get((C1298Ud) it.next());
                    lifecycleCamera.getClass();
                    lifecycleCamera.m9930r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final void m9943j(Collection collection) {
        synchronized (this.f16036a) {
            try {
                Iterator it = this.f16037b.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f16037b.get((C1298Ud) it.next());
                    boolean zIsEmpty = lifecycleCamera.m9928p().isEmpty();
                    lifecycleCamera.m9931s(collection);
                    if (!zIsEmpty && lifecycleCamera.m9928p().isEmpty()) {
                        m9941h(lifecycleCamera.m9927i());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: k */
    public final void m9944k() {
        synchronized (this.f16036a) {
            try {
                Iterator it = this.f16037b.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f16037b.get((C1298Ud) it.next());
                    lifecycleCamera.m9932t();
                    m9941h(lifecycleCamera.m9927i());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final void m9945l(InterfaceC7902Li0 interfaceC7902Li0) {
        synchronized (this.f16036a) {
            try {
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c = m9936c(interfaceC7902Li0);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c == null) {
                    return;
                }
                m9941h(interfaceC7902Li0);
                Iterator it = ((Set) this.f16038c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c)).iterator();
                while (it.hasNext()) {
                    this.f16037b.remove((C1298Ud) it.next());
                }
                this.f16038c.remove(lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c);
                lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c.f16032b.getLifecycle().mo2369b(lifecycleCameraRepository$LifecycleCameraRepositoryObserverM9936c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: m */
    public final void m9946m(InterfaceC7902Li0 interfaceC7902Li0) {
        synchronized (this.f16036a) {
            try {
                Iterator it = ((Set) this.f16038c.get(m9936c(interfaceC7902Li0))).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f16037b.get((C1298Ud) it.next());
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.m9928p().isEmpty()) {
                        lifecycleCamera.m9933u();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
