package androidx.camera.lifecycle;

import defpackage.AbstractC3377dM1;
import defpackage.C0920Lo;
import defpackage.C1588Ud;
import defpackage.C1777Wo;
import defpackage.C1933Yo;
import defpackage.C2359bc1;
import defpackage.EnumC0201Ci0;
import defpackage.InterfaceC0903Li0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {
    public static final Object f = new Object();
    public static b g;
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque d = new ArrayDeque();
    public C2359bc1 e;

    public final void a(LifecycleCamera lifecycleCamera, Collection collection, C2359bc1 c2359bc1) {
        synchronized (this.a) {
            try {
                boolean z = true;
                AbstractC3377dM1.e(!collection.isEmpty());
                this.e = c2359bc1;
                InterfaceC0903Li0 interfaceC0903Li0I = lifecycleCamera.i();
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverC = c(interfaceC0903Li0I);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverC == null) {
                    return;
                }
                Set set = (Set) this.c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC);
                C2359bc1 c2359bc12 = this.e;
                if (c2359bc12 == null || c2359bc12.a != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        LifecycleCamera lifecycleCamera2 = (LifecycleCamera) this.b.get((C1588Ud) it.next());
                        lifecycleCamera2.getClass();
                        if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.p().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    lifecycleCamera.c.K();
                    lifecycleCamera.c.I();
                    lifecycleCamera.d(collection);
                    if (((C0920Lo) interfaceC0903Li0I).q.c.compareTo(EnumC0201Ci0.d) < 0) {
                        z = false;
                    }
                    if (z) {
                        g(interfaceC0903Li0I);
                    }
                } catch (C1777Wo e) {
                    throw new IllegalArgumentException(e);
                }
            } finally {
            }
        }
    }

    public final LifecycleCamera b(C0920Lo c0920Lo, C1933Yo c1933Yo) {
        synchronized (this.a) {
            try {
                AbstractC3377dM1.d("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.b.get(new C1588Ud(c0920Lo, c1933Yo.e)) == null);
                LifecycleCamera lifecycleCamera = new LifecycleCamera(c0920Lo, c1933Yo);
                if (((ArrayList) c1933Yo.z()).isEmpty()) {
                    lifecycleCamera.r();
                }
                if (c0920Lo.q.c == EnumC0201Ci0.a) {
                    return lifecycleCamera;
                }
                f(lifecycleCamera);
                return lifecycleCamera;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final LifecycleCameraRepository$LifecycleCameraRepositoryObserver c(InterfaceC0903Li0 interfaceC0903Li0) {
        synchronized (this.a) {
            try {
                for (LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver : this.c.keySet()) {
                    if (interfaceC0903Li0.equals(lifecycleCameraRepository$LifecycleCameraRepositoryObserver.b)) {
                        return lifecycleCameraRepository$LifecycleCameraRepositoryObserver;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Collection d() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.b.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final boolean e(InterfaceC0903Li0 interfaceC0903Li0) {
        synchronized (this.a) {
            try {
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverC = c(interfaceC0903Li0);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverC == null) {
                    return false;
                }
                Iterator it = ((Set) this.c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.b.get((C1588Ud) it.next());
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.p().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(LifecycleCamera lifecycleCamera) {
        synchronized (this.a) {
            try {
                InterfaceC0903Li0 interfaceC0903Li0I = lifecycleCamera.i();
                C1933Yo c1933Yo = lifecycleCamera.c;
                C1588Ud c1588Ud = new C1588Ud(interfaceC0903Li0I, C1933Yo.v(c1933Yo.q, c1933Yo.r));
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverC = c(interfaceC0903Li0I);
                Set hashSet = lifecycleCameraRepository$LifecycleCameraRepositoryObserverC != null ? (Set) this.c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC) : new HashSet();
                hashSet.add(c1588Ud);
                this.b.put(c1588Ud, lifecycleCamera);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverC == null) {
                    LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver = new LifecycleCameraRepository$LifecycleCameraRepositoryObserver(interfaceC0903Li0I, this);
                    this.c.put(lifecycleCameraRepository$LifecycleCameraRepositoryObserver, hashSet);
                    ((C0920Lo) interfaceC0903Li0I).q.a(lifecycleCameraRepository$LifecycleCameraRepositoryObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(InterfaceC0903Li0 interfaceC0903Li0) {
        synchronized (this.a) {
            try {
                if (e(interfaceC0903Li0)) {
                    if (this.d.isEmpty()) {
                        this.d.push(interfaceC0903Li0);
                    } else {
                        C2359bc1 c2359bc1 = this.e;
                        if (c2359bc1 == null || c2359bc1.a != 2) {
                            InterfaceC0903Li0 interfaceC0903Li02 = (InterfaceC0903Li0) this.d.peek();
                            if (!interfaceC0903Li0.equals(interfaceC0903Li02)) {
                                i(interfaceC0903Li02);
                                this.d.remove(interfaceC0903Li0);
                                this.d.push(interfaceC0903Li0);
                            }
                        }
                    }
                    m(interfaceC0903Li0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(InterfaceC0903Li0 interfaceC0903Li0) {
        synchronized (this.a) {
            try {
                this.d.remove(interfaceC0903Li0);
                i(interfaceC0903Li0);
                if (!this.d.isEmpty()) {
                    m((InterfaceC0903Li0) this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(InterfaceC0903Li0 interfaceC0903Li0) {
        synchronized (this.a) {
            try {
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverC = c(interfaceC0903Li0);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverC == null) {
                    return;
                }
                Iterator it = ((Set) this.c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.b.get((C1588Ud) it.next());
                    lifecycleCamera.getClass();
                    lifecycleCamera.r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Collection collection) {
        synchronized (this.a) {
            try {
                Iterator it = this.b.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.b.get((C1588Ud) it.next());
                    boolean zIsEmpty = lifecycleCamera.p().isEmpty();
                    lifecycleCamera.s(collection);
                    if (!zIsEmpty && lifecycleCamera.p().isEmpty()) {
                        h(lifecycleCamera.i());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.a) {
            try {
                Iterator it = this.b.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.b.get((C1588Ud) it.next());
                    lifecycleCamera.t();
                    h(lifecycleCamera.i());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(InterfaceC0903Li0 interfaceC0903Li0) {
        synchronized (this.a) {
            try {
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverC = c(interfaceC0903Li0);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverC == null) {
                    return;
                }
                h(interfaceC0903Li0);
                Iterator it = ((Set) this.c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC)).iterator();
                while (it.hasNext()) {
                    this.b.remove((C1588Ud) it.next());
                }
                this.c.remove(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC);
                lifecycleCameraRepository$LifecycleCameraRepositoryObserverC.b.getLifecycle().b(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(InterfaceC0903Li0 interfaceC0903Li0) {
        synchronized (this.a) {
            try {
                Iterator it = ((Set) this.c.get(c(interfaceC0903Li0))).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.b.get((C1588Ud) it.next());
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.p().isEmpty()) {
                        lifecycleCamera.u();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
