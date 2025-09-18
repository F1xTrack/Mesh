package p000;

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

/* renamed from: XJ */
/* loaded from: classes.dex */
public final class C1467XJ extends R11 {

    /* renamed from: f */
    public final /* synthetic */ int f13669f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1467XJ(ReactApplicationContext reactApplicationContext, int i) {
        super(reactApplicationContext);
        this.f13669f = i;
    }

    @Override // p000.AbstractC1633Zx
    /* renamed from: a */
    public String mo8964a() {
        switch (this.f13669f) {
            case 11:
                return "com.snap.mushroom.MainActivity";
            default:
                return super.mo8964a();
        }
    }

    @Override // p000.AbstractC1633Zx
    /* renamed from: b */
    public final String mo8965b() {
        switch (this.f13669f) {
        }
        return null;
    }

    @Override // p000.AbstractC1633Zx
    /* renamed from: d */
    public final String mo8966d() {
        switch (this.f13669f) {
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

    @Override // p000.AbstractC1633Zx
    /* renamed from: e */
    public final String mo8967e() {
        switch (this.f13669f) {
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

    @Override // p000.R11, p000.AbstractC1633Zx
    /* renamed from: g */
    public final void mo4103g(ReadableMap readableMap) throws InterruptedException, PackageManager.NameNotFoundException, IOException {
        boolean z;
        String string;
        Object obj = this.f15235a;
        switch (this.f13669f) {
            case 0:
                super.mo4103g(readableMap);
                m6878l(null);
                return;
            case 1:
                super.mo4103g(readableMap);
                m6878l(null);
                return;
            case 2:
                super.mo4103g(readableMap);
                m6878l(null);
                return;
            case 3:
                super.mo4103g(readableMap);
                m6878l(null);
                return;
            case 4:
                super.mo4103g(readableMap);
                if (!AbstractC1633Zx.m9647f(readableMap, "appId")) {
                    throw new IllegalArgumentException("appId was not provided.");
                }
                if (!AbstractC1633Zx.m9647f(readableMap, "backgroundImage") && !AbstractC1633Zx.m9647f(readableMap, "backgroundVideo") && !AbstractC1633Zx.m9647f(readableMap, "stickerImage")) {
                    throw new IllegalArgumentException("Invalid background or sticker assets provided.");
                }
                Activity currentActivity = ((ReactApplicationContext) obj).getCurrentActivity();
                if (currentActivity == null) {
                    B81.m526a("Something went wrong");
                } else {
                    ((Intent) this.f15236b).putExtra("com.facebook.platform.extra.APPLICATION_ID", readableMap.getString("appId"));
                    ((Intent) this.f15236b).putExtra("bottom_background_color", "#906df4");
                    ((Intent) this.f15236b).putExtra("top_background_color", "#837DF4");
                    if (AbstractC1633Zx.m9647f(readableMap, "attributionURL")) {
                        ((Intent) this.f15236b).putExtra("content_url", readableMap.getString("attributionURL"));
                    }
                    if (AbstractC1633Zx.m9647f(readableMap, "backgroundTopColor")) {
                        ((Intent) this.f15236b).putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
                    }
                    if (AbstractC1633Zx.m9647f(readableMap, "backgroundBottomColor")) {
                        ((Intent) this.f15236b).putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
                    }
                    Boolean boolValueOf = Boolean.FALSE;
                    if (AbstractC1633Zx.m9647f(readableMap, "useInternalStorage")) {
                        boolValueOf = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
                    }
                    z = AbstractC1633Zx.m9647f(readableMap, "backgroundImage") || AbstractC1633Zx.m9647f(readableMap, "backgroundVideo");
                    if (z) {
                        U41 u41 = new U41(AbstractC1633Zx.m9647f(readableMap, "backgroundImage") ? readableMap.getString("backgroundImage") : AbstractC1633Zx.m9647f(readableMap, "backgroundVideo") ? readableMap.getString("backgroundVideo") : "", ClipboardModule.MIMETYPE_JPEG, "background", boolValueOf, (ReactApplicationContext) obj);
                        Intent intent = (Intent) this.f15236b;
                        Uri uriM7887v = u41.m7887v();
                        String str = (String) u41.f11647d;
                        if (str == null) {
                            str = "*/*";
                        }
                        intent.setDataAndType(uriM7887v, str);
                        ((Intent) this.f15236b).setFlags(1);
                    }
                    if (AbstractC1633Zx.m9647f(readableMap, "stickerImage")) {
                        U41 u412 = new U41(readableMap.getString("stickerImage"), ClipboardModule.MIMETYPE_PNG, "sticker", boolValueOf, (ReactApplicationContext) obj);
                        if (!z) {
                            ((Intent) this.f15236b).setType("image/*");
                        }
                        ((Intent) this.f15236b).putExtra("interactive_asset_uri", u412.m7887v());
                        currentActivity.grantUriPermission("com.facebook.katana", u412.m7887v(), 1);
                    }
                }
                m6878l(readableMap);
                return;
            case 5:
                super.mo4103g(readableMap);
                m6878l(null);
                return;
            case 6:
                super.mo4103g(readableMap);
                if (AbstractC1633Zx.m9647f(readableMap, "type")) {
                    String string2 = readableMap.getString("type");
                    if (string2.startsWith("text")) {
                        ((Intent) this.f15236b).setPackage("com.instagram.android");
                        ((Intent) this.f15236b).setType("text/plain");
                        ((Intent) this.f15236b).setAction("android.intent.action.SEND");
                        m6878l(null);
                        return;
                    }
                    if (AbstractC1633Zx.m9647f(readableMap, "url")) {
                        String string3 = readableMap.getString("url");
                        if (string3.startsWith("instagram://")) {
                            Uri uri = Uri.parse(string3);
                            ((Intent) this.f15236b).setAction("android.intent.action.VIEW");
                            ((Intent) this.f15236b).setData(uri);
                            m6878l(null);
                            return;
                        }
                        String[] strArrSplit = string2.split("/");
                        String str2 = strArrSplit[strArrSplit.length - 1];
                        boolean zStartsWith = string2.startsWith("image");
                        String str3 = (String) this.f15237c;
                        Boolean boolValueOf2 = Boolean.valueOf(AbstractC1633Zx.m9647f((ReadableMap) this.f15239e, "useInternalStorage") && ((ReadableMap) this.f15239e).getBoolean("useInternalStorage"));
                        Uri uriM7887v2 = (zStartsWith ? new U41(string3, AbstractC7222ym.m26245v("image/", str2), "image", boolValueOf2, (ReactApplicationContext) obj) : new U41(string3, AbstractC7222ym.m26245v("video/", str2), "video", boolValueOf2, (ReactApplicationContext) obj)).m7887v();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        if (zStartsWith) {
                            intent2.setType("image/*");
                        } else {
                            intent2.setType("video/*");
                        }
                        intent2.putExtra("android.intent.extra.STREAM", uriM7887v2);
                        intent2.setPackage("com.instagram.android");
                        Intent intent3 = new Intent("com.instagram.share.ADD_TO_STORY");
                        intent3.setDataAndType(uriM7887v2, str2);
                        intent3.addFlags(1);
                        intent3.setPackage("com.instagram.android");
                        Intent intentCreateChooser = Intent.createChooser(intent2, str3);
                        intentCreateChooser.addFlags(268435456);
                        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent3});
                        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) obj;
                        reactApplicationContext.getCurrentActivity().grantUriPermission("com.instagram.android", uriM7887v2, 1);
                        reactApplicationContext.startActivity(intentCreateChooser);
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean("success", true);
                        writableMapCreateMap.putString("message", ((Intent) this.f15236b).getPackage());
                        B81.m527b(writableMapCreateMap);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                super.mo4103g(readableMap);
                if (!AbstractC1633Zx.m9647f(readableMap, "backgroundImage") && !AbstractC1633Zx.m9647f(readableMap, "backgroundVideo") && !AbstractC1633Zx.m9647f(readableMap, "stickerImage")) {
                    throw new IllegalArgumentException("Invalid background or sticker assets provided.");
                }
                Activity currentActivity2 = ((ReactApplicationContext) obj).getCurrentActivity();
                if (currentActivity2 == null) {
                    B81.m526a("Something went wrong");
                } else {
                    ((Intent) this.f15236b).putExtra("source_application", readableMap.getString("appId"));
                    ((Intent) this.f15236b).putExtra("bottom_background_color", "#906df4");
                    ((Intent) this.f15236b).putExtra("top_background_color", "#837DF4");
                    if (AbstractC1633Zx.m9647f(readableMap, "attributionURL")) {
                        ((Intent) this.f15236b).putExtra("content_url", readableMap.getString("attributionURL"));
                    }
                    if (AbstractC1633Zx.m9647f(readableMap, "backgroundTopColor")) {
                        ((Intent) this.f15236b).putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
                    }
                    if (AbstractC1633Zx.m9647f(readableMap, "backgroundBottomColor")) {
                        ((Intent) this.f15236b).putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
                    }
                    Boolean boolValueOf3 = Boolean.FALSE;
                    if (AbstractC1633Zx.m9647f(readableMap, "useInternalStorage")) {
                        boolValueOf3 = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
                    }
                    if (AbstractC1633Zx.m9647f(readableMap, "linkUrl")) {
                        ((Intent) this.f15236b).putExtra("link_url", readableMap.getString("linkUrl"));
                    }
                    if (AbstractC1633Zx.m9647f(readableMap, "linkText")) {
                        ((Intent) this.f15236b).putExtra("link_text", readableMap.getString("linkText"));
                    }
                    z = AbstractC1633Zx.m9647f(readableMap, "backgroundImage") || AbstractC1633Zx.m9647f(readableMap, "backgroundVideo");
                    if (z) {
                        boolean zM9647f = AbstractC1633Zx.m9647f(readableMap, "backgroundImage");
                        String str4 = ClipboardModule.MIMETYPE_JPEG;
                        if (zM9647f) {
                            string = readableMap.getString("backgroundImage");
                        } else if (AbstractC1633Zx.m9647f(readableMap, "backgroundVideo")) {
                            string = readableMap.getString("backgroundVideo");
                            str4 = "video/*";
                        } else {
                            string = "";
                        }
                        U41 u413 = new U41(string, str4, "background", boolValueOf3, (ReactApplicationContext) obj);
                        Intent intent4 = (Intent) this.f15236b;
                        Uri uriM7887v3 = u413.m7887v();
                        String str5 = (String) u413.f11647d;
                        if (str5 == null) {
                            str5 = "*/*";
                        }
                        intent4.setDataAndType(uriM7887v3, str5);
                        ((Intent) this.f15236b).setFlags(1);
                    }
                    if (AbstractC1633Zx.m9647f(readableMap, "stickerImage")) {
                        U41 u414 = new U41(readableMap.getString("stickerImage"), ClipboardModule.MIMETYPE_PNG, "sticker", boolValueOf3, (ReactApplicationContext) obj);
                        if (!z) {
                            ((Intent) this.f15236b).setType("image/*");
                        }
                        ((Intent) this.f15236b).putExtra("interactive_asset_uri", u414.m7887v());
                        currentActivity2.grantUriPermission("com.instagram.android", u414.m7887v(), 1);
                    }
                }
                m6878l(readableMap);
                return;
            case 8:
                super.mo4103g(readableMap);
                m6878l(null);
                return;
            case 9:
                super.mo4103g(readableMap);
                m6878l(null);
                return;
            case 10:
                super.mo4103g(readableMap);
                m6878l(null);
                return;
            case 11:
                super.mo4103g(readableMap);
                m6878l(null);
                return;
            case 12:
                super.mo4103g(readableMap);
                m6878l(null);
                return;
            case 13:
                super.mo4103g(readableMap);
                m6878l(null);
                return;
            case 14:
                super.mo4103g(readableMap);
                m6878l(null);
                return;
            case 15:
                super.mo4103g(readableMap);
                if (readableMap.hasKey("whatsAppNumber")) {
                    try {
                        ((Intent) this.f15236b).setComponent(new ComponentName("com.whatsapp.w4b", "com.whatsapp.Conversation"));
                        m6878l(null);
                        Thread.sleep(10L);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                ((Intent) this.f15236b).setComponent(null);
                m6878l(null);
                return;
            default:
                super.mo4103g(readableMap);
                if (readableMap.hasKey("whatsAppNumber")) {
                    try {
                        ((Intent) this.f15236b).setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                        m6878l(null);
                        Thread.sleep(10L);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                ((Intent) this.f15236b).setComponent(null);
                m6878l(null);
                return;
        }
    }
}
