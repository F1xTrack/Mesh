package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.IOException;

/* loaded from: classes.dex */
public final class XJ extends R11 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ XJ(ReactApplicationContext reactApplicationContext, int i) {
        super(reactApplicationContext);
        this.f = i;
    }

    @Override // defpackage.AbstractC2038Zx
    public String a() {
        switch (this.f) {
            case 11:
                return "com.snap.mushroom.MainActivity";
            default:
                return super.a();
        }
    }

    @Override // defpackage.AbstractC2038Zx
    public final String b() {
        switch (this.f) {
        }
        return null;
    }

    @Override // defpackage.AbstractC2038Zx
    public final String d() {
        switch (this.f) {
            case 0:
                return "com.discord";
            case 1:
                return "com.google.android.gm";
            case 2:
                return "com.facebook.pages.app";
            case 3:
                return "com.facebook.katana";
            case 4:
                return "com.facebook.katana";
            case 5:
                return "com.google.android.apps.plus";
            case 6:
                return "com.instagram.android";
            case 7:
                return "com.instagram.android";
            case 8:
                return "com.linkedin.android";
            case 9:
                return "com.facebook.orca";
            case 10:
                return "com.pinterest";
            case 11:
                return "com.snapchat.android";
            case 12:
                return "org.telegram.messenger";
            case 13:
                return "com.twitter.android";
            case 14:
                return "com.viber.voip";
            case 15:
                return "com.whatsapp.w4b";
            default:
                return "com.whatsapp";
        }
    }

    @Override // defpackage.AbstractC2038Zx
    public final String e() {
        switch (this.f) {
            case 0:
                return "https://play.google.com/store/apps/details?id=com.discord";
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return "market://details?id=com.facebook.katana";
            case 5:
                return "market://details?id=com.google.android.apps.plus";
            case 6:
                return "https://play.google.com/store/apps/details?id=com.instagram.android";
            case 7:
                return "https://play.google.com/store/apps/details?id=com.instagram.android";
            case 8:
                return "market://details?id=com.linkedin.android";
            case 9:
                return "market://details?id=com.facebook.orca";
            case 10:
                return "market://details?id=com.pinterest";
            case 11:
                return "market://details?id=com.snapchat.android";
            case 12:
                return "market://details?id=org.telegram.messenger";
            case 13:
                return null;
            case 14:
                return "market://details?id=com.viber.voip";
            case 15:
                return "market://details?id=com.whatsapp.w4b";
            default:
                return "market://details?id=com.whatsapp";
        }
    }

    @Override // defpackage.R11, defpackage.AbstractC2038Zx
    public final void g(ReadableMap readableMap) throws InterruptedException, PackageManager.NameNotFoundException, IOException {
        boolean z;
        String string;
        Object obj = this.a;
        switch (this.f) {
            case 0:
                super.g(readableMap);
                l(null);
                return;
            case 1:
                super.g(readableMap);
                l(null);
                return;
            case 2:
                super.g(readableMap);
                l(null);
                return;
            case 3:
                super.g(readableMap);
                l(null);
                return;
            case 4:
                super.g(readableMap);
                if (!AbstractC2038Zx.f(readableMap, "appId")) {
                    throw new IllegalArgumentException("appId was not provided.");
                }
                if (!AbstractC2038Zx.f(readableMap, "backgroundImage") && !AbstractC2038Zx.f(readableMap, "backgroundVideo") && !AbstractC2038Zx.f(readableMap, "stickerImage")) {
                    throw new IllegalArgumentException("Invalid background or sticker assets provided.");
                }
                Activity currentActivity = ((ReactApplicationContext) obj).getCurrentActivity();
                if (currentActivity == null) {
                    B81.a("Something went wrong");
                } else {
                    ((Intent) this.b).putExtra("com.facebook.platform.extra.APPLICATION_ID", readableMap.getString("appId"));
                    ((Intent) this.b).putExtra("bottom_background_color", "#906df4");
                    ((Intent) this.b).putExtra("top_background_color", "#837DF4");
                    if (AbstractC2038Zx.f(readableMap, "attributionURL")) {
                        ((Intent) this.b).putExtra("content_url", readableMap.getString("attributionURL"));
                    }
                    if (AbstractC2038Zx.f(readableMap, "backgroundTopColor")) {
                        ((Intent) this.b).putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
                    }
                    if (AbstractC2038Zx.f(readableMap, "backgroundBottomColor")) {
                        ((Intent) this.b).putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
                    }
                    Boolean boolValueOf = Boolean.FALSE;
                    if (AbstractC2038Zx.f(readableMap, "useInternalStorage")) {
                        boolValueOf = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
                    }
                    z = AbstractC2038Zx.f(readableMap, "backgroundImage") || AbstractC2038Zx.f(readableMap, "backgroundVideo");
                    if (z) {
                        U41 u41 = new U41(AbstractC2038Zx.f(readableMap, "backgroundImage") ? readableMap.getString("backgroundImage") : AbstractC2038Zx.f(readableMap, "backgroundVideo") ? readableMap.getString("backgroundVideo") : "", ClipboardModule.MIMETYPE_JPEG, "background", boolValueOf, (ReactApplicationContext) obj);
                        Intent intent = (Intent) this.b;
                        Uri uriV = u41.v();
                        String str = (String) u41.d;
                        if (str == null) {
                            str = "*/*";
                        }
                        intent.setDataAndType(uriV, str);
                        ((Intent) this.b).setFlags(1);
                    }
                    if (AbstractC2038Zx.f(readableMap, "stickerImage")) {
                        U41 u412 = new U41(readableMap.getString("stickerImage"), ClipboardModule.MIMETYPE_PNG, "sticker", boolValueOf, (ReactApplicationContext) obj);
                        if (!z) {
                            ((Intent) this.b).setType("image/*");
                        }
                        ((Intent) this.b).putExtra("interactive_asset_uri", u412.v());
                        currentActivity.grantUriPermission("com.facebook.katana", u412.v(), 1);
                    }
                }
                l(readableMap);
                return;
            case 5:
                super.g(readableMap);
                l(null);
                return;
            case 6:
                super.g(readableMap);
                if (AbstractC2038Zx.f(readableMap, "type")) {
                    String string2 = readableMap.getString("type");
                    if (string2.startsWith("text")) {
                        ((Intent) this.b).setPackage("com.instagram.android");
                        ((Intent) this.b).setType("text/plain");
                        ((Intent) this.b).setAction("android.intent.action.SEND");
                        l(null);
                        return;
                    }
                    if (AbstractC2038Zx.f(readableMap, "url")) {
                        String string3 = readableMap.getString("url");
                        if (string3.startsWith("instagram://")) {
                            Uri uri = Uri.parse(string3);
                            ((Intent) this.b).setAction("android.intent.action.VIEW");
                            ((Intent) this.b).setData(uri);
                            l(null);
                            return;
                        }
                        String[] strArrSplit = string2.split("/");
                        String str2 = strArrSplit[strArrSplit.length - 1];
                        boolean zStartsWith = string2.startsWith("image");
                        String str3 = (String) this.c;
                        Boolean boolValueOf2 = Boolean.valueOf(AbstractC2038Zx.f((ReadableMap) this.e, "useInternalStorage") && ((ReadableMap) this.e).getBoolean("useInternalStorage"));
                        Uri uriV2 = (zStartsWith ? new U41(string3, AbstractC8235ym.v("image/", str2), "image", boolValueOf2, (ReactApplicationContext) obj) : new U41(string3, AbstractC8235ym.v("video/", str2), "video", boolValueOf2, (ReactApplicationContext) obj)).v();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        if (zStartsWith) {
                            intent2.setType("image/*");
                        } else {
                            intent2.setType("video/*");
                        }
                        intent2.putExtra("android.intent.extra.STREAM", uriV2);
                        intent2.setPackage("com.instagram.android");
                        Intent intent3 = new Intent("com.instagram.share.ADD_TO_STORY");
                        intent3.setDataAndType(uriV2, str2);
                        intent3.addFlags(1);
                        intent3.setPackage("com.instagram.android");
                        Intent intentCreateChooser = Intent.createChooser(intent2, str3);
                        intentCreateChooser.addFlags(268435456);
                        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent3});
                        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) obj;
                        reactApplicationContext.getCurrentActivity().grantUriPermission("com.instagram.android", uriV2, 1);
                        reactApplicationContext.startActivity(intentCreateChooser);
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean("success", true);
                        writableMapCreateMap.putString("message", ((Intent) this.b).getPackage());
                        B81.b(writableMapCreateMap);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                super.g(readableMap);
                if (!AbstractC2038Zx.f(readableMap, "backgroundImage") && !AbstractC2038Zx.f(readableMap, "backgroundVideo") && !AbstractC2038Zx.f(readableMap, "stickerImage")) {
                    throw new IllegalArgumentException("Invalid background or sticker assets provided.");
                }
                Activity currentActivity2 = ((ReactApplicationContext) obj).getCurrentActivity();
                if (currentActivity2 == null) {
                    B81.a("Something went wrong");
                } else {
                    ((Intent) this.b).putExtra("source_application", readableMap.getString("appId"));
                    ((Intent) this.b).putExtra("bottom_background_color", "#906df4");
                    ((Intent) this.b).putExtra("top_background_color", "#837DF4");
                    if (AbstractC2038Zx.f(readableMap, "attributionURL")) {
                        ((Intent) this.b).putExtra("content_url", readableMap.getString("attributionURL"));
                    }
                    if (AbstractC2038Zx.f(readableMap, "backgroundTopColor")) {
                        ((Intent) this.b).putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
                    }
                    if (AbstractC2038Zx.f(readableMap, "backgroundBottomColor")) {
                        ((Intent) this.b).putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
                    }
                    Boolean boolValueOf3 = Boolean.FALSE;
                    if (AbstractC2038Zx.f(readableMap, "useInternalStorage")) {
                        boolValueOf3 = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
                    }
                    if (AbstractC2038Zx.f(readableMap, "linkUrl")) {
                        ((Intent) this.b).putExtra("link_url", readableMap.getString("linkUrl"));
                    }
                    if (AbstractC2038Zx.f(readableMap, "linkText")) {
                        ((Intent) this.b).putExtra("link_text", readableMap.getString("linkText"));
                    }
                    z = AbstractC2038Zx.f(readableMap, "backgroundImage") || AbstractC2038Zx.f(readableMap, "backgroundVideo");
                    if (z) {
                        boolean zF = AbstractC2038Zx.f(readableMap, "backgroundImage");
                        String str4 = ClipboardModule.MIMETYPE_JPEG;
                        if (zF) {
                            string = readableMap.getString("backgroundImage");
                        } else if (AbstractC2038Zx.f(readableMap, "backgroundVideo")) {
                            string = readableMap.getString("backgroundVideo");
                            str4 = "video/*";
                        } else {
                            string = "";
                        }
                        U41 u413 = new U41(string, str4, "background", boolValueOf3, (ReactApplicationContext) obj);
                        Intent intent4 = (Intent) this.b;
                        Uri uriV3 = u413.v();
                        String str5 = (String) u413.d;
                        if (str5 == null) {
                            str5 = "*/*";
                        }
                        intent4.setDataAndType(uriV3, str5);
                        ((Intent) this.b).setFlags(1);
                    }
                    if (AbstractC2038Zx.f(readableMap, "stickerImage")) {
                        U41 u414 = new U41(readableMap.getString("stickerImage"), ClipboardModule.MIMETYPE_PNG, "sticker", boolValueOf3, (ReactApplicationContext) obj);
                        if (!z) {
                            ((Intent) this.b).setType("image/*");
                        }
                        ((Intent) this.b).putExtra("interactive_asset_uri", u414.v());
                        currentActivity2.grantUriPermission("com.instagram.android", u414.v(), 1);
                    }
                }
                l(readableMap);
                return;
            case 8:
                super.g(readableMap);
                l(null);
                return;
            case 9:
                super.g(readableMap);
                l(null);
                return;
            case 10:
                super.g(readableMap);
                l(null);
                return;
            case 11:
                super.g(readableMap);
                l(null);
                return;
            case 12:
                super.g(readableMap);
                l(null);
                return;
            case 13:
                super.g(readableMap);
                l(null);
                return;
            case 14:
                super.g(readableMap);
                l(null);
                return;
            case 15:
                super.g(readableMap);
                if (readableMap.hasKey("whatsAppNumber")) {
                    try {
                        ((Intent) this.b).setComponent(new ComponentName("com.whatsapp.w4b", "com.whatsapp.Conversation"));
                        l(null);
                        Thread.sleep(10L);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                ((Intent) this.b).setComponent(null);
                l(null);
                return;
            default:
                super.g(readableMap);
                if (readableMap.hasKey("whatsAppNumber")) {
                    try {
                        ((Intent) this.b).setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                        l(null);
                        Thread.sleep(10L);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                ((Intent) this.b).setComponent(null);
                l(null);
                return;
        }
    }
}
