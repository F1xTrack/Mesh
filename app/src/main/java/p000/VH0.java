package p000;

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

    /* renamed from: e */
    public static final Pattern f12488e = Pattern.compile("^.+:.+/");

    /* renamed from: f */
    public static VH0 f12489f;

    /* renamed from: a */
    public Promise f12490a;

    /* renamed from: b */
    public Boolean f12491b;

    /* renamed from: c */
    public Activity f12492c;

    /* renamed from: d */
    public C7621Fx1 f12493d;

    /* renamed from: a */
    public static String m8385a(Context context) {
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

    /* renamed from: b */
    public static VH0 m8386b() {
        if (f12489f == null) {
            f12489f = new VH0();
        }
        return f12489f;
    }

    /* renamed from: c */
    public static int m8387c(Context context, String str) {
        return f12488e.matcher(str).find() ? context.getResources().getIdentifier(str, null, null) : context.getResources().getIdentifier(str, "anim", context.getPackageName());
    }

    /* renamed from: d */
    public static Integer m8388d(C1396WB c1396wb, ReadableMap readableMap, String str, String str2, String str3) {
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
                    C1396WB.class.getDeclaredMethod(str2, Integer.TYPE).invoke(c1396wb, numValueOf);
                    return numValueOf;
                } catch (Exception e) {
                    e = e;
                    if (!(e instanceof IllegalArgumentException)) {
                        return numValueOf;
                    }
                    throw new JSApplicationIllegalArgumentException("Invalid " + str3 + " color '" + string + "': " + e.getMessage());
                }
            } catch (Throwable unused) {
                return numValueOf;
            }
        } catch (Exception e2) {
            e = e2;
            string = null;
        }
    }

    /* renamed from: e */
    public final void m8389e() {
        if (C6741rP.m24327b().m24330e(this)) {
            C6741rP c6741rPM24327b = C6741rP.m24327b();
            synchronized (c6741rPM24327b) {
                try {
                    List list = (List) c6741rPM24327b.f41648b.get(this);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            List list2 = (List) c6741rPM24327b.f41647a.get((Class) it.next());
                            if (list2 != null) {
                                int size = list2.size();
                                int i = 0;
                                while (i < size) {
                                    Q51 q51 = (Q51) list2.get(i);
                                    if (q51.f9477a == this) {
                                        q51.f9479c = false;
                                        list2.remove(i);
                                        i--;
                                        size--;
                                    }
                                    i++;
                                }
                            }
                        }
                        c6741rPM24327b.f41648b.remove(this);
                    } else {
                        c6741rPM24327b.f41662p.mo7643a(Level.WARNING, "Subscriber to unregister was not registered before: " + VH0.class);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @L51
    public void onEvent(C0998Pr c0998Pr) {
        m8389e();
        if (this.f12490a == null) {
            return;
        }
        boolean zBooleanValue = c0998Pr.f9302c.booleanValue();
        String str = c0998Pr.f9300a;
        if (zBooleanValue) {
            this.f12490a.reject("InAppBrowser", str);
        } else {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("type", c0998Pr.f9301b);
            writableMapCreateMap.putString("message", str);
            this.f12490a.resolve(writableMapCreateMap);
        }
        this.f12490a = null;
    }
}
