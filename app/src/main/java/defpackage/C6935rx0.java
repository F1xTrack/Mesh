package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* renamed from: rx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6935rx0 extends AbstractC8355zO1 {
    public final C6363ox0 a;
    public final ExecutorService b;
    public final C2193al c;

    public C6935rx0(C6363ox0 c6363ox0) {
        ExecutorService executorServiceT = c6363ox0.a.t();
        this.a = c6363ox0;
        this.b = executorServiceT;
        this.c = new C2193al(false, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
    }

    public static final void g(C6935rx0 c6935rx0, InterfaceC7089sl interfaceC7089sl, Exception exc, ES1 es1) {
        c6935rx0.getClass();
        if (!((DN0) interfaceC7089sl).o) {
            es1.G(exc);
            return;
        }
        ((C1484Su0) es1.c).getClass();
        AbstractC2139aT abstractC2139aT = (AbstractC2139aT) es1.b;
        ((E90) abstractC2139aT.a()).k(abstractC2139aT.b, "NetworkFetchProducer");
        abstractC2139aT.a.c();
    }

    @Override // defpackage.AbstractC8355zO1
    public final AbstractC2139aT a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        O90.f(abstractC1516Tf, "consumer");
        O90.f(rd0, "context");
        return new C6745qx0(abstractC1516Tf, rd0);
    }

    @Override // defpackage.AbstractC8355zO1
    public final Map d(AbstractC2139aT abstractC2139aT, int i) {
        C6745qx0 c6745qx0 = (C6745qx0) abstractC2139aT;
        O90.f(c6745qx0, "fetchState");
        return AbstractC7096sn0.h(new Pair("queue_time", String.valueOf(c6745qx0.g - c6745qx0.f)), new Pair("fetch_time", String.valueOf(c6745qx0.h - c6745qx0.g)), new Pair("total_time", String.valueOf(c6745qx0.h - c6745qx0.f)), new Pair("image_size", String.valueOf(i)));
    }

    @Override // defpackage.AbstractC8355zO1
    public final void e(AbstractC2139aT abstractC2139aT) {
        C6745qx0 c6745qx0 = (C6745qx0) abstractC2139aT;
        O90.f(c6745qx0, "fetchState");
        c6745qx0.h = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.AbstractC8355zO1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(C6745qx0 c6745qx0, ES1 es1) {
        O90.f(c6745qx0, "fetchState");
        c6745qx0.f = SystemClock.elapsedRealtime();
        RD0 rd0 = c6745qx0.b;
        Uri uri = ((C7647vg) rd0).a.b;
        O90.e(uri, "fetchState.uri");
        try {
            C7375uF c7375uF = new C7375uF(9, false);
            c7375uF.G(uri.toString());
            c7375uF.A("GET", null);
            C2193al c2193al = this.c;
            if (c2193al != null) {
                c7375uF.r(c2193al);
            }
            C0908Lk c0908Lk = ((C7647vg) rd0).a.j;
            if (c0908Lk != null) {
                F71 f71 = C0908Lk.c;
                c7375uF.k("Range", String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{S20.i(c0908Lk.a), S20.i(c0908Lk.b)}, 2)));
            }
            i(c6745qx0, es1, c7375uF.o());
        } catch (Exception e) {
            es1.G(e);
        }
    }

    public final void i(C6745qx0 c6745qx0, ES1 es1, C6649qR0 c6649qR0) {
        O90.f(c6745qx0, "fetchState");
        DN0 dn0B = this.a.b(c6649qR0);
        ((C7647vg) c6745qx0.b).a(new E40(dn0B, 2, this));
        FirebasePerfOkHttpClient.enqueue(dn0B, new C6846rT1(c6745qx0, this, es1, 19));
    }
}
