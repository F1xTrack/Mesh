package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: Fw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0477Fw0 implements InterfaceC7258td1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0477Fw0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC7258td1
    public final AbstractC6876rd1 a(C2226aw c2226aw, C8023xe1 c8023xe1) {
        switch (this.a) {
            case 0:
                if (c8023xe1.a == Number.class) {
                    return (C0633Hw0) this.b;
                }
                return null;
            case 1:
                if (c8023xe1.a == Object.class) {
                    return new C2036Zw0(c2226aw, (EnumC1659Va1) this.b);
                }
                return null;
            default:
                Class cls = c8023xe1.a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C0633Hw0) this.b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C0633Hw0) this.b) + "]";
            default:
                return super.toString();
        }
    }
}
