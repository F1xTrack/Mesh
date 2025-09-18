package defpackage;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* loaded from: classes.dex */
public final class MO1 extends U0 {
    public final C2406bs0 c;

    public MO1(C2406bs0 c2406bs0) {
        super(8);
        this.c = c2406bs0;
    }

    @Override // defpackage.U0
    public final Object f1(Object obj) {
        C5814m32 c5814m32C;
        C0425Ff c0425Ff = (C0425Ff) obj;
        C2406bs0 c2406bs0 = this.c;
        Context contextB = c2406bs0.b();
        String str = true != IA1.c() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
        synchronized (AbstractC7341u32.class) {
            byte b = (byte) (((byte) 1) | 2);
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                if ((1 & b) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            c5814m32C = AbstractC7341u32.c(new C4274i32(1, str, true));
        }
        ZE1 ze1 = C2534cX1.h;
        return new C6465pT1(c2406bs0, c0425Ff, (MM.a(contextB, ModuleDescriptor.MODULE_ID) <= 0 && GoogleApiAvailabilityLight.getInstance().getApkVersion(contextB) < 204500000) ? new C4210hk(contextB, c0425Ff, c5814m32C) : new C2534cX1(contextB, c0425Ff, c5814m32C), c5814m32C);
    }
}
