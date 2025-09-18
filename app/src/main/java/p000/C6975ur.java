package p000;

import java.util.Arrays;

/* renamed from: ur */
/* loaded from: classes2.dex */
public final class C6975ur extends AbstractC9973k90 {
    @Override // p000.AbstractC0249Dx
    /* renamed from: a */
    public final AbstractC7742Ig0 mo412a(InterfaceC7402Bs0 interfaceC7402Bs0) {
        O90.m5968f(interfaceC7402Bs0, "module");
        AbstractC11955zg0 abstractC11955zg0Mo897h = interfaceC7402Bs0.mo897h();
        abstractC11955zg0Mo897h.getClass();
        return abstractC11955zg0Mo897h.m26509s(EnumC11005sD0.f42306g);
    }

    @Override // p000.AbstractC0249Dx
    public final String toString() {
        String strValueOf;
        Object obj = this.f2329a;
        Integer numValueOf = Integer.valueOf(((Character) obj).charValue());
        char cCharValue = ((Character) obj).charValue();
        if (cCharValue == '\b') {
            strValueOf = "\\b";
        } else if (cCharValue == '\t') {
            strValueOf = "\\t";
        } else if (cCharValue == '\n') {
            strValueOf = "\\n";
        } else if (cCharValue == '\f') {
            strValueOf = "\\f";
        } else if (cCharValue == '\r') {
            strValueOf = "\\r";
        } else {
            byte type = (byte) Character.getType(cCharValue);
            strValueOf = (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? "?" : String.valueOf(cCharValue);
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }
}
