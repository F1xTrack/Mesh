package p000;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: Fw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7618Fw0 implements InterfaceC11186td1 {

    /* renamed from: a */
    public final /* synthetic */ int f3487a;

    /* renamed from: b */
    public final /* synthetic */ Object f3488b;

    public /* synthetic */ C7618Fw0(int i, Object obj) {
        this.f3487a = i;
        this.f3488b = obj;
    }

    @Override // p000.InterfaceC11186td1
    /* renamed from: a */
    public final AbstractC10930rd1 mo1562a(C1753aw c1753aw, C11698xe1 c11698xe1) {
        switch (this.f3487a) {
            case 0:
                if (c11698xe1.f45725a == Number.class) {
                    return (C7722Hw0) this.f3488b;
                }
                return null;
            case 1:
                if (c11698xe1.f45725a == Object.class) {
                    return new C8658Zw0(c1753aw, (EnumC8407Va1) this.f3488b);
                }
                return null;
            default:
                Class cls = c11698xe1.f45725a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C7722Hw0) this.f3488b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f3487a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C7722Hw0) this.f3488b) + "]";
            default:
                return super.toString();
        }
    }
}
