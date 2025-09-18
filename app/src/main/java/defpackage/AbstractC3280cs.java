package defpackage;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;

/* renamed from: cs */
/* loaded from: classes2.dex */
public abstract class AbstractC3280cs implements InterfaceC2020Zr {
    public static final Charset g = Charset.forName("UTF-8");
    public transient AtomicBoolean b;
    public transient AtomicBoolean d;
    public transient Cipher e;
    public transient KeyStore f;
    public final Object a = new Object();
    public final Object c = new Object();

    @Override // defpackage.InterfaceC2020Zr
    public EnumC8191yX0 a() {
        return EnumC8191yX0.c;
    }

    @Override // defpackage.InterfaceC2020Zr
    public void f(String str) throws KeyStoreException {
        String strP = p();
        if (TextUtils.isEmpty(str)) {
            str = strP;
        }
        KeyStore keyStoreT = t();
        try {
            if (keyStoreT.containsAlias(str)) {
                keyStoreT.deleteEntry(str);
            }
        } catch (GeneralSecurityException unused) {
        }
    }

    @Override // defpackage.InterfaceC2020Zr
    public boolean g() {
        C2405bs c2405bs;
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        synchronized (this.a) {
            try {
                AtomicBoolean atomicBoolean2 = this.b;
                if (atomicBoolean2 != null) {
                    return atomicBoolean2.get();
                }
                this.b = new AtomicBoolean(false);
                C2405bs c2405bs2 = null;
                try {
                    c2405bs = new C2405bs(this);
                } catch (Throwable unused) {
                }
                try {
                    EnumC8191yX0 enumC8191yX0 = EnumC8191yX0.c;
                    this.b.set((s((Key) c2405bs.c).isInsideSecureHardware() ? enumC8191yX0 : EnumC8191yX0.b).compareTo(enumC8191yX0) >= 0);
                    c2405bs.close();
                } catch (Throwable unused2) {
                    c2405bs2 = c2405bs;
                    if (c2405bs2 != null) {
                        c2405bs2.close();
                    }
                    return this.b.get();
                }
                return this.b.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i(Key key, byte[] bArr) {
        return j(key, bArr);
    }

    public String j(Key key, byte[] bArr) {
        Cipher cipherO = o();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    cipherO.init(2, key);
                    CipherInputStream cipherInputStream = new CipherInputStream(byteArrayInputStream, cipherO);
                    try {
                        byte[] bArr2 = new byte[16384];
                        while (true) {
                            int i = cipherInputStream.read(bArr2);
                            if (i <= 0) {
                                cipherInputStream.close();
                                String str = new String(byteArrayOutputStream.toByteArray(), g);
                                byteArrayOutputStream.close();
                                byteArrayInputStream.close();
                                return str;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i);
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            th.getMessage();
            throw th;
        }
    }

    public final byte[] k(Key key, String str, InterfaceC2214as interfaceC2214as) {
        Cipher cipherO = o();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                interfaceC2214as.a(cipherO, key, byteArrayOutputStream);
                byteArrayOutputStream.flush();
                CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipherO);
                try {
                    cipherOutputStream.write(str.getBytes(g));
                    cipherOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            th.getMessage();
            throw th;
        }
    }

    public final Key l(String str, EnumC8191yX0 enumC8191yX0, AtomicInteger atomicInteger) throws C6027nB, NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException, C1205Pf0 {
        Key key;
        do {
            KeyStore keyStoreT = t();
            if (!keyStoreT.containsAlias(str)) {
                n(str, enumC8191yX0);
            }
            key = null;
            try {
                key = keyStoreT.getKey(str, null);
                if (key == null) {
                    throw new C1205Pf0("Empty key extracted!");
                }
            } catch (UnrecoverableKeyException e) {
                if (atomicInteger.getAndDecrement() <= 0) {
                    throw e;
                }
                keyStoreT.deleteEntry(str);
            }
        } while (key == null);
        return key;
    }

    public abstract Key m(KeyGenParameterSpec keyGenParameterSpec);

    public final void n(String str, EnumC8191yX0 enumC8191yX0) throws C6027nB {
        Key keyV;
        synchronized (this.c) {
            try {
                AtomicBoolean atomicBoolean = this.d;
                keyV = null;
                if (atomicBoolean == null || atomicBoolean.get()) {
                    if (this.d == null) {
                        this.d = new AtomicBoolean(false);
                    }
                    try {
                        keyV = v(str);
                        this.d.set(true);
                    } catch (GeneralSecurityException | ProviderException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (keyV == null || !this.d.get()) {
            keyV = m(r(str, false).build());
        }
        if ((s(keyV).isInsideSecureHardware() ? EnumC8191yX0.c : EnumC8191yX0.b).compareTo(enumC8191yX0) < 0) {
            throw new C6027nB("Cannot generate keys with required security guarantees");
        }
    }

    public final Cipher o() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        this.e = Cipher.getInstance(q());
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public String p() {
        return b();
    }

    public abstract String q();

    public abstract KeyGenParameterSpec.Builder r(String str, boolean z);

    public abstract KeyInfo s(Key key);

    public final KeyStore t() {
        if (this.f == null) {
            synchronized (this) {
                try {
                    if (this.f == null) {
                        try {
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            keyStore.load(null);
                            this.f = keyStore;
                        } catch (Throwable th) {
                            throw new C1205Pf0("Could not access Keystore", th);
                        }
                    }
                } finally {
                }
            }
        }
        return this.f;
    }

    public final void u(EnumC8191yX0 enumC8191yX0) throws C6027nB {
        if (a().compareTo(enumC8191yX0) >= 0) {
            return;
        }
        throw new C6027nB("Insufficient security level (wants " + enumC8191yX0 + "; got " + a() + ")");
    }

    public final Key v(String str) throws C1205Pf0 {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return m(r(str, false).setIsStrongBoxBacked(true).build());
        }
        throw new C1205Pf0(AbstractC8235ym.g(i, "Strong box security keystore is not supported for old API", "."));
    }
}
