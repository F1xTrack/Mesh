package p000;

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

/* renamed from: w3 */
/* loaded from: classes.dex */
public final class C7051w3 implements InterfaceC1586ZC {

    /* renamed from: a */
    public final InterfaceC1586ZC f44661a;

    /* renamed from: b */
    public final byte[] f44662b;

    /* renamed from: c */
    public final byte[] f44663c;

    /* renamed from: d */
    public CipherInputStream f44664d;

    public C7051w3(InterfaceC1586ZC interfaceC1586ZC, byte[] bArr, byte[] bArr2) {
        this.f44661a = interfaceC1586ZC;
        this.f44662b = bArr;
        this.f44663c = bArr2;
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f44662b, "AES"), new IvParameterSpec(this.f44663c));
                C1771bD c1771bD = new C1771bD(this.f44661a, c3976eD);
                this.f44664d = new CipherInputStream(c1771bD, cipher);
                c1771bD.m10434m();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
        if (this.f44664d != null) {
            this.f44664d = null;
            this.f44661a.close();
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: d */
    public final void mo5255d(InterfaceC9648hc1 interfaceC9648hc1) {
        interfaceC9648hc1.getClass();
        this.f44661a.mo5255d(interfaceC9648hc1);
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: l */
    public final Map mo3793l() {
        return this.f44661a.mo3793l();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        return this.f44661a.mo2366o();
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) throws IOException {
        this.f44664d.getClass();
        int i3 = this.f44664d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
