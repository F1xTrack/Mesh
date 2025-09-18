package p000;

import android.os.CancellationSignal;
import android.view.animation.LinearInterpolator;

/* renamed from: h12 */
/* loaded from: classes.dex */
public abstract class AbstractC9572h12 {

    /* renamed from: a */
    public static AV1 f28168a;

    /* renamed from: d */
    public static final boolean m18696d(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        return abstractC7742Ig0.mo3963L() instanceof AbstractC3933dW;
    }

    /* renamed from: e */
    public static final X01 m18697e(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC7742Ig0.mo3963L();
        if (abstractC8315Tg1Mo3963L instanceof AbstractC3933dW) {
            return ((AbstractC3933dW) abstractC8315Tg1Mo3963L).f26126b;
        }
        if (abstractC8315Tg1Mo3963L instanceof X01) {
            return (X01) abstractC8315Tg1Mo3963L;
        }
        throw new C6838sg();
    }

    /* renamed from: j */
    public static final X01 m18698j(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC7742Ig0.mo3963L();
        if (abstractC8315Tg1Mo3963L instanceof AbstractC3933dW) {
            return ((AbstractC3933dW) abstractC8315Tg1Mo3963L).f26127c;
        }
        if (abstractC8315Tg1Mo3963L instanceof X01) {
            return (X01) abstractC8315Tg1Mo3963L;
        }
        throw new C6838sg();
    }

    /* renamed from: k */
    public static synchronized V02 m18699k(D02 d02) {
        try {
            if (f28168a == null) {
                f28168a = new AV1(1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (V02) f28168a.m7838g1(d02);
    }

    /* renamed from: a */
    public abstract void mo8860a(LinearInterpolator linearInterpolator, CancellationSignal cancellationSignal, C8572Yf0 c8572Yf0);

    /* renamed from: b */
    public abstract int mo8861b();

    /* renamed from: c */
    public abstract void mo8862c(int i);

    /* renamed from: g */
    public abstract void mo8863g(boolean z);

    /* renamed from: h */
    public abstract void mo8864h(int i);

    /* renamed from: i */
    public abstract void mo8865i(int i);

    /* renamed from: f */
    public void mo9116f(boolean z) {
    }
}
