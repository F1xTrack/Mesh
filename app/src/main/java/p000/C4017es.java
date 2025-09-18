package p000;

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

/* renamed from: es */
/* loaded from: classes2.dex */
public final class C4017es extends AbstractC3892cs {

    /* renamed from: h */
    public final /* synthetic */ int f26919h;

    public /* synthetic */ C4017es(int i) {
        this.f26919h = i;
    }

    @Override // p000.AbstractC3892cs, p000.InterfaceC1627Zr
    /* renamed from: a */
    public EnumC11810yX0 mo9615a() {
        switch (this.f26919h) {
            case 0:
                return EnumC11810yX0.f46289c;
            default:
                return super.mo9615a();
        }
    }

    @Override // p000.InterfaceC1627Zr
    /* renamed from: b */
    public final String mo9616b() {
        switch (this.f26919h) {
            case 0:
                return "KeystoreAESCBC";
            default:
                return "KeystoreRSAECB";
        }
    }

    @Override // p000.InterfaceC1627Zr
    /* renamed from: c */
    public final C1501Xr mo9617c(String str, String str2, String str3, EnumC11810yX0 enumC11810yX0) throws C6473nB {
        switch (this.f26919h) {
            case 0:
                m17434u(enumC11810yX0);
                try {
                    Key keyM17425l = m17425l(TextUtils.isEmpty(str) ? "RN_KEYCHAIN_DEFAULT_ALIAS" : str, enumC11810yX0, new AtomicInteger(1));
                    C4262il c4262il = AbstractC11234u10.f43448a;
                    return new C1501Xr(m17424k(keyM17425l, str2, c4262il), m17424k(keyM17425l, str3, c4262il), this);
                } catch (GeneralSecurityException e) {
                    throw new C6473nB(AbstractC7222ym.m26245v("Could not encrypt data with alias: ", str), e);
                } catch (Throwable th) {
                    StringBuilder sbM26240q = AbstractC7222ym.m26240q("Unknown error with alias: ", str, ", error: ");
                    sbM26240q.append(th.getMessage());
                    throw new C6473nB(sbM26240q.toString(), th);
                }
            default:
                m17434u(enumC11810yX0);
                try {
                    return m18061x(TextUtils.isEmpty(str) ? "KeystoreRSAECB" : str, str3, str2, enumC11810yX0);
                } catch (C8104Pf0 e2) {
                    e = e2;
                    throw new C6473nB(AbstractC7222ym.m26245v("Could not access Keystore for service ", str), e);
                } catch (IOException e3) {
                    throw new C6473nB("I/O error: " + e3.getMessage(), e3);
                } catch (InvalidKeyException e4) {
                    e = e4;
                    throw new C6473nB(AbstractC7222ym.m26245v("Could not encrypt data for service ", str), e);
                } catch (KeyStoreException e5) {
                    e = e5;
                    throw new C6473nB(AbstractC7222ym.m26245v("Could not access Keystore for service ", str), e);
                } catch (NoSuchAlgorithmException e6) {
                    e = e6;
                    throw new C6473nB(AbstractC7222ym.m26245v("Could not encrypt data for service ", str), e);
                } catch (InvalidKeySpecException e7) {
                    e = e7;
                    throw new C6473nB(AbstractC7222ym.m26245v("Could not encrypt data for service ", str), e);
                } catch (NoSuchPaddingException e8) {
                    e = e8;
                    throw new C6473nB(AbstractC7222ym.m26245v("Could not encrypt data for service ", str), e);
                } catch (Throwable th2) {
                    throw new C6473nB("Unknown error: " + th2.getMessage(), th2);
                }
        }
    }

    @Override // p000.InterfaceC1627Zr
    /* renamed from: d */
    public final int mo9618d() {
        switch (this.f26919h) {
        }
        return 23;
    }

