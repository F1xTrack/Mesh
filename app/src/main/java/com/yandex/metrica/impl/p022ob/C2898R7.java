package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.R7 */
/* loaded from: classes2.dex */
public class C2898R7 {

    /* renamed from: a */
    private String f22107a;

    /* renamed from: b */
    private final Context f22108b;

    /* renamed from: c */
    private final List<InterfaceC2923S7> f22109c;

    /* renamed from: d */
    private final C2699J7 f22110d;

    /* renamed from: e */
    private boolean f22111e;

    /* renamed from: f */
    private boolean f22112f;

    /* renamed from: g */
    private InterfaceC2923S7 f22113g;

    /* renamed from: h */
    private final C2742L0 f22114h;

    public C2898R7(Context context, C2969U3 c2969u3) {
        this(context, C2968U2.m15243a(21) ? Arrays.asList(new C3332i8(context, c2969u3), new C3023W7()) : Collections.singletonList(new C3023W7()), new C2742L0(), new C2699J7());
    }

    /* renamed from: a */
    private synchronized void m14972a() {
        InterfaceC2923S7 next;
        try {
            if (!this.f22112f) {
                synchronized (this) {
                    try {
                        Iterator<InterfaceC2923S7> it = this.f22109c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            try {
                                C2699J7 c2699j7 = this.f22110d;
                                String strMo15112c = next.mo15112c();
                                c2699j7.getClass();
                                System.loadLibrary(strMo15112c);
                                break;
                            } catch (Throwable unused) {
                            }
                        }
                        this.f22113g = next;
                        if (next != null) {
                            try {
                                next.mo15110a(false);
                            } catch (Throwable unused2) {
                            }
                            this.f22107a = this.f22114h.m14504b(this.f22108b, this.f22113g.mo15107a());
                        }
                    } finally {
                    }
                }
            }
            this.f22112f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C2898R7(Context context, List<InterfaceC2923S7> list, C2742L0 c2742l0, C2699J7 c2699j7) {
        this.f22108b = context;
        this.f22109c = list;
        this.f22114h = c2742l0;
        this.f22110d = c2699j7;
    }

    /* renamed from: a */
    public synchronized void m14974a(boolean z, String str, String str2) {
        String str3;
        try {
            if (z) {
                synchronized (this) {
                    try {
                        m14972a();
                    } catch (Throwable unused) {
                        this.f22111e = false;
                    }
                    synchronized (this) {
                        InterfaceC2923S7 interfaceC2923S7 = this.f22113g;
                        if ((interfaceC2923S7 != null) && (str3 = this.f22107a) != null && !this.f22111e) {
                            interfaceC2923S7.mo15109a(str, str3, str2);
                            this.f22111e = true;
                        }
                    }
                }
            }
            synchronized (this) {
                synchronized (this) {
                    InterfaceC2923S7 interfaceC2923S72 = this.f22113g;
                    if ((interfaceC2923S72 != null) && this.f22111e) {
                        interfaceC2923S72.mo15111b();
                    }
                    this.f22111e = false;
                }
            }
        } finally {
        }
    }

    /* renamed from: a */
    public void m14973a(String str) {
        InterfaceC2923S7 interfaceC2923S7 = this.f22113g;
        if (interfaceC2923S7 != null) {
            interfaceC2923S7.mo15108a(str);
        }
    }
}
