package ru.ok.tracer.upload;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.AbstractC8069xu;
import defpackage.C0844Ko1;
import defpackage.C1623Uo1;
import defpackage.C4061gy;
import defpackage.C5602ky0;
import defpackage.C5793ly0;
import defpackage.C8317zC;
import defpackage.O90;
import defpackage.SN;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.tracer.CoreTracerConfiguration;
import ru.ok.tracer.TracerFeature;
import ru.ok.tracer.base.compat.PackageInfoCompat;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.upload.SampleUploadWorker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ok/tracer/upload/SampleUploader;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ok/tracer/TracerFeature;", "feature", "Ljava/io/File;", "sampleFile", "", "useGzip", "", "tag", "", "attr1", "", "customProperties", "LTf1;", "upload", "(Landroid/content/Context;Lru/ok/tracer/TracerFeature;Ljava/io/File;ZLjava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V", "tracer-sample-upload_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SampleUploader {
    public static final SampleUploader INSTANCE = new SampleUploader();

    private SampleUploader() {
    }

    public final void upload(Context context, TracerFeature feature, File sampleFile, boolean useGzip, String tag, Long attr1, Map<String, String> customProperties) {
        int i;
        boolean z;
        O90.f(context, "context");
        O90.f(feature, "feature");
        O90.f(sampleFile, "sampleFile");
        O90.f(customProperties, "customProperties");
        SampleUploadWorker.Companion companion = SampleUploadWorker.INSTANCE;
        PackageManager packageManager = context.getPackageManager();
        O90.e(packageManager, "context.packageManager");
        String packageName = context.getPackageName();
        O90.e(packageName, "context.packageName");
        C8317zC c8317zCCreateData = companion.createData(feature, sampleFile, useGzip, tag, attr1, PackageInfoCompat.getLongVersionCodeCompat(PackageManagerCompat.getPackageInfoCompat(packageManager, packageName, 0)), customProperties);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (CoreTracerConfiguration.INSTANCE.get().getDebugUpload()) {
            i = 1;
            z = false;
        } else {
            i = 3;
            z = true;
        }
        C4061gy c4061gy = new C4061gy(i, false, z, z, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? AbstractC8069xu.g0(linkedHashSet) : SN.a);
        C5602ky0 c5602ky0 = new C5602ky0(SampleUploadWorker.class);
        ((C1623Uo1) c5602ky0.c).j = c4061gy;
        O90.f(c8317zCCreateData, "inputData");
        ((C1623Uo1) c5602ky0.c).e = c8317zCCreateData;
        C0844Ko1.d(context).a((C5793ly0) c5602ky0.b());
    }
}
