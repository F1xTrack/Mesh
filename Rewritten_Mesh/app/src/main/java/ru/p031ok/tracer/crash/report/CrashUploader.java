package ru.p031ok.tracer.crash.report;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC6366lU;
import p000.AbstractC8729aT1;
import p000.D51;
import p000.O90;
import ru.p031ok.tracer.CoreTracerConfiguration;
import ru.p031ok.tracer.Tracer;
import ru.p031ok.tracer.base.http.HttpMultipartBodyBuilder;
import ru.p031ok.tracer.base.http.HttpRequest;
import ru.p031ok.tracer.base.http.HttpRequestBody;
import ru.p031ok.tracer.base.http.HttpResponse;
import ru.p031ok.tracer.base.http.HttpResponseBody;
import ru.p031ok.tracer.base.p032io.GZIPUtils;
import ru.p031ok.tracer.upload.NetworkResponseHandler;
import ru.p031ok.tracer.utils.Logger;

@Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, m22267d2 = {"Lru/ok/tracer/crash/report/CrashUploader;", "", "<init>", "()V", "Lru/ok/tracer/crash/report/CrashDescription;", "descr", "LTf1;", "upload", "(Lru/ok/tracer/crash/report/CrashDescription;)V", "", "crashDescriptions", "(Ljava/util/List;)V", "tracer-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CrashUploader {

    @Metadata(m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CrashType.values().length];
            try {
                iArr[CrashType.MINIDUMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void upload(List<CrashDescription> crashDescriptions) {
        O90.m5968f(crashDescriptions, "crashDescriptions");
        crashDescriptions.size();
        for (CrashDescription crashDescription : crashDescriptions) {
            try {
                upload(crashDescription);
                crashDescription.delete();
            } catch (Throwable unused) {
            }
        }
    }

    private final void upload(CrashDescription descr) throws JSONException, IOException {
        String str;
        String str2;
        String str3;
        byte[] bytes;
        Tracer tracer = Tracer.INSTANCE;
        String appToken = tracer.getAppToken();
        if (appToken == null) {
            Logger.w$default("No app token", null, 2, null);
            return;
        }
        File file = new File(descr.getSystemStatePath());
        if (!file.exists()) {
            Logger.e$default("System info not exists", null, 2, null);
            return;
        }
        String strM22436f = AbstractC6366lU.m22436f(file);
        File file2 = new File(descr.getTagsPath());
        if (!file2.exists()) {
            file2 = null;
        }
        String strM22436f2 = file2 != null ? AbstractC6366lU.m22436f(file2) : null;
        JSONObject jSONObject = new JSONObject(strM22436f);
        if (strM22436f2 != null) {
            jSONObject.put("tags", new JSONArray(strM22436f2));
        }
        String string = jSONObject.toString();
        byte[] bytesToGzippedByteArray = GZIPUtils.readBytesToGzippedByteArray(new File(descr.getStacktracePath()));
        File file3 = new File(descr.getAllStacktracesPath());
        byte[] bytesToGzippedByteArray2 = file3.exists() ? GZIPUtils.readBytesToGzippedByteArray(file3) : null;
        File file4 = new File(descr.getLogsPath());
        byte[] bytesToGzippedByteArray3 = file4.exists() ? GZIPUtils.readBytesToGzippedByteArray(file4) : null;
        CrashType crashType = descr.getCrashType();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[crashType.ordinal()];
        if (i != 1 && i != 2) {
            str = "stackTrace";
        } else {
            str = "file";
        }
        int i2 = iArr[crashType.ordinal()];
        if (i2 != 1 && i2 != 2) {
            str2 = "stack.gzip";
        } else {
            str2 = "file.gzip";
        }
        int i3 = iArr[crashType.ordinal()];
        if (i3 == 1) {
            str3 = "api/crash/uploadNative";
        } else if (i3 != 2) {
            str3 = "api/crash/upload";
        } else {
            str3 = "api/crash/uploadAnr";
        }
        String string2 = Uri.parse(CoreTracerConfiguration.INSTANCE.get().getApiUrl()).buildUpon().appendEncodedPath(str3).appendQueryParameter("crashToken", appToken).toString();
        O90.m5967e(string2, "CoreTracerConfiguration.…)\n            .toString()");
        HttpMultipartBodyBuilder httpMultipartBodyBuilder = new HttpMultipartBodyBuilder();
        httpMultipartBodyBuilder.addString("type", crashType.getApiValue());
        HttpRequestBody.Companion companion = HttpRequestBody.INSTANCE;
        httpMultipartBodyBuilder.add(str, str2, companion.fromBytes("application/octet-stream", bytesToGzippedByteArray));
        HttpMultipartBodyBuilder.add$default(httpMultipartBodyBuilder, "uploadBean", null, HttpRequestBody.Companion.fromString$default(companion, "application/json; charset=utf-8", string, null, 4, null), 2, null);
        if (bytesToGzippedByteArray2 != null) {
            httpMultipartBodyBuilder.add("threadDump", "threads.gzip", companion.fromBytes("application/octet-stream", bytesToGzippedByteArray2));
        }
        if (bytesToGzippedByteArray3 != null) {
            httpMultipartBodyBuilder.add("logs", "logs.gzip", companion.fromBytes("application/octet-stream", bytesToGzippedByteArray3));
        }
        HttpResponse httpResponseExecute = tracer.getHttpClient().execute(new HttpRequest(string2, httpMultipartBodyBuilder.build()));
        try {
            httpResponseExecute.getStatusCode();
            httpResponseExecute.getMessage();
            HttpResponseBody body = httpResponseExecute.getBody();
            String contentType = body != null ? body.getContentType() : null;
            HttpResponseBody body2 = httpResponseExecute.getBody();
            NetworkResponseHandler.universalHandleResponse$default(NetworkResponseHandler.INSTANCE, contentType, (body2 == null || (bytes = body2.getBytes()) == null) ? null : D51.m1549h(bytes), FEATURE_CRASH_REPORTKt.getFEATURE_CRASH_REPORT().getName(), null, 8, null);
            AbstractC8729aT1.m9749a(httpResponseExecute, null);
        } finally {
        }
    }
}
