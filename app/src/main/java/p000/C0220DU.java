package p000;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: DU */
/* loaded from: classes.dex */
public final class C0220DU extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a */
    public final /* synthetic */ C8342Tu0 f2019a;

    public C0220DU(C8342Tu0 c8342Tu0) {
        this.f2019a = c8342Tu0;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((C0799Mh) ((C8539Xo1) this.f2019a.f11590b).f13983d).mo5426a(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((C0799Mh) ((C8539Xo1) this.f2019a.f11590b).f13983d).f7297a;
        if (weakReference.get() == null || !((C0988Ph) weakReference.get()).f9237n) {
            return;
        }
        C0988Ph c0988Ph = (C0988Ph) weakReference.get();
        if (c0988Ph.f9244u == null) {
            c0988Ph.f9244u = new C7560Et0();
        }
        C0988Ph.m6411i(c0988Ph.f9244u, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((C0799Mh) ((C8539Xo1) this.f2019a.f11590b).f13983d).f7297a;
        if (weakReference.get() != null) {
            C0988Ph c0988Ph = (C0988Ph) weakReference.get();
            if (c0988Ph.f9243t == null) {
                c0988Ph.f9243t = new C7560Et0();
            }
            C0988Ph.m6411i(c0988Ph.f9243t, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        C0346FU c0346fuM2312f = AbstractC0283EU.m2312f(AbstractC0283EU.m2308b(authenticationResult));
        C8342Tu0 c8342Tu0 = this.f2019a;
        c8342Tu0.getClass();
        C8071Oo1 c8071Oo1 = null;
        if (c0346fuM2312f != null) {
            Cipher cipher = c0346fuM2312f.f3275b;
            if (cipher != null) {
                c8071Oo1 = new C8071Oo1(cipher);
            } else {
                Signature signature = c0346fuM2312f.f3274a;
                if (signature != null) {
                    c8071Oo1 = new C8071Oo1(signature);
                } else {
                    Mac mac = c0346fuM2312f.f3276c;
                    if (mac != null) {
                        c8071Oo1 = new C8071Oo1(mac);
                    }
                }
            }
        }
        ((C0799Mh) ((C8539Xo1) c8342Tu0.f11590b).f13983d).mo5427b(new C0548Ih(c8071Oo1, 2));
    }
}
