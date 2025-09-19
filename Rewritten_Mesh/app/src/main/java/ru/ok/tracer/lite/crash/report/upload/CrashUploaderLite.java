package ru.ok.tracer.lite.crash.report.upload;

import android.content.Context;
import android.net.Uri;
import defpackage.AbstractC2141aT1;
import defpackage.D51;
import defpackage.MN;
import defpackage.O90;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tracer.base.apptoken.AppTokenUtils;
import ru.ok.tracer.base.commands.CommandsHandler;
import ru.ok.tracer.base.http.HttpMultipartBodyBuilder;
import ru.ok.tracer.base.http.HttpRequest;
import ru.ok.tracer.base.http.HttpRequestBody;
import ru.ok.tracer.base.http.HttpResponse;
import ru.ok.tracer.base.http.HttpResponseBody;
import ru.ok.tracer.base.io.GZIPUtils;
import ru.ok.tracer.base.stacktrace.ThrowableUtils;
import ru.ok.tracer.lite.TracerLibraryInfo;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.crash.report.LogEntryLite;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLiteKt;
import ru.ok.tracer.lite.limits.TracerLiteLimits;
import ru.ok.tracer.lite.upload.TracerLiteHttpClientHolder;
import ru.ok.tracer.lite.upload.UploadBeanUtilsLite;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ok/tracer/lite/crash/report/upload/CrashUploaderLite;", "", "Lru/ok/tracer/lite/TracerLite;", "tracer", "Lru/ok/tracer/lite/limits/TracerLiteLimits;", "limits", "<init>", "(Lru/ok/tracer/lite/TracerLite;Lru/ok/tracer/lite/limits/TracerLiteLimits;)V", "", "e", "", "issueKey", "", "Lru/ok/tracer/lite/crash/report/LogEntryLite;", "logs", "tags", "LTf1;", "upload", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Lru/ok/tracer/lite/TracerLite;", "Lru/ok/tracer/lite/upload/TracerLiteHttpClientHolder;", "httpClientHolder", "Lru/ok/tracer/lite/upload/TracerLiteHttpClientHolder;", "Lru/ok/tracer/base/commands/CommandsHandler;", "commandHandler", "Lru/ok/tracer/base/commands/CommandsHandler;", "tracer-lite-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CrashUploaderLite {
    private final CommandsHandler commandHandler;
    private final TracerLiteHttpClientHolder httpClientHolder;
    private final TracerLite tracer;

    public CrashUploaderLite(TracerLite tracerLite, TracerLiteLimits tracerLiteLimits) {
        O90.f(tracerLite, "tracer");
        O90.f(tracerLiteLimits, "limits");
        this.tracer = tracerLite;
        this.httpClientHolder = TracerLiteHttpClientHolder.INSTANCE.get(tracerLite);
        this.commandHandler = new CommandsHandler.Builder().setFeatureName(TracerCrashReportLiteKt.FEATURE_CRASH_REPORT).setLimitsHandler(tracerLiteLimits).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void upload$default(CrashUploaderLite crashUploaderLite, Throwable th, String str, List list, List list2, int i, Object obj) {
        int i2 = i & 4;
        MN mn = MN.a;
        if (i2 != 0) {
            list = mn;
        }
        if ((i & 8) != 0) {
            list2 = mn;
        }
        crashUploaderLite.upload(th, str, list, list2);
    }

    public final void upload(Throwable e, String issueKey, List<LogEntryLite> logs, List<String> tags) {
        String str;
        String string;
        byte[] bytes;
        List<String> list = tags;
        O90.f(e, "e");
        O90.f(logs, "logs");
        O90.f(list, "tags");
        try {
            String libToken = this.tracer.getLibToken();
            if (libToken == null) {
                throw new IllegalStateException("No lib token");
            }
            String hostAppToken = AppTokenUtils.getHostAppToken(this.tracer.getContext());
            Context context = this.tracer.getContext();
            TracerLibraryInfo libraryInfo = this.tracer.getLibraryInfo();
            Date date = new Date();
            if (list.isEmpty()) {
                str = issueKey;
                list = null;
            } else {
                str = issueKey;
            }
            String string2 = UploadBeanUtilsLite.composeLibUploadBean(context, libraryInfo, date, str, list).toString();
            O90.e(string2, "uploadBean.toString()");
            StringBuilder sb = new StringBuilder();
            ThrowableUtils.appendStackTraceTo(e, sb);
            String string3 = sb.toString();
            O90.e(string3, "StringBuilder().apply(builderAction).toString()");
            byte[] gzippedByteArray = GZIPUtils.toGzippedByteArray(string3);
            if (logs.isEmpty()) {
                string = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                Iterator<LogEntryLite> it = logs.iterator();
                int i = 0;
                while (it.hasNext()) {
                    it.next().appendToApi(sb2, i);
                    i++;
                }
                string = sb2.toString();
                O90.e(string, "StringBuilder().apply(builderAction).toString()");
            }
            byte[] gzippedByteArray2 = string != null ? GZIPUtils.toGzippedByteArray(string) : null;
            Uri.Builder builderAppendQueryParameter = Uri.parse(this.tracer.getConfiguration().getApiUrl()).buildUpon().appendEncodedPath("api/crash/upload").appendQueryParameter("crashToken", libToken);
            if (hostAppToken != null) {
                builderAppendQueryParameter.appendQueryParameter("crashHostAppToken", hostAppToken);
            }
            String string4 = builderAppendQueryParameter.toString();
            HttpMultipartBodyBuilder httpMultipartBodyBuilder = new HttpMultipartBodyBuilder();
            httpMultipartBodyBuilder.addString("type", "NON_FATAL");
            HttpRequestBody.Companion companion = HttpRequestBody.INSTANCE;
            httpMultipartBodyBuilder.add("stackTrace", "stack.gzip", companion.fromBytes("application/octet-stream", gzippedByteArray));
            HttpMultipartBodyBuilder.add$default(httpMultipartBodyBuilder, "uploadBean", null, HttpRequestBody.Companion.fromString$default(companion, "application/json; charset=utf-8", string2, null, 4, null), 2, null);
            if (gzippedByteArray2 != null) {
                httpMultipartBodyBuilder.add("logs", "logs.gzip", companion.fromBytes("application/octet-stream", gzippedByteArray2));
            }
            try {
                HttpResponse httpResponseExecute = this.httpClientHolder.getHttpClient().execute(new HttpRequest(string4, httpMultipartBodyBuilder.build()));
                try {
                    int statusCode = httpResponseExecute.getStatusCode();
                    String message = httpResponseExecute.getMessage();
                    HttpResponseBody body = httpResponseExecute.getBody();
                    String contentType = body != null ? body.getContentType() : null;
                    HttpResponseBody body2 = httpResponseExecute.getBody();
                    this.commandHandler.handleResponse(contentType, (body2 == null || (bytes = body2.getBytes()) == null) ? null : D51.h(bytes));
                    if (statusCode == 200) {
                        AbstractC2141aT1.a(httpResponseExecute, null);
                        return;
                    }
                    throw new IOException("HTTP " + statusCode + ' ' + message);
                } finally {
                }
            } catch (IOException unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