    @Override // p000.InterfaceC1627Zr
    /* renamed from: e */
    public final boolean mo9619e() {
        switch (this.f26919h) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // p000.InterfaceC1627Zr
    /* renamed from: h */
    public final void mo9622h(InterfaceC4040fE interfaceC4040fE, String str, byte[] bArr, byte[] bArr2) throws C6473nB {
        Key keyM17425l;
        switch (this.f26919h) {
            case 0:
                try {
                    interfaceC4040fE.mo18197d(m18060w(str, bArr, bArr2), null);
                    break;
                } catch (Throwable th) {
                    interfaceC4040fE.mo18197d(null, th);
                    return;
                }
            default:
                EnumC11810yX0 enumC11810yX0 = EnumC11810yX0.f46287a;
                m17434u(enumC11810yX0);
                if (TextUtils.isEmpty(str)) {
                    str = "KeystoreRSAECB";
                }
                Key key = null;
                try {
                    try {
                        keyM17425l = m17425l(str, enumC11810yX0, new AtomicInteger(1));
                    } catch (Throwable th2) {
                        interfaceC4040fE.mo18197d(null, th2);
                        return;
                    }
                } catch (UserNotAuthenticatedException e) {
                    e = e;
                }
                try {
                    interfaceC4040fE.mo18197d(new C1564Yr(mo17423j(keyM17425l, bArr), mo17423j(keyM17425l, bArr2)), null);
                    break;
                } catch (UserNotAuthenticatedException e2) {
                    e = e2;
                    key = keyM17425l;
                    e.getMessage();
                    interfaceC4040fE.mo18198g(new C1501Xr(key, bArr2, bArr));
                }
        }
    }

    @Override // p000.AbstractC3892cs
    /* renamed from: i */
    public String mo17422i(Key key, byte[] bArr) {
        switch (this.f26919h) {
            case 0:
                return mo17423j(key, bArr);
            default:
                return super.mo17422i(key, bArr);
        }
    }

    @Override // p000.AbstractC3892cs
    /* renamed from: j */
    public String mo17423j(Key key, byte[] bArr) {
        switch (this.f26919h) {
            case 0:
                Cipher cipherM17428o = m17428o();
                try {
                    byte[] bArr2 = new byte[16];
                    if (16 >= bArr.length) {
                        throw new IOException("Insufficient length of input data for IV extracting.");
                    }
                    System.arraycopy(bArr, 0, bArr2, 0, 16);
                    cipherM17428o.init(2, key, new IvParameterSpec(bArr2));
                    return new String(cipherM17428o.doFinal(bArr, 16, bArr.length - 16), AbstractC3892cs.f25682g);
                } catch (Throwable th) {
                    th.getMessage();
                    throw th;
                }
            default:
                return super.mo17423j(key, bArr);
        }
    }

    @Override // p000.AbstractC3892cs
    /* renamed from: m */
    public final Key mo17426m(KeyGenParameterSpec keyGenParameterSpec) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        switch (this.f26919h) {
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

    @Override // p000.AbstractC3892cs
    /* renamed from: p */
    public String mo17429p() {
        switch (this.f26919h) {
            case 0:
                return "RN_KEYCHAIN_DEFAULT_ALIAS";
            default:
                return super.mo17429p();
        }
    }

    @Override // p000.AbstractC3892cs
    /* renamed from: q */
    public final String mo17430q() {
        switch (this.f26919h) {
            case 0:
                return "AES/CBC/PKCS7Padding";
            default:
                return "RSA/ECB/PKCS1Padding";
        }
    }

    @Override // p000.AbstractC3892cs
    /* renamed from: r */
    public final KeyGenParameterSpec.Builder mo17431r(String str, boolean z) {
        switch (this.f26919h) {
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

    @Override // p000.AbstractC3892cs
    /* renamed from: s */
    public final KeyInfo mo17432s(Key key) {
        switch (this.f26919h) {
            case 0:
                return (KeyInfo) SecretKeyFactory.getInstance(key.getAlgorithm(), "AndroidKeyStore").getKeySpec((SecretKey) key, KeyInfo.class);
            default:
                return (KeyInfo) KeyFactory.getInstance(key.getAlgorithm(), "AndroidKeyStore").getKeySpec(key, KeyInfo.class);
        }
    }

    /* renamed from: w */
    public C1564Yr m18060w(String str, byte[] bArr, byte[] bArr2) throws C6473nB {
        EnumC11810yX0 enumC11810yX0 = EnumC11810yX0.f46287a;
        m17434u(enumC11810yX0);
        try {
            Key keyM17425l = m17425l(TextUtils.isEmpty(str) ? "RN_KEYCHAIN_DEFAULT_ALIAS" : str, enumC11810yX0, new AtomicInteger(1));
            return new C1564Yr(mo17423j(keyM17425l, bArr), mo17423j(keyM17425l, bArr2), mo17432s(keyM17425l).isInsideSecureHardware() ? EnumC11810yX0.f46289c : EnumC11810yX0.f46288b);
        } catch (GeneralSecurityException e) {
            throw new C6473nB(AbstractC7222ym.m26245v("Could not decrypt data with alias: ", str), e);
        } catch (Throwable th) {
            StringBuilder sbM26240q = AbstractC7222ym.m26240q("Unknown error with alias: ", str, ", error: ");
            sbM26240q.append(th.getMessage());
            throw new C6473nB(sbM26240q.toString(), th);
        }
    }

    /* renamed from: x */
    public C1501Xr m18061x(String str, String str2, String str3, EnumC11810yX0 enumC11810yX0) throws C6473nB, InvalidKeySpecException {
        KeyStore keyStoreM17433t = m17433t();
        if (!keyStoreM17433t.containsAlias(str)) {
            m17427n(str, enumC11810yX0);
        }
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(keyStoreM17433t.getCertificate(str).getPublicKey().getEncoded()));
        C4262il c4262il = AbstractC11106t10.f42765a;
        return new C1501Xr(m17424k(publicKeyGeneratePublic, str3, c4262il), m17424k(publicKeyGeneratePublic, str2, c4262il), this);
    }
}
