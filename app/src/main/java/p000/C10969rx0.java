package p000;

import android.net.Uri;
import android.os.SystemClock;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* renamed from: rx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10969rx0 extends AbstractC11920zO1 {

    /* renamed from: a */
    public final C10585ox0 f42174a;

    /* renamed from: b */
    public final ExecutorService f42175b;

    /* renamed from: c */
    public final C1684al f42176c;

    public C10969rx0(C10585ox0 c10585ox0) {
        ExecutorService executorServiceM24421t = c10585ox0.f39371a.m24421t();
        this.f42174a = c10585ox0;
        this.f42175b = executorServiceM24421t;
        this.f42176c = new C1684al(false, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
    }

    /* renamed from: g */
    public static final void m24557g(C10969rx0 c10969rx0, InterfaceC6843sl interfaceC6843sl, Exception exc, ES1 es1) {
        c10969rx0.getClass();
        if (!((DN0) interfaceC6843sl).f1994o) {
            es1.m2285G(exc);
            return;
        }
        ((C8290Su0) es1.f2709c).getClass();
        AbstractC1666aT abstractC1666aT = (AbstractC1666aT) es1.f2708b;
        ((E90) abstractC1666aT.m9748a()).mo753k(abstractC1666aT.f15523b, "NetworkFetchProducer");
        abstractC1666aT.f15522a.m7717c();
    }

    @Override // p000.AbstractC11920zO1
    /* renamed from: a */
    public final AbstractC1666aT mo2920a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        O90.m5968f(abstractC1237Tf, "consumer");
        O90.m5968f(rd0, "context");
        return new C10841qx0(abstractC1237Tf, rd0);
    }

    @Override // p000.AbstractC11920zO1
    /* renamed from: d */
    public final Map mo2922d(AbstractC1666aT abstractC1666aT, int i) {
        C10841qx0 c10841qx0 = (C10841qx0) abstractC1666aT;
        O90.m5968f(c10841qx0, "fetchState");
        return AbstractC11077sn0.m24780h(new Pair("queue_time", String.valueOf(c10841qx0.f41265g - c10841qx0.f41264f)), new Pair("fetch_time", String.valueOf(c10841qx0.f41266h - c10841qx0.f41265g)), new Pair("total_time", String.valueOf(c10841qx0.f41266h - c10841qx0.f41264f)), new Pair("image_size", String.valueOf(i)));
    }

    @Override // p000.AbstractC11920zO1
    /* renamed from: e */
    public final void mo2923e(AbstractC1666aT abstractC1666aT) {
        C10841qx0 c10841qx0 = (C10841qx0) abstractC1666aT;
        O90.m5968f(c10841qx0, "fetchState");
        c10841qx0.f41266h = SystemClock.elapsedRealtime();
    }

    @Override // p000.AbstractC11920zO1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo2921c(C10841qx0 c10841qx0, ES1 es1) {
        O90.m5968f(c10841qx0, "fetchState");
        c10841qx0.f41264f = SystemClock.elapsedRealtime();
        RD0 rd0 = c10841qx0.f15523b;
        Uri uri = ((C7027vg) rd0).f44473a.f40609b;
        O90.m5967e(uri, "fetchState.uri");
        try {
            C6937uF c6937uF = new C6937uF(9, false);
            c6937uF.m25136G(uri.toString());
            c6937uF.m25130A("GET", null);
            C1684al c1684al = this.f42176c;
            if (c1684al != null) {
                c6937uF.m25142r(c1684al);
            }
            C0739Lk c0739Lk = ((C7027vg) rd0).f44473a.f40617j;
            if (c0739Lk != null) {
                F71 f71 = C0739Lk.f6823c;
                c6937uF.m25139k("Range", String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{S20.m7153i(c0739Lk.f6824a), S20.m7153i(c0739Lk.f6825b)}, 2)));
            }
            m24558i(c10841qx0, es1, c6937uF.m25141o());
        } catch (Exception e) {
            es1.m2285G(e);
        }
    }

    /* renamed from: i */
    public final void m24558i(C10841qx0 c10841qx0, ES1 es1, C10777qR0 c10777qR0) {
        O90.m5968f(c10841qx0, "fetchState");
        DN0 dn0M23580b = this.f42174a.m23580b(c10777qR0);
        ((C7027vg) c10841qx0.f15523b).m25462a(new E40(dn0M23580b, 2, this));
        FirebasePerfOkHttpClient.enqueue(dn0M23580b, new C10910rT1(c10841qx0, this, es1, 19));
    }
}
