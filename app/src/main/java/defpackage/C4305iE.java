package defpackage;

import android.os.Looper;
import androidx.fragment.app.l;

/* renamed from: iE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4305iE extends C3923gE {
    public C1304Qm0 h;
    public Boolean i;

    @Override // defpackage.C3923gE, defpackage.EO1
    public final void a(int i, CharSequence charSequence) {
        if (!this.i.booleanValue()) {
            super.a(i, charSequence);
            return;
        }
        this.h = null;
        this.i = Boolean.FALSE;
        k();
    }

    @Override // defpackage.EO1
    public final void b() {
        C0431Fh c0431Fh;
        C1304Qm0 c1304Qm0 = this.h;
        if (c1304Qm0 != null) {
            this.i = Boolean.TRUE;
            try {
                try {
                    C5332jY c5332jY = (C5332jY) c1304Qm0.b;
                    if (c5332jY != null && (c0431Fh = (C0431Fh) c5332jY.B("androidx.biometric.BiometricFragment")) != null) {
                        c0431Fh.r(3);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                this.h = null;
            }
        }
    }

    @Override // defpackage.C3923gE, defpackage.EO1
    public final void e(C0665Ih c0665Ih) {
        this.h = null;
        this.i = Boolean.FALSE;
        super.e(c0665Ih);
    }

    @Override // defpackage.C3923gE
    public final void i() {
        l lVarH = h();
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            lVarH.runOnUiThread(new RunnableC4114hE(this, 0));
            j();
            return;
        }
        C1304Qm0 c1304Qm0 = new C1304Qm0(lVarH, this.e, this);
        C0821Kh c0821Kh = this.g;
        if (c0821Kh == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        c1304Qm0.u(c0821Kh, null);
        this.h = c1304Qm0;
    }

    public final void k() {
        l lVarH = h();
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            lVarH.runOnUiThread(new RunnableC4114hE(this, 1));
            return;
        }
        C1304Qm0 c1304Qm0 = new C1304Qm0(lVarH, this.e, this);
        C0821Kh c0821Kh = this.g;
        if (c0821Kh == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        c1304Qm0.u(c0821Kh, null);
        this.h = c1304Qm0;
    }
}
