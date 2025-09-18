package defpackage;

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
public abstract class AbstractC0171By0 {
    public static final Feature[] a = new Feature[0];
    public static final Feature b;
    public static final C0954Lz1 c;
    public static final C0954Lz1 d;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        b = feature;
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
        VY vy = new VY();
        vy.i0("barcode", feature);
        vy.i0("custom_ica", feature2);
        vy.i0("face", feature3);
        vy.i0("ica", feature4);
        vy.i0("ocr", feature5);
        vy.i0("langid", feature6);
        vy.i0("nlclassifier", feature7);
        vy.i0("tflite_dynamite", feature8);
        vy.i0("barcode_ui", feature9);
        vy.i0("smart_reply", feature10);
        C8463zy1 c8463zy1 = (C8463zy1) vy.d;
        if (c8463zy1 != null) {
            throw c8463zy1.a();
        }
        C0954Lz1 c0954Lz1A = C0954Lz1.a(vy.b, (Object[]) vy.c, vy);
        C8463zy1 c8463zy12 = (C8463zy1) vy.d;
        if (c8463zy12 != null) {
            throw c8463zy12.a();
        }
        c = c0954Lz1A;
        VY vy2 = new VY();
        vy2.i0("com.google.android.gms.vision.barcode", feature);
        vy2.i0("com.google.android.gms.vision.custom.ica", feature2);
        vy2.i0("com.google.android.gms.vision.face", feature3);
        vy2.i0("com.google.android.gms.vision.ica", feature4);
        vy2.i0("com.google.android.gms.vision.ocr", feature5);
        vy2.i0("com.google.android.gms.mlkit.langid", feature6);
        vy2.i0("com.google.android.gms.mlkit.nlclassifier", feature7);
        vy2.i0("com.google.android.gms.tflite_dynamite", feature8);
        vy2.i0("com.google.android.gms.mlkit_smartreply", feature10);
        C8463zy1 c8463zy13 = (C8463zy1) vy2.d;
        if (c8463zy13 != null) {
            throw c8463zy13.a();
        }
        C0954Lz1 c0954Lz1A2 = C0954Lz1.a(vy2.b, (Object[]) vy2.c, vy2);
        C8463zy1 c8463zy14 = (C8463zy1) vy2.d;
        if (c8463zy14 != null) {
            throw c8463zy14.a();
        }
        d = c0954Lz1A2;
    }

    public static void a(Context context, List list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            ModuleInstall.getClient(context).installModules(ModuleInstallRequest.newBuilder().addApi(new C4364iX1(b(c, list), 0)).build()).c(new C3931gG1(4));
        } else {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(StringUtils.COMMA, list));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
        }
    }

    public static Feature[] b(C0954Lz1 c0954Lz1, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i = 0; i < list.size(); i++) {
            featureArr[i] = (Feature) Preconditions.checkNotNull((Feature) c0954Lz1.get(list.get(i)));
        }
        return featureArr;
    }
}
