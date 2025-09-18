package defpackage;

import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.CodedException;

/* renamed from: k8 */
/* loaded from: classes2.dex */
public final class C5445k8 extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    public C5445k8(String str, CodedException codedException) {
        O90.f(str, "message");
        String strA = codedException.a();
        String strLineSeparator = System.lineSeparator();
        String localizedMessage = codedException.getLocalizedMessage();
        super(strA, str + strLineSeparator + "→ Caused by: " + ((Object) (localizedMessage == null ? codedException : localizedMessage)), codedException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5445k8(String str, String str2, CodedException codedException) {
        this("Call to function '" + str2 + "." + str + "' has been rejected.", codedException);
        O90.f(str, "methodName");
        O90.f(str2, "moduleName");
    }

    public C5445k8(C1679Vh0 c1679Vh0, int i, String str, CodedException codedException) {
        O90.f(str, "providedType");
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
        sb.append(c1679Vh0);
        sb.append(" (received ");
        this(AbstractC1705Vq.l(sb, str, ")"), codedException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5445k8(String str, InterfaceC7454uf0 interfaceC7454uf0, ReadableType readableType, CodedException codedException) {
        O90.f(str, "fieldName");
        O90.f(interfaceC7454uf0, "fieldType");
        O90.f(readableType, "providedType");
        StringBuilder sbX = F91.x("Cannot cast '", readableType.name(), "' for field '", str, "' ('");
        sbX.append(interfaceC7454uf0);
        sbX.append("').");
        this(sbX.toString(), codedException);
    }

    public C5445k8(InterfaceC7454uf0 interfaceC7454uf0, C7835wf0 c7835wf0, String str, CodedException codedException) {
        this("Cannot cast '" + str + "' to '" + c7835wf0 + "' required by the collection of type: '" + interfaceC7454uf0 + "'.", codedException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5445k8(InterfaceC7454uf0 interfaceC7454uf0, C7835wf0 c7835wf0, ReadableType readableType, CodedException codedException) {
        this(interfaceC7454uf0, c7835wf0, readableType.name(), codedException);
        O90.f(interfaceC7454uf0, "collectionType");
        O90.f(c7835wf0, "elementType");
        O90.f(readableType, "providedType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5445k8(InterfaceC7454uf0 interfaceC7454uf0, C7835wf0 c7835wf0, InterfaceC1667Vd0 interfaceC1667Vd0, CodedException codedException) {
        this(interfaceC7454uf0, c7835wf0, interfaceC1667Vd0.toString(), codedException);
        O90.f(interfaceC7454uf0, "collectionType");
        O90.f(c7835wf0, "elementType");
        O90.f(interfaceC1667Vd0, "providedType");
    }
}
