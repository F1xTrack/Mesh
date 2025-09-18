package p000;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: Gw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7670Gw0 implements InterfaceC11314ud1 {

    /* renamed from: a */
    public final /* synthetic */ int f3967a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC11058sd1 f3968b;

    public /* synthetic */ C7670Gw0(AbstractC11058sd1 abstractC11058sd1, int i) {
        this.f3967a = i;
        this.f3968b = abstractC11058sd1;
    }

    @Override // p000.InterfaceC11314ud1
    /* renamed from: a */
    public final AbstractC11058sd1 mo2052a(C9189e20 c9189e20, C11825ye1 c11825ye1) {
        switch (this.f3967a) {
            case 0:
                if (c11825ye1.f46373a == Number.class) {
                    break;
                }
                break;
            default:
                Class cls = c11825ye1.f46373a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    break;
                }
                break;
        }
        return (C7774Iw0) this.f3968b;
    }

    public String toString() {
        switch (this.f3967a) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C7774Iw0) this.f3968b) + "]";
            default:
                return super.toString();
        }
    }
}
