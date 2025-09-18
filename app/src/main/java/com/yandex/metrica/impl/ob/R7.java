package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class R7 {
    private String a;
    private final Context b;
    private final List<S7> c;
    private final J7 d;
    private boolean e;
    private boolean f;
    private S7 g;
    private final L0 h;

    public R7(Context context, U3 u3) {
        this(context, U2.a(21) ? Arrays.asList(new C2823i8(context, u3), new W7()) : Collections.singletonList(new W7()), new L0(), new J7());
    }

    private synchronized void a() {
        S7 next;
        try {
            if (!this.f) {
                synchronized (this) {
                    try {
                        Iterator<S7> it = this.c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            try {
                                J7 j7 = this.d;
                                String strC = next.c();
                                j7.getClass();
                                System.loadLibrary(strC);
                                break;
                            } catch (Throwable unused) {
                            }
                        }
                        this.g = next;
                        if (next != null) {
                            try {
                                next.a(false);
                            } catch (Throwable unused2) {
                            }
                            this.a = this.h.b(this.b, this.g.a());
                        }
                    } finally {
                    }
                }
            }
            this.f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public R7(Context context, List<S7> list, L0 l0, J7 j7) {
        this.b = context;
        this.c = list;
        this.h = l0;
        this.d = j7;
    }

    public synchronized void a(boolean z, String str, String str2) {
        String str3;
        try {
            if (z) {
                synchronized (this) {
                    try {
                        a();
                    } catch (Throwable unused) {
                        this.e = false;
                    }
                    synchronized (this) {
                        S7 s7 = this.g;
                        if ((s7 != null) && (str3 = this.a) != null && !this.e) {
                            s7.a(str, str3, str2);
                            this.e = true;
                        }
                    }
                }
            }
            synchronized (this) {
                synchronized (this) {
                    S7 s72 = this.g;
                    if ((s72 != null) && this.e) {
                        s72.b();
                    }
                    this.e = false;
                }
            }
        } finally {
        }
    }

    public void a(String str) {
        S7 s7 = this.g;
        if (s7 != null) {
            s7.a(str);
        }
    }
}
