package p000;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import com.facebook.crypto.Crypto;
import com.facebook.crypto.CryptoConfig;
import com.facebook.crypto.Entity;
import com.facebook.crypto.util.SystemNativeCryptoLibrary;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactApplicationContext;
import java.nio.charset.Charset;
import java.security.Key;

/* renamed from: ds */
/* loaded from: classes2.dex */
public final class C3954ds extends AbstractC3892cs {

    /* renamed from: h */
    public final Crypto f26345h;

    public C3954ds(ReactApplicationContext reactApplicationContext) {
        C6214j4 c6214j4;
        C4137gm c4137gm = new C4137gm(reactApplicationContext, CryptoConfig.KEY_256);
        synchronized (C6214j4.class) {
            try {
                if (C6214j4.f34896a == null) {
                    C6214j4.f34896a = new C6214j4(new SystemNativeCryptoLibrary(), new C0850NV());
                }
                c6214j4 = C6214j4.f34896a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f26345h = c6214j4.createDefaultCrypto(c4137gm);
    }

    @Override // p000.AbstractC3892cs, p000.InterfaceC1627Zr
    /* renamed from: a */
    public final EnumC11810yX0 mo9615a() {
        return EnumC11810yX0.f46287a;
    }

    @Override // p000.InterfaceC1627Zr
    /* renamed from: b */
    public final String mo9616b() {
        return "FacebookConceal";
    }

    @Override // p000.InterfaceC1627Zr
    /* renamed from: c */
    public final C1501Xr mo9617c(String str, String str2, String str3, EnumC11810yX0 enumC11810yX0) throws C6473nB {
        m17434u(enumC11810yX0);
        Crypto crypto = this.f26345h;
        if (!crypto.isAvailable()) {
            throw new C6473nB("Crypto is missing");
        }
        Entity entityCreate = Entity.create(AbstractC7222ym.m26245v("RN_KEYCHAIN:", str) + "user");
        Entity entityCreate2 = Entity.create(AbstractC7222ym.m26245v("RN_KEYCHAIN:", str) + "pass");
        try {
            Charset charset = AbstractC3892cs.f25682g;
            return new C1501Xr(crypto.encrypt(str2.getBytes(charset), entityCreate), crypto.encrypt(str3.getBytes(charset), entityCreate2), this);
        } catch (Throwable th) {
            throw new C6473nB(AbstractC7222ym.m26245v("Encryption failed for alias: ", str), th);
        }
    }

    @Override // p000.InterfaceC1627Zr
    /* renamed from: d */
    public final int mo9618d() {
        return 16;
    }

    @Override // p000.InterfaceC1627Zr
    /* renamed from: e */
    public final boolean mo9619e() {
        return false;
    }

    @Override // p000.AbstractC3892cs, p000.InterfaceC1627Zr
    /* renamed from: g */
    public final boolean mo9621g() {
        return false;
    }

    @Override // p000.InterfaceC1627Zr
    /* renamed from: h */
    public final void mo9622h(InterfaceC4040fE interfaceC4040fE, String str, byte[] bArr, byte[] bArr2) {
        try {
            interfaceC4040fE.mo18197d(m17768w(str, bArr, bArr2), null);
        } catch (Throwable th) {
            interfaceC4040fE.mo18197d(null, th);
        }
    }

    @Override // p000.AbstractC3892cs
    /* renamed from: m */
    public final Key mo17426m(KeyGenParameterSpec keyGenParameterSpec) throws C6473nB {
        throw new C6473nB("Not designed for a call");
    }

    @Override // p000.AbstractC3892cs
    /* renamed from: q */
    public final String mo17430q() {
        throw new AssertionException("Not designed for a call");
    }

    @Override // p000.AbstractC3892cs
    /* renamed from: r */
    public final KeyGenParameterSpec.Builder mo17431r(String str, boolean z) throws C6473nB {
        throw new C6473nB("Not designed for a call");
    }

    @Override // p000.AbstractC3892cs
    /* renamed from: s */
    public final KeyInfo mo17432s(Key key) throws C6473nB {
        throw new C6473nB("Not designed for a call");
    }

    /* renamed from: w */
    public final C1564Yr m17768w(String str, byte[] bArr, byte[] bArr2) throws C6473nB {
        EnumC11810yX0 enumC11810yX0 = EnumC11810yX0.f46287a;
        m17434u(enumC11810yX0);
        Crypto crypto = this.f26345h;
        if (!crypto.isAvailable()) {
            throw new C6473nB("Crypto is missing");
        }
        Entity entityCreate = Entity.create(AbstractC7222ym.m26245v("RN_KEYCHAIN:", str) + "user");
        Entity entityCreate2 = Entity.create(AbstractC7222ym.m26245v("RN_KEYCHAIN:", str) + "pass");
        try {
            byte[] bArrDecrypt = crypto.decrypt(bArr, entityCreate);
            byte[] bArrDecrypt2 = crypto.decrypt(bArr2, entityCreate2);
            Charset charset = AbstractC3892cs.f25682g;
            return new C1564Yr(new String(bArrDecrypt, charset), new String(bArrDecrypt2, charset), enumC11810yX0);
        } catch (Throwable th) {
            throw new C6473nB(AbstractC7222ym.m26245v("Decryption failed for alias: ", str), th);
        }
    }

    @Override // p000.AbstractC3892cs, p000.InterfaceC1627Zr
    /* renamed from: f */
    public final void mo9620f(String str) {
    }
}
