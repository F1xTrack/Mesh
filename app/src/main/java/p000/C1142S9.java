package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: S9 */
/* loaded from: classes.dex */
public final class C1142S9 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f10599a = 0;

    /* renamed from: b */
    public InterfaceC1801bh f10600b;

    /* renamed from: c */
    public final Context f10601c;

    public C1142S9(S91 s91) {
        O90.m5968f(s91, "context");
        this.f10600b = C1680ah.f15613a;
        Context applicationContext = s91.getApplicationContext();
        O90.m5967e(applicationContext, "getApplicationContext(...)");
        this.f10601c = applicationContext;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f10599a) {
            case 0:
                if (intent != null && "android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.f10600b.mo914d();
                    break;
                }
                break;
            default:
                if (intent != null && O90.m5963a(intent.getAction(), "rnv_media_control")) {
                    int intExtra = intent.getIntExtra("rnv_control_type", 0);
                    C10891rK0 c10891rK0 = (C10891rK0) this.f10600b;
                    if (intExtra == 1) {
                        c10891rK0.setPausedModifier(false);
                        break;
                    } else if (intExtra == 2) {
                        c10891rK0.setPausedModifier(true);
                        break;
                    }
                }
                break;
        }
    }

    public C1142S9(S91 s91, C10891rK0 c10891rK0) {
        O90.m5968f(c10891rK0, "view");
        O90.m5968f(s91, "context");
        this.f10600b = c10891rK0;
        this.f10601c = s91;
    }
}
