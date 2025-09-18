package p000;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: Ir0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7764Ir0 implements InterfaceC9841j70, InterfaceC7144xX {

    /* renamed from: a */
    public final Object f5172a;

    /* renamed from: b */
    public final C1625Zp f5173b;

    /* renamed from: c */
    public int f5174c;

    /* renamed from: d */
    public final C0267EE f5175d;

    /* renamed from: e */
    public boolean f5176e;

    /* renamed from: f */
    public final X11 f5177f;

    /* renamed from: g */
    public InterfaceC9713i70 f5178g;

    /* renamed from: h */
    public Executor f5179h;

    /* renamed from: i */
    public final LongSparseArray f5180i;

    /* renamed from: j */
    public final LongSparseArray f5181j;

    /* renamed from: k */
    public int f5182k;

    /* renamed from: l */
    public final ArrayList f5183l;

    /* renamed from: m */
    public final ArrayList f5184m;

    public C7764Ir0(int i, int i2, int i3, int i4) {
        X11 x11 = new X11(ImageReader.newInstance(i, i2, i3, i4));
        this.f5172a = new Object();
        this.f5173b = new C1625Zp(1, this);
        this.f5174c = 0;
        this.f5175d = new C0267EE(27, this);
        this.f5176e = false;
        this.f5180i = new LongSparseArray();
        this.f5181j = new LongSparseArray();
        this.f5184m = new ArrayList();
        this.f5177f = x11;
        this.f5182k = 0;
        this.f5183l = new ArrayList(mo4048l());
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: a */
    public final InterfaceC9457g70 mo4037a() {
        synchronized (this.f5172a) {
            try {
                if (this.f5183l.isEmpty()) {
                    return null;
                }
                if (this.f5182k >= this.f5183l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f5183l.size() - 1; i++) {
                    if (!this.f5184m.contains(this.f5183l.get(i))) {
                        arrayList.add((InterfaceC9457g70) this.f5183l.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC9457g70) it.next()).close();
                }
                int size = this.f5183l.size();
                ArrayList arrayList2 = this.f5183l;
                this.f5182k = size;
                InterfaceC9457g70 interfaceC9457g70 = (InterfaceC9457g70) arrayList2.get(size - 1);
                this.f5184m.add(interfaceC9457g70);
                return interfaceC9457g70;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC7144xX
    /* renamed from: b */
    public final void mo4038b(AbstractC7207yX abstractC7207yX) {
        synchronized (this.f5172a) {
            m4040d(abstractC7207yX);
        }
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: c */
    public final int mo4039c() {
        int iMo4039c;
        synchronized (this.f5172a) {
            iMo4039c = this.f5177f.mo4039c();
        }
        return iMo4039c;
    }

    @Override // p000.InterfaceC9841j70
    public final void close() {
        synchronized (this.f5172a) {
            try {
                if (this.f5176e) {
                    return;
                }
                Iterator it = new ArrayList(this.f5183l).iterator();
                while (it.hasNext()) {
                    ((InterfaceC9457g70) it.next()).close();
                }
                this.f5183l.clear();
                this.f5177f.close();
                this.f5176e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void m4040d(AbstractC7207yX abstractC7207yX) {
        synchronized (this.f5172a) {
            try {
                int iIndexOf = this.f5183l.indexOf(abstractC7207yX);
                if (iIndexOf >= 0) {
                    this.f5183l.remove(iIndexOf);
                    int i = this.f5182k;
                    if (iIndexOf <= i) {
                        this.f5182k = i - 1;
                    }
                }
                this.f5184m.remove(abstractC7207yX);
                if (this.f5174c > 0) {
                    m4043g(this.f5177f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final void m4041e(C11814yZ0 c11814yZ0) {
        InterfaceC9713i70 interfaceC9713i70;
        Executor executor;
        synchronized (this.f5172a) {
            try {
                if (this.f5183l.size() < mo4048l()) {
                    c11814yZ0.m26161a(this);
                    this.f5183l.add(c11814yZ0);
                    interfaceC9713i70 = this.f5178g;
                    executor = this.f5179h;
                } else {
                    AbstractC7806Jm0.m4412f("TAG");
                    c11814yZ0.close();
                    interfaceC9713i70 = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC9713i70 != null) {
            if (executor != null) {
                executor.execute(new RunnableC1096RQ(this, 17, interfaceC9713i70));
            } else {
                interfaceC9713i70.mo504k(this);
            }
        }
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: f */
    public final void mo4042f() {
        synchronized (this.f5172a) {
            this.f5177f.mo4042f();
            this.f5178g = null;
            this.f5179h = null;
            this.f5174c = 0;
        }
    }

    /* renamed from: g */
    public final void m4043g(InterfaceC9841j70 interfaceC9841j70) {
        InterfaceC9457g70 interfaceC9457g70Mo4049n;
        synchronized (this.f5172a) {
            try {
                if (this.f5176e) {
                    return;
                }
                int size = this.f5181j.size() + this.f5183l.size();
                if (size >= interfaceC9841j70.mo4048l()) {
                    AbstractC7806Jm0.m4412f("MetadataImageReader");
                    return;
                }
                do {
                    try {
                        interfaceC9457g70Mo4049n = interfaceC9841j70.mo4049n();
                        if (interfaceC9457g70Mo4049n != null) {
                            this.f5174c--;
                            size++;
                            this.f5181j.put(interfaceC9457g70Mo4049n.mo18403P().getTimestamp(), interfaceC9457g70Mo4049n);
                            m4045i();
                        }
                    } catch (IllegalStateException unused) {
                        AbstractC7806Jm0.m4412f("MetadataImageReader");
                        interfaceC9457g70Mo4049n = null;
                    }
                    if (interfaceC9457g70Mo4049n == null || this.f5174c <= 0) {
                        break;
                    }
                } while (size < interfaceC9841j70.mo4048l());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC9841j70
    public final int getHeight() {
        int height;
        synchronized (this.f5172a) {
            height = this.f5177f.getHeight();
        }
        return height;
    }

    @Override // p000.InterfaceC9841j70
    public final int getWidth() {
        int width;
        synchronized (this.f5172a) {
            width = this.f5177f.getWidth();
        }
        return width;
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: h */
    public final Surface mo4044h() {
        Surface surfaceMo4044h;
        synchronized (this.f5172a) {
            surfaceMo4044h = this.f5177f.mo4044h();
        }
        return surfaceMo4044h;
    }

    /* renamed from: i */
    public final void m4045i() {
        synchronized (this.f5172a) {
            try {
                for (int size = this.f5180i.size() - 1; size >= 0; size--) {
                    K60 k60 = (K60) this.f5180i.valueAt(size);
                    long timestamp = k60.getTimestamp();
                    InterfaceC9457g70 interfaceC9457g70 = (InterfaceC9457g70) this.f5181j.get(timestamp);
                    if (interfaceC9457g70 != null) {
                        this.f5181j.remove(timestamp);
                        this.f5180i.removeAt(size);
                        m4041e(new C11814yZ0(interfaceC9457g70, null, k60));
                    }
                }
                m4046j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final void m4046j() {
        synchronized (this.f5172a) {
            try {
                if (this.f5181j.size() != 0 && this.f5180i.size() != 0) {
                    long jKeyAt = this.f5181j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f5180i.keyAt(0);
                    AbstractC9104dM1.m17546e(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f5181j.size() - 1; size >= 0; size--) {
                            if (this.f5181j.keyAt(size) < jKeyAt2) {
                                ((InterfaceC9457g70) this.f5181j.valueAt(size)).close();
                                this.f5181j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f5180i.size() - 1; size2 >= 0; size2--) {
                            if (this.f5180i.keyAt(size2) < jKeyAt) {
                                this.f5180i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: k */
    public final void mo4047k(InterfaceC9713i70 interfaceC9713i70, Executor executor) {
        synchronized (this.f5172a) {
            interfaceC9713i70.getClass();
            this.f5178g = interfaceC9713i70;
            executor.getClass();
            this.f5179h = executor;
            this.f5177f.mo4047k(this.f5175d, executor);
        }
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: l */
    public final int mo4048l() {
        int iMo4048l;
        synchronized (this.f5172a) {
            iMo4048l = this.f5177f.mo4048l();
        }
        return iMo4048l;
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: n */
    public final InterfaceC9457g70 mo4049n() {
        synchronized (this.f5172a) {
            try {
                if (this.f5183l.isEmpty()) {
                    return null;
                }
                if (this.f5182k >= this.f5183l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.f5183l;
                int i = this.f5182k;
                this.f5182k = i + 1;
                InterfaceC9457g70 interfaceC9457g70 = (InterfaceC9457g70) arrayList.get(i);
                this.f5184m.add(interfaceC9457g70);
                return interfaceC9457g70;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
