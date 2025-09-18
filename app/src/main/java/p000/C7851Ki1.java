package p000;

import android.os.Vibrator;

/* renamed from: Ki1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7851Ki1 implements InterfaceC7695Hi1 {

    /* renamed from: a */
    public final long[] f6264a;

    public C7851Ki1(long[] jArr) {
        this.f6264a = jArr;
    }

    @Override // p000.InterfaceC7695Hi1
    /* renamed from: a */
    public final void mo3552a(Vibrator vibrator) {
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(this.f6264a, -1);
            }
        } catch (Exception unused) {
        }
    }
}
