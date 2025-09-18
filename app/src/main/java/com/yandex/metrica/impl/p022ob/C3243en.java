package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.yandex.metrica.impl.ob.en */
/* loaded from: classes2.dex */
public class C3243en {

    /* renamed from: a */
    private final String f23382a;

    /* renamed from: b */
    private final byte[] f23383b;

    /* renamed from: c */
    private final byte[] f23384c;

    public C3243en(String str, byte[] bArr, byte[] bArr2) {
        this.f23382a = str;
        this.f23383b = bArr;
        this.f23384c = bArr2;
    }

    @SuppressLint({"TrulyRandom"})
    /* renamed from: a */
    public byte[] m15862a(byte[] bArr) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f23383b, "AES");
        Cipher cipher = Cipher.getInstance(this.f23382a);
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f23384c));
        return cipher.doFinal(bArr);
    }

    /* renamed from: a */
    public byte[] m15863a(byte[] bArr, int i, int i2) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f23383b, "AES");
        Cipher cipher = Cipher.getInstance(this.f23382a);
        cipher.init(2, secretKeySpec, new IvParameterSpec(this.f23384c));
        return cipher.doFinal(bArr, i, i2);
    }
}
