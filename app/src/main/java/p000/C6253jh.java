package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.yandex.metrica.impl.p022ob.C3505p;
import com.yandex.metrica.impl.p022ob.InterfaceC3531q;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* renamed from: jh */
/* loaded from: classes2.dex */
public final class C6253jh extends AbstractRunnableC7152xf {

    /* renamed from: b */
    public final /* synthetic */ int f35321b;

    /* renamed from: c */
    public final /* synthetic */ Object f35322c;

    /* renamed from: d */
    public final /* synthetic */ Object f35323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6253jh(Object obj, int i, Object obj2) {
        super(1);
        this.f35321b = i;
        this.f35323d = obj;
        this.f35322c = obj2;
    }

    @Override // p000.AbstractRunnableC7152xf
    /* renamed from: a */
    public final void mo18884a() {
        switch (this.f35321b) {
            case 0:
                C8071Oo1 c8071Oo1 = (C8071Oo1) this.f35323d;
                c8071Oo1.getClass();
                if (((BillingResult) this.f35322c).getResponseCode() == 0) {
                    for (String str : AbstractC7230yu.m26275f("inapp", "subs")) {
                        C3505p c3505p = (C3505p) c8071Oo1.f8627a;
                        BillingClient billingClient = (BillingClient) c8071Oo1.f8628b;
                        InterfaceC3531q interfaceC3531q = (InterfaceC3531q) c8071Oo1.f8629c;
                        C8907bs1 c8907bs1 = (C8907bs1) c8071Oo1.f8630d;
                        O90.m5968f(c3505p, "config");
                        O90.m5968f(billingClient, "billingClient");
                        O90.m5968f(interfaceC3531q, "utilsProvider");
                        O90.m5968f(str, "type");
                        O90.m5968f(c8907bs1, "billingLibraryConnectionHolder");
                        C6479nH c6479nH = new C6479nH();
                        c6479nH.f38227a = c3505p;
                        c6479nH.f38228b = billingClient;
                        c6479nH.f38229c = interfaceC3531q;
                        c6479nH.f38230d = str;
                        c6479nH.f38231e = c8907bs1;
                        ((LinkedHashSet) ((C8907bs1) c8071Oo1.f8630d).f17202a).add(c6479nH);
                        ((InterfaceC3531q) c8071Oo1.f8629c).mo3443c().execute(new C6379lh(str, c6479nH, c8071Oo1, 0));
                    }
                    break;
                }
                break;
            case 1:
                C6442mh c6442mh = (C6442mh) this.f35323d;
                c6442mh.getClass();
                if (((BillingResult) this.f35322c).getResponseCode() == 0) {
                    for (String str2 : Arrays.asList("inapp", "subs")) {
                        C7355Au1 c7355Au1 = new C7355Au1();
                        C8779as1 c8779as1 = c6442mh.f37833f;
                        C9987kG0 c9987kG0 = new C9987kG0(c6442mh.f37828a, c6442mh.f37829b, c6442mh.f37830c, c6442mh.f37831d, c6442mh.f37832e, str2, c8779as1, c7355Au1);
                        ((HashSet) c8779as1.f16642d).add(c9987kG0);
                        c6442mh.f37830c.execute(new C6379lh(c6442mh, str2, c9987kG0, 1, false));
                    }
                    break;
                }
                break;
            case 2:
                C8128Pr0 c8128Pr0 = (C8128Pr0) this.f35323d;
                if (((BillingClient) c8128Pr0.f9304b).isReady()) {
                    ((BillingClient) c8128Pr0.f9304b).queryPurchasesAsync((String) c8128Pr0.f9303a, (C6937uF) this.f35322c);
                    break;
                } else {
                    ((InterfaceC3531q) c8128Pr0.f9305c).mo3440a().execute(new C6316kh(4, this));
                    break;
                }
            default:
                C0487Hj c0487Hj = (C0487Hj) this.f35323d;
                BillingClient billingClientBuild = BillingClient.newBuilder((Context) c0487Hj.f4446c).setListener(new C7512Dv0(19)).enablePendingPurchases().build();
                O90.m5967e(billingClientBuild, "BillingClient\n          …                 .build()");
                C3505p c3505p2 = (C3505p) this.f35322c;
                O90.m5968f(c3505p2, "config");
                O90.m5968f(c0487Hj, "utilsProvider");
                Handler handler = new Handler(Looper.getMainLooper());
                C8907bs1 c8907bs12 = new C8907bs1();
                c8907bs12.f17203b = billingClientBuild;
                c8907bs12.f17204c = handler;
                c8907bs12.f17202a = new LinkedHashSet();
                C8071Oo1 c8071Oo12 = new C8071Oo1();
                c8071Oo12.f8627a = c3505p2;
                c8071Oo12.f8628b = billingClientBuild;
                c8071Oo12.f8629c = c0487Hj;
                c8071Oo12.f8630d = c8907bs12;
                billingClientBuild.startConnection(c8071Oo12);
                break;
        }
    }
}
