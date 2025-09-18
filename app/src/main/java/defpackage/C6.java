package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class C6 extends E6 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ H6 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6(H6 h6, C5772lr0 c5772lr0) {
        super(h6);
        this.d = h6;
        this.e = c5772lr0;
    }

    @Override // defpackage.E6
    public final IntentFilter d() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // defpackage.E6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6.e():int");
    }

    @Override // defpackage.E6
    public final void g() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        switch (this.c) {
            case 0:
                this.d.n(true, true);
                break;
            default:
                this.d.n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6(H6 h6, Context context) {
        super(h6);
        this.d = h6;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
