package p000;

/* renamed from: tL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11150tL1 implements OE1 {

    /* renamed from: b */
    public static final C11150tL1 f43023b = new C11150tL1(0);

    /* renamed from: c */
    public static final C11150tL1 f43024c = new C11150tL1(1);

    /* renamed from: d */
    public static final C11150tL1 f43025d = new C11150tL1(2);

    /* renamed from: e */
    public static final C11150tL1 f43026e = new C11150tL1(3);

    /* renamed from: f */
    public static final C11150tL1 f43027f = new C11150tL1(4);

    /* renamed from: g */
    public static final C11150tL1 f43028g = new C11150tL1(5);

    /* renamed from: a */
    public final /* synthetic */ int f43029a;

    public /* synthetic */ C11150tL1(int i) {
        this.f43029a = i;
    }

    @Override // p000.OE1
    /* renamed from: a */
    public final boolean mo5999a(int i) {
        switch (this.f43029a) {
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
                if (AbstractC11367v22.m25310b(i) != 0) {
                }
                break;
            case 2:
                if ((i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : EnumC10768qM1.ALTERNATIVE_BILLING_ACTION : EnumC10768qM1.LOCAL_PURCHASES_UPDATED_ACTION : EnumC10768qM1.PURCHASES_UPDATED_ACTION : EnumC10768qM1.BROADCAST_ACTION_UNSPECIFIED) != null) {
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
