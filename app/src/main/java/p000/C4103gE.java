package p000;

import android.app.KeyguardManager;
import android.os.Build;
import android.os.Looper;
import androidx.fragment.app.AbstractActivityC1730l;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactApplicationContext;
import java.security.Key;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: gE */
/* loaded from: classes2.dex */
public class C4103gE extends EO1 implements InterfaceC4040fE {

    /* renamed from: a */
    public C1564Yr f27618a;

    /* renamed from: b */
    public Throwable f27619b;

    /* renamed from: c */
    public final ReactApplicationContext f27620c;

    /* renamed from: d */
    public final AbstractC3892cs f27621d;

    /* renamed from: e */
    public final ExecutorService f27622e = Executors.newSingleThreadExecutor();

    /* renamed from: f */
    public C1501Xr f27623f;

    /* renamed from: g */
    public final C0674Kh f27624g;

    public C4103gE(ReactApplicationContext reactApplicationContext, InterfaceC1627Zr interfaceC1627Zr, C0674Kh c0674Kh) {
        this.f27620c = reactApplicationContext;
        this.f27621d = (AbstractC3892cs) interfaceC1627Zr;
        this.f27624g = c0674Kh;
    }

    @Override // p000.EO1
    /* renamed from: a */
    public void mo2211a(int i, CharSequence charSequence) {
        mo18197d(null, new C6473nB("code: " + i + ", msg: " + ((Object) charSequence)));
    }

    @Override // p000.InterfaceC4040fE
    /* renamed from: c */
    public final Throwable mo18196c() {
        return this.f27619b;
    }

    @Override // p000.InterfaceC4040fE
    /* renamed from: d */
    public final void mo18197d(C1564Yr c1564Yr, Throwable th) {
        this.f27618a = c1564Yr;
        this.f27619b = th;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // p000.EO1
    /* renamed from: e */
    public void mo2213e(C0548Ih c0548Ih) {
        AbstractC3892cs abstractC3892cs = this.f27621d;
        try {
            C1501Xr c1501Xr = this.f27623f;
            if (c1501Xr == null) {
                throw new NullPointerException("Decrypt context is not assigned yet.");
            }
            String strMo17422i = abstractC3892cs.mo17422i((Key) c1501Xr.f13993c, (byte[]) c1501Xr.f2473a);
            C1501Xr c1501Xr2 = this.f27623f;
            mo18197d(new C1564Yr(strMo17422i, abstractC3892cs.mo17422i((Key) c1501Xr2.f13993c, (byte[]) c1501Xr2.f2474b)), null);
        } catch (Throwable th) {
            mo18197d(null, th);
        }
    }

    @Override // p000.InterfaceC4040fE
    /* renamed from: g */
    public final void mo18198g(C1501Xr c1501Xr) {
        this.f27623f = c1501Xr;
        int i = Build.VERSION.SDK_INT;
        ReactApplicationContext reactApplicationContext = this.f27620c;
        if (((KeyguardManager) reactApplicationContext.getSystemService("keyguard")).isKeyguardSecure() && (i < 28 ? reactApplicationContext.checkSelfPermission("android.permission.USE_FINGERPRINT") == 0 : reactApplicationContext.checkSelfPermission("android.permission.USE_BIOMETRIC") == 0)) {
            mo18409i();
        } else {
            mo18197d(null, new C6473nB("Could not start fingerprint Authentication. No permissions granted."));
        }
    }

    @Override // p000.InterfaceC4040fE
    public final C1564Yr getResult() {
        return this.f27618a;
    }

    /* renamed from: h */
    public final AbstractActivityC1730l m18408h() {
        AbstractActivityC1730l abstractActivityC1730l = (AbstractActivityC1730l) this.f27620c.getCurrentActivity();
        if (abstractActivityC1730l != null) {
            return abstractActivityC1730l;
        }
        throw new NullPointerException("Not assigned current activity");
    }

    /* renamed from: i */
    public void mo18409i() {
        AbstractActivityC1730l abstractActivityC1730lM18408h = m18408h();
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            abstractActivityC1730lM18408h.runOnUiThread(new RunnableC0383G4(28, this));
            m18410j();
            return;
        }
        C8170Qm0 c8170Qm0 = new C8170Qm0(abstractActivityC1730lM18408h, this.f27622e, this);
        C0674Kh c0674Kh = this.f27624g;
        if (c0674Kh == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        c8170Qm0.m6778u(c0674Kh, null);
    }

    /* renamed from: j */
    public final void m18410j() {
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
