package defpackage;

/* renamed from: tL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7204tL1 implements OE1 {
    public static final C7204tL1 b = new C7204tL1(0);
    public static final C7204tL1 c = new C7204tL1(1);
    public static final C7204tL1 d = new C7204tL1(2);
    public static final C7204tL1 e = new C7204tL1(3);
    public static final C7204tL1 f = new C7204tL1(4);
    public static final C7204tL1 g = new C7204tL1(5);
    public final /* synthetic */ int a;

    public /* synthetic */ C7204tL1(int i) {
        this.a = i;
    }

    @Override // defpackage.OE1
    public final boolean a(int i) {
        switch (this.a) {
            case 0:
                switch (i) {
                    default:
                        switch (i) {
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                }
            case 1:
                if (AbstractC7528v22.b(i) != 0) {
                }
                break;
            case 2:
                if ((i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : EnumC6635qM1.ALTERNATIVE_BILLING_ACTION : EnumC6635qM1.LOCAL_PURCHASES_UPDATED_ACTION : EnumC6635qM1.PURCHASES_UPDATED_ACTION : EnumC6635qM1.BROADCAST_ACTION_UNSPECIFIED) != null) {
                }
                break;
            case 3:
                if (i == 0 || i == 1 || i == 2 || i == 3) {
                }
                break;
            case 4:
                if (i != 17) {
                    switch (i) {
                    }
                }
                break;
            default:
                if (i == 0 || i == 1) {
                }
                break;
        }
        return true;
    }
}
