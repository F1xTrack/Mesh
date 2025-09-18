package p000;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class X21 implements InterfaceC0768MC, InterfaceC0706LC {

    /* renamed from: a */
    public final C0832ND f13526a;

    /* renamed from: b */
    public final RunnableC0895OD f13527b;

    /* renamed from: c */
    public volatile int f13528c;

    /* renamed from: d */
    public volatile C0076BC f13529d;

    /* renamed from: e */
    public volatile Object f13530e;

    /* renamed from: f */
    public volatile C11087ss0 f13531f;

    /* renamed from: g */
    public volatile C0139CC f13532g;

    public X21(C0832ND c0832nd, RunnableC0895OD runnableC0895OD) {
        this.f13526a = c0832nd;
        this.f13527b = runnableC0895OD;
    }

    @Override // p000.InterfaceC0706LC
    /* renamed from: a */
    public final void mo4921a(InterfaceC7740If0 interfaceC7740If0, Exception exc, InterfaceC0643KC interfaceC0643KC, EnumC1460XC enumC1460XC) {
        this.f13527b.mo4921a(interfaceC7740If0, exc, interfaceC0643KC, this.f13531f.f42649c.mo3257d());
    }

    @Override // p000.InterfaceC0768MC
    /* renamed from: b */
    public final boolean mo555b() {
        if (this.f13530e != null) {
            Object obj = this.f13530e;
            this.f13530e = null;
            try {
                if (!m8925d(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f13529d != null && this.f13529d.mo555b()) {
            return true;
        }
        this.f13529d = null;
        this.f13531f = null;
        boolean z = false;
        while (!z && this.f13528c < this.f13526a.m5584b().size()) {
            ArrayList arrayListM5584b = this.f13526a.m5584b();
            int i = this.f13528c;
            this.f13528c = i + 1;
            this.f13531f = (C11087ss0) arrayListM5584b.get(i);
            if (this.f13531f != null && (this.f13526a.f7566p.mo17909c(this.f13531f.f42649c.mo3257d()) || this.f13526a.m5585c(this.f13531f.f42649c.mo3254a()) != null)) {
                this.f13531f.f42649c.mo3256c(this.f13526a.f7565o, new C9108dO1(this, 25, this.f13531f));
                z = true;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC0706LC
    /* renamed from: c */
    public final void mo4922c(InterfaceC7740If0 interfaceC7740If0, Object obj, InterfaceC0643KC interfaceC0643KC, EnumC1460XC enumC1460XC, InterfaceC7740If0 interfaceC7740If02) {
        this.f13527b.mo4922c(interfaceC7740If0, obj, interfaceC0643KC, this.f13531f.f42649c.mo3257d(), interfaceC7740If0);
    }

    @Override // p000.InterfaceC0768MC
    public final void cancel() {
        C11087ss0 c11087ss0 = this.f13531f;
        if (c11087ss0 != null) {
            c11087ss0.f42649c.cancel();
        }
    }

    /* renamed from: d */
    public final boolean m8925d(Object obj) throws Throwable {
        int i = AbstractC10433nl0.f38500a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC1208TC interfaceC1208TCM17934h = this.f13526a.f7553c.m25734a().m17934h(obj);
            Object objMo2902m = interfaceC1208TCM17934h.mo2902m();
            InterfaceC1782bO interfaceC1782bOM5586d = this.f13526a.m5586d(objMo2902m);
            C10189lr0 c10189lr0 = new C10189lr0(interfaceC1782bOM5586d, objMo2902m, this.f13526a.f7559i, 9);
            InterfaceC7740If0 interfaceC7740If0 = this.f13531f.f42647a;
            C0832ND c0832nd = this.f13526a;
            C0139CC c0139cc = new C0139CC(interfaceC7740If0, c0832nd.f7564n);
            InterfaceC1593ZJ interfaceC1593ZJM1677b = c0832nd.f7558h.m1677b();
            interfaceC1593ZJM1677b.mo5744d(c0139cc, c10189lr0);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c0139cc.toString();
                obj.toString();
                interfaceC1782bOM5586d.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (interfaceC1593ZJM1677b.mo5746f(c0139cc) != null) {
                this.f13532g = c0139cc;
                this.f13529d = new C0076BC(Collections.singletonList(this.f13531f.f42647a), this.f13526a, this);
                this.f13531f.f42649c.mo3255b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f13532g);
                obj.toString();
            }
            try {
                this.f13527b.mo4922c(this.f13531f.f42647a, interfaceC1208TCM17934h.mo2902m(), this.f13531f.f42649c, this.f13531f.f42649c.mo3257d(), this.f13531f.f42647a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f13531f.f42649c.mo3255b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
