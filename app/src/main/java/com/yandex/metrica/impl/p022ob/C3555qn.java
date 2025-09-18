package com.yandex.metrica.impl.p022ob;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.qn */
/* loaded from: classes2.dex */
public class C3555qn {

    /* renamed from: a */
    private final C3529pn f24563a;

    /* renamed from: b */
    private volatile C3581rn f24564b;

    /* renamed from: c */
    private volatile InterfaceExecutorC3607sn f24565c;

    /* renamed from: d */
    private volatile InterfaceExecutorC3607sn f24566d;

    /* renamed from: e */
    private volatile Handler f24567e;

    public C3555qn() {
        this(new C3529pn());
    }

    /* renamed from: a */
    public InterfaceExecutorC3607sn m16637a() {
        if (this.f24565c == null) {
            synchronized (this) {
                try {
                    if (this.f24565c == null) {
                        this.f24563a.getClass();
                        this.f24565c = new C3581rn("YMM-APT");
                    }
                } finally {
                }
            }
        }
        return this.f24565c;
    }

    /* renamed from: b */
    public C3581rn m16638b() {
        if (this.f24564b == null) {
            synchronized (this) {
                try {
                    if (this.f24564b == null) {
                        this.f24563a.getClass();
                        this.f24564b = new C3581rn("YMM-YM");
                    }
                } finally {
                }
            }
        }
        return this.f24564b;
    }

    /* renamed from: c */
    public Handler m16639c() {
        if (this.f24567e == null) {
            synchronized (this) {
                try {
                    if (this.f24567e == null) {
                        this.f24563a.getClass();
                        this.f24567e = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return this.f24567e;
    }

    /* renamed from: d */
    public InterfaceExecutorC3607sn m16640d() {
        if (this.f24566d == null) {
            synchronized (this) {
                try {
                    if (this.f24566d == null) {
                        this.f24563a.getClass();
                        this.f24566d = new C3581rn("YMM-RS");
                    }
                } finally {
                }
            }
        }
        return this.f24566d;
    }

    public C3555qn(C3529pn c3529pn) {
        this.f24563a = c3529pn;
    }
}
