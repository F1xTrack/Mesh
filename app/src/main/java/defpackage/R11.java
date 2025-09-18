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
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes.dex */
public abstract class R11 extends AbstractC2038Zx {
    @Override // defpackage.AbstractC2038Zx
    public void g(ReadableMap readableMap) throws PackageManager.NameNotFoundException, IOException {
        String strE;
        PrintStream printStream = System.out;
        printStream.println(d());
        if (d() != null || b() != null || e() != null) {
            try {
                ((ReactApplicationContext) this.a).getPackageManager().getPackageInfo(d(), 1);
                printStream.println("INSTALLED");
                if (a() != null) {
                    ((Intent) this.b).setComponent(new ComponentName(d(), a()));
                } else {
                    ((Intent) this.b).setPackage(d());
                }
                super.g(readableMap);
                return;
            } catch (PackageManager.NameNotFoundException unused) {
                printStream.println("NOT INSTALLED");
                if (b() != null) {
                    String strB = b();
                    String string = readableMap.getString("url");
                    try {
                        String strReplace = strB.replace("{url}", URLEncoder.encode(string, "UTF-8"));
                        String string2 = readableMap.getString("message");
                        try {
                            strE = strReplace.replace("{message}", URLEncoder.encode(string2, "UTF-8"));
                        } catch (UnsupportedEncodingException unused2) {
                            throw new RuntimeException(AbstractC8235ym.v("URLEncoder.encode() failed for ", string2));
                        }
                    } catch (UnsupportedEncodingException unused3) {
                        throw new RuntimeException(AbstractC8235ym.v("URLEncoder.encode() failed for ", string));
                    }
                } else {
                    strE = e() != null ? e() : "";
                }
                this.b = new Intent(new Intent("android.intent.action.VIEW", Uri.parse(strE)));
            }
        }
        super.g(readableMap);
    }

    public final void l(ReadableMap readableMap) {
        boolean zHasKey = ((ReadableMap) this.e).hasKey("forceDialog");
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.a;
        if (!zHasKey || !((ReadableMap) this.e).getBoolean("forceDialog")) {
            ((Intent) this.b).addFlags(268435456);
            reactApplicationContext.startActivity((Intent) this.b);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("success", true);
            writableMapCreateMap.putString("message", ((Intent) this.b).getPackage());
            B81.b(writableMapCreateMap);
            return;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            B81.a("Something went wrong");
            return;
        }
        if (readableMap != null && !AbstractC2038Zx.f(readableMap, "social")) {
            throw new IllegalArgumentException("social is empty");
        }
        Intent intentCreateChooser = Intent.createChooser((Intent) this.b, (String) this.c, B81.c(reactApplicationContext));
        intentCreateChooser.addFlags(1073741824);
        currentActivity.startActivityForResult(intentCreateChooser, 16845);
    }
}
