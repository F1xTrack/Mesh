package p000;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;

/* renamed from: tX */
/* loaded from: classes.dex */
public class C6892tX implements InterfaceC3899cz {

    /* renamed from: a */
    public final ArrayList f43110a = new ArrayList(2);

    /* renamed from: a */
    public final synchronized void m24939a(InterfaceC3899cz interfaceC3899cz) {
        this.f43110a.add(interfaceC3899cz);
    }

    @Override // p000.InterfaceC3899cz
    /* renamed from: b */
    public final void mo3351b(String str, L60 l60) {
        int size = this.f43110a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC3899cz interfaceC3899cz = (InterfaceC3899cz) this.f43110a.get(i);
                if (interfaceC3899cz != null) {
                    interfaceC3899cz.mo3351b(str, l60);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m24940c() {
        this.f43110a.clear();
    }

    /* renamed from: d */
    public final synchronized void m24941d() {
    }

    @Override // p000.InterfaceC3899cz
    /* renamed from: g */
    public final synchronized void mo3352g(String str, Throwable th) {
        int size = this.f43110a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC3899cz interfaceC3899cz = (InterfaceC3899cz) this.f43110a.get(i);
                if (interfaceC3899cz != null) {
                    interfaceC3899cz.mo3352g(str, th);
                }
            } catch (Exception unused) {
                m24941d();
            }
        }
    }

    @Override // p000.InterfaceC3899cz
    /* renamed from: h */
    public final synchronized void mo3353h(Object obj, String str) {
        int size = this.f43110a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC3899cz interfaceC3899cz = (InterfaceC3899cz) this.f43110a.get(i);
                if (interfaceC3899cz != null) {
                    interfaceC3899cz.mo3353h(obj, str);
                }
            } catch (Exception unused) {
                m24941d();
            }
        }
    }

    @Override // p000.InterfaceC3899cz
    /* renamed from: j */
    public final synchronized void mo3354j(String str) {
        int size = this.f43110a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC3899cz interfaceC3899cz = (InterfaceC3899cz) this.f43110a.get(i);
                if (interfaceC3899cz != null) {
                    interfaceC3899cz.mo3354j(str);
                }
            } catch (Exception unused) {
                m24941d();
            }
        }
    }

    @Override // p000.InterfaceC3899cz
    /* renamed from: n */
    public final void mo3355n(String str, Throwable th) {
        int size = this.f43110a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC3899cz interfaceC3899cz = (InterfaceC3899cz) this.f43110a.get(i);
                if (interfaceC3899cz != null) {
                    interfaceC3899cz.mo3355n(str, th);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // p000.InterfaceC3899cz
    /* renamed from: o */
    public final synchronized void mo3356o(String str, L60 l60, Animatable animatable) {
        int size = this.f43110a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC3899cz interfaceC3899cz = (InterfaceC3899cz) this.f43110a.get(i);
                if (interfaceC3899cz != null) {
                    interfaceC3899cz.mo3356o(str, l60, animatable);
                }
            } catch (Exception unused) {
                m24941d();
            }
        }
    }
}
