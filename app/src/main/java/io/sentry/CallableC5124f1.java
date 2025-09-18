package io.sentry;

import defpackage.AbstractC8235ym;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: io.sentry.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC5124f1 implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ S c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ CallableC5124f1(C5081a c5081a, long j, S s, ILogger iLogger) {
        this.d = c5081a;
        this.b = j;
        this.c = s;
        this.e = iLogger;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws io.sentry.exception.b {
        Object obj = this.e;
        long j = this.b;
        Object obj2 = this.d;
        S s = this.c;
        switch (this.a) {
            case 0:
                C5081a c5081a = (C5081a) obj2;
                byte[] bArrB = c5081a.a;
                String str = c5081a.c;
                if (bArrB != null) {
                    long length = bArrB.length;
                    if (length > j) {
                        throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(length), Long.valueOf(j)));
                    }
                } else {
                    io.sentry.protocol.F f = c5081a.b;
                    if (f == null || (bArrB = io.sentry.util.a.b(s, (ILogger) obj, f)) == null) {
                        throw new io.sentry.exception.b(AbstractC8235ym.k("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable or a path is set."));
                    }
                    long length2 = bArrB.length;
                    if (length2 > j) {
                        throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(length2), Long.valueOf(j)));
                    }
                }
                return bArrB;
            default:
                File file = (File) obj2;
                if (!file.exists()) {
                    throw new io.sentry.exception.b(AbstractC8235ym.k("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                try {
                    String str2 = new String(io.sentry.config.a.e(io.sentry.config.a.B(j, file.getPath())), "US-ASCII");
                    if (str2.isEmpty()) {
                        throw new io.sentry.exception.b("Profiling trace file is empty");
                    }
                    E0 e0 = (E0) obj;
                    e0.B = str2;
                    try {
                        e0.l = (List) e0.b.call();
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C5127g1.d));
                                try {
                                    s.e(e0, bufferedWriter);
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    bufferedWriter.close();
                                    byteArrayOutputStream.close();
                                    return byteArray;
                                } finally {
                                }
                            } catch (Throwable th) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            throw new io.sentry.exception.b("Failed to serialize profiling trace data\n" + e.getMessage());
                        }
                    } finally {
                        file.delete();
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new AssertionError(e2);
                }
        }
    }

    public /* synthetic */ CallableC5124f1(File file, long j, E0 e0, S s) {
        this.d = file;
        this.b = j;
        this.e = e0;
        this.c = s;
    }
}
