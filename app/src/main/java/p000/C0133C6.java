package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.PowerManager;

/* renamed from: C6 */
/* loaded from: classes.dex */
public final class C0133C6 extends AbstractC0259E6 {

    /* renamed from: c */
    public final /* synthetic */ int f1191c = 0;

    /* renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C0448H6 f1192d;

    /* renamed from: e */
    public final Object f1193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0133C6(LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6, C10189lr0 c10189lr0) {
        super(layoutInflaterFactory2C0448H6);
        this.f1192d = layoutInflaterFactory2C0448H6;
        this.f1193e = c10189lr0;
    }

    @Override // p000.AbstractC0259E6
    /* renamed from: d */
    public final IntentFilter mo981d() {
        switch (this.f1191c) {
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
    @Override // p000.AbstractC0259E6
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo982e() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0133C6.mo982e():int");
    }

    @Override // p000.AbstractC0259E6
    /* renamed from: g */
    public final void mo983g() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        switch (this.f1191c) {
            case 0:
                this.f1192d.m3287n(true, true);
                break;
            default:
                this.f1192d.m3287n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0133C6(LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6, Context context) {
        super(layoutInflaterFactory2C0448H6);
        this.f1192d = layoutInflaterFactory2C0448H6;
        this.f1193e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
