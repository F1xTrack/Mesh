package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ai */
/* loaded from: classes2.dex */
public abstract class AbstractC3134ai {

    /* renamed from: a */
    final Socket f23063a;

    /* renamed from: b */
    final InterfaceC3290gi f23064b;

    /* renamed from: c */
    final C2585Ei f23065c;

    /* renamed from: d */
    final Uri f23066d;

    /* renamed from: e */
    final C3316hi f23067e;

    public AbstractC3134ai(Socket socket, Uri uri, InterfaceC3290gi interfaceC3290gi, C2585Ei c2585Ei, C3316hi c3316hi) {
        this.f23063a = socket;
        this.f23066d = uri;
        this.f23064b = interfaceC3290gi;
        this.f23065c = c2585Ei;
        this.f23067e = c3316hi;
    }

    /* renamed from: a */
    public abstract void mo14850a();

    /* renamed from: a */
    public void m15616a(String str, Map<String, String> map, byte[] bArr) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        this.f23067e.m16051b();
        OutputStream outputStream = null;
        OutputStream outputStream2 = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(this.f23063a.getOutputStream());
                try {
                    bufferedOutputStream.write(str.getBytes());
                    m15614a(bufferedOutputStream);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        m15615a(bufferedOutputStream, key, entry.getValue());
                        outputStream2 = key;
                    }
                    m15614a(bufferedOutputStream);
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.flush();
                    this.f23067e.m16052c();
                    ((RunnableC3368ji) this.f23064b).m16187b(this.f23063a.getLocalPort(), this.f23067e);
                    outputStream = outputStream2;
                } catch (IOException e) {
                    e = e;
                    bufferedOutputStream2 = bufferedOutputStream;
                    ((RunnableC3368ji) this.f23064b).m16184a("io_exception_during_sync", e);
                    bufferedOutputStream = bufferedOutputStream2;
                    outputStream = bufferedOutputStream2;
                    C2968U2.m15241a((Closeable) bufferedOutputStream);
                } catch (Throwable th) {
                    th = th;
                    outputStream = bufferedOutputStream;
                    C2968U2.m15241a((Closeable) outputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
            C2968U2.m15241a((Closeable) bufferedOutputStream);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    private void m15615a(OutputStream outputStream, String str, String str2) throws IOException {
        outputStream.write((str + ": " + str2).getBytes());
        m15614a(outputStream);
    }

    /* renamed from: a */
    private void m15614a(OutputStream outputStream) throws IOException {
        outputStream.write("\r\n".getBytes());
    }
}
