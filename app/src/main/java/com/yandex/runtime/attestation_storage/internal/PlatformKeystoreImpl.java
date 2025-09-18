package com.yandex.runtime.attestation_storage.internal;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.yandex.runtime.Runtime;
import com.yandex.runtime.attestation.EcPublicKey;
import com.yandex.runtime.logging.Logger;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import p000.AbstractC10229m90;
import p000.AbstractC8137Pv1;
import p000.C10324mu1;
import p000.C7611Fs1;
import p000.C8553Xv1;
import p000.C9450g32;
import p000.GQ0;
import p000.InterfaceC8348Tx0;
import p000.InterfaceC9307ey0;
import p000.InterfaceC9550gr1;
import p000.Y81;

/* loaded from: classes2.dex */
public class PlatformKeystoreImpl implements PlatformKeystore {
    private static final String KEY_ALIAS_BASE = "MAPKIT_ATTESTED_KEY_";
    private String alias;
    private KeyStore keyStore;
    private KeyStore.PrivateKeyEntry privateKeyEntry;

    private PlatformKeystoreImpl(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, UnrecoverableEntryException {
        this.alias = str;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.keyStore = keyStore;
            try {
                keyStore.load(null);
                if (hasEntry()) {
                    tryLoadEntry();
                }
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException("Can't check the integrity of keystore: " + e.getMessage());
            }
        } catch (KeyStoreException e2) {
            throw new IllegalStateException("No Android Key Store in the system: " + e2.getMessage());
        }
    }

    public static boolean attestationAvailable() throws CertificateException {
        Provider provider = Security.getProvider("AndroidKeyStore");
        if (provider == null || provider.getService("KeyPairGenerator", "EC") == null || provider.getService("KeyFactory", "EC") == null || Security.getProviders("Signature.NONEwithECDSA").length == 0) {
            return false;
        }
        try {
            CertificateFactory.getInstance("X.509");
            return Security.getProviders("MessageDigest.SHA-256").length != 0;
        } catch (CertificateException unused) {
            return false;
        }
    }

