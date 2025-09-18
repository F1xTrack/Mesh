package defpackage;

import android.widget.FrameLayout;
import com.facebook.react.bridge.ReadableArray;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class HO1 {
    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void b(InterfaceC7015sM0 interfaceC7015sM0, FrameLayout frameLayout, int i, ReadableArray readableArray) {
        UN1.c(frameLayout);
        if (i == 1) {
            UN1.c(readableArray);
            d(interfaceC7015sM0, frameLayout, readableArray);
        } else if (i == 2) {
            UN1.c(readableArray);
            interfaceC7015sM0.scrollToEnd(frameLayout, new C7397uM0(readableArray.getBoolean(0)));
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), interfaceC7015sM0.getClass().getSimpleName()));
            }
            interfaceC7015sM0.flashScrollIndicators(frameLayout);
        }
    }

    public static void c(InterfaceC7015sM0 interfaceC7015sM0, FrameLayout frameLayout, String str, ReadableArray readableArray) {
        UN1.c(frameLayout);
        str.getClass();
        switch (str) {
            case "scrollTo":
                UN1.c(readableArray);
                d(interfaceC7015sM0, frameLayout, readableArray);
                return;
            case "flashScrollIndicators":
                interfaceC7015sM0.flashScrollIndicators(frameLayout);
                return;
            case "scrollToEnd":
                UN1.c(readableArray);
                interfaceC7015sM0.scrollToEnd(frameLayout, new C7397uM0(readableArray.getBoolean(0)));
                return;
            default:
                throw new IllegalArgumentException(AbstractC7209tN0.x("Unsupported command ", str, " received by ", interfaceC7015sM0.getClass().getSimpleName(), "."));
        }
    }

    public static void d(InterfaceC7015sM0 interfaceC7015sM0, FrameLayout frameLayout, ReadableArray readableArray) {
        interfaceC7015sM0.scrollTo(frameLayout, new C7206tM0(Math.round(AbstractC7586vL1.b((float) readableArray.getDouble(0))), Math.round(AbstractC7586vL1.b((float) readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }
}
