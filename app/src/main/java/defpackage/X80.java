package defpackage;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes.dex */
public final class X80 implements ResponseHandler {
    public final ResponseHandler a;
    public final C0646Ia1 b;
    public final C2030Zu0 c;

    public X80(ResponseHandler responseHandler, C0646Ia1 c0646Ia1, C2030Zu0 c2030Zu0) {
        this.a = responseHandler;
        this.b = c0646Ia1;
        this.c = c2030Zu0;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.c.j(this.b.a());
        this.c.e(httpResponse.getStatusLine().getStatusCode());
        Long lA = AbstractC2224av0.a(httpResponse);
        if (lA != null) {
            this.c.i(lA.longValue());
        }
        String strB = AbstractC2224av0.b(httpResponse);
        if (strB != null) {
            this.c.h(strB);
        }
        this.c.b();
        return this.a.handleResponse(httpResponse);
    }
}
