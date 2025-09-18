package p000;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class DQ0 implements InterfaceC10775qQ0 {

    /* renamed from: b */
    public static GQ0 f2012b;

    /* renamed from: a */
    public final Handler f2013a = new Handler(Looper.getMainLooper());

    @Override // p000.InterfaceC10775qQ0
    /* renamed from: a */
    public final void mo1679a(C11415vQ0 c11415vQ0) {
        this.f2013a.post(new RunnableC8352Tz0(16, c11415vQ0));
    }

    @Override // p000.InterfaceC10775qQ0
    /* renamed from: b */
    public final void mo1680b() {
        this.f2013a.post(new RunnableC0004A3(8));
    }

    @Override // p000.InterfaceC10775qQ0
    /* renamed from: c */
    public final void mo1681c() {
        this.f2013a.post(new RunnableC0004A3(10));
    }

    @Override // p000.InterfaceC10775qQ0
    /* renamed from: d */
    public final void mo1682d() {
        this.f2013a.post(new RunnableC0004A3(9));
    }
}
