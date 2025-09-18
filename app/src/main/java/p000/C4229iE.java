package p000;

import android.os.Looper;
import androidx.fragment.app.AbstractActivityC1730l;

/* renamed from: iE */
/* loaded from: classes2.dex */
public final class C4229iE extends C4103gE {

    /* renamed from: h */
    public C8170Qm0 f28969h;

    /* renamed from: i */
    public Boolean f28970i;

    @Override // p000.C4103gE, p000.EO1
    /* renamed from: a */
    public final void mo2211a(int i, CharSequence charSequence) {
        if (!this.f28970i.booleanValue()) {
            super.mo2211a(i, charSequence);
            return;
        }
        this.f28969h = null;
        this.f28970i = Boolean.FALSE;
        m18987k();
    }

    @Override // p000.EO1
    /* renamed from: b */
    public final void mo2212b() {
        C0359Fh c0359Fh;
        C8170Qm0 c8170Qm0 = this.f28969h;
        if (c8170Qm0 != null) {
            this.f28970i = Boolean.TRUE;
            try {
                try {
                    C6244jY c6244jY = (C6244jY) c8170Qm0.f9780b;
                    if (c6244jY != null && (c0359Fh = (C0359Fh) c6244jY.m10039B("androidx.biometric.BiometricFragment")) != null) {
                        c0359Fh.m2739r(3);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                this.f28969h = null;
            }
        }
    }

    @Override // p000.C4103gE, p000.EO1
    /* renamed from: e */
    public final void mo2213e(C0548Ih c0548Ih) {
        this.f28969h = null;
        this.f28970i = Boolean.FALSE;
        super.mo2213e(c0548Ih);
    }

    @Override // p000.C4103gE
    /* renamed from: i */
    public final void mo18409i() {
        AbstractActivityC1730l abstractActivityC1730lM18408h = m18408h();
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            abstractActivityC1730lM18408h.runOnUiThread(new RunnableC4166hE(this, 0));
            m18410j();
            return;
        }
        C8170Qm0 c8170Qm0 = new C8170Qm0(abstractActivityC1730lM18408h, this.f27622e, this);
        C0674Kh c0674Kh = this.f27624g;
        if (c0674Kh == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        c8170Qm0.m6778u(c0674Kh, null);
        this.f28969h = c8170Qm0;
    }

    /* renamed from: k */
    public final void m18987k() {
        AbstractActivityC1730l abstractActivityC1730lM18408h = m18408h();
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            abstractActivityC1730lM18408h.runOnUiThread(new RunnableC4166hE(this, 1));
            return;
        }
        C8170Qm0 c8170Qm0 = new C8170Qm0(abstractActivityC1730lM18408h, this.f27622e, this);
        C0674Kh c0674Kh = this.f27624g;
        if (c0674Kh == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        c8170Qm0.m6778u(c0674Kh, null);
        this.f28969h = c8170Qm0;
    }
}
