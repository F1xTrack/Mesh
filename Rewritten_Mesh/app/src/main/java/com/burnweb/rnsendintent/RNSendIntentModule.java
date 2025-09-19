package com.burnweb.rnsendintent;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.PowerManager;
import android.provider.CalendarContract;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000.AbstractC0345FT;
import p000.C10585ox0;
import p000.C11905zH0;
import p000.C6937uF;
import p000.C8539Xo1;
import p000.RunnableC1192Sx;
import p000.RunnableC1483XZ;

/* loaded from: classes.dex */
public class RNSendIntentModule extends ReactContextBaseJavaModule {
    private static final int FILE_SELECT_CODE = 20190903;
    private static final String TAG = "RNSendIntentModule";
    private static final String TEXT_HTML = "text/html";
    private static final String TEXT_PLAIN = "text/plain";
    private static final String[] VALID_RECURRENCE = {"DAILY", "WEEKLY", "MONTHLY", "YEARLY"};
    private final ActivityEventListener mActivityEventListener;
    private Callback mCallback;
    private ReactApplicationContext reactContext;

    public RNSendIntentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C11905zH0 c11905zH0 = new C11905zH0(this, 2);
        this.mActivityEventListener = c11905zH0;
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(c11905zH0);
    }

    private Intent getSendIntent(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType(str2);
        intent.addFlags(268435456);
        return intent;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean parseExtras(com.facebook.react.bridge.ReadableMap r25, android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.burnweb.rnsendintent.RNSendIntentModule.parseExtras(com.facebook.react.bridge.ReadableMap, android.content.Intent):boolean");
    }

    @ReactMethod
    public void addCalendarEvent(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            calendar.setTime(simpleDateFormat.parse(str3));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar2 = Calendar.getInstance();
        try {
            calendar2.setTime(simpleDateFormat.parse(str4));
        } catch (ParseException e2) {
            e2.printStackTrace();
        }
        Intent intentPutExtra = new Intent("android.intent.action.INSERT").addFlags(268435456).setData(CalendarContract.Events.CONTENT_URI).putExtra("beginTime", calendar.getTimeInMillis()).putExtra("endTime", calendar2.getTimeInMillis()).putExtra("allDay", bool).putExtra("title", str).putExtra("description", str2).putExtra("eventLocation", str6);
        if (Arrays.asList(VALID_RECURRENCE).contains(str5.toUpperCase())) {
            intentPutExtra.putExtra("rrule", "FREQ=" + str5.toUpperCase());
        }
        if (intentPutExtra.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intentPutExtra);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("TEXT_PLAIN", TEXT_PLAIN);
        map.put("TEXT_HTML", TEXT_HTML);
        return map;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SendIntentAndroid";
    }

    @ReactMethod
    public void getPhoneNumber(Promise promise) {
        promise.resolve(((TelephonyManager) this.reactContext.getSystemService("phone")).getLine1Number());
    }

    @ReactMethod
    public void getVoiceMailNumber(Promise promise) {
        promise.resolve(((TelephonyManager) this.reactContext.getSystemService("phone")).getVoiceMailNumber());
    }

    @ReactMethod
    public void gotoHomeScreen() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        this.reactContext.startActivity(intent);
    }

    @ReactMethod
    public void installRemoteApp(String str, String str2, Promise promise) {
        File file = new File(this.reactContext.getExternalFilesDir(null), str2);
        C6937uF c6937uF = new C6937uF(9, false);
        c6937uF.m25136G(str);
        new C10585ox0().m23580b(c6937uF.m25141o()).m1669f(new C8539Xo1(this, promise, file, 22));
    }

    @ReactMethod
    public void isAppInstalled(String str, Promise promise) {
        if (this.reactContext.getPackageManager().getLaunchIntentForPackage(str) == null) {
            promise.resolve(Boolean.FALSE);
        } else {
            promise.resolve(Boolean.TRUE);
        }
    }

    @ReactMethod
    public void openAllEmailApp() {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", "");
        intent.putExtra("android.intent.extra.SUBJECT", "");
        PackageManager packageManager = this.reactContext.getPackageManager();
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            arrayList.add(packageManager.getLaunchIntentForPackage(it.next().activityInfo.packageName));
        }
        Intent intentCreateChooser = Intent.createChooser(new Intent(), "Select your Inbox");
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        getCurrentActivity().startActivity(intentCreateChooser);
    }

    @ReactMethod
    public void openApp(String str, ReadableMap readableMap, Promise promise) {
        Intent launchIntentForPackage = this.reactContext.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            promise.resolve(Boolean.FALSE);
        } else {
            if (!parseExtras(readableMap, launchIntentForPackage)) {
                promise.resolve(Boolean.FALSE);
                return;
            }
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            this.reactContext.startActivity(launchIntentForPackage);
            promise.resolve(Boolean.TRUE);
        }
    }

    @ReactMethod
    public void openAppWithData(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        Uri uri = Uri.parse(str2);
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str3 != null) {
            intent.setDataAndType(uri, str3);
        } else {
            intent.setData(uri);
        }
        intent.setPackage(str);
        if (!parseExtras(readableMap, intent)) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        intent.addFlags(268435456);
        this.reactContext.startActivity(intent);
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void openAppWithUri(String str, ReadableMap readableMap, Promise promise) throws URISyntaxException {
        try {
            Intent uri = Intent.parseUri(str, 1);
            uri.addFlags(268435456);
            if (this.reactContext.getPackageManager().getLaunchIntentForPackage(uri.getPackage()) != null) {
                this.reactContext.startActivity(uri);
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=" + uri.getPackage()));
                intent.addFlags(268435456);
                this.reactContext.startActivity(intent);
            }
            promise.resolve(Boolean.TRUE);
        } catch (Exception unused) {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public void openApplicationSettings() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("package:" + this.reactContext.getPackageName()));
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void openCalendar() {
        new ComponentName("com.android.calendar", "com.android.calendar.LaunchActivity");
        Intent type = new Intent().addFlags(268435456).setType("vnd.android.cursor.item/event");
        if (type.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(type);
        }
    }

    @ReactMethod
    public void openCamera() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.addFlags(268435456);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void openChooserWithMultipleOptions(ReadableArray readableArray, String str) {
        readableArray.toArrayList();
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        ArrayList arrayList = new ArrayList();
        String str2 = "android.intent.extra.TEXT";
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            if (map.hasKey("subject")) {
                intent.putExtra("android.intent.extra.SUBJECT", map.getString("subject"));
            }
            if (map.hasKey("text")) {
                intent.putExtra("android.intent.extra.TEXT", map.getString("text"));
            }
            if (map.hasKey("imageUrl")) {
                File file = new File(map.getString("imageUrl"));
                arrayList.add(AbstractC0345FT.m2663d(this.reactContext, this.reactContext.getPackageName() + ".fileprovider", file));
                intent.setType("image/*");
            } else if (map.hasKey("videoUrl")) {
                File file2 = new File(map.getString("videoUrl"));
                Uri uriM2663d = AbstractC0345FT.m2663d(this.reactContext, this.reactContext.getPackageName() + ".fileprovider", file2);
                if (!map.hasKey("subject")) {
                    intent.putExtra("android.intent.extra.SUBJECT", "Untitled_Video");
                }
                arrayList.add(uriM2663d);
                intent.setType("video/*");
            } else {
                intent.setType(TEXT_PLAIN);
            }
            str2 = "android.intent.extra.STREAM";
        }
        intent.putExtra(str2, arrayList);
        intent.addFlags(268435456);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.startActivity(Intent.createChooser(intent, str));
        }
    }

    @ReactMethod
    public void openChooserWithOptions(ReadableMap readableMap, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        if (readableMap.hasKey("subject")) {
            intent.putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (readableMap.hasKey("text")) {
            intent.putExtra("android.intent.extra.TEXT", readableMap.getString("text"));
        }
        if (readableMap.hasKey("imageUrl")) {
            File file = new File(readableMap.getString("imageUrl"));
            intent.putExtra("android.intent.extra.STREAM", AbstractC0345FT.m2663d(this.reactContext, this.reactContext.getPackageName() + ".fileprovider", file));
            intent.setType("image/*");
        } else if (readableMap.hasKey("videoUrl")) {
            File file2 = new File(readableMap.getString("videoUrl"));
            Uri uriM2663d = AbstractC0345FT.m2663d(this.reactContext, this.reactContext.getPackageName() + ".fileprovider", file2);
            if (!readableMap.hasKey("subject")) {
                intent.putExtra("android.intent.extra.SUBJECT", "Untitled_Video");
            }
            intent.putExtra("android.intent.extra.STREAM", uriM2663d);
            intent.setType("video/*");
        } else {
            intent.setType(TEXT_PLAIN);
        }
        intent.addFlags(268435456);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.startActivity(Intent.createChooser(intent, str));
        }
    }

    @ReactMethod
    public void openChromeIntent(String str, Promise promise) throws URISyntaxException {
        PackageManager packageManager = this.reactContext.getPackageManager();
        try {
            Intent uri = Intent.parseUri(str, 1);
            uri.addFlags(268435456);
            if (packageManager.resolveActivity(uri, 0) != null) {
                this.reactContext.startActivity(uri);
                promise.resolve(Boolean.TRUE);
                return;
            }
            String stringExtra = uri.getStringExtra("browser_fallback_url");
            if (stringExtra == null) {
                promise.resolve(Boolean.FALSE);
                return;
            }
            this.reactContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(stringExtra)));
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            e.printStackTrace();
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public void openDownloadManager() {
        Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
        intent.addFlags(268435456);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void openEmailApp() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.APP_EMAIL");
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void openFileChooser(ReadableMap readableMap, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (readableMap.hasKey("subject")) {
            intent.putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        File file = new File(readableMap.getString("fileUrl"));
        if (Build.VERSION.SDK_INT > 23) {
            intent.setDataAndType(AbstractC0345FT.m2663d(this.reactContext, this.reactContext.getPackageName() + ".fileprovider", file), readableMap.getString("type"));
        } else {
            intent.setDataAndType(Uri.fromFile(file), readableMap.getString("type"));
        }
        intent.addFlags(268435457);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.startActivity(Intent.createChooser(intent, str));
        }
    }

    @ReactMethod
    public void openFilePicker(ReadableMap readableMap, Callback callback) {
        this.mCallback = callback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType(readableMap.getString("type"));
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            getCurrentActivity().startActivityForResult(Intent.createChooser(intent, readableMap.getString("title")), FILE_SELECT_CODE);
        } catch (ActivityNotFoundException unused) {
        }
    }

    @ReactMethod
    public void openMaps(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + str));
        intent.addFlags(268435456);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void openMapsWithRoute(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("google.navigation:q=" + str + "&mode=" + str2));
        intent.addFlags(268435456);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void openSettings(String str) {
        Intent intent = new Intent(str);
        intent.setFlags(268435456);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void requestIgnoreBatteryOptimizations(Promise promise) {
        if (!((PowerManager) this.reactContext.getSystemService("power")).isIgnoringBatteryOptimizations(this.reactContext.getPackageName())) {
            Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(Uri.fromParts("package", this.reactContext.getPackageName(), null));
            intent.addFlags(268435456);
            if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
                this.reactContext.startActivity(intent);
                promise.resolve(Boolean.TRUE);
                return;
            }
        }
        promise.resolve(Boolean.FALSE);
    }

    @ReactMethod
    public void sendMail(String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", str3);
        intent.addFlags(268435456);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void sendPhoneCall(String str, Boolean bool) {
        Intent intent = new Intent("android.intent.action.CALL", Uri.parse("tel:" + str.replaceAll("#", "%23").trim()));
        intent.addFlags(268435456);
        if (bool.booleanValue()) {
            intent.setPackage("com.android.server.telecom");
        }
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            try {
                this.reactContext.startActivity(intent);
            } catch (SecurityException e) {
                e.getMessage();
                sendPhoneDial(str, bool);
            }
        }
    }

    @ReactMethod
    public void sendPhoneDial(String str, Boolean bool) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str.trim()));
        intent.addFlags(268435456);
        if (bool.booleanValue()) {
            intent.setPackage("com.android.server.telecom");
        }
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void sendSms(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("sms:" + str.trim()));
        intent.addFlags(268435456);
        if (str2 != null) {
            intent.putExtra("sms_body", str2);
        }
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void sendText(String str, String str2) {
        Intent sendIntent = getSendIntent(str, str2);
        if (sendIntent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.runOnUiQueueThread(new RunnableC1483XZ(this, sendIntent, false, 15));
        }
    }

    @ReactMethod
    public void sendTextWithTitle(String str, String str2, String str3) {
        Intent sendIntent = getSendIntent(str2, str3);
        if (sendIntent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.runOnUiQueueThread(new RunnableC1192Sx(this, sendIntent, str, 8, false));
        }
    }

    @ReactMethod
    public void shareImageToInstagram(String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage("com.instagram.android");
        intent.setFlags(268435456);
        intent.setAction("android.intent.action.SEND");
        intent.setType(str);
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str2));
        this.reactContext.startActivity(intent);
    }

    @ReactMethod
    public void shareTextToLine(ReadableMap readableMap) {
        ComponentName componentName = new ComponentName("jp.naver.line.android", "jp.naver.line.android.activity.selectchat.SelectChatActivity");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setFlags(268435456);
        intent.setType(TEXT_PLAIN);
        if (readableMap.hasKey("text")) {
            intent.putExtra("android.intent.extra.TEXT", readableMap.getString("text"));
        }
        intent.setComponent(componentName);
        this.reactContext.startActivity(intent);
    }

    @ReactMethod
    public void showIgnoreBatteryOptimizationsSettings() {
        Intent intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        intent.addFlags(268435456);
        if (intent.resolveActivity(this.reactContext.getPackageManager()) != null) {
            this.reactContext.startActivity(intent);
        }
    }
}
