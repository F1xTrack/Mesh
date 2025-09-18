package com.yandex.metrica.impl.p022ob;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.yandex.metrica.impl.p021ac.CrashpadServiceHelper;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.e8 */
/* loaded from: classes2.dex */
public class C3228e8 {

    /* renamed from: a */
    private final String f23330a;

    /* renamed from: b */
    private LocalServerSocket f23331b;

    /* renamed from: c */
    private volatile boolean f23332c;

    /* renamed from: d */
    private final C3358j8 f23333d;

    /* renamed from: e */
    private final InterfaceC2988Um<String> f23334e;

    /* renamed from: f */
    private final String f23335f;

    /* renamed from: g */
    private List<InterfaceC2988Um<String>> f23336g;

    /* renamed from: h */
    private final Thread f23337h;

    /* renamed from: com.yandex.metrica.impl.ob.e8$a */
    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (C3228e8.this.f23332c) {
                try {
                    LocalSocket localSocketAccept = C3228e8.this.f23331b.accept();
                    byte[] bArr = new byte[256];
                    int i = localSocketAccept.getInputStream().read(bArr);
                    localSocketAccept.close();
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    C3228e8.m15824a(C3228e8.this, new String(bArr2));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e8$b */
    public class b implements InterfaceC2988Um<String> {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(String str) {
            CrashpadServiceHelper.setUpServiceHelper(str);
        }
    }

    public C3228e8(String str, String str2) {
        this(str, str2, C3358j8.m16114a(), new b());
    }

    public C3228e8(String str, String str2, C3358j8 c3358j8, InterfaceC2988Um<String> interfaceC2988Um) {
        this.f23332c = false;
        this.f23336g = new LinkedList();
        this.f23337h = new a();
        this.f23330a = str;
        this.f23335f = str2;
        this.f23333d = c3358j8;
        this.f23334e = interfaceC2988Um;
    }

    /* renamed from: a */
    public void m15827a(InterfaceC2988Um<String> interfaceC2988Um) {
        synchronized (this) {
            this.f23336g.add(interfaceC2988Um);
        }
        if (this.f23332c || this.f23335f == null) {
            return;
        }
        synchronized (this) {
            if (!this.f23332c) {
                try {
                    if (this.f23333d.m16115b()) {
                        this.f23331b = new LocalServerSocket(this.f23330a);
                        this.f23332c = true;
                        this.f23334e.mo13904b(this.f23335f);
                        this.f23337h.start();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized void m15828b(InterfaceC2988Um<String> interfaceC2988Um) {
        this.f23336g.remove(interfaceC2988Um);
    }

    /* renamed from: a */
    public static void m15824a(C3228e8 c3228e8, String str) {
        synchronized (c3228e8) {
            Iterator<InterfaceC2988Um<String>> it = c3228e8.f23336g.iterator();
            while (it.hasNext()) {
                it.next().mo13904b(str);
            }
        }
    }
}
