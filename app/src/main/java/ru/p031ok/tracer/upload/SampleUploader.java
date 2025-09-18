package ru.p031ok.tracer.upload;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC7167xu;
import p000.C10075ky0;
import p000.C10203ly0;
import p000.C1156SN;
import p000.C4149gy;
import p000.C7249zC;
import p000.C7863Ko1;
import p000.C8383Uo1;
import p000.O90;
import ru.p031ok.tracer.CoreTracerConfiguration;
import ru.p031ok.tracer.TracerFeature;
import ru.p031ok.tracer.base.compat.PackageInfoCompat;
import ru.p031ok.tracer.base.compat.PackageManagerCompat;
import ru.p031ok.tracer.upload.SampleUploadWorker;

@Metadata(m22266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m22267d2 = {"Lru/ok/tracer/upload/SampleUploader;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ok/tracer/TracerFeature;", "feature", "Ljava/io/File;", "sampleFile", "", "useGzip", "", "tag", "", "attr1", "", "customProperties", "LTf1;", "upload", "(Landroid/content/Context;Lru/ok/tracer/TracerFeature;Ljava/io/File;ZLjava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V", "tracer-sample-upload_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SampleUploader {
    public static final SampleUploader INSTANCE = new SampleUploader();

    private SampleUploader() {
    }

    public final void upload(Context context, TracerFeature feature, File sampleFile, boolean useGzip, String tag, Long attr1, Map<String, String> customProperties) {
        int i;
        boolean z;
        O90.m5968f(context, "context");
        O90.m5968f(feature, "feature");
        O90.m5968f(sampleFile, "sampleFile");
        O90.m5968f(customProperties, "customProperties");
        SampleUploadWorker.Companion companion = SampleUploadWorker.INSTANCE;
        PackageManager packageManager = context.getPackageManager();
        O90.m5967e(packageManager, "context.packageManager");
        String packageName = context.getPackageName();
        O90.m5967e(packageName, "context.packageName");
        C7249zC c7249zCCreateData = companion.createData(feature, sampleFile, useGzip, tag, attr1, PackageInfoCompat.getLongVersionCodeCompat(PackageManagerCompat.getPackageInfoCompat(packageManager, packageName, 0)), customProperties);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (CoreTracerConfiguration.INSTANCE.get().getDebugUpload()) {
            i = 1;
            z = false;
        } else {
            i = 3;
            z = true;
        }
        C4149gy c4149gy = new C4149gy(i, false, z, z, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? AbstractC7167xu.m25987g0(linkedHashSet) : C1156SN.f10705a);
        C10075ky0 c10075ky0 = new C10075ky0(SampleUploadWorker.class);
        ((C8383Uo1) c10075ky0.f28106c).f12143j = c4149gy;
        O90.m5968f(c7249zCCreateData, "inputData");
        ((C8383Uo1) c10075ky0.f28106c).f12138e = c7249zCCreateData;
        C7863Ko1.m4736d(context).m4021a((C10203ly0) c10075ky0.m18675b());
    }
}
