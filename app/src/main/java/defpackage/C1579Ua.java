package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: Ua, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1579Ua extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ AbstractC1813Xa a;

    public C1579Ua(AbstractC1813Xa abstractC1813Xa) {
        this.a = abstractC1813Xa;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((C0976Mh) this.a).a;
        if (weakReference.get() == null || !((C1210Ph) weakReference.get()).n) {
            return;
        }
        C1210Ph c1210Ph = (C1210Ph) weakReference.get();
        if (c1210Ph.u == null) {
            c1210Ph.u = new C0390Et0();
        }
        C1210Ph.i(c1210Ph.u, Boolean.TRUE);
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential identityCredentialB;
        C1155Oo1 c1155Oo1 = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher cipherD = AbstractC6600qB.d(cryptoObject);
            if (cipherD != null) {
                c1155Oo1 = new C1155Oo1(cipherD);
            } else {
                Signature signatureF = AbstractC6600qB.f(cryptoObject);
                if (signatureF != null) {
                    c1155Oo1 = new C1155Oo1(signatureF);
                } else {
                    Mac macE = AbstractC6600qB.e(cryptoObject);
                    if (macE != null) {
                        c1155Oo1 = new C1155Oo1(macE);
                    } else if (Build.VERSION.SDK_INT >= 30 && (identityCredentialB = AbstractC6790rB.b(cryptoObject)) != null) {
                        c1155Oo1 = new C1155Oo1();
                        c1155Oo1.a = null;
                        c1155Oo1.b = null;
                        c1155Oo1.c = null;
                        c1155Oo1.d = identityCredentialB;
                    }
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        int iA = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                iA = AbstractC1735Wa.a(authenticationResult);
            }
        } else if (i != 29) {
            iA = 2;
        }
        this.a.b(new C0665Ih(c1155Oo1, iA));
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
