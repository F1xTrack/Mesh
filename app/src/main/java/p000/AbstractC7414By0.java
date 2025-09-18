package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: By0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7414By0 {

    /* renamed from: a */
    public static final Feature[] f1103a = new Feature[0];

    /* renamed from: b */
    public static final Feature f1104b;

    /* renamed from: c */
    public static final C7937Lz1 f1105c;

    /* renamed from: d */
    public static final C7937Lz1 f1106d;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f1104b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        Feature feature3 = new Feature("vision.face", 1L);
        Feature feature4 = new Feature("vision.ica", 1L);
        Feature feature5 = new Feature("vision.ocr", 1L);
        new Feature("mlkit.ocr.chinese", 1L);
        new Feature("mlkit.ocr.common", 1L);
        new Feature("mlkit.ocr.devanagari", 1L);
        new Feature("mlkit.ocr.japanese", 1L);
        new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        new Feature("mlkit.image.caption", 1L);
        new Feature("mlkit.docscan.detect", 1L);
        new Feature("mlkit.docscan.crop", 1L);
        new Feature("mlkit.docscan.enhance", 1L);
        new Feature("mlkit.docscan.ui", 1L);
        new Feature("mlkit.docscan.stain", 1L);
        new Feature("mlkit.docscan.shadow", 1L);
        new Feature("mlkit.quality.aesthetic", 1L);
        new Feature("mlkit.quality.technical", 1L);
        new Feature("mlkit.segmentation.subject", 1L);
        C1356VY c1356vy = new C1356VY();
        c1356vy.m8500i0("barcode", feature);
        c1356vy.m8500i0("custom_ica", feature2);
        c1356vy.m8500i0("face", feature3);
        c1356vy.m8500i0("ica", feature4);
        c1356vy.m8500i0("ocr", feature5);
        c1356vy.m8500i0("langid", feature6);
        c1356vy.m8500i0("nlclassifier", feature7);
        c1356vy.m8500i0("tflite_dynamite", feature8);
        c1356vy.m8500i0("barcode_ui", feature9);
        c1356vy.m8500i0("smart_reply", feature10);
        C11992zy1 c11992zy1 = (C11992zy1) c1356vy.f12613d;
        if (c11992zy1 != null) {
            throw c11992zy1.m26595a();
        }
        C7937Lz1 c7937Lz1M5178a = C7937Lz1.m5178a(c1356vy.f12611b, (Object[]) c1356vy.f12612c, c1356vy);
        C11992zy1 c11992zy12 = (C11992zy1) c1356vy.f12613d;
        if (c11992zy12 != null) {
            throw c11992zy12.m26595a();
        }
        f1105c = c7937Lz1M5178a;
        C1356VY c1356vy2 = new C1356VY();
        c1356vy2.m8500i0("com.google.android.gms.vision.barcode", feature);
        c1356vy2.m8500i0("com.google.android.gms.vision.custom.ica", feature2);
        c1356vy2.m8500i0("com.google.android.gms.vision.face", feature3);
        c1356vy2.m8500i0("com.google.android.gms.vision.ica", feature4);
        c1356vy2.m8500i0("com.google.android.gms.vision.ocr", feature5);
        c1356vy2.m8500i0("com.google.android.gms.mlkit.langid", feature6);
        c1356vy2.m8500i0("com.google.android.gms.mlkit.nlclassifier", feature7);
        c1356vy2.m8500i0("com.google.android.gms.tflite_dynamite", feature8);
        c1356vy2.m8500i0("com.google.android.gms.mlkit_smartreply", feature10);
        C11992zy1 c11992zy13 = (C11992zy1) c1356vy2.f12613d;
        if (c11992zy13 != null) {
            throw c11992zy13.m26595a();
        }
        C7937Lz1 c7937Lz1M5178a2 = C7937Lz1.m5178a(c1356vy2.f12611b, (Object[]) c1356vy2.f12612c, c1356vy2);
        C11992zy1 c11992zy14 = (C11992zy1) c1356vy2.f12613d;
        if (c11992zy14 != null) {
            throw c11992zy14.m26595a();
        }
        f1106d = c7937Lz1M5178a2;
    }

    /* renamed from: a */
    public static void m931a(Context context, List list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            ModuleInstall.getClient(context).installModules(ModuleInstallRequest.newBuilder().addApi(new C9766iX1(m932b(f1105c, list), 0)).build()).mo11136c(new C9476gG1(4));
        } else {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(StringUtils.COMMA, list));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
        }
    }

    /* renamed from: b */
    public static Feature[] m932b(C7937Lz1 c7937Lz1, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i = 0; i < list.size(); i++) {
            featureArr[i] = (Feature) Preconditions.checkNotNull((Feature) c7937Lz1.get(list.get(i)));
        }
        return featureArr;
    }
}
