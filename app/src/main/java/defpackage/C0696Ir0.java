package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: Ir0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696Ir0 implements InterfaceC5252j70, InterfaceC8000xX {
    public final Object a;
    public final C2014Zp b;
    public int c;
    public final EE d;
    public boolean e;
    public final X11 f;
    public InterfaceC4285i70 g;
    public Executor h;
    public final LongSparseArray i;
    public final LongSparseArray j;
    public int k;
    public final ArrayList l;
    public final ArrayList m;

    public C0696Ir0(int i, int i2, int i3, int i4) {
        X11 x11 = new X11(ImageReader.newInstance(i, i2, i3, i4));
        this.a = new Object();
        this.b = new C2014Zp(1, this);
        this.c = 0;
        this.d = new EE(27, this);
        this.e = false;
        this.i = new LongSparseArray();
        this.j = new LongSparseArray();
        this.m = new ArrayList();
        this.f = x11;
        this.k = 0;
        this.l = new ArrayList(l());
    }

    @Override // defpackage.InterfaceC5252j70
    public final InterfaceC3903g70 a() {
        synchronized (this.a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.k >= this.l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.l.size() - 1; i++) {
                    if (!this.m.contains(this.l.get(i))) {
                        arrayList.add((InterfaceC3903g70) this.l.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3903g70) it.next()).close();
                }
                int size = this.l.size();
                ArrayList arrayList2 = this.l;
                this.k = size;
                InterfaceC3903g70 interfaceC3903g70 = (InterfaceC3903g70) arrayList2.get(size - 1);
                this.m.add(interfaceC3903g70);
                return interfaceC3903g70;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC8000xX
    public final void b(AbstractC8190yX abstractC8190yX) {
        synchronized (this.a) {
            d(abstractC8190yX);
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public final int c() {
        int iC;
        synchronized (this.a) {
            iC = this.f.c();
        }
        return iC;
    }

    @Override // defpackage.InterfaceC5252j70
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = new ArrayList(this.l).iterator();
                while (it.hasNext()) {
                    ((InterfaceC3903g70) it.next()).close();
                }
                this.l.clear();
                this.f.close();
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(AbstractC8190yX abstractC8190yX) {
        synchronized (this.a) {
            try {
                int iIndexOf = this.l.indexOf(abstractC8190yX);
                if (iIndexOf >= 0) {
                    this.l.remove(iIndexOf);
                    int i = this.k;
                    if (iIndexOf <= i) {
                        this.k = i - 1;
                    }
                }
                this.m.remove(abstractC8190yX);
                if (this.c > 0) {
                    g(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(C8197yZ0 c8197yZ0) {
        InterfaceC4285i70 interfaceC4285i70;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.l.size() < l()) {
                    c8197yZ0.a(this);
                    this.l.add(c8197yZ0);
                    interfaceC4285i70 = this.g;
                    executor = this.h;
                } else {
                    AbstractC0759Jm0.f("TAG");
                    c8197yZ0.close();
                    interfaceC4285i70 = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC4285i70 != null) {
            if (executor != null) {
                executor.execute(new RQ(this, 17, interfaceC4285i70));
            } else {
                interfaceC4285i70.k(this);
            }
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public final void f() {
        synchronized (this.a) {
            this.f.f();
            this.g = null;
            this.h = null;
            this.c = 0;
        }
    }

    public final void g(InterfaceC5252j70 interfaceC5252j70) {
        InterfaceC3903g70 interfaceC3903g70N;
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                int size = this.j.size() + this.l.size();
                if (size >= interfaceC5252j70.l()) {
                    AbstractC0759Jm0.f("MetadataImageReader");
                    return;
                }
                do {
                    try {
                        interfaceC3903g70N = interfaceC5252j70.n();
                        if (interfaceC3903g70N != null) {
                            this.c--;
                            size++;
                            this.j.put(interfaceC3903g70N.P().getTimestamp(), interfaceC3903g70N);
                            i();
                        }
                    } catch (IllegalStateException unused) {
                        AbstractC0759Jm0.f("MetadataImageReader");
                        interfaceC3903g70N = null;
                    }
                    if (interfaceC3903g70N == null || this.c <= 0) {
                        break;
                    }
                } while (size < interfaceC5252j70.l());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.f.getHeight();
        }
        return height;
    }

    @Override // defpackage.InterfaceC5252j70
    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.f.getWidth();
        }
        return width;
    }

    @Override // defpackage.InterfaceC5252j70
    public final Surface h() {
        Surface surfaceH;
        synchronized (this.a) {
            surfaceH = this.f.h();
        }
        return surfaceH;
    }

    public final void i() {
        synchronized (this.a) {
            try {
                for (int size = this.i.size() - 1; size >= 0; size--) {
                    K60 k60 = (K60) this.i.valueAt(size);
                    long timestamp = k60.getTimestamp();
                    InterfaceC3903g70 interfaceC3903g70 = (InterfaceC3903g70) this.j.get(timestamp);
                    if (interfaceC3903g70 != null) {
                        this.j.remove(timestamp);
                        this.i.removeAt(size);
                        e(new C8197yZ0(interfaceC3903g70, null, k60));
                    }
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.a) {
            try {
                if (this.j.size() != 0 && this.i.size() != 0) {
                    long jKeyAt = this.j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.i.keyAt(0);
                    AbstractC3377dM1.e(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.j.size() - 1; size >= 0; size--) {
                            if (this.j.keyAt(size) < jKeyAt2) {
                                ((InterfaceC3903g70) this.j.valueAt(size)).close();
                                this.j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.i.size() - 1; size2 >= 0; size2--) {
                            if (this.i.keyAt(size2) < jKeyAt) {
                                this.i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public final void k(InterfaceC4285i70 interfaceC4285i70, Executor executor) {
        synchronized (this.a) {
            interfaceC4285i70.getClass();
            this.g = interfaceC4285i70;
            executor.getClass();
            this.h = executor;
            this.f.k(this.d, executor);
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public final int l() {
        int iL;
        synchronized (this.a) {
            iL = this.f.l();
        }
        return iL;
    }

    @Override // defpackage.InterfaceC5252j70
    public final InterfaceC3903g70 n() {
        synchronized (this.a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.k >= this.l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.l;
                int i = this.k;
                this.k = i + 1;
                InterfaceC3903g70 interfaceC3903g70 = (InterfaceC3903g70) arrayList.get(i);
                this.m.add(interfaceC3903g70);
                return interfaceC3903g70;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
