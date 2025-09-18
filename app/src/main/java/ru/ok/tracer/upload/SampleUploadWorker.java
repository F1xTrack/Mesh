package ru.ok.tracer.upload;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.AbstractC1061Nj0;
import defpackage.AbstractC2141aT1;
import defpackage.AbstractC5702lU;
import defpackage.AbstractC7096sn0;
import defpackage.C0481Fx1;
import defpackage.C6353ou;
import defpackage.C8317zC;
import defpackage.D51;
import defpackage.NP1;
import defpackage.O90;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tracer.CoreTracerConfiguration;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.TracerFeature;
import ru.ok.tracer.base.compat.PackageInfoCompat;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.base.http.HttpMultipartBodyBuilder;
import ru.ok.tracer.base.http.HttpRequest;
import ru.ok.tracer.base.http.HttpRequestBody;
import ru.ok.tracer.base.http.HttpResponse;
import ru.ok.tracer.base.http.HttpResponseBody;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ok/tracer/upload/SampleUploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "uploadToken", "Ljava/io/File;", "sampleFile", "tmpFile", "LTf1;", "uploadFile", "(Ljava/lang/String;Ljava/io/File;Ljava/io/File;)V", "getUploadToken", "()Ljava/lang/String;", "LNj0;", "doWork", "()LNj0;", "getFeatureName", "featureName", "getTag", "tag", "", "getTagLimit", "()I", "tagLimit", "Companion", "tracer-sample-upload_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SampleUploadWorker extends Worker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String PARAM_ATTR1 = "tracer_attr1";
    private static final String PARAM_CUSTOM_PROPERTIES_KEYS = "tracer_custom_properties_keys";
    private static final String PARAM_FEATURE_NAME = "tracer_feature_name";
    private static final String PARAM_FEATURE_TAG = "tracer_feature_tag";
    private static final String PARAM_FEATURE_TAG_LIMIT = "tracer_feature_tag_limit";
    private static final String PARAM_FEATURE_USE_GZIP = "tracer_feature_uze_gzip";
    private static final String PARAM_HAS_ATTR1 = "tracer_has_attr1";
    private static final String PARAM_SAMPLE_FILE_PATH = "tracer_sample_file_path";
    private static final String PARAM_VERSION_CODE = "tracer_version_code";

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015¨\u0006\u001e"}, d2 = {"Lru/ok/tracer/upload/SampleUploadWorker$Companion;", "", "<init>", "()V", "Lru/ok/tracer/TracerFeature;", "feature", "Ljava/io/File;", "sampleFile", "", "useGzip", "", "tag", "", "attr1", "versionCode", "", "customProperties", "LzC;", "createData", "(Lru/ok/tracer/TracerFeature;Ljava/io/File;ZLjava/lang/String;Ljava/lang/Long;JLjava/util/Map;)LzC;", "PARAM_ATTR1", "Ljava/lang/String;", "PARAM_CUSTOM_PROPERTIES_KEYS", "PARAM_FEATURE_NAME", "PARAM_FEATURE_TAG", "PARAM_FEATURE_TAG_LIMIT", "PARAM_FEATURE_USE_GZIP", "PARAM_HAS_ATTR1", "PARAM_SAMPLE_FILE_PATH", "PARAM_VERSION_CODE", "tracer-sample-upload_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8317zC createData(TracerFeature feature, File sampleFile, boolean useGzip, String tag, Long attr1, long versionCode, Map<String, String> customProperties) {
            O90.f(feature, "feature");
            O90.f(sampleFile, "sampleFile");
            O90.f(customProperties, "customProperties");
            C0481Fx1 c0481Fx1 = new C0481Fx1(13);
            ((HashMap) c0481Fx1.a).put(SampleUploadWorker.PARAM_FEATURE_NAME, feature.getName());
            ((HashMap) c0481Fx1.a).put(SampleUploadWorker.PARAM_FEATURE_USE_GZIP, Boolean.valueOf(useGzip));
            ((HashMap) c0481Fx1.a).put(SampleUploadWorker.PARAM_SAMPLE_FILE_PATH, sampleFile.getPath());
            ((HashMap) c0481Fx1.a).put(SampleUploadWorker.PARAM_FEATURE_TAG, tag);
            if (attr1 != null) {
                ((HashMap) c0481Fx1.a).put(SampleUploadWorker.PARAM_HAS_ATTR1, Boolean.TRUE);
                ((HashMap) c0481Fx1.a).put(SampleUploadWorker.PARAM_ATTR1, attr1);
            }
            Object[] array = customProperties.keySet().toArray(new String[0]);
            O90.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            ((HashMap) c0481Fx1.a).put(SampleUploadWorker.PARAM_CUSTOM_PROPERTIES_KEYS, (String[]) array);
            c0481Fx1.w(customProperties);
            ((HashMap) c0481Fx1.a).put(SampleUploadWorker.PARAM_VERSION_CODE, Long.valueOf(versionCode));
            C8317zC c8317zC = new C8317zC((HashMap) c0481Fx1.a);
            C8317zC.c(c8317zC);
            return c8317zC;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SampleUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        O90.f(context, "context");
        O90.f(workerParameters, "workerParams");
    }

    private final String getFeatureName() {
        String strB = getInputData().b(PARAM_FEATURE_NAME);
        O90.c(strB);
        return strB;
    }

    private final String getTag() {
        return getInputData().b(PARAM_FEATURE_TAG);
    }

    private final int getTagLimit() {
        Object obj = getInputData().a.get(PARAM_FEATURE_TAG_LIMIT);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    private final String getUploadToken() throws JSONException, IOException {
        Tracer tracer = Tracer.INSTANCE;
        String appToken = tracer.getAppToken();
        if (appToken == null) {
            Logger.w$default("No app token", null, 2, null);
            return null;
        }
        SystemState currentSystemState = tracer.getStateStorage().getCurrentSystemState();
        Object obj = getInputData().a.get(PARAM_CUSTOM_PROPERTIES_KEYS);
        String[] strArr = obj instanceof String[] ? (String[]) obj : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("versionName", currentSystemState.getVersionName());
        jSONObject.put("versionCode", currentSystemState.getVersionCode());
        jSONObject.put("buildUuid", currentSystemState.getBuildUuid());
        jSONObject.put("sessionUuid", currentSystemState.getSessionUuid());
        jSONObject.put("deviceId", currentSystemState.getDeviceId());
        jSONObject.put("feature", getFeatureName());
        Object obj2 = getInputData().a.get(PARAM_HAS_ATTR1);
        if (obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false) {
            Object obj3 = getInputData().a.get(PARAM_ATTR1);
            jSONObject.put("attr1", obj3 instanceof Long ? ((Long) obj3).longValue() : 0L);
        }
        if (getTag() != null) {
            jSONObject.put("tag", getTag());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (strArr != null) {
            for (String str : strArr) {
                String strB = getInputData().b(str);
                if (strB != null) {
                    O90.e(str, "it");
                    linkedHashMap.put(str, strB);
                }
            }
        }
        LinkedHashMap linkedHashMapJ = AbstractC7096sn0.j(currentSystemState.getProperties(), linkedHashMap);
        if (!linkedHashMapJ.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : linkedHashMapJ.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put("properties", jSONObject2);
        }
        String string = Uri.parse(CoreTracerConfiguration.INSTANCE.get().getApiUrl()).buildUpon().appendEncodedPath("api/sample/initUpload").appendQueryParameter("sampleToken", appToken).toString();
        O90.e(string, "CoreTracerConfiguration.…)\n            .toString()");
        HttpRequestBody.Companion companion = HttpRequestBody.INSTANCE;
        String string2 = jSONObject.toString();
        O90.e(string2, "json.toString()");
        HttpRequest httpRequest = new HttpRequest(string, HttpRequestBody.Companion.fromString$default(companion, "application/json; charset=utf-8", string2, null, 4, null));
        jSONObject.toString();
        HttpResponse httpResponseExecute = Tracer.INSTANCE.getHttpClient().execute(httpRequest);
        try {
            HttpResponseBody body = httpResponseExecute.getBody();
            if (body == null) {
                AbstractC2141aT1.a(httpResponseExecute, null);
                return null;
            }
            JSONObject jSONObject3 = new JSONObject(D51.h(body.getBytes()));
            NetworkResponseHandler.INSTANCE.universalHandleResponse(jSONObject3, getFeatureName(), getTag());
            if (httpResponseExecute.getStatusCode() != 200) {
                AbstractC2141aT1.a(httpResponseExecute, null);
                return null;
            }
            String string3 = jSONObject3.getString("uploadToken");
            AbstractC2141aT1.a(httpResponseExecute, null);
            return string3;
        } finally {
        }
    }

    private final void uploadFile(String uploadToken, File sampleFile, File tmpFile) throws C6353ou {
        HttpResponse httpResponseExecute;
        byte[] bytes;
        Object obj = getInputData().a.get(PARAM_FEATURE_USE_GZIP);
        if (obj instanceof Boolean ? ((Boolean) obj).booleanValue() : true) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(sampleFile));
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(tmpFile)));
            try {
                try {
                    NP1.a(bufferedInputStream, gZIPOutputStream, 8192);
                    AbstractC2141aT1.a(gZIPOutputStream, null);
                    AbstractC2141aT1.a(bufferedInputStream, null);
                } finally {
                }
            } finally {
            }
        } else {
            AbstractC5702lU.b(sampleFile, tmpFile, true, 4);
        }
        sampleFile.length();
        tmpFile.length();
        sampleFile.delete();
        byte[] bArrD = AbstractC5702lU.d(tmpFile);
        String string = Uri.parse(CoreTracerConfiguration.INSTANCE.get().getApiUrl()).buildUpon().appendEncodedPath("api/sample/upload").appendQueryParameter("uploadToken", uploadToken).toString();
        O90.e(string, "CoreTracerConfiguration.…)\n            .toString()");
        HttpMultipartBodyBuilder httpMultipartBodyBuilder = new HttpMultipartBodyBuilder();
        httpMultipartBodyBuilder.add("file", "sample", HttpRequestBody.INSTANCE.fromBytes("application/octet-stream", bArrD));
        try {
            httpResponseExecute = Tracer.INSTANCE.getHttpClient().execute(new HttpRequest(string, httpMultipartBodyBuilder.build()));
        } catch (Exception unused) {
        } catch (Throwable th) {
            tmpFile.delete();
            throw th;
        }
        try {
            httpResponseExecute.getStatusCode();
            httpResponseExecute.getMessage();
            HttpResponseBody body = httpResponseExecute.getBody();
            String contentType = body != null ? body.getContentType() : null;
            HttpResponseBody body2 = httpResponseExecute.getBody();
            NetworkResponseHandler.INSTANCE.universalHandleResponse(contentType, (body2 == null || (bytes = body2.getBytes()) == null) ? null : D51.h(bytes), getFeatureName(), getTag());
            AbstractC2141aT1.a(httpResponseExecute, null);
            tmpFile.delete();
        } finally {
        }
    }

    @Override // androidx.work.Worker
    public AbstractC1061Nj0 doWork() {
        File file;
        File file2 = null;
        try {
            String strB = getInputData().b(PARAM_SAMPLE_FILE_PATH);
            O90.c(strB);
            file = new File(strB);
        } catch (Exception unused) {
            file = null;
        }
        try {
        } catch (Exception unused2) {
            if (0 != 0 && file2.exists()) {
                file2.delete();
            }
            if (file != null && file.exists()) {
                file.delete();
            }
            return AbstractC1061Nj0.a();
        }
        if (!file.exists()) {
            Logger.w$default("sample file not exists with path: " + file.getPath(), null, 2, null);
            return AbstractC1061Nj0.a();
        }
        Object obj = getInputData().a.get(PARAM_VERSION_CODE);
        long jLongValue = obj instanceof Long ? ((Long) obj).longValue() : 0L;
        PackageManager packageManager = getApplicationContext().getPackageManager();
        O90.e(packageManager, "applicationContext.packageManager");
        String packageName = getApplicationContext().getPackageName();
        O90.e(packageName, "applicationContext.packageName");
        if (PackageInfoCompat.getLongVersionCodeCompat(PackageManagerCompat.getPackageInfoCompat(packageManager, packageName, 0)) != jLongValue) {
            file.delete();
            return AbstractC1061Nj0.a();
        }
        String uploadToken = getUploadToken();
        if (uploadToken != null) {
            TracerFiles tracerFiles = TracerFiles.INSTANCE;
            Context applicationContext = getApplicationContext();
            O90.e(applicationContext, "applicationContext");
            String string = getId().toString();
            O90.e(string, "id.toString()");
            uploadFile(uploadToken, file, tracerFiles.createTempFile(applicationContext, string));
        }
        return AbstractC1061Nj0.a();
    }
}
