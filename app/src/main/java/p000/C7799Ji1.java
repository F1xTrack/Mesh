package p000;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: Ji1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7799Ji1 implements InterfaceC7695Hi1 {

    /* renamed from: a */
    public final /* synthetic */ int f5676a;

    /* renamed from: b */
    public final int f5677b;

    public /* synthetic */ C7799Ji1(int i, int i2) {
        this.f5676a = i2;
        this.f5677b = i;
    }

    @Override // p000.InterfaceC7695Hi1
    /* renamed from: a */
    public final void mo3552a(Vibrator vibrator) {
        switch (this.f5676a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        if (vibrator.hasVibrator()) {
                            vibrator.vibrate(VibrationEffect.createPredefined(this.f5677b));
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
                        vibrator.vibrate(this.f5677b);
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
