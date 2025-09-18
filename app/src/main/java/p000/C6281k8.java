package p000;

import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.CodedException;

/* renamed from: k8 */
/* loaded from: classes2.dex */
public final class C6281k8 extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    public C6281k8(String str, CodedException codedException) {
        O90.m5968f(str, "message");
        String strM18088a = codedException.m18088a();
        String strLineSeparator = System.lineSeparator();
        String localizedMessage = codedException.getLocalizedMessage();
        super(strM18088a, str + strLineSeparator + "→ Caused by: " + ((Object) (localizedMessage == null ? codedException : localizedMessage)), codedException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6281k8(String str, String str2, CodedException codedException) {
        this("Call to function '" + str2 + "." + str + "' has been rejected.", codedException);
        O90.m5968f(str, "methodName");
        O90.m5968f(str2, "moduleName");
    }

    public C6281k8(C8420Vh0 c8420Vh0, int i, String str, CodedException codedException) {
        O90.m5968f(str, "providedType");
        int i2 = i + 1;
        int i3 = i2 % 100;
        String str2 = "th";
        if (11 > i3 || i3 >= 14) {
            int i4 = i2 % 10;
            if (i4 == 1) {
                str2 = "st";
            } else if (i4 == 2) {
                str2 = "nd";
            } else if (i4 == 3) {
                str2 = "rd";
            }
        }
        StringBuilder sb = new StringBuilder("The ");
        sb.append(i2 + str2);
        sb.append(" argument cannot be cast to type ");
        sb.append(c8420Vh0);
        sb.append(" (received ");
        this(AbstractC1374Vq.m8593l(sb, str, ")"), codedException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6281k8(String str, InterfaceC11317uf0 interfaceC11317uf0, ReadableType readableType, CodedException codedException) {
        O90.m5968f(str, "fieldName");
        O90.m5968f(interfaceC11317uf0, "fieldType");
        O90.m5968f(readableType, "providedType");
        StringBuilder sbM2541x = F91.m2541x("Cannot cast '", readableType.name(), "' for field '", str, "' ('");
        sbM2541x.append(interfaceC11317uf0);
        sbM2541x.append("').");
        this(sbM2541x.toString(), codedException);
    }

    public C6281k8(InterfaceC11317uf0 interfaceC11317uf0, C11572wf0 c11572wf0, String str, CodedException codedException) {
        this("Cannot cast '" + str + "' to '" + c11572wf0 + "' required by the collection of type: '" + interfaceC11317uf0 + "'.", codedException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6281k8(InterfaceC11317uf0 interfaceC11317uf0, C11572wf0 c11572wf0, ReadableType readableType, CodedException codedException) {
        this(interfaceC11317uf0, c11572wf0, readableType.name(), codedException);
        O90.m5968f(interfaceC11317uf0, "collectionType");
        O90.m5968f(c11572wf0, "elementType");
        O90.m5968f(readableType, "providedType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6281k8(InterfaceC11317uf0 interfaceC11317uf0, C11572wf0 c11572wf0, InterfaceC8412Vd0 interfaceC8412Vd0, CodedException codedException) {
        this(interfaceC11317uf0, c11572wf0, interfaceC8412Vd0.toString(), codedException);
        O90.m5968f(interfaceC11317uf0, "collectionType");
        O90.m5968f(c11572wf0, "elementType");
        O90.m5968f(interfaceC8412Vd0, "providedType");
    }
}
