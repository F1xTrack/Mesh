package com.my.tracker.personalize;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.m;
import com.my.tracker.obfuscated.t0;
import com.my.tracker.obfuscated.y2;
import com.my.tracker.obfuscated.z2;
import defpackage.AbstractC7209tN0;
import defpackage.CE;
import defpackage.RunnableC6880rf;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class PersonalizeApiClient {
    private final a a;

    public static final class Builder {
        private List a;
        private Context b;

        public PersonalizeApiClient build() {
            z2 z2Var = MyTracker.a.a;
            String strG = z2Var.g();
            if (TextUtils.isEmpty(strG)) {
                y2.a("Builder: MyTracker hasn't been initialized. Initialize it before using Personalize API");
                return null;
            }
            Context context = this.b;
            String instanceId = context != null ? MyTracker.getInstanceId(context) : null;
            List list = this.a;
            return new PersonalizeApiClient(new a(strG, (list == null || instanceId == null || !list.contains(instanceId)) ? z2Var.l() : z2Var.k()));
        }

        public Builder withTestDevices(Context context, List<String> list) {
            this.a = list;
            this.b = context;
            return this;
        }
    }

    public interface OnCompleteListener<T> {
        void onRequestComplete(PersonalizeApiClient personalizeApiClient, PersonalizeRequest<T> personalizeRequest, PersonalizeResponse<T> personalizeResponse);
    }

    public PersonalizeApiClient(a aVar) {
        this.a = aVar;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public <T> void sendRequest(PersonalizeRequest<T> personalizeRequest, Handler handler, OnCompleteListener<T> onCompleteListener) {
        m.b(new CE(this, a(personalizeRequest, this.a), personalizeRequest, handler, onCompleteListener));
    }

    private String a(PersonalizeRequest personalizeRequest, a aVar) {
        String strZ = AbstractC7209tN0.z(new StringBuilder(), aVar.b, "/api/v1/recommendation", personalizeRequest.a());
        Map mapB = personalizeRequest.b();
        mapB.remove("sdk_key");
        if (mapB.isEmpty()) {
            return strZ;
        }
        Uri.Builder builderBuildUpon = Uri.parse(strZ).buildUpon();
        for (Map.Entry entry : mapB.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                builderBuildUpon.appendQueryParameter(str, (String) it.next());
            }
        }
        builderBuildUpon.appendQueryParameter("sdk_key", aVar.a);
        return builderBuildUpon.toString();
    }

    private void a(PersonalizeRequest personalizeRequest, t0.b bVar, Handler handler, OnCompleteListener onCompleteListener) {
        String str;
        String str2;
        if (bVar == null) {
            y2.a("PersonalizeApiClient: MyTracker hasn't been initialized yet");
            str = null;
            str2 = "MyTracker hasn't been initialized yet";
        } else {
            String str3 = (String) bVar.b();
            if (!TextUtils.isEmpty(str3)) {
                try {
                    c cVarA = personalizeRequest.c().a(new JSONObject(str3));
                    String strA = cVarA.a();
                    if (strA != null) {
                        a(personalizeRequest, null, null, handler, strA, onCompleteListener);
                    } else {
                        a(personalizeRequest, cVarA.b(), str3, handler, null, onCompleteListener);
                    }
                    return;
                } catch (Throwable th) {
                    String str4 = "Can't parse JSON with error: " + th.getMessage();
                    y2.a("PersonalizeApiClient: " + str4);
                    a(personalizeRequest, null, null, handler, str4, onCompleteListener);
                    return;
                }
            }
            y2.a("PersonalizeApiClient: HTTP response is empty");
            str = null;
            str2 = "HTTP response is empty";
        }
        a(personalizeRequest, null, str, handler, str2, onCompleteListener);
    }

    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, String str) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, new PersonalizeResponse(null, str, null));
    }

    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, PersonalizeResponse personalizeResponse) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, personalizeResponse);
    }

    public /* synthetic */ void a(String str, PersonalizeRequest personalizeRequest, Handler handler, OnCompleteListener onCompleteListener) {
        a(personalizeRequest, t0.a((MyTrackerConfig.OkHttpClientProvider) null).a(str), handler, onCompleteListener);
    }

    private void a(PersonalizeRequest personalizeRequest, Object obj, String str, Handler handler, String str2, OnCompleteListener onCompleteListener) {
        RunnableC6880rf runnableC6880rf;
        if (handler == null) {
            handler = m.a;
        }
        if (TextUtils.isEmpty(str2)) {
            runnableC6880rf = new RunnableC6880rf(this, onCompleteListener, personalizeRequest, new PersonalizeResponse(obj, null, str), 14);
        } else {
            y2.b("PersonalizeApiClient: " + str2);
            runnableC6880rf = new RunnableC6880rf(this, onCompleteListener, personalizeRequest, str2);
        }
        handler.post(runnableC6880rf);
    }
}
