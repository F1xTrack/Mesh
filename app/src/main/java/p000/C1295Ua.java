package p000;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: Ua */
/* loaded from: classes.dex */
public final class C1295Ua extends BiometricPrompt$AuthenticationCallback {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1484Xa f11919a;

    public C1295Ua(AbstractC1484Xa abstractC1484Xa) {
        this.f11919a = abstractC1484Xa;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.f11919a.mo5426a(i, charSequence);
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((C0799Mh) this.f11919a).f7297a;
        if (weakReference.get() == null || !((C0988Ph) weakReference.get()).f9237n) {
            return;
        }
        C0988Ph c0988Ph = (C0988Ph) weakReference.get();
        if (c0988Ph.f9244u == null) {
            c0988Ph.f9244u = new C7560Et0();
        }
        C0988Ph.m6411i(c0988Ph.f9244u, Boolean.TRUE);
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential identityCredentialM24179b;
        C8071Oo1 c8071Oo1 = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher cipherM23943d = AbstractC6664qB.m23943d(cryptoObject);
            if (cipherM23943d != null) {
                c8071Oo1 = new C8071Oo1(cipherM23943d);
            } else {
                Signature signatureM23945f = AbstractC6664qB.m23945f(cryptoObject);
                if (signatureM23945f != null) {
                    c8071Oo1 = new C8071Oo1(signatureM23945f);
                } else {
                    Mac macM23944e = AbstractC6664qB.m23944e(cryptoObject);
                    if (macM23944e != null) {
                        c8071Oo1 = new C8071Oo1(macM23944e);
                    } else if (Build.VERSION.SDK_INT >= 30 && (identityCredentialM24179b = AbstractC6727rB.m24179b(cryptoObject)) != null) {
                        c8071Oo1 = new C8071Oo1();
                        c8071Oo1.f8627a = null;
                        c8071Oo1.f8628b = null;
                        c8071Oo1.f8629c = null;
                        c8071Oo1.f8630d = identityCredentialM24179b;
                    }
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        int iM8821a = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                iM8821a = AbstractC1421Wa.m8821a(authenticationResult);
            }
        } else if (i != 29) {
            iM8821a = 2;
        }
        this.f11919a.mo5427b(new C0548Ih(c8071Oo1, iM8821a));
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
