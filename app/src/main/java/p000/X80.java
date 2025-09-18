package p000;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes.dex */
public final class X80 implements ResponseHandler {

    /* renamed from: a */
    public final ResponseHandler f13572a;

    /* renamed from: b */
    public final C7731Ia1 f13573b;

    /* renamed from: c */
    public final C8654Zu0 f13574c;

    public X80(ResponseHandler responseHandler, C7731Ia1 c7731Ia1, C8654Zu0 c8654Zu0) {
        this.f13572a = responseHandler;
        this.f13573b = c7731Ia1;
        this.f13574c = c8654Zu0;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.f13574c.m9635j(this.f13573b.m3946a());
        this.f13574c.m9630e(httpResponse.getStatusLine().getStatusCode());
        Long lM10379a = AbstractC8784av0.m10379a(httpResponse);
        if (lM10379a != null) {
            this.f13574c.m9634i(lM10379a.longValue());
        }
        String strM10380b = AbstractC8784av0.m10380b(httpResponse);
        if (strM10380b != null) {
            this.f13574c.m9633h(strM10380b);
        }
        this.f13574c.m9628b();
        return this.f13572a.handleResponse(httpResponse);
    }
}
