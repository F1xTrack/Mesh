package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.exception.C6016b;
import io.sentry.protocol.C6083F;
import io.sentry.util.AbstractC6168a;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.Callable;
import p000.AbstractC7222ym;

/* renamed from: io.sentry.f1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC6019f1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f34153a = 0;

    /* renamed from: b */
    public final /* synthetic */ long f34154b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC5801S f34155c;

    /* renamed from: d */
    public final /* synthetic */ Object f34156d;

    /* renamed from: e */
    public final /* synthetic */ Object f34157e;

    public /* synthetic */ CallableC6019f1(C5825a c5825a, long j, InterfaceC5801S interfaceC5801S, ILogger iLogger) {
        this.f34156d = c5825a;
        this.f34154b = j;
        this.f34155c = interfaceC5801S;
        this.f34157e = iLogger;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws C6016b {
        Object obj = this.f34157e;
        long j = this.f34154b;
        Object obj2 = this.f34156d;
        InterfaceC5801S interfaceC5801S = this.f34155c;
        switch (this.f34153a) {
            case 0:
                C5825a c5825a = (C5825a) obj2;
                byte[] bArrM21878b = c5825a.f33467a;
                String str = c5825a.f33469c;
                if (bArrM21878b != null) {
                    long length = bArrM21878b.length;
                    if (length > j) {
                        throw new C6016b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(length), Long.valueOf(j)));
                    }
                } else {
                    C6083F c6083f = c5825a.f33468b;
                    if (c6083f == null || (bArrM21878b = AbstractC6168a.m21878b(interfaceC5801S, (ILogger) obj, c6083f)) == null) {
                        throw new C6016b(AbstractC7222ym.m26234k("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable or a path is set."));
                    }
                    long length2 = bArrM21878b.length;
                    if (length2 > j) {
                        throw new C6016b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(length2), Long.valueOf(j)));
                    }
                }
                return bArrM21878b;
            default:
                File file = (File) obj2;
                if (!file.exists()) {
                    throw new C6016b(AbstractC7222ym.m26234k("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                try {
                    String str2 = new String(AbstractC6003a.m21746e(AbstractC6003a.m21733B(j, file.getPath())), "US-ASCII");
                    if (str2.isEmpty()) {
                        throw new C6016b("Profiling trace file is empty");
                    }
                    C5761E0 c5761e0 = (C5761E0) obj;
                    c5761e0.f33236B = str2;
                    try {
                        c5761e0.f33249l = (List) c5761e0.f33239b.call();
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C6022g1.f34163d));
                                try {
                                    interfaceC5801S.mo21461e(c5761e0, bufferedWriter);
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
                            throw new C6016b("Failed to serialize profiling trace data\n" + e.getMessage());
                        }
                    } finally {
                        file.delete();
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new AssertionError(e2);
                }
        }
    }

    public /* synthetic */ CallableC6019f1(File file, long j, C5761E0 c5761e0, InterfaceC5801S interfaceC5801S) {
        this.f34156d = file;
        this.f34154b = j;
        this.f34157e = c5761e0;
        this.f34155c = interfaceC5801S;
    }
}
