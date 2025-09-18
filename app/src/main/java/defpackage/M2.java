package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class M2 extends L2 {
    public final int a;

    public M2() {
        int i = Build.VERSION.SDK_INT;
        int pickImagesMaxLimit = (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
        this.a = pickImagesMaxLimit;
        if (pickImagesMaxLimit <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    @Override // defpackage.L2
    public final K2 b(Context context, Object obj) {
        O90.f((C2086aB0) obj, "input");
        return null;
    }

    @Override // defpackage.L2
    public final Object c(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        MN mn = MN.a;
        if (intent == null) {
            return mn;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            return mn;
        }
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                Uri uri = clipData.getItemAt(i2).getUri();
                if (uri != null) {
                    linkedHashSet.add(uri);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }

    @Override // defpackage.L2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Intent a(Context context, C2086aB0 c2086aB0) {
        O90.f(context, "context");
        O90.f(c2086aB0, "input");
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2);
        int i2 = this.a;
        if (z) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(GM1.e(c2086aB0.a));
            if (i2 > MediaStore.getPickImagesMaxLimit()) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", i2);
            return intent;
        }
        if (GM1.d(context) != null) {
            ResolveInfo resolveInfoD = GM1.d(context);
            if (resolveInfoD == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveInfoD.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(GM1.e(c2086aB0.a));
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", i2);
            return intent2;
        }
        if (GM1.c(context) != null) {
            ResolveInfo resolveInfoC = GM1.c(context);
            if (resolveInfoC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = resolveInfoC.activityInfo;
            Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", i2);
            return intent3;
        }
        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent4.setType(GM1.e(c2086aB0.a));
        intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (intent4.getType() != null) {
            return intent4;
        }
        intent4.setType("*/*");
        intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        return intent4;
    }
}
