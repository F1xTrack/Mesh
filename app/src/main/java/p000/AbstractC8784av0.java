package p000;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* renamed from: av0 */
/* loaded from: classes.dex */
public abstract class AbstractC8784av0 {

    /* renamed from: a */
    public static final Pattern f16674a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    /* renamed from: a */
    public static Long m10379a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C6989v4.m25319d().m25320a();
            return null;
        }
    }

    /* renamed from: b */
    public static String m10380b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    /* renamed from: c */
    public static void m10381c(C8654Zu0 c8654Zu0) {
        if (!((C8602Yu0) c8654Zu0.f15212d.f40483b).m9417V()) {
            C8498Wu0 c8498Wu0 = c8654Zu0.f15212d;
            c8498Wu0.m23922n();
            C8602Yu0.m9400v((C8602Yu0) c8498Wu0.f40483b);
        }
        c8654Zu0.m9628b();
    }
}
