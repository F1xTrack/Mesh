package p000;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* loaded from: classes.dex */
public final class MO1 extends AbstractC1259U0 {

    /* renamed from: c */
    public final C8906bs0 f7143c;

    public MO1(C8906bs0 c8906bs0) {
        super(8);
        this.f7143c = c8906bs0;
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: f1 */
    public final Object mo198f1(Object obj) {
        C10218m32 c10218m32M25100c;
        C0357Ff c0357Ff = (C0357Ff) obj;
        C8906bs0 c8906bs0 = this.f7143c;
        Context contextM10533b = c8906bs0.m10533b();
        String str = true != IA1.m3779c() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
        synchronized (AbstractC11242u32.class) {
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
            c10218m32M25100c = AbstractC11242u32.m25100c(new C9706i32(1, str, true));
        }
        ZE1 ze1 = C8993cX1.f17589h;
        return new C10654pT1(c8906bs0, c0357Ff, (C0778MM.m5341a(contextM10533b, ModuleDescriptor.MODULE_ID) <= 0 && GoogleApiAvailabilityLight.getInstance().getApkVersion(contextM10533b) < 204500000) ? new C4198hk(contextM10533b, c0357Ff, c10218m32M25100c) : new C8993cX1(contextM10533b, c0357Ff, c10218m32M25100c), c10218m32M25100c);
    }
}
