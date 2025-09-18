package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class DU extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ C1562Tu0 a;

    public DU(C1562Tu0 c1562Tu0) {
        this.a = c1562Tu0;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((C0976Mh) ((C1857Xo1) this.a.b).d).a(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((C0976Mh) ((C1857Xo1) this.a.b).d).a;
        if (weakReference.get() == null || !((C1210Ph) weakReference.get()).n) {
            return;
        }
        C1210Ph c1210Ph = (C1210Ph) weakReference.get();
        if (c1210Ph.u == null) {
            c1210Ph.u = new C0390Et0();
        }
        C1210Ph.i(c1210Ph.u, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((C0976Mh) ((C1857Xo1) this.a.b).d).a;
        if (weakReference.get() != null) {
            C1210Ph c1210Ph = (C1210Ph) weakReference.get();
            if (c1210Ph.t == null) {
                c1210Ph.t = new C0390Et0();
            }
            C1210Ph.i(c1210Ph.t, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        FU fuF = EU.f(EU.b(authenticationResult));
        C1562Tu0 c1562Tu0 = this.a;
        c1562Tu0.getClass();
        C1155Oo1 c1155Oo1 = null;
        if (fuF != null) {
            Cipher cipher = fuF.b;
            if (cipher != null) {
                c1155Oo1 = new C1155Oo1(cipher);
            } else {
                Signature signature = fuF.a;
                if (signature != null) {
                    c1155Oo1 = new C1155Oo1(signature);
                } else {
                    Mac mac = fuF.c;
                    if (mac != null) {
                        c1155Oo1 = new C1155Oo1(mac);
                    }
                }
            }
        }
        ((C0976Mh) ((C1857Xo1) c1562Tu0.b).d).b(new C0665Ih(c1155Oo1, 2));
    }
}
