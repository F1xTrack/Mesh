package p000;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: S2 */
/* loaded from: classes.dex */
public final class C1135S2 extends AbstractC0696L2 {

    /* renamed from: a */
    public final /* synthetic */ int f10538a;

    public /* synthetic */ C1135S2(int i) {
        this.f10538a = i;
    }

    @Override // p000.AbstractC0696L2
    /* renamed from: a */
    public final Intent mo4866a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f10538a) {
            case 0:
                return m7152d(context, (C8692aB0) obj);
            case 1:
                String[] strArr = (String[]) obj;
                O90.m5968f(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                O90.m5967e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 2:
                Intent intent = (Intent) obj;
                O90.m5968f(intent, "input");
                return intent;
            case 3:
                C10613p90 c10613p90 = (C10613p90) obj;
                O90.m5968f(c10613p90, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c10613p90);
                O90.m5967e(intentPutExtra2, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return intentPutExtra2;
            default:
                C10613p90 c10613p902 = (C10613p90) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = c10613p902.f39869b;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = c10613p902.f39868a;
                        O90.m5968f(intentSender, "intentSender");
                        c10613p902 = new C10613p90(intentSender, null, c10613p902.f39870c, c10613p902.f39871d);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c10613p902);
                if (Log.isLoggable("FragmentManager", 2)) {
                    intent2.toString();
                }
                return intent2;
        }
    }

    @Override // p000.AbstractC0696L2
    /* renamed from: b */
    public C0633K2 mo4867b(Context context, Object obj) {
        switch (this.f10538a) {
            case 0:
                O90.m5968f((C8692aB0) obj, "input");
                return null;
            case 1:
                String[] strArr = (String[]) obj;
                O90.m5968f(strArr, "input");
                if (strArr.length == 0) {
                    return new C0633K2(C0842NN.f7735a);
                }
                for (String str : strArr) {
                    if (AbstractC3982eJ.m17899a(context, str) != 0) {
                        return null;
                    }
                }
                int iM24983b = AbstractC11205tn0.m24983b(strArr.length);
                if (iM24983b < 16) {
                    iM24983b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new C0633K2(linkedHashMap);
            default:
                return super.mo4867b(context, obj);
        }
    }

    @Override // p000.AbstractC0696L2
    /* renamed from: c */
    public final Object mo4868c(int i, Intent intent) {
        List arrayList;
        switch (this.f10538a) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Uri data2 = intent.getData();
                        if (data2 != null) {
                            linkedHashSet.add(data2);
                        }
                        ClipData clipData = intent.getClipData();
                        if (clipData == null && linkedHashSet.isEmpty()) {
                            arrayList = C0779MN.f7117a;
                        } else {
                            if (clipData != null) {
                                int itemCount = clipData.getItemCount();
                                for (int i2 = 0; i2 < itemCount; i2++) {
                                    Uri uri = clipData.getItemAt(i2).getUri();
                                    if (uri != null) {
                                        linkedHashSet.add(uri);
                                    }
                                }
                            }
                            arrayList = new ArrayList(linkedHashSet);
                        }
                        data = (Uri) AbstractC7167xu.m25957C(arrayList);
                    }
                    break;
                }
                break;
            case 1:
                C0842NN c0842nn = C0842NN.f7735a;
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i3 == 0));
                        }
                        break;
                    }
                }
                break;
        }
        return new C0507I2(i, intent);
    }

    /* renamed from: d */
    public Intent m7152d(Context context, C8692aB0 c8692aB0) {
        Intent intent;
        O90.m5968f(context, "context");
        O90.m5968f(c8692aB0, "input");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(GM1.m3052e(c8692aB0.f15379a));
            return intent2;
        }
        if (GM1.m3051d(context) != null) {
            ResolveInfo resolveInfoM3051d = GM1.m3051d(context);
            if (resolveInfoM3051d == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveInfoM3051d.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent.setType(GM1.m3052e(c8692aB0.f15379a));
        } else {
            if (GM1.m3050c(context) == null) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(GM1.m3052e(c8692aB0.f15379a));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            ResolveInfo resolveInfoM3050c = GM1.m3050c(context);
            if (resolveInfoM3050c == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = resolveInfoM3050c.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent.setType(GM1.m3052e(c8692aB0.f15379a));
        }
        return intent;
    }
}
