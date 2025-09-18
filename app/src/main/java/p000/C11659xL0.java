package p000;

import java.net.SocketException;
import java.net.SocketTimeoutException;

/* renamed from: xL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11659xL0 implements InterfaceC10869r90 {

    /* renamed from: a */
    public final /* synthetic */ C10777qR0 f45552a;

    /* renamed from: b */
    public final /* synthetic */ RunnableC11786yL0 f45553b;

    public C11659xL0(RunnableC11786yL0 runnableC11786yL0, C10777qR0 c10777qR0) {
        this.f45553b = runnableC11786yL0;
        this.f45552a = c10777qR0;
    }

    @Override // p000.InterfaceC10869r90
    /* renamed from: a */
    public final HS0 mo18634a(GN0 gn0) {
        RunnableC11786yL0 runnableC11786yL0 = this.f45553b;
        HS0 hs0M3055b = null;
        try {
            hs0M3055b = gn0.m3055b(this.f45552a);
            int iM26247x = AbstractC7222ym.m26247x(runnableC11786yL0.f46210m);
            IS0 is0 = hs0M3055b.f4301g;
            IS0 c9869jL0 = (iM26247x == 0 || iM26247x != 1) ? new C9869jL0(C11277uL0.f43672b, runnableC11786yL0.f46199b, is0, runnableC11786yL0.f46198a.f28391l.booleanValue()) : new C10509oL0(C11277uL0.f43672b, runnableC11786yL0.f46199b, hs0M3055b.f4301g, runnableC11786yL0.f46203f, runnableC11786yL0.f46198a.f28389j.booleanValue());
            GS0 gs0M3429o = hs0M3055b.m3429o();
            gs0M3429o.f3747g = c9869jL0;
            return gs0M3429o.m3066a();
        } catch (SocketException unused) {
            runnableC11786yL0.f46213p = true;
            if (hs0M3055b != null) {
                hs0M3055b.close();
            }
            return gn0.m3055b(gn0.f3715e);
        } catch (SocketTimeoutException unused2) {
            runnableC11786yL0.f46213p = true;
            if (hs0M3055b != null) {
                hs0M3055b.close();
            }
            return gn0.m3055b(gn0.f3715e);
        } catch (Exception unused3) {
            if (hs0M3055b != null) {
                hs0M3055b.close();
            }
            return gn0.m3055b(gn0.f3715e);
        }
    }
}
