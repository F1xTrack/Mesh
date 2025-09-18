package p000;

import android.widget.FrameLayout;
import com.facebook.react.bridge.ReadableArray;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class HO1 {
    /* renamed from: a */
    public static void m3403a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m3404b(InterfaceC11023sM0 interfaceC11023sM0, FrameLayout frameLayout, int i, ReadableArray readableArray) {
        UN1.m7999c(frameLayout);
        if (i == 1) {
            UN1.m7999c(readableArray);
            m3406d(interfaceC11023sM0, frameLayout, readableArray);
        } else if (i == 2) {
            UN1.m7999c(readableArray);
            interfaceC11023sM0.scrollToEnd(frameLayout, new C11279uM0(readableArray.getBoolean(0)));
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), interfaceC11023sM0.getClass().getSimpleName()));
            }
            interfaceC11023sM0.flashScrollIndicators(frameLayout);
        }
    }

    /* renamed from: c */
    public static void m3405c(InterfaceC11023sM0 interfaceC11023sM0, FrameLayout frameLayout, String str, ReadableArray readableArray) {
        UN1.m7999c(frameLayout);
        str.getClass();
        switch (str) {
            case "scrollTo":
                UN1.m7999c(readableArray);
                m3406d(interfaceC11023sM0, frameLayout, readableArray);
                return;
            case "flashScrollIndicators":
                interfaceC11023sM0.flashScrollIndicators(frameLayout);
                return;
            case "scrollToEnd":
                UN1.m7999c(readableArray);
                interfaceC11023sM0.scrollToEnd(frameLayout, new C11279uM0(readableArray.getBoolean(0)));
                return;
            default:
                throw new IllegalArgumentException(AbstractC11153tN0.m24912x("Unsupported command ", str, " received by ", interfaceC11023sM0.getClass().getSimpleName(), "."));
        }
    }

    /* renamed from: d */
    public static void m3406d(InterfaceC11023sM0 interfaceC11023sM0, FrameLayout frameLayout, ReadableArray readableArray) {
        interfaceC11023sM0.scrollTo(frameLayout, new C11151tM0(Math.round(AbstractC11406vL1.m25403b((float) readableArray.getDouble(0))), Math.round(AbstractC11406vL1.m25403b((float) readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }
}
