package defpackage;

import android.graphics.Bitmap;
import java.io.Closeable;

/* renamed from: zt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8446zt implements Cloneable, Closeable {
    public static final OL0 e = new OL0(9);
    public static final OJ1 f = new OJ1(9);
    public boolean a = false;
    public final C6946s01 b;
    public final InterfaceC8256yt c;
    public final Throwable d;

    public AbstractC8446zt(C6946s01 c6946s01, InterfaceC8256yt interfaceC8256yt, Throwable th) {
        c6946s01.getClass();
        this.b = c6946s01;
        synchronized (c6946s01) {
            c6946s01.c();
            c6946s01.b++;
        }
        this.c = interfaceC8256yt;
        this.d = th;
    }

    public static boolean D(AbstractC8446zt abstractC8446zt) {
        return abstractC8446zt != null && abstractC8446zt.A();
    }

    public static UE J(Closeable closeable) {
        return S(closeable, e, f);
    }

    public static UE S(Object obj, InterfaceC7986xS0 interfaceC7986xS0, InterfaceC8256yt interfaceC8256yt) {
        if (obj == null) {
            return null;
        }
        interfaceC8256yt.g();
        if (!(obj instanceof Bitmap)) {
            boolean z = obj instanceof InterfaceC7876wt;
        }
        return new UE(obj, interfaceC7986xS0, interfaceC8256yt, null, true);
    }

    public static AbstractC8446zt o(AbstractC8446zt abstractC8446zt) {
        if (abstractC8446zt != null) {
            return abstractC8446zt.n();
        }
        return null;
    }

    public static void p(AbstractC8446zt abstractC8446zt) {
        if (abstractC8446zt != null) {
            abstractC8446zt.close();
        }
    }

    public synchronized boolean A() {
        return !this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.b.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: m */
    public abstract AbstractC8446zt clone();

    public synchronized AbstractC8446zt n() {
        if (!A()) {
            return null;
        }
        return clone();
    }

    public final synchronized Object w() {
        Object objD;
        ML1.e(!this.a);
        objD = this.b.d();
        objD.getClass();
        return objD;
    }

    public final synchronized C6946s01 x() {
        return this.b;
    }

    public AbstractC8446zt(Object obj, InterfaceC7986xS0 interfaceC7986xS0, InterfaceC8256yt interfaceC8256yt, Throwable th, boolean z) {
        this.b = new C6946s01(obj, interfaceC7986xS0, z);
        this.c = interfaceC8256yt;
        this.d = th;
    }
}
