package defpackage;

import java.net.SocketException;
import java.net.SocketTimeoutException;

/* renamed from: xL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7965xL0 implements InterfaceC6785r90 {
    public final /* synthetic */ C6649qR0 a;
    public final /* synthetic */ RunnableC8155yL0 b;

    public C7965xL0(RunnableC8155yL0 runnableC8155yL0, C6649qR0 c6649qR0) {
        this.b = runnableC8155yL0;
        this.a = c6649qR0;
    }

    @Override // defpackage.InterfaceC6785r90
    public final HS0 a(GN0 gn0) {
        RunnableC8155yL0 runnableC8155yL0 = this.b;
        HS0 hs0B = null;
        try {
            hs0B = gn0.b(this.a);
            int iX = AbstractC8235ym.x(runnableC8155yL0.m);
            IS0 is0 = hs0B.g;
            IS0 c5294jL0 = (iX == 0 || iX != 1) ? new C5294jL0(C7394uL0.b, runnableC8155yL0.b, is0, runnableC8155yL0.a.l.booleanValue()) : new C6249oL0(C7394uL0.b, runnableC8155yL0.b, hs0B.g, runnableC8155yL0.f, runnableC8155yL0.a.j.booleanValue());
            GS0 gs0O = hs0B.o();
            gs0O.g = c5294jL0;
            return gs0O.a();
        } catch (SocketException unused) {
            runnableC8155yL0.p = true;
            if (hs0B != null) {
                hs0B.close();
            }
            return gn0.b(gn0.e);
        } catch (SocketTimeoutException unused2) {
            runnableC8155yL0.p = true;
            if (hs0B != null) {
                hs0B.close();
            }
            return gn0.b(gn0.e);
        } catch (Exception unused3) {
            if (hs0B != null) {
                hs0B.close();
            }
            return gn0.b(gn0.e);
        }
    }
}
