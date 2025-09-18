package com.yandex.metrica.impl.ob;

import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ai, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2633ai {
    final Socket a;
    final InterfaceC2783gi b;
    final Ei c;
    final Uri d;
    final C2808hi e;

    public AbstractC2633ai(Socket socket, Uri uri, InterfaceC2783gi interfaceC2783gi, Ei ei, C2808hi c2808hi) {
        this.a = socket;
        this.d = uri;
        this.b = interfaceC2783gi;
        this.c = ei;
        this.e = c2808hi;
    }

    public abstract void a();

    public void a(String str, Map<String, String> map, byte[] bArr) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        this.e.b();
        OutputStream outputStream = null;
        OutputStream outputStream2 = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(this.a.getOutputStream());
                try {
                    bufferedOutputStream.write(str.getBytes());
                    a(bufferedOutputStream);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        a(bufferedOutputStream, key, entry.getValue());
                        outputStream2 = key;
                    }
                    a(bufferedOutputStream);
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.flush();
                    this.e.c();
                    ((RunnableC2857ji) this.b).b(this.a.getLocalPort(), this.e);
                    outputStream = outputStream2;
                } catch (IOException e) {
                    e = e;
                    bufferedOutputStream2 = bufferedOutputStream;
                    ((RunnableC2857ji) this.b).a("io_exception_during_sync", e);
                    bufferedOutputStream = bufferedOutputStream2;
                    outputStream = bufferedOutputStream2;
                    U2.a((Closeable) bufferedOutputStream);
                } catch (Throwable th) {
                    th = th;
                    outputStream = bufferedOutputStream;
                    U2.a((Closeable) outputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
            U2.a((Closeable) bufferedOutputStream);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void a(OutputStream outputStream, String str, String str2) throws IOException {
        outputStream.write((str + ": " + str2).getBytes());
        a(outputStream);
    }

    private void a(OutputStream outputStream) throws IOException {
        outputStream.write("\r\n".getBytes());
    }
}
