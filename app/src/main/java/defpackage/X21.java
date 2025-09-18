package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class X21 implements MC, LC {
    public final ND a;
    public final OD b;
    public volatile int c;
    public volatile BC d;
    public volatile Object e;
    public volatile C7111ss0 f;
    public volatile CC g;

    public X21(ND nd, OD od) {
        this.a = nd;
        this.b = od;
    }

    @Override // defpackage.LC
    public final void a(InterfaceC0660If0 interfaceC0660If0, Exception exc, KC kc, XC xc) {
        this.b.a(interfaceC0660If0, exc, kc, this.f.c.d());
    }

    @Override // defpackage.MC
    public final boolean b() {
        if (this.e != null) {
            Object obj = this.e;
            this.e = null;
            try {
                if (!d(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.d != null && this.d.b()) {
            return true;
        }
        this.d = null;
        this.f = null;
        boolean z = false;
        while (!z && this.c < this.a.b().size()) {
            ArrayList arrayListB = this.a.b();
            int i = this.c;
            this.c = i + 1;
            this.f = (C7111ss0) arrayListB.get(i);
            if (this.f != null && (this.a.p.c(this.f.c.d()) || this.a.c(this.f.c.a()) != null)) {
                this.f.c.c(this.a.o, new C3383dO1(this, 25, this.f));
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.LC
    public final void c(InterfaceC0660If0 interfaceC0660If0, Object obj, KC kc, XC xc, InterfaceC0660If0 interfaceC0660If02) {
        this.b.c(interfaceC0660If0, obj, kc, this.f.c.d(), interfaceC0660If0);
    }

    @Override // defpackage.MC
    public final void cancel() {
        C7111ss0 c7111ss0 = this.f;
        if (c7111ss0 != null) {
            c7111ss0.c.cancel();
        }
    }

    public final boolean d(Object obj) throws Throwable {
        int i = AbstractC6136nl0.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            TC tcH = this.a.c.a().h(obj);
            Object objM = tcH.m();
            InterfaceC2315bO interfaceC2315bOD = this.a.d(objM);
            C5772lr0 c5772lr0 = new C5772lr0(interfaceC2315bOD, objM, this.a.i, 9);
            InterfaceC0660If0 interfaceC0660If0 = this.f.a;
            ND nd = this.a;
            CC cc = new CC(interfaceC0660If0, nd.n);
            ZJ zjB = nd.h.b();
            zjB.d(cc, c5772lr0);
            if (Log.isLoggable("SourceGenerator", 2)) {
                cc.toString();
                obj.toString();
                interfaceC2315bOD.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (zjB.f(cc) != null) {
                this.g = cc;
                this.d = new BC(Collections.singletonList(this.f.a), this.a, this);
                this.f.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.g);
                obj.toString();
            }
            try {
                this.b.c(this.f.a, tcH.m(), this.f.c, this.f.c.d(), this.f.a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f.c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
