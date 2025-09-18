package com.yandex.metrica.impl.p022ob;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;

/* renamed from: com.yandex.metrica.impl.ob.ba */
/* loaded from: classes2.dex */
public class C3152ba {

    /* renamed from: a */
    private final a f23121a;

    /* renamed from: b */
    private final C3684vm f23122b;

    /* renamed from: com.yandex.metrica.impl.ob.ba$a */
    public static class a {
    }

    public C3152ba() {
        this(new a(), new C3684vm());
    }

    /* renamed from: a */
    public byte[] m15680a(byte[] bArr, String str) {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            a aVar = this.f23121a;
            byte[] bytes = str.getBytes();
            aVar.getClass();
            C3243en c3243en = new C3243en(AESEncrypter.DEFAULT_ALGORITHM, bytes, bArrCopyOfRange);
            if (C2968U2.m15246a(bArr)) {
                return null;
            }
            byte[] bArrM15863a = c3243en.m15863a(bArr, 16, bArr.length - 16);
            this.f23122b.getClass();
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArrM15863a);
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
                byte[] bArrM15297a = C2991V0.m15297a(gZIPInputStream, Integer.MAX_VALUE);
                C2968U2.m15241a((Closeable) gZIPInputStream);
                C2968U2.m15241a((Closeable) byteArrayInputStream);
                return bArrM15297a;
            } catch (Throwable th4) {
                th = th4;
                C2968U2.m15241a((Closeable) gZIPInputStream);
                C2968U2.m15241a((Closeable) byteArrayInputStream);
                throw th;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public C3152ba(a aVar, C3684vm c3684vm) {
        this.f23121a = aVar;
        this.f23122b = c3684vm;
    }
}
