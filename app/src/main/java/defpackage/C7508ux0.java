package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: ux0 */
/* loaded from: classes.dex */
public final class C7508ux0 implements KC, InterfaceC0131Bl {
    public final C6363ox0 a;
    public final E10 b;
    public C0170By c;
    public IS0 d;
    public JC e;
    public volatile DN0 f;

    public C7508ux0(C6363ox0 c6363ox0, E10 e10) {
        this.a = c6363ox0;
        this.b = e10;
    }

    @Override // defpackage.InterfaceC0131Bl
    public final void Z(InterfaceC7089sl interfaceC7089sl, HS0 hs0) {
        this.d = hs0.g;
        if (!hs0.n()) {
            this.e.e(new C6353ou(hs0.d, (IOException) null, hs0.c));
        } else {
            IS0 is0 = this.d;
            IL1.d(is0, "Argument must not be null");
            C0170By c0170By = new C0170By(this.d.m(), is0.o());
            this.c = c0170By;
            this.e.j(c0170By);
        }
    }

    @Override // defpackage.KC
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.KC
    public final void b() throws IOException {
        try {
            C0170By c0170By = this.c;
            if (c0170By != null) {
                c0170By.close();
            }
        } catch (IOException unused) {
        }
        IS0 is0 = this.d;
        if (is0 != null) {
            is0.close();
        }
        this.e = null;
    }

    @Override // defpackage.KC
    public final void c(EnumC7561vD0 enumC7561vD0, JC jc) {
        C7375uF c7375uF = new C7375uF(9, false);
        c7375uF.G(this.b.d());
        for (Map.Entry entry : this.b.b.a().entrySet()) {
            c7375uF.k((String) entry.getKey(), (String) entry.getValue());
        }
        C6649qR0 c6649qR0O = c7375uF.o();
        this.e = jc;
        this.f = this.a.b(c6649qR0O);
        FirebasePerfOkHttpClient.enqueue(this.f, this);
    }

    @Override // defpackage.KC
    public final void cancel() {
        DN0 dn0 = this.f;
        if (dn0 != null) {
            dn0.e();
        }
    }

    @Override // defpackage.KC
    public final XC d() {
        return XC.b;
    }

    @Override // defpackage.InterfaceC0131Bl
    public final void w0(InterfaceC7089sl interfaceC7089sl, IOException iOException) {
        this.e.e(iOException);
    }
}
