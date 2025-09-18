package io.sentry;

import defpackage.CallableC7695vw;
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

/* renamed from: io.sentry.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5127g1 {
    public static final Charset d = Charset.forName("UTF-8");
    public final C5130h1 a;
    public final Callable b;
    public byte[] c;

    public C5127g1(C5130h1 c5130h1, byte[] bArr) {
        this.a = c5130h1;
        this.c = bArr;
        this.b = null;
    }

    public static C5127g1 a(S s, io.sentry.clientreport.b bVar) {
        io.sentry.config.a.D(s, "ISerializer is required.");
        C5142l1 c5142l1 = new C5142l1(new CallableC7695vw(s, 12, bVar));
        return new C5127g1(new C5130h1(EnumC5145m1.resolve(bVar), new CallableC5118d1(c5142l1, 4), "application/json", (String) null, (String) null), new CallableC5118d1(c5142l1, 5));
    }

    public static C5127g1 b(S s, O1 o1) {
        io.sentry.config.a.D(s, "ISerializer is required.");
        io.sentry.config.a.D(o1, "Session is required.");
        C5142l1 c5142l1 = new C5142l1(new CallableC7695vw(s, 10, o1));
        return new C5127g1(new C5130h1(EnumC5145m1.Session, new CallableC5118d1(c5142l1, 7), "application/json", (String) null, (String) null), new CallableC5118d1(c5142l1, 9));
    }

    public static byte[] g(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | 128));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(d);
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

    public final io.sentry.clientreport.b c(S s) throws IOException {
        C5130h1 c5130h1 = this.a;
        if (c5130h1 == null || c5130h1.c != EnumC5145m1.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(d()), d));
        try {
            io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) s.b(bufferedReader, io.sentry.clientreport.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final byte[] d() {
        Callable callable;
        if (this.c == null && (callable = this.b) != null) {
            this.c = (byte[]) callable.call();
        }
        return this.c;
    }

    public final C5133i1 e(S s) throws IOException {
        C5130h1 c5130h1 = this.a;
        if (c5130h1 == null) {
            return null;
        }
        if (c5130h1.c != EnumC5145m1.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(d()), d));
        try {
            C5133i1 c5133i1 = (C5133i1) s.b(bufferedReader, C5133i1.class);
            bufferedReader.close();
            return c5133i1;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.protocol.A f(S s) throws IOException {
        C5130h1 c5130h1 = this.a;
        if (c5130h1 == null || c5130h1.c != EnumC5145m1.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(d()), d));
        try {
            io.sentry.protocol.A a = (io.sentry.protocol.A) s.b(bufferedReader, io.sentry.protocol.A.class);
            bufferedReader.close();
            return a;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C5127g1(C5130h1 c5130h1, Callable callable) {
        this.a = c5130h1;
        this.b = callable;
        this.c = null;
    }
}
