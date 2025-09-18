package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.yandex.metrica.impl.ob.C2988p;
import com.yandex.metrica.impl.ob.InterfaceC3013q;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* renamed from: jh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5359jh extends AbstractRunnableC8024xf {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5359jh(Object obj, int i, Object obj2) {
        super(1);
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // defpackage.AbstractRunnableC8024xf
    public final void a() {
        switch (this.b) {
            case 0:
                C1155Oo1 c1155Oo1 = (C1155Oo1) this.d;
                c1155Oo1.getClass();
                if (((BillingResult) this.c).getResponseCode() == 0) {
                    for (String str : AbstractC8259yu.f("inapp", "subs")) {
                        C2988p c2988p = (C2988p) c1155Oo1.a;
                        BillingClient billingClient = (BillingClient) c1155Oo1.b;
                        InterfaceC3013q interfaceC3013q = (InterfaceC3013q) c1155Oo1.c;
                        C2407bs1 c2407bs1 = (C2407bs1) c1155Oo1.d;
                        O90.f(c2988p, "config");
                        O90.f(billingClient, "billingClient");
                        O90.f(interfaceC3013q, "utilsProvider");
                        O90.f(str, "type");
                        O90.f(c2407bs1, "billingLibraryConnectionHolder");
                        C6045nH c6045nH = new C6045nH();
                        c6045nH.a = c2988p;
                        c6045nH.b = billingClient;
                        c6045nH.c = interfaceC3013q;
                        c6045nH.d = str;
                        c6045nH.e = c2407bs1;
                        ((LinkedHashSet) ((C2407bs1) c1155Oo1.d).a).add(c6045nH);
                        ((InterfaceC3013q) c1155Oo1.c).c().execute(new C5741lh(str, c6045nH, c1155Oo1, 0));
                    }
                    break;
                }
                break;
            case 1:
                C5932mh c5932mh = (C5932mh) this.d;
                c5932mh.getClass();
                if (((BillingResult) this.c).getResponseCode() == 0) {
                    for (String str2 : Arrays.asList("inapp", "subs")) {
                        C0082Au1 c0082Au1 = new C0082Au1();
                        C2216as1 c2216as1 = c5932mh.f;
                        C5470kG0 c5470kG0 = new C5470kG0(c5932mh.a, c5932mh.b, c5932mh.c, c5932mh.d, c5932mh.e, str2, c2216as1, c0082Au1);
                        ((HashSet) c2216as1.d).add(c5470kG0);
                        c5932mh.c.execute(new C5741lh(c5932mh, str2, c5470kG0, 1, false));
                    }
                    break;
                }
                break;
            case 2:
                C1241Pr0 c1241Pr0 = (C1241Pr0) this.d;
                if (((BillingClient) c1241Pr0.b).isReady()) {
                    ((BillingClient) c1241Pr0.b).queryPurchasesAsync((String) c1241Pr0.a, (C7375uF) this.c);
                    break;
                } else {
                    ((InterfaceC3013q) c1241Pr0.c).a().execute(new C5550kh(4, this));
                    break;
                }
            default:
                C0593Hj c0593Hj = (C0593Hj) this.d;
                BillingClient billingClientBuild = BillingClient.newBuilder((Context) c0593Hj.c).setListener(new C0318Dv0(19)).enablePendingPurchases().build();
                O90.e(billingClientBuild, "BillingClient\n          …                 .build()");
                C2988p c2988p2 = (C2988p) this.c;
                O90.f(c2988p2, "config");
                O90.f(c0593Hj, "utilsProvider");
                Handler handler = new Handler(Looper.getMainLooper());
                C2407bs1 c2407bs12 = new C2407bs1();
                c2407bs12.b = billingClientBuild;
                c2407bs12.c = handler;
                c2407bs12.a = new LinkedHashSet();
                C1155Oo1 c1155Oo12 = new C1155Oo1();
                c1155Oo12.a = c2988p2;
                c1155Oo12.b = billingClientBuild;
                c1155Oo12.c = c0593Hj;
                c1155Oo12.d = c2407bs12;
                billingClientBuild.startConnection(c1155Oo12);
                break;
        }
    }
}
