package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: w3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7720w3 implements ZC {
    public final ZC a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public C7720w3(ZC zc, byte[] bArr, byte[] bArr2) {
        this.a = zc;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                C2282bD c2282bD = new C2282bD(this.a, c3538eD);
                this.d = new CipherInputStream(c2282bD, cipher);
                c2282bD.m();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.ZC
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // defpackage.ZC
    public final void d(InterfaceC4188hc1 interfaceC4188hc1) {
        interfaceC4188hc1.getClass();
        this.a.d(interfaceC4188hc1);
    }

    @Override // defpackage.ZC
    public final Map l() {
        return this.a.l();
    }

    @Override // defpackage.ZC
    public final Uri o() {
        return this.a.o();
    }

    @Override // defpackage.RC
    public final int r(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
