package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.p028io.GZIPCompressor;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.m3 */
/* loaded from: classes2.dex */
public final class C5287m3 {

    /* renamed from: a */
    public final C5262l3 f32165a;

    /* renamed from: b */
    public final GZIPCompressor f32166b;

    public C5287m3() {
        this(new C5262l3(), new GZIPCompressor());
    }

    /* renamed from: a */
    public final byte[] m20696a(byte[] bArr) {
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C5262l3 c5262l3 = this.f32165a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c5262l3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, bArrCopyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f32166b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C5287m3(C5262l3 c5262l3, GZIPCompressor gZIPCompressor) {
        this.f32165a = c5262l3;
        this.f32166b = gZIPCompressor;
    }
}
