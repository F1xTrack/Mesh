package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* renamed from: com.huawei.hms.base.log.b */
/* loaded from: classes.dex */
public class C2048b {

    /* renamed from: b */
    private String f18852b;

    /* renamed from: a */
    private int f18851a = 4;

    /* renamed from: c */
    private InterfaceC2050d f18853c = new C2049c();

    /* renamed from: b */
    private void m11543b() {
    }

    /* renamed from: a */
    public void m11546a(Context context, int i, String str) {
        this.f18851a = i;
        this.f18852b = str;
        this.f18853c.mo11539a(context, "HMSCore");
    }

    /* renamed from: b */
    public void m11550b(int i, String str, String str2, Throwable th) {
        try {
            if (m11549a(i)) {
                C2051e c2051eM11542a = m11542a(i, str, str2, th);
                String str3 = c2051eM11542a.m11558c() + c2051eM11542a.m11557a();
                this.f18853c.mo11541a(str3, i, str, str2 + '\n' + Log.getStackTraceString(th));
            }
        } catch (OutOfMemoryError unused) {
            m11543b();
        }
    }

    /* renamed from: a */
    public InterfaceC2050d m11544a() {
        return this.f18853c;
    }

    /* renamed from: a */
    public void m11547a(InterfaceC2050d interfaceC2050d) {
        this.f18853c = interfaceC2050d;
    }

    /* renamed from: a */
    public boolean m11549a(int i) {
        return i >= this.f18851a;
    }

    /* renamed from: a */
    public void m11545a(int i, String str, String str2) {
        try {
            if (m11549a(i)) {
                C2051e c2051eM11542a = m11542a(i, str, str2, null);
                this.f18853c.mo11541a(c2051eM11542a.m11558c() + c2051eM11542a.m11557a(), i, str, str2);
            }
        } catch (OutOfMemoryError unused) {
            m11543b();
        }
    }

    /* renamed from: a */
    public void m11548a(String str, String str2) {
        try {
            C2051e c2051eM11542a = m11542a(4, str, str2, null);
            this.f18853c.mo11541a(c2051eM11542a.m11558c() + '\n' + c2051eM11542a.m11557a(), 4, str, str2);
        } catch (OutOfMemoryError unused) {
            m11543b();
        }
    }

    /* renamed from: a */
    private C2051e m11542a(int i, String str, String str2, Throwable th) {
        C2051e c2051e = new C2051e(8, this.f18852b, i, str);
        c2051e.m11555a((C2051e) str2);
        c2051e.m11556a(th);
        return c2051e;
    }
}
