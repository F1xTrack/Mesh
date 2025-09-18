package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.qn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3037qn {
    private final C3012pn a;
    private volatile C3061rn b;
    private volatile InterfaceExecutorC3086sn c;
    private volatile InterfaceExecutorC3086sn d;
    private volatile Handler e;

    public C3037qn() {
        this(new C3012pn());
    }

    public InterfaceExecutorC3086sn a() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.a.getClass();
                        this.c = new C3061rn("YMM-APT");
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public C3061rn b() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.a.getClass();
                        this.b = new C3061rn("YMM-YM");
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public Handler c() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        this.a.getClass();
                        this.e = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public InterfaceExecutorC3086sn d() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.a.getClass();
                        this.d = new C3061rn("YMM-RS");
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public C3037qn(C3012pn c3012pn) {
        this.a = c3012pn;
    }
}
