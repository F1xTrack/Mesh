package ru.ok.tracer.lite.upload;

import android.content.Context;
import defpackage.LB;
import defpackage.O90;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.tracer.base.http.HttpClient;
import ru.ok.tracer.lite.TracerLite;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ok/tracer/lite/upload/TracerLiteHttpClientHolder;", "", "context", "Landroid/content/Context;", "libraryPackageName", "", "trafficStatsTag", "", "(Landroid/content/Context;Ljava/lang/String;I)V", "httpClient", "Lru/ok/tracer/base/http/HttpClient;", "getHttpClient", "()Lru/ok/tracer/base/http/HttpClient;", "httpClient$delegate", "Lkotlin/Lazy;", "Companion", "tracer-lite-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerLiteHttpClientHolder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;

    /* renamed from: httpClient$delegate, reason: from kotlin metadata */
    private final Lazy httpClient;
    private final String libraryPackageName;
    private final int trafficStatsTag;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tracer/lite/upload/TracerLiteHttpClientHolder$Companion;", "", "()V", "get", "Lru/ok/tracer/lite/upload/TracerLiteHttpClientHolder;", "tracer", "Lru/ok/tracer/lite/TracerLite;", "tracer-lite-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TracerLiteHttpClientHolder get(TracerLite tracer) {
            O90.f(tracer, "tracer");
            return tracer.getHttpClientHolder();
        }

        private Companion() {
        }
    }

    public TracerLiteHttpClientHolder(Context context, String str, int i) {
        O90.f(context, "context");
        O90.f(str, "libraryPackageName");
        this.context = context;
        this.libraryPackageName = str;
        this.trafficStatsTag = i;
        this.httpClient = LB.b(new TracerLiteHttpClientHolder$httpClient$2(this));
    }

    public final HttpClient getHttpClient() {
        return (HttpClient) this.httpClient.getValue();
    }

    public /* synthetic */ TracerLiteHttpClientHolder(Context context, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i2 & 4) != 0 ? -1 : i);
    }
}
