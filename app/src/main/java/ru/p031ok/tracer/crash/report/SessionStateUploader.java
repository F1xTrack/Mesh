package ru.p031ok.tracer.crash.report;

import android.net.Uri;
import android.os.ConditionVariable;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC8729aT1;
import p000.D51;
import p000.O90;
import p000.RunnableC8176Qp0;
import ru.p031ok.tracer.CoreTracerConfiguration;
import ru.p031ok.tracer.SystemState;
import ru.p031ok.tracer.Tracer;
import ru.p031ok.tracer.base.http.HttpRequest;
import ru.p031ok.tracer.base.http.HttpRequestBody;
import ru.p031ok.tracer.base.http.HttpResponse;
import ru.p031ok.tracer.base.http.HttpResponseBody;
import ru.p031ok.tracer.base.ucum.UcumUtils;
import ru.p031ok.tracer.session.SessionState;
import ru.p031ok.tracer.session.SessionStateStorage;
import ru.p031ok.tracer.session.SessionStatesSerializer;
import ru.p031ok.tracer.upload.NetworkResponseHandler;
import ru.p031ok.tracer.utils.Logger;
import ru.p031ok.tracer.utils.TracerThreads;

@Metadata(m22266d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m22267d2 = {"Lru/ok/tracer/crash/report/SessionStateUploader;", "", "<init>", "()V", "", UcumUtils.UCUM_MILLISECODS, "", "waitSessionUpload", "(J)Z", "Lru/ok/tracer/SystemState;", "systemState", "", "Lru/ok/tracer/session/SessionState;", "prevSessionStates", "Lru/ok/tracer/session/SessionStateStorage;", "storage", "LTf1;", "upload", "(Lru/ok/tracer/SystemState;Ljava/util/List;Lru/ok/tracer/session/SessionStateStorage;)V", "Landroid/os/ConditionVariable;", "sessionUploadCondition", "Landroid/os/ConditionVariable;", "tracer-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SessionStateUploader {
    private volatile ConditionVariable sessionUploadCondition;

    public static final void upload$lambda$3(HttpRequest httpRequest, ConditionVariable conditionVariable, SessionStateStorage sessionStateStorage) {
        byte[] bytes;
        O90.m5968f(httpRequest, "$request");
        O90.m5968f(conditionVariable, "$sessionUploadCondition");
        O90.m5968f(sessionStateStorage, "$storage");
        try {
            HttpResponse httpResponseExecute = Tracer.INSTANCE.getHttpClient().execute(httpRequest);
            try {
                int statusCode = httpResponseExecute.getStatusCode();
                HttpResponseBody body = httpResponseExecute.getBody();
                String contentType = body != null ? body.getContentType() : null;
                HttpResponseBody body2 = httpResponseExecute.getBody();
                String strM1549h = (body2 == null || (bytes = body2.getBytes()) == null) ? null : D51.m1549h(bytes);
                NetworkResponseHandler.universalHandleResponse$default(NetworkResponseHandler.INSTANCE, contentType, strM1549h, FEATURE_CRASH_FREEKt.getFEATURE_CRASH_FREE().getName(), null, 8, null);
                if (statusCode != 200) {
                    StringBuilder sb = new StringBuilder("HTTP ");
                    sb.append(statusCode);
                    sb.append(", ");
                    sb.append(strM1549h);
                } else {
                    new StringBuilder("Result: ").append(strM1549h);
                    sessionStateStorage.consumePrevSessionStates();
                }
                AbstractC8729aT1.m9749a(httpResponseExecute, null);
            } finally {
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            conditionVariable.open();
            throw th;
        }
        conditionVariable.open();
    }

    public final void upload(SystemState systemState, List<SessionState> prevSessionStates, SessionStateStorage storage) throws JSONException {
        O90.m5968f(systemState, "systemState");
        O90.m5968f(prevSessionStates, "prevSessionStates");
        O90.m5968f(storage, "storage");
        Logger.d$default("Upload session", null, 2, null);
        String appToken = Tracer.INSTANCE.getAppToken();
        if (appToken == null) {
            Logger.w$default("No app token", null, 2, null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("buildUuid", systemState.getBuildUuid());
        jSONObject.put("deviceId", systemState.getDeviceId());
        jSONObject.put("sessions", SessionStatesSerializer.INSTANCE.toJsonArray(prevSessionStates));
        String string = Uri.parse(CoreTracerConfiguration.INSTANCE.get().getApiUrl()).buildUpon().appendEncodedPath("api/crash/trackSession").appendQueryParameter("crashToken", appToken).toString();
        O90.m5967e(string, "CoreTracerConfiguration.…)\n            .toString()");
        HttpRequestBody.Companion companion = HttpRequestBody.INSTANCE;
        String string2 = jSONObject.toString();
        O90.m5967e(string2, "bodyJsonObject.toString()");
        HttpRequest httpRequest = new HttpRequest(string, HttpRequestBody.Companion.fromString$default(companion, "application/json; charset=utf-8", string2, null, 4, null));
        ConditionVariable conditionVariable = new ConditionVariable();
        this.sessionUploadCondition = conditionVariable;
        TracerThreads.INSTANCE.runOnIo(new RunnableC8176Qp0(httpRequest, conditionVariable, storage, 9));
    }

    public final boolean waitSessionUpload(long j) {
        try {
            ConditionVariable conditionVariable = this.sessionUploadCondition;
            if (conditionVariable == null) {
                return true;
            }
            conditionVariable.block(j);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
