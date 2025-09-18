package p000;

import com.android.billingclient.api.BillingClient;

/* renamed from: kh */
/* loaded from: classes2.dex */
public final class C6316kh extends AbstractRunnableC7152xf {

    /* renamed from: b */
    public final /* synthetic */ int f36607b;

    /* renamed from: c */
    public final /* synthetic */ Object f36608c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6316kh(int i, Object obj) {
        super(1);
        this.f36607b = i;
        this.f36608c = obj;
    }

    @Override // p000.AbstractRunnableC7152xf
    /* renamed from: a */
    public final void mo18884a() {
        switch (this.f36607b) {
            case 0:
                C6379lh c6379lh = (C6379lh) this.f36608c;
                ((C8907bs1) ((C8071Oo1) c6379lh.f37249e).f8630d).m10537e((C6479nH) c6379lh.f37248d);
                break;
            case 1:
                C6379lh c6379lh2 = (C6379lh) this.f36608c;
                ((C6442mh) c6379lh2.f37249e).f37833f.m10355b((C9987kG0) c6379lh2.f37248d);
                break;
            case 2:
                C6379lh c6379lh3 = (C6379lh) this.f36608c;
                ((C8907bs1) ((C6479nH) c6379lh3.f37248d).f38231e).m10537e((C8128Pr0) c6379lh3.f37249e);
                break;
            case 3:
                C6379lh c6379lh4 = (C6379lh) this.f36608c;
                ((C9987kG0) c6379lh4.f37249e).f36412g.m10355b((C9574h21) c6379lh4.f37248d);
                break;
            case 4:
                C6253jh c6253jh = (C6253jh) this.f36608c;
                ((C8907bs1) ((C8128Pr0) c6253jh.f35323d).f9308f).m10537e((C6937uF) c6253jh.f35322c);
                break;
            case 5:
                ((BillingClient) ((C8779as1) this.f36608c).f16641c).endConnection();
                break;
            default:
                ((BillingClient) ((C8907bs1) this.f36608c).f17203b).endConnection();
                break;
        }
    }
}
