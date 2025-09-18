package p000;

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
public abstract class AbstractC3892cs implements InterfaceC1627Zr {

    /* renamed from: g */
    public static final Charset f25682g = Charset.forName("UTF-8");

    /* renamed from: b */
    public transient AtomicBoolean f25684b;

    /* renamed from: d */
    public transient AtomicBoolean f25686d;

    /* renamed from: e */
    public transient Cipher f25687e;

    /* renamed from: f */
    public transient KeyStore f25688f;

    /* renamed from: a */
    public final Object f25683a = new Object();

    /* renamed from: c */
    public final Object f25685c = new Object();

    @Override // p000.InterfaceC1627Zr
    /* renamed from: a */
    public EnumC11810yX0 mo9615a() {
        return EnumC11810yX0.f46289c;
    }

    @Override // p000.InterfaceC1627Zr
    /* renamed from: f */
    public void mo9620f(String str) throws KeyStoreException {
        String strMo17429p = mo17429p();
        if (TextUtils.isEmpty(str)) {
            str = strMo17429p;
        }
        KeyStore keyStoreM17433t = m17433t();
        try {
            if (keyStoreM17433t.containsAlias(str)) {
                keyStoreM17433t.deleteEntry(str);
            }
        } catch (GeneralSecurityException unused) {
        }
    }

    @Override // p000.InterfaceC1627Zr
    /* renamed from: g */
    public boolean mo9621g() {
        C1812bs c1812bs;
        AtomicBoolean atomicBoolean = this.f25684b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        synchronized (this.f25683a) {
            try {
                AtomicBoolean atomicBoolean2 = this.f25684b;
                if (atomicBoolean2 != null) {
                    return atomicBoolean2.get();
                }
                this.f25684b = new AtomicBoolean(false);
                C1812bs c1812bs2 = null;
                try {
                    c1812bs = new C1812bs(this);
                } catch (Throwable unused) {
                }
                try {
                    EnumC11810yX0 enumC11810yX0 = EnumC11810yX0.f46289c;
                    this.f25684b.set((mo17432s((Key) c1812bs.f17197c).isInsideSecureHardware() ? enumC11810yX0 : EnumC11810yX0.f46288b).compareTo(enumC11810yX0) >= 0);
                    c1812bs.close();
                } catch (Throwable unused2) {
                    c1812bs2 = c1812bs;
                    if (c1812bs2 != null) {
                        c1812bs2.close();
                    }
                    return this.f25684b.get();
                }
                return this.f25684b.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public String mo17422i(Key key, byte[] bArr) {
        return mo17423j(key, bArr);
    }

    /* renamed from: j */
    public String mo17423j(Key key, byte[] bArr) {
        Cipher cipherM17428o = m17428o();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    cipherM17428o.init(2, key);
                    CipherInputStream cipherInputStream = new CipherInputStream(byteArrayInputStream, cipherM17428o);
                    try {
                        byte[] bArr2 = new byte[16384];
                        while (true) {
                            int i = cipherInputStream.read(bArr2);
                            if (i <= 0) {
                                cipherInputStream.close();
                                String str = new String(byteArrayOutputStream.toByteArray(), f25682g);
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

    /* renamed from: k */
    public final byte[] m17424k(Key key, String str, InterfaceC1749as interfaceC1749as) {
        Cipher cipherM17428o = m17428o();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                interfaceC1749as.mo10348a(cipherM17428o, key, byteArrayOutputStream);
                byteArrayOutputStream.flush();
                CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipherM17428o);
                try {
                    cipherOutputStream.write(str.getBytes(f25682g));
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

    /* renamed from: l */
    public final Key m17425l(String str, EnumC11810yX0 enumC11810yX0, AtomicInteger atomicInteger) throws C6473nB, NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException, C8104Pf0 {
        Key key;
        do {
            KeyStore keyStoreM17433t = m17433t();
            if (!keyStoreM17433t.containsAlias(str)) {
                m17427n(str, enumC11810yX0);
            }
            key = null;
            try {
                key = keyStoreM17433t.getKey(str, null);
                if (key == null) {
                    throw new C8104Pf0("Empty key extracted!");
                }
            } catch (UnrecoverableKeyException e) {
                if (atomicInteger.getAndDecrement() <= 0) {
                    throw e;
                }
                keyStoreM17433t.deleteEntry(str);
            }
        } while (key == null);
        return key;
    }

    /* renamed from: m */
    public abstract Key mo17426m(KeyGenParameterSpec keyGenParameterSpec);

    /* renamed from: n */
    public final void m17427n(String str, EnumC11810yX0 enumC11810yX0) throws C6473nB {
        Key keyM17435v;
        synchronized (this.f25685c) {
            try {
                AtomicBoolean atomicBoolean = this.f25686d;
                keyM17435v = null;
                if (atomicBoolean == null || atomicBoolean.get()) {
                    if (this.f25686d == null) {
                        this.f25686d = new AtomicBoolean(false);
                    }
                    try {
                        keyM17435v = m17435v(str);
                        this.f25686d.set(true);
                    } catch (GeneralSecurityException | ProviderException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (keyM17435v == null || !this.f25686d.get()) {
            keyM17435v = mo17426m(mo17431r(str, false).build());
        }
        if ((mo17432s(keyM17435v).isInsideSecureHardware() ? EnumC11810yX0.f46289c : EnumC11810yX0.f46288b).compareTo(enumC11810yX0) < 0) {
            throw new C6473nB("Cannot generate keys with required security guarantees");
        }
    }

    /* renamed from: o */
    public final Cipher m17428o() {
        if (this.f25687e == null) {
            synchronized (this) {
                try {
                    if (this.f25687e == null) {
                        this.f25687e = Cipher.getInstance(mo17430q());
                    }
                } finally {
                }
            }
        }
        return this.f25687e;
    }

    /* renamed from: p */
    public String mo17429p() {
        return mo9616b();
    }

    /* renamed from: q */
    public abstract String mo17430q();

    /* renamed from: r */
    public abstract KeyGenParameterSpec.Builder mo17431r(String str, boolean z);

    /* renamed from: s */
    public abstract KeyInfo mo17432s(Key key);

    /* renamed from: t */
    public final KeyStore m17433t() {
        if (this.f25688f == null) {
            synchronized (this) {
                try {
                    if (this.f25688f == null) {
                        try {
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            keyStore.load(null);
                            this.f25688f = keyStore;
                        } catch (Throwable th) {
                            throw new C8104Pf0("Could not access Keystore", th);
                        }
                    }
                } finally {
                }
            }
        }
        return this.f25688f;
    }

    /* renamed from: u */
    public final void m17434u(EnumC11810yX0 enumC11810yX0) throws C6473nB {
        if (mo9615a().compareTo(enumC11810yX0) >= 0) {
            return;
        }
        throw new C6473nB("Insufficient security level (wants " + enumC11810yX0 + "; got " + mo9615a() + ")");
    }

    /* renamed from: v */
    public final Key m17435v(String str) throws C8104Pf0 {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return mo17426m(mo17431r(str, false).setIsStrongBoxBacked(true).build());
        }
        throw new C8104Pf0(AbstractC7222ym.m26230g(i, "Strong box security keystore is not supported for old API", "."));
    }
}
