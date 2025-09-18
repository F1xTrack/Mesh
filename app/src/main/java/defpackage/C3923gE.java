package defpackage;

import android.app.KeyguardManager;
import android.os.Build;
import android.os.Looper;
import androidx.fragment.app.l;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactApplicationContext;
import java.security.Key;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: gE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3923gE extends EO1 implements InterfaceC3732fE {
    public C1942Yr a;
    public Throwable b;
    public final ReactApplicationContext c;
    public final AbstractC3280cs d;
    public final ExecutorService e = Executors.newSingleThreadExecutor();
    public C1864Xr f;
    public final C0821Kh g;

    public C3923gE(ReactApplicationContext reactApplicationContext, InterfaceC2020Zr interfaceC2020Zr, C0821Kh c0821Kh) {
        this.c = reactApplicationContext;
        this.d = (AbstractC3280cs) interfaceC2020Zr;
        this.g = c0821Kh;
    }

    @Override // defpackage.EO1
    public void a(int i, CharSequence charSequence) {
        d(null, new C6027nB("code: " + i + ", msg: " + ((Object) charSequence)));
    }

    @Override // defpackage.InterfaceC3732fE
    public final Throwable c() {
        return this.b;
    }

    @Override // defpackage.InterfaceC3732fE
    public final void d(C1942Yr c1942Yr, Throwable th) {
        this.a = c1942Yr;
        this.b = th;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // defpackage.EO1
    public void e(C0665Ih c0665Ih) {
        AbstractC3280cs abstractC3280cs = this.d;
        try {
            C1864Xr c1864Xr = this.f;
            if (c1864Xr == null) {
                throw new NullPointerException("Decrypt context is not assigned yet.");
            }
            String strI = abstractC3280cs.i((Key) c1864Xr.c, (byte[]) c1864Xr.a);
            C1864Xr c1864Xr2 = this.f;
            d(new C1942Yr(strI, abstractC3280cs.i((Key) c1864Xr2.c, (byte[]) c1864Xr2.b)), null);
        } catch (Throwable th) {
            d(null, th);
        }
    }

    @Override // defpackage.InterfaceC3732fE
    public final void g(C1864Xr c1864Xr) {
        this.f = c1864Xr;
        int i = Build.VERSION.SDK_INT;
        ReactApplicationContext reactApplicationContext = this.c;
        if (((KeyguardManager) reactApplicationContext.getSystemService("keyguard")).isKeyguardSecure() && (i < 28 ? reactApplicationContext.checkSelfPermission("android.permission.USE_FINGERPRINT") == 0 : reactApplicationContext.checkSelfPermission("android.permission.USE_BIOMETRIC") == 0)) {
            i();
        } else {
            d(null, new C6027nB("Could not start fingerprint Authentication. No permissions granted."));
        }
    }

    @Override // defpackage.InterfaceC3732fE
    public final C1942Yr getResult() {
        return this.a;
    }

    public final l h() {
        l lVar = (l) this.c.getCurrentActivity();
        if (lVar != null) {
            return lVar;
        }
        throw new NullPointerException("Not assigned current activity");
    }

    public void i() {
        l lVarH = h();
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            lVarH.runOnUiThread(new G4(28, this));
            j();
            return;
        }
        C1304Qm0 c1304Qm0 = new C1304Qm0(lVarH, this.e, this);
        C0821Kh c0821Kh = this.g;
        if (c0821Kh == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        c1304Qm0.u(c0821Kh, null);
    }

    public final void j() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new AssertionException("method should not be executed from MAIN thread");
        }
        try {
            synchronized (this) {
                wait();
            }
        } catch (InterruptedException unused) {
        }
    }
}
