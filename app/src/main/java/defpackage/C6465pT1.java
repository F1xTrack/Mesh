package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pT1 */
/* loaded from: classes.dex */
public final class C6465pT1 extends AbstractC0447Fm0 {
    public static final C8303z70 k = C8303z70.a;
    public static boolean l = true;
    public final C0425Ff e;
    public final LU1 f;
    public final C5814m32 g;
    public final C6005n32 h;
    public final C3441di i = new C3441di();
    public boolean j;

    public C6465pT1(C2406bs0 c2406bs0, C0425Ff c0425Ff, LU1 lu1, C5814m32 c5814m32) {
        Preconditions.checkNotNull(c2406bs0, "MlKitContext can not be null");
        Preconditions.checkNotNull(c0425Ff, "BarcodeScannerOptions can not be null");
        this.e = c0425Ff;
        this.f = lu1;
        this.g = c5814m32;
        this.h = new C6005n32(c2406bs0.b());
    }

    public final List g(E80 e80) {
        ArrayList arrayListA;
        synchronized (this) {
            C3441di c3441di = this.i;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c3441di.a(e80);
            try {
                arrayListA = this.f.a(e80);
                h(EnumC6184o02.NO_ERROR, jElapsedRealtime, e80, arrayListA);
                l = false;
            } catch (C3281cs0 e) {
                h(e.a == 14 ? EnumC6184o02.MODEL_NOT_DOWNLOADED : EnumC6184o02.UNKNOWN_ERROR, jElapsedRealtime, e80, null);
                throw e;
            }
        }
        return arrayListA;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.EnumC6184o02 r27, long r28, defpackage.E80 r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6465pT1.h(o02, long, E80, java.util.List):void");
    }
}
