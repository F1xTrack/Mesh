package io.sentry;

import io.sentry.clientreport.C5998b;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6078A;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p000.CallableC7043vw;

/* renamed from: io.sentry.g1 */
/* loaded from: classes2.dex */
public final class C6022g1 {

    /* renamed from: d */
    public static final Charset f34163d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C6025h1 f34164a;

    /* renamed from: b */
    public final Callable f34165b;

    /* renamed from: c */
    public byte[] f34166c;

    public C6022g1(C6025h1 c6025h1, byte[] bArr) {
        this.f34164a = c6025h1;
        this.f34166c = bArr;
        this.f34165b = null;
    }

    /* renamed from: a */
    public static C6022g1 m21779a(InterfaceC5801S interfaceC5801S, C5998b c5998b) {
        AbstractC6003a.m21735D(interfaceC5801S, "ISerializer is required.");
        C6059l1 c6059l1 = new C6059l1(new CallableC7043vw(interfaceC5801S, 12, c5998b));
        return new C6022g1(new C6025h1(EnumC6062m1.resolve(c5998b), new CallableC6010d1(c6059l1, 4), "application/json", (String) null, (String) null), new CallableC6010d1(c6059l1, 5));
    }

    /* renamed from: b */
    public static C6022g1 m21780b(InterfaceC5801S interfaceC5801S, C5792O1 c5792o1) {
        AbstractC6003a.m21735D(interfaceC5801S, "ISerializer is required.");
        AbstractC6003a.m21735D(c5792o1, "Session is required.");
        C6059l1 c6059l1 = new C6059l1(new CallableC7043vw(interfaceC5801S, 10, c5792o1));
        return new C6022g1(new C6025h1(EnumC6062m1.Session, new CallableC6010d1(c6059l1, 7), "application/json", (String) null, (String) null), new CallableC6010d1(c6059l1, 9));
    }

    /* renamed from: g */
    public static byte[] m21781g(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | 128));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f34163d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final C5998b m21782c(InterfaceC5801S interfaceC5801S) throws IOException {
        C6025h1 c6025h1 = this.f34164a;
        if (c6025h1 == null || c6025h1.f34175c != EnumC6062m1.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m21783d()), f34163d));
        try {
            C5998b c5998b = (C5998b) interfaceC5801S.mo21458b(bufferedReader, C5998b.class);
            bufferedReader.close();
            return c5998b;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final byte[] m21783d() {
        Callable callable;
        if (this.f34166c == null && (callable = this.f34165b) != null) {
            this.f34166c = (byte[]) callable.call();
        }
        return this.f34166c;
    }

    /* renamed from: e */
    public final C6039i1 m21784e(InterfaceC5801S interfaceC5801S) throws IOException {
        C6025h1 c6025h1 = this.f34164a;
        if (c6025h1 == null) {
            return null;
        }
        if (c6025h1.f34175c != EnumC6062m1.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m21783d()), f34163d));
        try {
            C6039i1 c6039i1 = (C6039i1) interfaceC5801S.mo21458b(bufferedReader, C6039i1.class);
            bufferedReader.close();
            return c6039i1;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: f */
    public final C6078A m21785f(InterfaceC5801S interfaceC5801S) throws IOException {
        C6025h1 c6025h1 = this.f34164a;
        if (c6025h1 == null || c6025h1.f34175c != EnumC6062m1.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m21783d()), f34163d));
        try {
            C6078A c6078a = (C6078A) interfaceC5801S.mo21458b(bufferedReader, C6078A.class);
            bufferedReader.close();
            return c6078a;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C6022g1(C6025h1 c6025h1, Callable callable) {
        this.f34164a = c6025h1;
        this.f34165b = callable;
        this.f34166c = null;
    }
}
