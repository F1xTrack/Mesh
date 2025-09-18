package defpackage;

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

/* renamed from: ds, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3470ds extends AbstractC3280cs {
    public final Crypto h;

    public C3470ds(ReactApplicationContext reactApplicationContext) {
        C5242j4 c5242j4;
        C4025gm c4025gm = new C4025gm(reactApplicationContext, CryptoConfig.KEY_256);
        synchronized (C5242j4.class) {
            try {
                if (C5242j4.a == null) {
                    C5242j4.a = new C5242j4(new SystemNativeCryptoLibrary(), new NV());
                }
                c5242j4 = C5242j4.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.h = c5242j4.createDefaultCrypto(c4025gm);
    }

    @Override // defpackage.AbstractC3280cs, defpackage.InterfaceC2020Zr
    public final EnumC8191yX0 a() {
        return EnumC8191yX0.a;
    }

    @Override // defpackage.InterfaceC2020Zr
    public final String b() {
        return "FacebookConceal";
    }

    @Override // defpackage.InterfaceC2020Zr
    public final C1864Xr c(String str, String str2, String str3, EnumC8191yX0 enumC8191yX0) throws C6027nB {
        u(enumC8191yX0);
        Crypto crypto = this.h;
        if (!crypto.isAvailable()) {
            throw new C6027nB("Crypto is missing");
        }
        Entity entityCreate = Entity.create(AbstractC8235ym.v("RN_KEYCHAIN:", str) + "user");
        Entity entityCreate2 = Entity.create(AbstractC8235ym.v("RN_KEYCHAIN:", str) + "pass");
        try {
            Charset charset = AbstractC3280cs.g;
            return new C1864Xr(crypto.encrypt(str2.getBytes(charset), entityCreate), crypto.encrypt(str3.getBytes(charset), entityCreate2), this);
        } catch (Throwable th) {
            throw new C6027nB(AbstractC8235ym.v("Encryption failed for alias: ", str), th);
        }
    }

    @Override // defpackage.InterfaceC2020Zr
    public final int d() {
        return 16;
    }

    @Override // defpackage.InterfaceC2020Zr
    public final boolean e() {
        return false;
    }

    @Override // defpackage.AbstractC3280cs, defpackage.InterfaceC2020Zr
    public final boolean g() {
        return false;
    }

    @Override // defpackage.InterfaceC2020Zr
    public final void h(InterfaceC3732fE interfaceC3732fE, String str, byte[] bArr, byte[] bArr2) {
        try {
            interfaceC3732fE.d(w(str, bArr, bArr2), null);
        } catch (Throwable th) {
            interfaceC3732fE.d(null, th);
        }
    }

    @Override // defpackage.AbstractC3280cs
    public final Key m(KeyGenParameterSpec keyGenParameterSpec) throws C6027nB {
        throw new C6027nB("Not designed for a call");
    }

    @Override // defpackage.AbstractC3280cs
    public final String q() {
        throw new AssertionException("Not designed for a call");
    }

    @Override // defpackage.AbstractC3280cs
    public final KeyGenParameterSpec.Builder r(String str, boolean z) throws C6027nB {
        throw new C6027nB("Not designed for a call");
    }

    @Override // defpackage.AbstractC3280cs
    public final KeyInfo s(Key key) throws C6027nB {
        throw new C6027nB("Not designed for a call");
    }

    public final C1942Yr w(String str, byte[] bArr, byte[] bArr2) throws C6027nB {
        EnumC8191yX0 enumC8191yX0 = EnumC8191yX0.a;
        u(enumC8191yX0);
        Crypto crypto = this.h;
        if (!crypto.isAvailable()) {
            throw new C6027nB("Crypto is missing");
        }
        Entity entityCreate = Entity.create(AbstractC8235ym.v("RN_KEYCHAIN:", str) + "user");
        Entity entityCreate2 = Entity.create(AbstractC8235ym.v("RN_KEYCHAIN:", str) + "pass");
        try {
            byte[] bArrDecrypt = crypto.decrypt(bArr, entityCreate);
            byte[] bArrDecrypt2 = crypto.decrypt(bArr2, entityCreate2);
            Charset charset = AbstractC3280cs.g;
            return new C1942Yr(new String(bArrDecrypt, charset), new String(bArrDecrypt2, charset), enumC8191yX0);
        } catch (Throwable th) {
            throw new C6027nB(AbstractC8235ym.v("Decryption failed for alias: ", str), th);
        }
    }

    @Override // defpackage.AbstractC3280cs, defpackage.InterfaceC2020Zr
    public final void f(String str) {
    }
}
