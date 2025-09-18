package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class WT1 {
    public static void a(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return;
        }
        while (true) {
            sb.append((CharSequence) it.next());
            if (!it.hasNext()) {
                return;
            } else {
                sb.append((CharSequence) HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
        }
    }

    public static final boolean b(Context context, String str) throws PackageManager.NameNotFoundException {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final void c(Activity activity, String str, InterfaceC5908mZ interfaceC5908mZ) {
        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return;
        }
        try {
            activity.startActivity(launchIntentForPackage);
        } catch (ActivityNotFoundException unused) {
            interfaceC5908mZ.invoke();
        }
    }

    public static final void d(Activity activity, String str, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(str, "url");
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            interfaceC5908mZ.invoke();
        }
    }
}
