package defpackage;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: Ji1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0748Ji1 implements InterfaceC0592Hi1 {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ C0748Ji1(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.InterfaceC0592Hi1
    public final void a(Vibrator vibrator) {
        switch (this.a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        if (vibrator.hasVibrator()) {
                            vibrator.vibrate(VibrationEffect.createPredefined(this.b));
                            break;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                try {
                    if (vibrator.hasVibrator()) {
                        vibrator.vibrate(this.b);
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
