package defpackage;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* renamed from: av0 */
/* loaded from: classes.dex */
public abstract class AbstractC2224av0 {
    public static final Pattern a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C7533v4.d().a();
            return null;
        }
    }

    public static String b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static void c(C2030Zu0 c2030Zu0) {
        if (!((C1952Yu0) c2030Zu0.d.b).V()) {
            C1796Wu0 c1796Wu0 = c2030Zu0.d;
            c1796Wu0.n();
            C1952Yu0.v((C1952Yu0) c1796Wu0.b);
        }
        c2030Zu0.b();
    }
}
