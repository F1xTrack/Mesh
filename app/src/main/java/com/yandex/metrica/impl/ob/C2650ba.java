package com.yandex.metrica.impl.ob;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;

/* renamed from: com.yandex.metrica.impl.ob.ba, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2650ba {
    private final a a;
    private final C3165vm b;

    /* renamed from: com.yandex.metrica.impl.ob.ba$a */
    public static class a {
    }

    public C2650ba() {
        this(new a(), new C3165vm());
    }

    public byte[] a(byte[] bArr, String str) {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            a aVar = this.a;
            byte[] bytes = str.getBytes();
            aVar.getClass();
            C2738en c2738en = new C2738en(AESEncrypter.DEFAULT_ALGORITHM, bytes, bArrCopyOfRange);
            if (U2.a(bArr)) {
                return null;
            }
            byte[] bArrA = c2738en.a(bArr, 16, bArr.length - 16);
            this.b.getClass();
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArrA);
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPInputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPInputStream = null;
                byteArrayInputStream = null;
            }
            try {
                byte[] bArrA2 = V0.a(gZIPInputStream, Integer.MAX_VALUE);
                U2.a((Closeable) gZIPInputStream);
                U2.a((Closeable) byteArrayInputStream);
                return bArrA2;
            } catch (Throwable th4) {
                th = th4;
                U2.a((Closeable) gZIPInputStream);
                U2.a((Closeable) byteArrayInputStream);
                throw th;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public C2650ba(a aVar, C3165vm c3165vm) {
        this.a = aVar;
        this.b = c3165vm;
    }
}
