package defpackage;

import java.util.Arrays;

/* renamed from: ur, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7489ur extends AbstractC5449k90 {
    @Override // defpackage.AbstractC0323Dx
    public final AbstractC0663Ig0 a(InterfaceC0153Bs0 interfaceC0153Bs0) {
        O90.f(interfaceC0153Bs0, "module");
        AbstractC8408zg0 abstractC8408zg0H = interfaceC0153Bs0.h();
        abstractC8408zg0H.getClass();
        return abstractC8408zg0H.s(EnumC6988sD0.g);
    }

    @Override // defpackage.AbstractC0323Dx
    public final String toString() {
        String strValueOf;
        Object obj = this.a;
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
