package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class VH0 {
    public static final Pattern e = Pattern.compile("^.+:.+/");
    public static VH0 f;
    public Promise a;
    public Boolean b;
    public Activity c;
    public C0481Fx1 d;

    public static String a(Context context) {
        String str = null;
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setType("text/plain").setData(Uri.fromParts("http", "", null));
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(data, 65536);
        if (listQueryIntentActivities.size() == 0) {
            listQueryIntentActivities = context.getPackageManager().queryIntentActivities(data, 131072);
        }
        if (listQueryIntentActivities.size() > 0) {
            return listQueryIntentActivities.get(0).activityInfo.packageName;
        }
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        List listAsList = Arrays.asList("com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.google.android.apps.chrome");
        PackageManager packageManager = context.getPackageManager();
        List arrayList = listAsList == null ? new ArrayList() : listAsList;
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str2 = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            if (listAsList != null) {
                arrayList2.addAll(listAsList);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            intent.setPackage(str3);
            if (packageManager.resolveService(intent, 0) != null) {
                str = str3;
                break;
            }
        }
        return (str != null || listQueryIntentServices == null || listQueryIntentServices.size() <= 0) ? str : listQueryIntentServices.get(0).serviceInfo.packageName;
    }

    public static VH0 b() {
        if (f == null) {
            f = new VH0();
        }
        return f;
    }

    public static int c(Context context, String str) {
        return e.matcher(str).find() ? context.getResources().getIdentifier(str, null, null) : context.getResources().getIdentifier(str, "anim", context.getPackageName());
    }

    public static Integer d(WB wb, ReadableMap readableMap, String str, String str2, String str3) {
        String string;
        Integer numValueOf = null;
        try {
            try {
                if (!readableMap.hasKey(str)) {
                    return null;
                }
                string = readableMap.getString(str);
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(string));
                    WB.class.getDeclaredMethod(str2, Integer.TYPE).invoke(wb, numValueOf);
                    return numValueOf;
                } catch (Exception e2) {
                    e = e2;
                    if (!(e instanceof IllegalArgumentException)) {
                        return numValueOf;
                    }
                    throw new JSApplicationIllegalArgumentException("Invalid " + str3 + " color '" + string + "': " + e.getMessage());
                }
            } catch (Throwable unused) {
                return numValueOf;
            }
        } catch (Exception e3) {
            e = e3;
            string = null;
        }
    }

    public final void e() {
        if (C6832rP.b().e(this)) {
            C6832rP c6832rPB = C6832rP.b();
            synchronized (c6832rPB) {
                try {
                    List list = (List) c6832rPB.b.get(this);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            List list2 = (List) c6832rPB.a.get((Class) it.next());
                            if (list2 != null) {
                                int size = list2.size();
                                int i = 0;
                                while (i < size) {
                                    Q51 q51 = (Q51) list2.get(i);
                                    if (q51.a == this) {
                                        q51.c = false;
                                        list2.remove(i);
                                        i--;
                                        size--;
                                    }
                                    i++;
                                }
                            }
                        }
                        c6832rPB.b.remove(this);
                    } else {
                        c6832rPB.p.a(Level.WARNING, "Subscriber to unregister was not registered before: " + VH0.class);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @L51
    public void onEvent(C1240Pr c1240Pr) {
        e();
        if (this.a == null) {
            return;
        }
        boolean zBooleanValue = c1240Pr.c.booleanValue();
        String str = c1240Pr.a;
        if (zBooleanValue) {
            this.a.reject("InAppBrowser", str);
        } else {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("type", c1240Pr.b);
            writableMapCreateMap.putString("message", str);
            this.a.resolve(writableMapCreateMap);
        }
        this.a = null;
    }
}
