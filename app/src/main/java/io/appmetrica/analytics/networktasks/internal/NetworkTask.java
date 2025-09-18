package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.p026io.IExecutionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public class NetworkTask {

    /* renamed from: a */
    private int f33125a = 1;

    /* renamed from: b */
    private final Executor f33126b;

    /* renamed from: c */
    private final IExecutionPolicy f33127c;

    /* renamed from: d */
    private final ExponentialBackoffPolicy f33128d;

    /* renamed from: e */
    private final UnderlyingNetworkTask f33129e;

    /* renamed from: f */
    private final List f33130f;

    /* renamed from: g */
    private final String f33131g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i);
    }

    public NetworkTask(Executor executor, IExecutionPolicy iExecutionPolicy, ExponentialBackoffPolicy exponentialBackoffPolicy, UnderlyingNetworkTask underlyingNetworkTask, List<ShouldTryNextHostCondition> list, String str) {
        this.f33126b = executor;
        this.f33127c = iExecutionPolicy;
        this.f33128d = exponentialBackoffPolicy;
        this.f33129e = underlyingNetworkTask;
        this.f33130f = list;
        this.f33131g = str;
    }

    /* renamed from: a */
    private synchronized boolean m21295a(int i) {
        if (!m21296a(i)) {
            return false;
        }
        this.f33125a = i;
        return true;
    }

    public String description() {
        return this.f33129e.description();
    }

    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f33127c;
    }

    public Executor getExecutor() {
        return this.f33126b;
    }

    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f33128d;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f33129e.getRequestDataHolder();
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f33129e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f33129e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f33129e.getSslSocketFactory();
    }

    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f33129e;
    }

    public String getUrl() {
        return this.f33129e.getFullUrlFormer().getUrl();
    }

    public String getUserAgent() {
        return this.f33131g;
    }

    public boolean onCreateNetworkTask() {
        if (m21295a(3)) {
            return this.f33129e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean zM21295a = m21295a(4);
        if (zM21295a) {
            this.f33129e.getFullUrlFormer().incrementAttemptNumber();
            this.f33129e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f33129e.onPerformRequest();
        }
        return zM21295a;
    }

    public boolean onRequestComplete() {
        boolean zOnRequestComplete;
        boolean z;
        synchronized (this) {
            try {
                if (m21296a(5, 6)) {
                    zOnRequestComplete = this.f33129e.onRequestComplete();
                    if (zOnRequestComplete) {
                        this.f33125a = 5;
                    } else {
                        this.f33125a = 6;
                    }
                    z = true;
                } else {
                    zOnRequestComplete = false;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.f33129e.onPostRequestComplete(zOnRequestComplete);
        }
        return zOnRequestComplete;
    }

    public void onRequestError(Throwable th) {
        if (m21295a(6)) {
            this.f33129e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (m21295a(7)) {
            this.f33129e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean zM21295a = m21295a(2);
        if (zM21295a) {
            this.f33129e.onTaskAdded();
        }
        return zM21295a;
    }

    public void onTaskFinished() {
        int i;
        boolean zM21295a;
        synchronized (this) {
            i = this.f33125a;
            zM21295a = m21295a(8);
        }
        if (zM21295a) {
            this.f33129e.onTaskFinished();
            if (i == 5) {
                this.f33129e.onSuccessfulTaskFinished();
            } else if (i == 6 || i == 7) {
                this.f33129e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (m21295a(9)) {
            this.f33129e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean zHasMoreHosts;
        boolean z;
        int i;
        try {
            zHasMoreHosts = this.f33129e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f33129e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f33130f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z = false;
                    break;
                }
            }
            i = this.f33125a;
        } catch (Throwable th) {
            throw th;
        }
        return i != 9 && i != 8 && zHasMoreHosts && z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean m21296a(int... r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            int r1 = r13.f33125a     // Catch: java.lang.Throwable -> L1f
            int r2 = r14.length     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            r4 = r3
        L8:
            if (r4 >= r2) goto L7e
            r5 = r14[r4]     // Catch: java.lang.Throwable -> L1f
            int r5 = io.appmetrica.analytics.networktasks.impl.AbstractC5680e.m21293a(r5)     // Catch: java.lang.Throwable -> L1f
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 6
            r10 = 5
            r11 = 9
            r12 = 1
            switch(r5) {
                case 0: goto L70;
                case 1: goto L67;
                case 2: goto L5d;
                case 3: goto L4e;
                case 4: goto L44;
                case 5: goto L44;
                case 6: goto L5d;
                case 7: goto L2e;
                case 8: goto L22;
                default: goto L1b;
            }     // Catch: java.lang.Throwable -> L1f
        L1b:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L71
        L1f:
            r14 = move-exception
            goto L89
        L22:
            if (r1 != r12) goto L25
            goto L70
        L25:
            if (r1 == r11) goto L28
            goto L29
        L28:
            r12 = r3
        L29:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> L1f
            goto L71
        L2e:
            if (r1 == r10) goto L41
            if (r1 == r9) goto L41
            r5 = 7
            if (r1 == r5) goto L41
            if (r1 == r8) goto L41
            if (r1 == r7) goto L41
            if (r1 != r6) goto L3c
            goto L41
        L3c:
            if (r1 != r11) goto L70
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L71
        L41:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L71
        L44:
            if (r1 != r6) goto L49
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L71
        L49:
            if (r1 != r11) goto L70
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L71
        L4e:
            if (r1 == r7) goto L5a
            if (r1 == r10) goto L5a
            if (r1 != r9) goto L55
            goto L5a
        L55:
            if (r1 != r11) goto L70
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L71
        L5a:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L71
        L5d:
            if (r1 != r8) goto L62
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L71
        L62:
            if (r1 != r11) goto L70
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L71
        L67:
            if (r1 != r12) goto L6a
            goto L6b
        L6a:
            r12 = r3
        L6b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> L1f
            goto L71
        L70:
            r5 = 0
        L71:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Throwable -> L1f
            if (r6 != 0) goto L7b
            r0 = r5
            goto L7e
        L7b:
            int r4 = r4 + 1
            goto L8
        L7e:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            r14.equals(r0)     // Catch: java.lang.Throwable -> L1f
            boolean r14 = r14.equals(r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r13)
            return r14
        L89:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L1f
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.networktasks.internal.NetworkTask.m21296a(int[]):boolean");
    }
}
