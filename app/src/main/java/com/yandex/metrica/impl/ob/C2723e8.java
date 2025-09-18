package com.yandex.metrica.impl.ob;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.e8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2723e8 {
    private final String a;
    private LocalServerSocket b;
    private volatile boolean c;
    private final C2847j8 d;
    private final Um<String> e;
    private final String f;
    private List<Um<String>> g;
    private final Thread h;

    /* renamed from: com.yandex.metrica.impl.ob.e8$a */
    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (C2723e8.this.c) {
                try {
                    LocalSocket localSocketAccept = C2723e8.this.b.accept();
                    byte[] bArr = new byte[256];
                    int i = localSocketAccept.getInputStream().read(bArr);
                    localSocketAccept.close();
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    C2723e8.a(C2723e8.this, new String(bArr2));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e8$b */
    public class b implements Um<String> {
        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            CrashpadServiceHelper.setUpServiceHelper(str);
        }
    }

    public C2723e8(String str, String str2) {
        this(str, str2, C2847j8.a(), new b());
    }

    public C2723e8(String str, String str2, C2847j8 c2847j8, Um<String> um) {
        this.c = false;
        this.g = new LinkedList();
        this.h = new a();
        this.a = str;
        this.f = str2;
        this.d = c2847j8;
        this.e = um;
    }

    public void a(Um<String> um) {
        synchronized (this) {
            this.g.add(um);
        }
        if (this.c || this.f == null) {
            return;
        }
        synchronized (this) {
            if (!this.c) {
                try {
                    if (this.d.b()) {
                        this.b = new LocalServerSocket(this.a);
                        this.c = true;
                        this.e.b(this.f);
                        this.h.start();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public synchronized void b(Um<String> um) {
        this.g.remove(um);
    }

    public static void a(C2723e8 c2723e8, String str) {
        synchronized (c2723e8) {
            Iterator<Um<String>> it = c2723e8.g.iterator();
            while (it.hasNext()) {
                it.next().b(str);
            }
        }
    }
}
