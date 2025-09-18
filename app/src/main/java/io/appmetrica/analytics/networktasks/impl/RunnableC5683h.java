package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.p026io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p000.AbstractC11374v51;
import p000.AbstractC7167xu;

/* renamed from: io.appmetrica.analytics.networktasks.impl.h */
/* loaded from: classes2.dex */
public final class RunnableC5683h implements Runnable {

    /* renamed from: a */
    public final NetworkTask f33091a;

    /* renamed from: b */
    public final InterruptionSafeThread f33092b;

    /* renamed from: c */
    public final C5681f f33093c;

    public RunnableC5683h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, C5681f c5681f) {
        this.f33091a = networkTask;
        this.f33092b = interruptionSafeThread;
        this.f33093c = c5681f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zOnRequestComplete;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f33091a.getExponentialBackoffPolicy();
        IExecutionPolicy connectionExecutionPolicy = this.f33091a.getConnectionExecutionPolicy();
        if (!this.f33092b.isRunning() || !connectionExecutionPolicy.canBeExecuted() || !exponentialBackoffPolicy.canBeExecuted(this.f33091a.getRetryPolicyConfig())) {
            this.f33091a.onShouldNotExecute();
            return;
        }
        boolean zOnCreateNetworkTask = this.f33091a.onCreateNetworkTask();
        Boolean boolValueOf = null;
        while (this.f33092b.isRunning() && zOnCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f33091a.getRetryPolicyConfig())) {
            C5681f c5681f = this.f33093c;
            NetworkTask networkTask = this.f33091a;
            c5681f.getClass();
            boolean z = false;
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url == null || TextUtils.isEmpty(AbstractC11374v51.m25350Y(url).toString())) {
                    StringBuilder sb = new StringBuilder("Task ");
                    sb.append(networkTask.description());
                    sb.append(" url is `");
                    sb.append(url);
                    sb.append("`. All hosts = ");
                    List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                    sb.append(allHosts != null ? allHosts.toString() : null);
                    networkTask.onRequestError(new IllegalArgumentException(sb.toString()));
                } else {
                    Request.Builder builderAddHeader = new Request.Builder(url).addHeader("Accept", "application/json").addHeader("User-Agent", networkTask.getUserAgent());
                    RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                    Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        builderAddHeader.addHeader((String) entry.getKey(), AbstractC7167xu.m25962H((Iterable) entry.getValue(), StringUtils.COMMA, null, null, null, 62));
                    }
                    if (NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                        if (!(postData.length == 0)) {
                            builderAddHeader.post(postData);
                            Long sendTimestamp = requestDataHolder.getSendTimestamp();
                            if (sendTimestamp != null) {
                                builderAddHeader.addHeader("Send-Timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(sendTimestamp.longValue())));
                            }
                            Integer sendTimezoneSec = requestDataHolder.getSendTimezoneSec();
                            if (sendTimezoneSec != null) {
                                builderAddHeader.addHeader("Send-Timezone", String.valueOf(sendTimezoneSec.intValue()));
                            }
                        }
                    }
                    NetworkClient.Builder builder = new NetworkClient.Builder();
                    int i = AbstractC5677b.f33087a;
                    Response responseExecute = builder.withConnectTimeout(i).withReadTimeout(i).withSslSocketFactory(networkTask.getSslSocketFactory()).build().newCall(builderAddHeader.build()).execute();
                    int code = responseExecute.getCode();
                    ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                    responseDataHolder.setResponseCode(code);
                    responseDataHolder.setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(responseExecute.getHeaders()));
                    if (responseDataHolder.isValidResponse()) {
                        responseDataHolder.setResponseData(responseExecute.getResponseData());
                    }
                    if (responseExecute.isCompleted()) {
                        zOnRequestComplete = networkTask.onRequestComplete();
                        boolValueOf = Boolean.valueOf(zOnRequestComplete);
                        if (zOnRequestComplete && this.f33091a.shouldTryNextHost()) {
                            z = true;
                        }
                        exponentialBackoffPolicy.onHostAttemptFinished(zOnRequestComplete);
                        zOnCreateNetworkTask = z;
                    } else {
                        networkTask.onRequestError(responseExecute.getException());
                    }
                }
            } else {
                networkTask.onRequestError(null);
            }
            zOnRequestComplete = false;
            boolValueOf = Boolean.valueOf(zOnRequestComplete);
            if (zOnRequestComplete) {
            }
            exponentialBackoffPolicy.onHostAttemptFinished(zOnRequestComplete);
            zOnCreateNetworkTask = z;
        }
        if (boolValueOf != null) {
            exponentialBackoffPolicy.onAllHostsAttemptsFinished(boolValueOf.booleanValue());
        }
    }
}
