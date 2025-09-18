package p000;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: ux0 */
/* loaded from: classes.dex */
public final class C11353ux0 implements InterfaceC0643KC, InterfaceC0111Bl {

    /* renamed from: a */
    public final C10585ox0 f44044a;

    /* renamed from: b */
    public final E10 f44045b;

    /* renamed from: c */
    public C0124By f44046c;

    /* renamed from: d */
    public IS0 f44047d;

    /* renamed from: e */
    public InterfaceC0580JC f44048e;

    /* renamed from: f */
    public volatile DN0 f44049f;

    public C11353ux0(C10585ox0 c10585ox0, E10 e10) {
        this.f44044a = c10585ox0;
        this.f44045b = e10;
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: Z */
    public final void mo851Z(InterfaceC6843sl interfaceC6843sl, HS0 hs0) {
        this.f44047d = hs0.f4301g;
        if (!hs0.m3428n()) {
            this.f44048e.mo556e(new C6583ou(hs0.f4298d, (IOException) null, hs0.f4297c));
        } else {
            IS0 is0 = this.f44047d;
            IL1.m3830d(is0, "Argument must not be null");
            C0124By c0124By = new C0124By(this.f44047d.m3876m(), is0.mo3383o());
            this.f44046c = c0124By;
            this.f44048e.mo557j(c0124By);
        }
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: a */
    public final Class mo3254a() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: b */
    public final void mo3255b() throws IOException {
        try {
            C0124By c0124By = this.f44046c;
            if (c0124By != null) {
                c0124By.close();
            }
        } catch (IOException unused) {
        }
        IS0 is0 = this.f44047d;
        if (is0 != null) {
            is0.close();
        }
        this.f44048e = null;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: c */
    public final void mo3256c(EnumC11389vD0 enumC11389vD0, InterfaceC0580JC interfaceC0580JC) {
        C6937uF c6937uF = new C6937uF(9, false);
        c6937uF.m25136G(this.f44045b.m1982d());
        for (Map.Entry entry : this.f44045b.f2342b.mo4869a().entrySet()) {
            c6937uF.m25139k((String) entry.getKey(), (String) entry.getValue());
        }
        C10777qR0 c10777qR0M25141o = c6937uF.m25141o();
        this.f44048e = interfaceC0580JC;
        this.f44049f = this.f44044a.m23580b(c10777qR0M25141o);
        FirebasePerfOkHttpClient.enqueue(this.f44049f, this);
    }

    @Override // p000.InterfaceC0643KC
    public final void cancel() {
        DN0 dn0 = this.f44049f;
        if (dn0 != null) {
            dn0.m1668e();
        }
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: d */
    public final EnumC1460XC mo3257d() {
        return EnumC1460XC.f13615b;
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: w0 */
    public final void mo852w0(InterfaceC6843sl interfaceC6843sl, IOException iOException) {
        this.f44048e.mo556e(iOException);
    }
}
