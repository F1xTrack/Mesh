package defpackage;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;

/* renamed from: tX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7238tX implements InterfaceC3301cz {
    public final ArrayList a = new ArrayList(2);

    public final synchronized void a(InterfaceC3301cz interfaceC3301cz) {
        this.a.add(interfaceC3301cz);
    }

    @Override // defpackage.InterfaceC3301cz
    public final void b(String str, L60 l60) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC3301cz interfaceC3301cz = (InterfaceC3301cz) this.a.get(i);
                if (interfaceC3301cz != null) {
                    interfaceC3301cz.b(str, l60);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    public final synchronized void c() {
        this.a.clear();
    }

    public final synchronized void d() {
    }

    @Override // defpackage.InterfaceC3301cz
    public final synchronized void g(String str, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC3301cz interfaceC3301cz = (InterfaceC3301cz) this.a.get(i);
                if (interfaceC3301cz != null) {
                    interfaceC3301cz.g(str, th);
                }
            } catch (Exception unused) {
                d();
            }
        }
    }

    @Override // defpackage.InterfaceC3301cz
    public final synchronized void h(Object obj, String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC3301cz interfaceC3301cz = (InterfaceC3301cz) this.a.get(i);
                if (interfaceC3301cz != null) {
                    interfaceC3301cz.h(obj, str);
                }
            } catch (Exception unused) {
                d();
            }
        }
    }

    @Override // defpackage.InterfaceC3301cz
    public final synchronized void j(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC3301cz interfaceC3301cz = (InterfaceC3301cz) this.a.get(i);
                if (interfaceC3301cz != null) {
                    interfaceC3301cz.j(str);
                }
            } catch (Exception unused) {
                d();
            }
        }
    }

    @Override // defpackage.InterfaceC3301cz
    public final void n(String str, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC3301cz interfaceC3301cz = (InterfaceC3301cz) this.a.get(i);
                if (interfaceC3301cz != null) {
                    interfaceC3301cz.n(str, th);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3301cz
    public final synchronized void o(String str, L60 l60, Animatable animatable) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC3301cz interfaceC3301cz = (InterfaceC3301cz) this.a.get(i);
                if (interfaceC3301cz != null) {
                    interfaceC3301cz.o(str, l60, animatable);
                }
            } catch (Exception unused) {
                d();
            }
        }
    }
}
