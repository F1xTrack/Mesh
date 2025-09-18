package com.p018my.tracker.personalize;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.p018my.tracker.MyTracker;
import com.p018my.tracker.MyTrackerConfig;
import com.p018my.tracker.obfuscated.AbstractC2340m;
import com.p018my.tracker.obfuscated.AbstractC2369t0;
import com.p018my.tracker.obfuscated.AbstractC2391y2;
import com.p018my.tracker.obfuscated.C2395z2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p000.AbstractC11153tN0;
import p000.RunnableC0141CE;
import p000.RunnableC6757rf;

/* loaded from: classes2.dex */
public final class PersonalizeApiClient {

    /* renamed from: a */
    private final C2396a f20210a;

    public static final class Builder {

        /* renamed from: a */
        private List f20211a;

        /* renamed from: b */
        private Context f20212b;

        public PersonalizeApiClient build() {
            C2395z2 c2395z2 = MyTracker.C2284a.f19674a;
            String strM13607g = c2395z2.m13607g();
            if (TextUtils.isEmpty(strM13607g)) {
                AbstractC2391y2.m13568a("Builder: MyTracker hasn't been initialized. Initialize it before using Personalize API");
                return null;
            }
            Context context = this.f20212b;
            String instanceId = context != null ? MyTracker.getInstanceId(context) : null;
            List list = this.f20211a;
            return new PersonalizeApiClient(new C2396a(strM13607g, (list == null || instanceId == null || !list.contains(instanceId)) ? c2395z2.m13612l() : c2395z2.m13611k()));
        }

        public Builder withTestDevices(Context context, List<String> list) {
            this.f20211a = list;
            this.f20212b = context;
            return this;
        }
    }

    public interface OnCompleteListener<T> {
        void onRequestComplete(PersonalizeApiClient personalizeApiClient, PersonalizeRequest<T> personalizeRequest, PersonalizeResponse<T> personalizeResponse);
    }

    public PersonalizeApiClient(C2396a c2396a) {
        this.f20210a = c2396a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public <T> void sendRequest(PersonalizeRequest<T> personalizeRequest, Handler handler, OnCompleteListener<T> onCompleteListener) {
        AbstractC2340m.m13291b(new RunnableC0141CE(this, m13625a(personalizeRequest, this.f20210a), personalizeRequest, handler, onCompleteListener));
    }

    /* renamed from: a */
    private String m13625a(PersonalizeRequest personalizeRequest, C2396a c2396a) {
        String strM24914z = AbstractC11153tN0.m24914z(new StringBuilder(), c2396a.f20221b, "/api/v1/recommendation", personalizeRequest.mo13634a());
        Map mapMo13636b = personalizeRequest.mo13636b();
        mapMo13636b.remove("sdk_key");
        if (mapMo13636b.isEmpty()) {
            return strM24914z;
        }
        Uri.Builder builderBuildUpon = Uri.parse(strM24914z).buildUpon();
        for (Map.Entry entry : mapMo13636b.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                builderBuildUpon.appendQueryParameter(str, (String) it.next());
            }
        }
        builderBuildUpon.appendQueryParameter("sdk_key", c2396a.f20220a);
        return builderBuildUpon.toString();
    }

    /* renamed from: a */
    private void m13629a(PersonalizeRequest personalizeRequest, AbstractC2369t0.b bVar, Handler handler, OnCompleteListener onCompleteListener) {
        String str;
        String str2;
        if (bVar == null) {
            AbstractC2391y2.m13568a("PersonalizeApiClient: MyTracker hasn't been initialized yet");
            str = null;
            str2 = "MyTracker hasn't been initialized yet";
        } else {
            String str3 = (String) bVar.m13501b();
            if (!TextUtils.isEmpty(str3)) {
                try {
                    C2398c c2398cMo13638a = personalizeRequest.mo13637c().mo13638a(new JSONObject(str3));
                    String strM13639a = c2398cMo13638a.m13639a();
                    if (strM13639a != null) {
                        m13630a(personalizeRequest, null, null, handler, strM13639a, onCompleteListener);
                    } else {
                        m13630a(personalizeRequest, c2398cMo13638a.m13640b(), str3, handler, null, onCompleteListener);
                    }
                    return;
                } catch (Throwable th) {
                    String str4 = "Can't parse JSON with error: " + th.getMessage();
                    AbstractC2391y2.m13568a("PersonalizeApiClient: " + str4);
                    m13630a(personalizeRequest, null, null, handler, str4, onCompleteListener);
                    return;
                }
            }
            AbstractC2391y2.m13568a("PersonalizeApiClient: HTTP response is empty");
            str = null;
            str2 = "HTTP response is empty";
        }
        m13630a(personalizeRequest, null, str, handler, str2, onCompleteListener);
    }

    /* renamed from: a */
    public /* synthetic */ void m13627a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, String str) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, new PersonalizeResponse(null, str, null));
    }

    /* renamed from: a */
    public /* synthetic */ void m13626a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, PersonalizeResponse personalizeResponse) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, personalizeResponse);
    }

    /* renamed from: a */
    public /* synthetic */ void m13631a(String str, PersonalizeRequest personalizeRequest, Handler handler, OnCompleteListener onCompleteListener) {
        m13629a(personalizeRequest, AbstractC2369t0.m13496a((MyTrackerConfig.OkHttpClientProvider) null).mo13274a(str), handler, onCompleteListener);
    }

    /* renamed from: a */
    private void m13630a(PersonalizeRequest personalizeRequest, Object obj, String str, Handler handler, String str2, OnCompleteListener onCompleteListener) {
        RunnableC6757rf runnableC6757rf;
        if (handler == null) {
            handler = AbstractC2340m.f20022a;
        }
        if (TextUtils.isEmpty(str2)) {
            runnableC6757rf = new RunnableC6757rf(this, onCompleteListener, personalizeRequest, new PersonalizeResponse(obj, null, str), 14);
        } else {
            AbstractC2391y2.m13572b("PersonalizeApiClient: " + str2);
            runnableC6757rf = new RunnableC6757rf(this, onCompleteListener, personalizeRequest, str2);
        }
        handler.post(runnableC6757rf);
    }
}
