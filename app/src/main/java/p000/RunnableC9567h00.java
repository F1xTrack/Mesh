package p000;

import com.google.firebase.perf.session.gauges.GaugeManager;

/* renamed from: h00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9567h00 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f28144a;

    /* renamed from: b */
    public final /* synthetic */ GaugeManager f28145b;

    /* renamed from: c */
    public final /* synthetic */ String f28146c;

    /* renamed from: d */
    public final /* synthetic */ EnumC3909d8 f28147d;

    public /* synthetic */ RunnableC9567h00(GaugeManager gaugeManager, String str, EnumC3909d8 enumC3909d8, int i) {
        this.f28144a = i;
        this.f28145b = gaugeManager;
        this.f28146c = str;
        this.f28147d = enumC3909d8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28144a) {
            case 0:
                this.f28145b.lambda$stopCollectingGauges$3(this.f28146c, this.f28147d);
                break;
            default:
                this.f28145b.lambda$startCollectingGauges$2(this.f28146c, this.f28147d);
                break;
        }
    }
}
