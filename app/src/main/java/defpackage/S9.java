package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class S9 extends BroadcastReceiver {
    public final /* synthetic */ int a = 0;
    public InterfaceC2372bh b;
    public final Context c;

    public S9(S91 s91) {
        O90.f(s91, "context");
        this.b = C2181ah.a;
        Context applicationContext = s91.getApplicationContext();
        O90.e(applicationContext, "getApplicationContext(...)");
        this.c = applicationContext;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                if (intent != null && "android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.b.d();
                    break;
                }
                break;
            default:
                if (intent != null && O90.a(intent.getAction(), "rnv_media_control")) {
                    int intExtra = intent.getIntExtra("rnv_control_type", 0);
                    C6818rK0 c6818rK0 = (C6818rK0) this.b;
                    if (intExtra == 1) {
                        c6818rK0.setPausedModifier(false);
                        break;
                    } else if (intExtra == 2) {
                        c6818rK0.setPausedModifier(true);
                        break;
                    }
                }
                break;
        }
    }

    public S9(S91 s91, C6818rK0 c6818rK0) {
        O90.f(c6818rK0, "view");
        O90.f(s91, "context");
        this.b = c6818rK0;
        this.c = s91;
    }
}
