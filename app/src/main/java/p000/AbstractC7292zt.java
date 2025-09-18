package p000;

import android.graphics.Bitmap;
import java.io.Closeable;

/* renamed from: zt */
/* loaded from: classes.dex */
public abstract class AbstractC7292zt implements Cloneable, Closeable {

    /* renamed from: e */
    public static final OL0 f47071e = new OL0(9);

    /* renamed from: f */
    public static final OJ1 f47072f = new OJ1(9);

    /* renamed from: a */
    public boolean f47073a = false;

    /* renamed from: b */
    public final C10976s01 f47074b;

    /* renamed from: c */
    public final InterfaceC7229yt f47075c;

    /* renamed from: d */
    public final Throwable f47076d;

    public AbstractC7292zt(C10976s01 c10976s01, InterfaceC7229yt interfaceC7229yt, Throwable th) {
        c10976s01.getClass();
        this.f47074b = c10976s01;
        synchronized (c10976s01) {
            c10976s01.m24573c();
            c10976s01.f42198b++;
        }
        this.f47075c = interfaceC7229yt;
        this.f47076d = th;
    }

    /* renamed from: D */
    public static boolean m26565D(AbstractC7292zt abstractC7292zt) {
        return abstractC7292zt != null && abstractC7292zt.m26570A();
    }

    /* renamed from: J */
    public static C1273UE m26566J(Closeable closeable) {
        return m26567S(closeable, f47071e, f47072f);
    }

    /* renamed from: S */
    public static C1273UE m26567S(Object obj, InterfaceC11673xS0 interfaceC11673xS0, InterfaceC7229yt interfaceC7229yt) {
        if (obj == null) {
            return null;
        }
        interfaceC7229yt.mo2898g();
        if (!(obj instanceof Bitmap)) {
            boolean z = obj instanceof InterfaceC7103wt;
        }
        return new C1273UE(obj, interfaceC11673xS0, interfaceC7229yt, null, true);
    }

    /* renamed from: o */
    public static AbstractC7292zt m26568o(AbstractC7292zt abstractC7292zt) {
        if (abstractC7292zt != null) {
            return abstractC7292zt.m26571n();
        }
        return null;
    }

    /* renamed from: p */
    public static void m26569p(AbstractC7292zt abstractC7292zt) {
        if (abstractC7292zt != null) {
            abstractC7292zt.close();
        }
    }

    /* renamed from: A */
    public synchronized boolean m26570A() {
        return !this.f47073a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f47073a) {
                    return;
                }
                this.f47073a = true;
                this.f47074b.m24572b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: m */
    public abstract AbstractC7292zt clone();

    /* renamed from: n */
    public synchronized AbstractC7292zt m26571n() {
        if (!m26570A()) {
            return null;
        }
        return clone();
    }

    /* renamed from: w */
    public final synchronized Object m26572w() {
        Object objM24574d;
        ML1.m5338e(!this.f47073a);
        objM24574d = this.f47074b.m24574d();
        objM24574d.getClass();
        return objM24574d;
    }

    /* renamed from: x */
    public final synchronized C10976s01 m26573x() {
        return this.f47074b;
    }

    public AbstractC7292zt(Object obj, InterfaceC11673xS0 interfaceC11673xS0, InterfaceC7229yt interfaceC7229yt, Throwable th, boolean z) {
        this.f47074b = new C10976s01(obj, interfaceC11673xS0, z);
        this.f47075c = interfaceC7229yt;
        this.f47076d = th;
    }
}
