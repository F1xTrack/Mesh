package p000;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pT1 */
/* loaded from: classes.dex */
public final class C10654pT1 extends AbstractC7598Fm0 {

    /* renamed from: k */
    public static final C11885z70 f40103k = C11885z70.f46640a;

    /* renamed from: l */
    public static boolean f40104l = true;

    /* renamed from: e */
    public final C0357Ff f40105e;

    /* renamed from: f */
    public final LU1 f40106f;

    /* renamed from: g */
    public final C10218m32 f40107g;

    /* renamed from: h */
    public final C10346n32 f40108h;

    /* renamed from: i */
    public final C3945di f40109i = new C3945di();

    /* renamed from: j */
    public boolean f40110j;

    public C10654pT1(C8906bs0 c8906bs0, C0357Ff c0357Ff, LU1 lu1, C10218m32 c10218m32) {
        Preconditions.checkNotNull(c8906bs0, "MlKitContext can not be null");
        Preconditions.checkNotNull(c0357Ff, "BarcodeScannerOptions can not be null");
        this.f40105e = c0357Ff;
        this.f40106f = lu1;
        this.f40107g = c10218m32;
        this.f40108h = new C10346n32(c8906bs0.m10533b());
    }

    /* renamed from: g */
    public final List m23800g(E80 e80) {
        ArrayList arrayListMo5008a;
        synchronized (this) {
            C3945di c3945di = this.f40109i;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c3945di.m17729a(e80);
            try {
                arrayListMo5008a = this.f40106f.mo5008a(e80);
                m23801h(EnumC10465o02.NO_ERROR, jElapsedRealtime, e80, arrayListMo5008a);
                f40104l = false;
            } catch (C9039cs0 e) {
                m23801h(e.f25689a == 14 ? EnumC10465o02.MODEL_NOT_DOWNLOADED : EnumC10465o02.UNKNOWN_ERROR, jElapsedRealtime, e80, null);
                throw e;
            }
        }
        return arrayListMo5008a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23801h(p000.EnumC10465o02 r27, long r28, p000.E80 r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10654pT1.m23801h(o02, long, E80, java.util.List):void");
    }
}
