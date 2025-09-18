package defpackage;

import com.google.firebase.perf.session.gauges.GaugeManager;

/* renamed from: h00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4069h00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ GaugeManager b;
    public final /* synthetic */ String c;
    public final /* synthetic */ EnumC3333d8 d;

    public /* synthetic */ RunnableC4069h00(GaugeManager gaugeManager, String str, EnumC3333d8 enumC3333d8, int i) {
        this.a = i;
        this.b = gaugeManager;
        this.c = str;
        this.d = enumC3333d8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$stopCollectingGauges$3(this.c, this.d);
                break;
            default:
                this.b.lambda$startCollectingGauges$2(this.c, this.d);
                break;
        }
    }
}
