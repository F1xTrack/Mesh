package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: Gw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555Gw0 implements InterfaceC7449ud1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC7067sd1 b;

    public /* synthetic */ C0555Gw0(AbstractC7067sd1 abstractC7067sd1, int i) {
        this.a = i;
        this.b = abstractC7067sd1;
    }

    @Override // defpackage.InterfaceC7449ud1
    public final AbstractC7067sd1 a(C3504e20 c3504e20, C8213ye1 c8213ye1) {
        switch (this.a) {
            case 0:
                if (c8213ye1.a == Number.class) {
                    break;
                }
                break;
            default:
                Class cls = c8213ye1.a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    break;
                }
                break;
        }
        return (C0711Iw0) this.b;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C0711Iw0) this.b) + "]";
            default:
                return super.toString();
        }
    }
}