    public static void cleanupUnusedKeys(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            try {
                keyStore.load(null);
                try {
                    Iterator it = Collections.list(keyStore.aliases()).iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (str2.startsWith(KEY_ALIAS_BASE)) {
                            if (str != null) {
                                if (str2.equals(KEY_ALIAS_BASE + str)) {
                                }
                            }
                            keyStore.deleteEntry(str2);
                        }
                    }
                } catch (KeyStoreException e) {
                    Logger.error("Could not delete entry: " + e.getMessage());
                }
            } catch (IOException e2) {
                Logger.error("Could not load keystore for key cleanup. I/O error: " + e2.getMessage());
            } catch (NoSuchAlgorithmException e3) {
                Logger.error("Could not load keystore for key cleanup. No such algorithm for checking keystore integrity: " + e3.getMessage());
            } catch (CertificateException e4) {
                Logger.error("Could not load keystore for key cleanup. Could not load certificate: " + e4.getMessage());
            }
        } catch (KeyStoreException e5) {
            Logger.error("Could not get keystore implementation for key cleanup: " + e5.getMessage());
        }
    }

    public static PlatformKeystore createKeystore(String str) {
        try {
            return new PlatformKeystoreImpl(KEY_ALIAS_BASE + str);
        } catch (IOException | CertificateException unused) {
            return null;
        }
    }

    private String createNonce(byte[] bArr) throws NoSuchAlgorithmException, CertificateException {
        try {
            byte[] certificateChain = getCertificateChain();
            if (certificateChain == null) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(certificateChain);
            return Base64.encodeToString(messageDigest.digest(), 10);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No SHA-256 algorithm in the environment: " + e.getMessage());
        }
    }

    private byte[] getCertificateChain() throws CertificateException {
        if (this.privateKeyEntry == null) {
            throw new IllegalStateException("Key entry is null. Generate key first.");
        }
        try {
            try {
                return CertificateFactory.getInstance("X.509").generateCertPath(Arrays.asList(this.privateKeyEntry.getCertificateChain())).getEncoded();
            } catch (CertificateEncodingException | CertificateException unused) {
                return null;
            }
        } catch (CertificateException e) {
            throw new IllegalStateException("X.509 is unsupported in the system: " + e.getMessage());
        }
    }

    private boolean hasEntry() {
        try {
            return this.keyStore.containsAlias(this.alias);
        } catch (KeyStoreException e) {
            throw new IllegalStateException("Keystore is not initialized: " + e.getMessage());
        }
    }

    private void tryLoadEntry() throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        try {
            KeyStore.Entry entry = this.keyStore.getEntry(this.alias, null);
            if (entry == null) {
                return;
            }
            if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                throw new IllegalStateException("Key entry is not an instance of a KeyStore.PrivateKeyEntry");
            }
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
            this.privateKeyEntry = privateKeyEntry;
            if (privateKeyEntry.getPrivateKey().getAlgorithm() != "EC") {
                removeKey();
            }
        } catch (KeyStoreException e) {
            throw new IllegalStateException("Keystore has not been loaded: " + e.getMessage());
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No such algorithm in the environment: " + e2.getMessage());
        } catch (UnrecoverableEntryException e3) {
            throw new IllegalStateException("Entry is protected: " + e3.getMessage());
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public byte[] ecSign(byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (this.privateKeyEntry == null) {
            throw new IllegalStateException("Key entry is null. Generate key first.");
        }
        try {
            Signature signature = Signature.getInstance("NONEwithECDSA");
            try {
                signature.initSign(this.privateKeyEntry.getPrivateKey());
                try {
                    signature.update(bArr);
                    return signature.sign();
                } catch (SignatureException e) {
                    throw new IllegalStateException("Could not sign provided data: " + e.getMessage());
                }
            } catch (InvalidKeyException e2) {
                throw new IllegalStateException("Key provided for signing is invalid: " + e2.getMessage());
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new IllegalStateException("No NONEwithECDSA support: " + e3.getMessage());
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public void generateKey(byte[] bArr) throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            try {
                keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(this.alias, 4).setDigests("NONE").setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setAttestationChallenge(bArr).setKeySize(256).build());
                keyPairGenerator.generateKeyPair();
                tryLoadEntry();
            } catch (InvalidAlgorithmParameterException e) {
                throw new IllegalStateException("Arguments for initialization of EC algorithm are invalid: " + e.getMessage());
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("EC algorithm is unsupported in AndroidKeyStore: " + e2.getMessage());
        } catch (NoSuchProviderException e3) {
            throw new IllegalStateException("No Android Key Store in the system: " + e3.getMessage());
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public byte[] getAppAttestKeyAssertion() {
        throw new UnsupportedOperationException("No AppAttest for Android");
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public String getAppAttestKeyId() {
        throw new UnsupportedOperationException("No AppAttest for Android");
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public String getApplicationId() {
        throw new UnsupportedOperationException("Should not be used for Android");
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public EcPublicKey getEcPublicKey() {
        try {
            ECPoint w = ((ECPublicKeySpec) KeyFactory.getInstance("EC").getKeySpec(this.privateKeyEntry.getCertificate().getPublicKey(), ECPublicKeySpec.class)).getW();
            return new EcPublicKey(w.getAffineX().toByteArray(), w.getAffineY().toByteArray());
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("EC algorithm is unsupported in AndroidKeyStore: " + e.getMessage());
        } catch (InvalidKeySpecException e2) {
            throw new IllegalStateException("Invalid KeySpec or key could not be processed: " + e2.getMessage());
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public byte[] getKeystoreProof() {
        return getCertificateChain();
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public boolean hasKey() {
        return this.privateKeyEntry != null;
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public void removeKey() throws KeyStoreException {
        this.privateKeyEntry = null;
        if (hasEntry()) {
            try {
                this.keyStore.deleteEntry(this.alias);
            } catch (KeyStoreException e) {
                throw new IllegalStateException("Keystore is not initialized: " + e.getMessage());
            }
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public void requestAttestKey(byte[] bArr, long j, final AttestationListener attestationListener) throws NoSuchAlgorithmException, CertificateException {
        GQ0 gq0;
        String strCreateNonce = createNonce(bArr);
        if (strCreateNonce == null) {
            attestationListener.onAttestationFailed("Could not create nonce");
        }
        if (strCreateNonce == null) {
            throw new NullPointerException("Null nonce");
        }
        C7611Fs1 c7611Fs1 = new C7611Fs1(strCreateNonce, Long.valueOf(j));
        Context applicationContext = Runtime.getApplicationContext();
        synchronized (AbstractC8137Pv1.class) {
            try {
                if (AbstractC8137Pv1.f9360a == null) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    if (applicationContext2 != null) {
                        applicationContext = applicationContext2;
                    }
                    AbstractC8137Pv1.f9360a = new GQ0(applicationContext);
                }
                gq0 = AbstractC8137Pv1.f9360a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C9450g32 c9450g32M9183a = ((C8553Xv1) ((InterfaceC9550gr1) gq0.f3735b).mo1468a()).m9183a(c7611Fs1);
        InterfaceC9307ey0 interfaceC9307ey0 = new InterfaceC9307ey0() { // from class: com.yandex.runtime.attestation_storage.internal.PlatformKeystoreImpl.1
            @Override // p000.InterfaceC9307ey0
            public void onSuccess(AbstractC10229m90 abstractC10229m90) {
                attestationListener.onAttestationReceived(((C10324mu1) abstractC10229m90).f37989a.getBytes());
            }
        };
        c9450g32M9183a.getClass();
        c9450g32M9183a.mo11138e(Y81.f14171a, interfaceC9307ey0);
        c9450g32M9183a.mo11136c(new InterfaceC8348Tx0() { // from class: com.yandex.runtime.attestation_storage.internal.PlatformKeystoreImpl.2
            @Override // p000.InterfaceC8348Tx0
            public void onFailure(Exception exc) {
                attestationListener.onAttestationFailed(exc.getMessage());
            }
        });
    }
}
