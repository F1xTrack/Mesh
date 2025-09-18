package defpackage;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.security.keystore.UserNotAuthenticatedException;
import android.text.TextUtils;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: es, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3661es extends AbstractC3280cs {
    public final /* synthetic */ int h;

    public /* synthetic */ C3661es(int i) {
        this.h = i;
    }

    @Override // defpackage.AbstractC3280cs, defpackage.InterfaceC2020Zr
    public EnumC8191yX0 a() {
        switch (this.h) {
            case 0:
                return EnumC8191yX0.c;
            default:
                return super.a();
        }
    }

    @Override // defpackage.InterfaceC2020Zr
    public final String b() {
        switch (this.h) {
            case 0:
                return "KeystoreAESCBC";
            default:
                return "KeystoreRSAECB";
        }
    }

    @Override // defpackage.InterfaceC2020Zr
    public final C1864Xr c(String str, String str2, String str3, EnumC8191yX0 enumC8191yX0) throws C6027nB {
        switch (this.h) {
            case 0:
                u(enumC8191yX0);
                try {
                    Key keyL = l(TextUtils.isEmpty(str) ? "RN_KEYCHAIN_DEFAULT_ALIAS" : str, enumC8191yX0, new AtomicInteger(1));
                    C4403il c4403il = AbstractC7331u10.a;
                    return new C1864Xr(k(keyL, str2, c4403il), k(keyL, str3, c4403il), this);
                } catch (GeneralSecurityException e) {
                    throw new C6027nB(AbstractC8235ym.v("Could not encrypt data with alias: ", str), e);
                } catch (Throwable th) {
                    StringBuilder sbQ = AbstractC8235ym.q("Unknown error with alias: ", str, ", error: ");
                    sbQ.append(th.getMessage());
                    throw new C6027nB(sbQ.toString(), th);
                }
            default:
                u(enumC8191yX0);
                try {
                    return x(TextUtils.isEmpty(str) ? "KeystoreRSAECB" : str, str3, str2, enumC8191yX0);
                } catch (C1205Pf0 e2) {
                    e = e2;
                    throw new C6027nB(AbstractC8235ym.v("Could not access Keystore for service ", str), e);
                } catch (IOException e3) {
                    throw new C6027nB("I/O error: " + e3.getMessage(), e3);
                } catch (InvalidKeyException e4) {
                    e = e4;
                    throw new C6027nB(AbstractC8235ym.v("Could not encrypt data for service ", str), e);
                } catch (KeyStoreException e5) {
                    e = e5;
                    throw new C6027nB(AbstractC8235ym.v("Could not access Keystore for service ", str), e);
                } catch (NoSuchAlgorithmException e6) {
                    e = e6;
                    throw new C6027nB(AbstractC8235ym.v("Could not encrypt data for service ", str), e);
                } catch (InvalidKeySpecException e7) {
                    e = e7;
                    throw new C6027nB(AbstractC8235ym.v("Could not encrypt data for service ", str), e);
                } catch (NoSuchPaddingException e8) {
                    e = e8;
                    throw new C6027nB(AbstractC8235ym.v("Could not encrypt data for service ", str), e);
                } catch (Throwable th2) {
                    throw new C6027nB("Unknown error: " + th2.getMessage(), th2);
                }
        }
    }

    @Override // defpackage.InterfaceC2020Zr
    public final int d() {
        switch (this.h) {
        }
        return 23;
    }

    @Override // defpackage.InterfaceC2020Zr
    public final boolean e() {
        switch (this.h) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.InterfaceC2020Zr
    public final void h(InterfaceC3732fE interfaceC3732fE, String str, byte[] bArr, byte[] bArr2) throws C6027nB {
        Key keyL;
        switch (this.h) {
            case 0:
                try {
                    interfaceC3732fE.d(w(str, bArr, bArr2), null);
                    break;
                } catch (Throwable th) {
                    interfaceC3732fE.d(null, th);
                    return;
                }
            default:
                EnumC8191yX0 enumC8191yX0 = EnumC8191yX0.a;
                u(enumC8191yX0);
                if (TextUtils.isEmpty(str)) {
                    str = "KeystoreRSAECB";
                }
                Key key = null;
                try {
                    try {
                        keyL = l(str, enumC8191yX0, new AtomicInteger(1));
                    } catch (Throwable th2) {
                        interfaceC3732fE.d(null, th2);
                        return;
                    }
                } catch (UserNotAuthenticatedException e) {
                    e = e;
                }
                try {
                    interfaceC3732fE.d(new C1942Yr(j(keyL, bArr), j(keyL, bArr2)), null);
                    break;
                } catch (UserNotAuthenticatedException e2) {
                    e = e2;
                    key = keyL;
                    e.getMessage();
                    interfaceC3732fE.g(new C1864Xr(key, bArr2, bArr));
                }
        }
    }

    @Override // defpackage.AbstractC3280cs
    public String i(Key key, byte[] bArr) {
        switch (this.h) {
            case 0:
                return j(key, bArr);
            default:
                return super.i(key, bArr);
        }
    }

    @Override // defpackage.AbstractC3280cs
    public String j(Key key, byte[] bArr) {
        switch (this.h) {
            case 0:
                Cipher cipherO = o();
                try {
                    byte[] bArr2 = new byte[16];
                    if (16 >= bArr.length) {
                        throw new IOException("Insufficient length of input data for IV extracting.");
                    }
                    System.arraycopy(bArr, 0, bArr2, 0, 16);
                    cipherO.init(2, key, new IvParameterSpec(bArr2));
                    return new String(cipherO.doFinal(bArr, 16, bArr.length - 16), AbstractC3280cs.g);
                } catch (Throwable th) {
                    th.getMessage();
                    throw th;
                }
            default:
                return super.j(key, bArr);
        }
    }

    @Override // defpackage.AbstractC3280cs
    public final Key m(KeyGenParameterSpec keyGenParameterSpec) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        switch (this.h) {
            case 0:
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(keyGenParameterSpec);
                return keyGenerator.generateKey();
            default:
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                keyPairGenerator.initialize(keyGenParameterSpec);
                return keyPairGenerator.generateKeyPair().getPrivate();
        }
    }

    @Override // defpackage.AbstractC3280cs
    public String p() {
        switch (this.h) {
            case 0:
                return "RN_KEYCHAIN_DEFAULT_ALIAS";
            default:
                return super.p();
        }
    }

    @Override // defpackage.AbstractC3280cs
    public final String q() {
        switch (this.h) {
            case 0:
                return "AES/CBC/PKCS7Padding";
            default:
                return "RSA/ECB/PKCS1Padding";
        }
    }

    @Override // defpackage.AbstractC3280cs
    public final KeyGenParameterSpec.Builder r(String str, boolean z) {
        switch (this.h) {
            case 0:
                return new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setRandomizedEncryptionRequired(true).setKeySize(256);
            default:
                int i = Build.VERSION.SDK_INT;
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(str, 3).setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setRandomizedEncryptionRequired(true).setUserAuthenticationRequired(true).setKeySize(z ? 512 : 2048);
                if (i >= 30) {
                    keySize.setUserAuthenticationParameters(5, 2);
                } else {
                    keySize.setUserAuthenticationValidityDurationSeconds(5);
                }
                return keySize;
        }
    }

    @Override // defpackage.AbstractC3280cs
    public final KeyInfo s(Key key) {
        switch (this.h) {
            case 0:
                return (KeyInfo) SecretKeyFactory.getInstance(key.getAlgorithm(), "AndroidKeyStore").getKeySpec((SecretKey) key, KeyInfo.class);
            default:
                return (KeyInfo) KeyFactory.getInstance(key.getAlgorithm(), "AndroidKeyStore").getKeySpec(key, KeyInfo.class);
        }
    }

    public C1942Yr w(String str, byte[] bArr, byte[] bArr2) throws C6027nB {
        EnumC8191yX0 enumC8191yX0 = EnumC8191yX0.a;
        u(enumC8191yX0);
        try {
            Key keyL = l(TextUtils.isEmpty(str) ? "RN_KEYCHAIN_DEFAULT_ALIAS" : str, enumC8191yX0, new AtomicInteger(1));
            return new C1942Yr(j(keyL, bArr), j(keyL, bArr2), s(keyL).isInsideSecureHardware() ? EnumC8191yX0.c : EnumC8191yX0.b);
        } catch (GeneralSecurityException e) {
            throw new C6027nB(AbstractC8235ym.v("Could not decrypt data with alias: ", str), e);
        } catch (Throwable th) {
            StringBuilder sbQ = AbstractC8235ym.q("Unknown error with alias: ", str, ", error: ");
            sbQ.append(th.getMessage());
            throw new C6027nB(sbQ.toString(), th);
        }
    }

    public C1864Xr x(String str, String str2, String str3, EnumC8191yX0 enumC8191yX0) throws C6027nB, InvalidKeySpecException {
        KeyStore keyStoreT = t();
        if (!keyStoreT.containsAlias(str)) {
            n(str, enumC8191yX0);
        }
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(keyStoreT.getCertificate(str).getPublicKey().getEncoded()));
        C4403il c4403il = AbstractC7140t10.a;
        return new C1864Xr(k(publicKeyGeneratePublic, str3, c4403il), k(publicKeyGeneratePublic, str2, c4403il), this);
    }
}
