package defpackage;

import com.android.billingclient.api.BillingClient;

/* renamed from: kh */
/* loaded from: classes2.dex */
public final class C5550kh extends AbstractRunnableC8024xf {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5550kh(int i, Object obj) {
        super(1);
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.AbstractRunnableC8024xf
    public final void a() {
        switch (this.b) {
            case 0:
                C5741lh c5741lh = (C5741lh) this.c;
                ((C2407bs1) ((C1155Oo1) c5741lh.e).d).e((C6045nH) c5741lh.d);
                break;
            case 1:
                C5741lh c5741lh2 = (C5741lh) this.c;
                ((C5932mh) c5741lh2.e).f.b((C5470kG0) c5741lh2.d);
                break;
            case 2:
                C5741lh c5741lh3 = (C5741lh) this.c;
                ((C2407bs1) ((C6045nH) c5741lh3.d).e).e((C1241Pr0) c5741lh3.e);
                break;
            case 3:
                C5741lh c5741lh4 = (C5741lh) this.c;
                ((C5470kG0) c5741lh4.e).g.b((C4078h21) c5741lh4.d);
                break;
            case 4:
                C5359jh c5359jh = (C5359jh) this.c;
                ((C2407bs1) ((C1241Pr0) c5359jh.d).f).e((C7375uF) c5359jh.c);
                break;
            case 5:
                ((BillingClient) ((C2216as1) this.c).c).endConnection();
                break;
            default:
                ((BillingClient) ((C2407bs1) this.c).b).endConnection();
                break;
        }
    }
}
