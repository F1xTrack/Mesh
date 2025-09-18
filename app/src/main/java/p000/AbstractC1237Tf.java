package p000;

/* renamed from: Tf */
/* loaded from: classes.dex */
public abstract class AbstractC1237Tf {

    /* renamed from: a */
    public boolean f11461a = false;

    /* renamed from: a */
    public static boolean m7714a(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: b */
    public static boolean m7715b(int i) {
        return !m7714a(i);
    }

    /* renamed from: l */
    public static boolean m7716l(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: c */
    public final synchronized void m7717c() {
        if (this.f11461a) {
            return;
        }
        this.f11461a = true;
        try {
            mo6844d();
        } catch (Exception unused) {
            m7721k();
        }
    }

    /* renamed from: d */
    public abstract void mo6844d();

    /* renamed from: e */
    public final synchronized void m7718e(Throwable th) {
        if (this.f11461a) {
            return;
        }
        this.f11461a = true;
        try {
            mo6845f(th);
        } catch (Exception unused) {
            m7721k();
        }
    }

    /* renamed from: f */
    public abstract void mo6845f(Throwable th);

    /* renamed from: g */
    public final synchronized void m7719g(int i, Object obj) {
        if (this.f11461a) {
            return;
        }
        this.f11461a = m7714a(i);
        try {
            mo6846h(i, obj);
        } catch (Exception unused) {
            m7721k();
        }
    }

    /* renamed from: h */
    public abstract void mo6846h(int i, Object obj);

    /* renamed from: i */
    public final synchronized void m7720i(float f) {
        if (this.f11461a) {
            return;
        }
        try {
            mo6847j(f);
        } catch (Exception unused) {
            m7721k();
        }
    }

    /* renamed from: j */
    public abstract void mo6847j(float f);

    /* renamed from: k */
    public final void m7721k() {
        AbstractC3929dS.f26114a.m18228o(6);
    }
}
