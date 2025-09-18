package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: Xg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1831Xg extends AbstractC3634ej {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1831Xg(Context context, C1857Xo1 c1857Xo1, int i) {
        super(context, c1857Xo1);
        this.g = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    @Override // defpackage.AbstractC2038Zx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c() {
        /*
            r7 = this;
            r0 = -1
            java.lang.String r1 = "status"
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r3 = 0
            r4 = 1
            r5 = 0
            int r6 = r7.g
            switch(r6) {
                case 0: goto L8a;
                case 1: goto L4d;
                default: goto Ld;
            }
        Ld:
            android.content.IntentFilter r0 = r7.l()
            java.lang.Object r1 = r7.b
            android.content.Context r1 = (android.content.Context) r1
            android.content.Intent r0 = r1.registerReceiver(r5, r0)
            if (r0 == 0) goto L40
            java.lang.String r1 = r0.getAction()
            if (r1 != 0) goto L22
            goto L40
        L22:
            java.lang.String r0 = r0.getAction()
            if (r0 == 0) goto L48
            int r1 = r0.hashCode()
            r2 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r1 == r2) goto L42
            r2 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r1 == r2) goto L37
            goto L48
        L37:
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L48
        L40:
            r3 = r4
            goto L48
        L42:
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r0 = r0.equals(r1)
        L48:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L4d:
            android.content.IntentFilter r6 = new android.content.IntentFilter
            r6.<init>(r2)
            java.lang.Object r2 = r7.b
            android.content.Context r2 = (android.content.Context) r2
            android.content.Intent r2 = r2.registerReceiver(r5, r6)
            if (r2 != 0) goto L68
            TE r0 = defpackage.TE.G()
            int r1 = defpackage.AbstractC1987Zg.a
            r0.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L89
        L68:
            int r1 = r2.getIntExtra(r1, r0)
            java.lang.String r5 = "level"
            int r5 = r2.getIntExtra(r5, r0)
            java.lang.String r6 = "scale"
            int r0 = r2.getIntExtra(r6, r0)
            float r2 = (float) r5
            float r0 = (float) r0
            float r2 = r2 / r0
            if (r1 == r4) goto L84
            r0 = 1041865114(0x3e19999a, float:0.15)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L85
        L84:
            r3 = r4
        L85:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
        L89:
            return r0
        L8a:
            android.content.IntentFilter r6 = new android.content.IntentFilter
            r6.<init>(r2)
            java.lang.Object r2 = r7.b
            android.content.Context r2 = (android.content.Context) r2
            android.content.Intent r2 = r2.registerReceiver(r5, r6)
            if (r2 != 0) goto La5
            TE r0 = defpackage.TE.G()
            int r1 = defpackage.AbstractC1909Yg.a
            r0.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto Lb4
        La5:
            int r0 = r2.getIntExtra(r1, r0)
            r1 = 2
            if (r0 == r1) goto Laf
            r1 = 5
            if (r0 != r1) goto Lb0
        Laf:
            r3 = r4
        Lb0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1831Xg.c():java.lang.Object");
    }

    @Override // defpackage.AbstractC3634ej
    public final IntentFilter l() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.AbstractC3634ej
    public final void m(Intent intent) {
        int i = this.g;
        O90.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        switch (i) {
            case 0:
                String action = intent.getAction();
                if (action != null) {
                    TE teG = TE.G();
                    int i2 = AbstractC1909Yg.a;
                    teG.getClass();
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                i(Boolean.FALSE);
                                break;
                            }
                            break;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                i(Boolean.FALSE);
                                break;
                            }
                            break;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                i(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                i(Boolean.TRUE);
                                break;
                            }
                            break;
                    }
                }
                break;
            case 1:
                if (intent.getAction() != null) {
                    TE teG2 = TE.G();
                    int i3 = AbstractC1987Zg.a;
                    intent.getAction();
                    teG2.getClass();
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int iHashCode = action2.hashCode();
                        if (iHashCode == -1980154005) {
                            if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                i(Boolean.TRUE);
                                break;
                            }
                        } else if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                            i(Boolean.FALSE);
                            break;
                        }
                    }
                }
                break;
            default:
                if (intent.getAction() != null) {
                    TE teG3 = TE.G();
                    int i4 = AbstractC2260b51.a;
                    intent.getAction();
                    teG3.getClass();
                    String action3 = intent.getAction();
                    if (action3 != null) {
                        int iHashCode2 = action3.hashCode();
                        if (iHashCode2 == -1181163412) {
                            if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                i(Boolean.FALSE);
                                break;
                            }
                        } else if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                            i(Boolean.TRUE);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
