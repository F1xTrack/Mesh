package defpackage;

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

/* loaded from: classes.dex */
public final class S2 extends L2 {
    public final /* synthetic */ int a;

    public /* synthetic */ S2(int i) {
        this.a = i;
    }

    @Override // defpackage.L2
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                return d(context, (C2086aB0) obj);
            case 1:
                String[] strArr = (String[]) obj;
                O90.f(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                O90.e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 2:
                Intent intent = (Intent) obj;
                O90.f(intent, "input");
                return intent;
            case 3:
                C6404p90 c6404p90 = (C6404p90) obj;
                O90.f(c6404p90, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c6404p90);
                O90.e(intentPutExtra2, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return intentPutExtra2;
            default:
                C6404p90 c6404p902 = (C6404p90) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = c6404p902.b;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = c6404p902.a;
                        O90.f(intentSender, "intentSender");
                        c6404p902 = new C6404p90(intentSender, null, c6404p902.c, c6404p902.d);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c6404p902);
                if (Log.isLoggable("FragmentManager", 2)) {
                    intent2.toString();
                }
                return intent2;
        }
    }

    @Override // defpackage.L2
    public K2 b(Context context, Object obj) {
        switch (this.a) {
            case 0:
                O90.f((C2086aB0) obj, "input");
                return null;
            case 1:
                String[] strArr = (String[]) obj;
                O90.f(strArr, "input");
                if (strArr.length == 0) {
                    return new K2(NN.a);
                }
                for (String str : strArr) {
                    if (AbstractC3556eJ.a(context, str) != 0) {
                        return null;
                    }
                }
                int iB = AbstractC7287tn0.b(strArr.length);
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new K2(linkedHashMap);
            default:
                return super.b(context, obj);
        }
    }

    @Override // defpackage.L2
    public final Object c(int i, Intent intent) {
        List arrayList;
        switch (this.a) {
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
                            arrayList = MN.a;
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
                        data = (Uri) AbstractC8069xu.C(arrayList);
                    }
                    break;
                }
                break;
            case 1:
                NN nn = NN.a;
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
        return new I2(i, intent);
    }

    public Intent d(Context context, C2086aB0 c2086aB0) {
        Intent intent;
        O90.f(context, "context");
        O90.f(c2086aB0, "input");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(GM1.e(c2086aB0.a));
            return intent2;
        }
        if (GM1.d(context) != null) {
            ResolveInfo resolveInfoD = GM1.d(context);
            if (resolveInfoD == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveInfoD.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent.setType(GM1.e(c2086aB0.a));
        } else {
            if (GM1.c(context) == null) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(GM1.e(c2086aB0.a));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            ResolveInfo resolveInfoC = GM1.c(context);
            if (resolveInfoC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = resolveInfoC.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent.setType(GM1.e(c2086aB0.a));
        }
        return intent;
    }
}
