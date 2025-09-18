package p000;

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

/* renamed from: M2 */
/* loaded from: classes.dex */
public final class C0758M2 extends AbstractC0696L2 {

    /* renamed from: a */
    public final int f6971a;

    public C0758M2() {
        int i = Build.VERSION.SDK_INT;
        int pickImagesMaxLimit = (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
        this.f6971a = pickImagesMaxLimit;
        if (pickImagesMaxLimit <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    @Override // p000.AbstractC0696L2
    /* renamed from: b */
    public final C0633K2 mo4867b(Context context, Object obj) {
        O90.m5968f((C8692aB0) obj, "input");
        return null;
    }

    @Override // p000.AbstractC0696L2
    /* renamed from: c */
    public final Object mo4868c(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        C0779MN c0779mn = C0779MN.f7117a;
        if (intent == null) {
            return c0779mn;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            return c0779mn;
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

    @Override // p000.AbstractC0696L2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Intent mo4866a(Context context, C8692aB0 c8692aB0) {
        O90.m5968f(context, "context");
        O90.m5968f(c8692aB0, "input");
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2);
        int i2 = this.f6971a;
        if (z) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(GM1.m3052e(c8692aB0.f15379a));
            if (i2 > MediaStore.getPickImagesMaxLimit()) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", i2);
            return intent;
        }
        if (GM1.m3051d(context) != null) {
            ResolveInfo resolveInfoM3051d = GM1.m3051d(context);
            if (resolveInfoM3051d == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveInfoM3051d.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(GM1.m3052e(c8692aB0.f15379a));
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", i2);
            return intent2;
        }
        if (GM1.m3050c(context) != null) {
            ResolveInfo resolveInfoM3050c = GM1.m3050c(context);
            if (resolveInfoM3050c == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = resolveInfoM3050c.activityInfo;
            Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", i2);
            return intent3;
        }
        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent4.setType(GM1.m3052e(c8692aB0.f15379a));
        intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (intent4.getType() != null) {
            return intent4;
        }
        intent4.setType("*/*");
        intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        return intent4;
    }
}
