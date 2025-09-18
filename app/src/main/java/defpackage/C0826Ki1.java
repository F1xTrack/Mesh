package defpackage;

import android.os.Vibrator;

/* renamed from: Ki1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0826Ki1 implements InterfaceC0592Hi1 {
    public final long[] a;

    public C0826Ki1(long[] jArr) {
        this.a = jArr;
    }

    @Override // defpackage.InterfaceC0592Hi1
    public final void a(Vibrator vibrator) {
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(this.a, -1);
            }
        } catch (Exception unused) {
        }
    }
}
