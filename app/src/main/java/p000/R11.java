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
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes.dex */
public abstract class R11 extends AbstractC1633Zx {
    @Override // p000.AbstractC1633Zx
    /* renamed from: g */
    public void mo4103g(ReadableMap readableMap) throws PackageManager.NameNotFoundException, IOException {
        String strMo8967e;
        PrintStream printStream = System.out;
        printStream.println(mo8966d());
        if (mo8966d() != null || mo8965b() != null || mo8967e() != null) {
            try {
                ((ReactApplicationContext) this.f15235a).getPackageManager().getPackageInfo(mo8966d(), 1);
                printStream.println("INSTALLED");
                if (mo8964a() != null) {
                    ((Intent) this.f15236b).setComponent(new ComponentName(mo8966d(), mo8964a()));
                } else {
                    ((Intent) this.f15236b).setPackage(mo8966d());
                }
                super.mo4103g(readableMap);
                return;
            } catch (PackageManager.NameNotFoundException unused) {
                printStream.println("NOT INSTALLED");
                if (mo8965b() != null) {
                    String strMo8965b = mo8965b();
                    String string = readableMap.getString("url");
                    try {
                        String strReplace = strMo8965b.replace("{url}", URLEncoder.encode(string, "UTF-8"));
                        String string2 = readableMap.getString("message");
                        try {
                            strMo8967e = strReplace.replace("{message}", URLEncoder.encode(string2, "UTF-8"));
                        } catch (UnsupportedEncodingException unused2) {
                            throw new RuntimeException(AbstractC7222ym.m26245v("URLEncoder.encode() failed for ", string2));
                        }
                    } catch (UnsupportedEncodingException unused3) {
                        throw new RuntimeException(AbstractC7222ym.m26245v("URLEncoder.encode() failed for ", string));
                    }
                } else {
                    strMo8967e = mo8967e() != null ? mo8967e() : "";
                }
                this.f15236b = new Intent(new Intent("android.intent.action.VIEW", Uri.parse(strMo8967e)));
            }
        }
        super.mo4103g(readableMap);
    }

    /* renamed from: l */
    public final void m6878l(ReadableMap readableMap) {
        boolean zHasKey = ((ReadableMap) this.f15239e).hasKey("forceDialog");
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f15235a;
        if (!zHasKey || !((ReadableMap) this.f15239e).getBoolean("forceDialog")) {
            ((Intent) this.f15236b).addFlags(268435456);
            reactApplicationContext.startActivity((Intent) this.f15236b);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("success", true);
            writableMapCreateMap.putString("message", ((Intent) this.f15236b).getPackage());
            B81.m527b(writableMapCreateMap);
            return;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            B81.m526a("Something went wrong");
            return;
        }
        if (readableMap != null && !AbstractC1633Zx.m9647f(readableMap, "social")) {
            throw new IllegalArgumentException("social is empty");
        }
        Intent intentCreateChooser = Intent.createChooser((Intent) this.f15236b, (String) this.f15237c, B81.m528c(reactApplicationContext));
        intentCreateChooser.addFlags(1073741824);
        currentActivity.startActivityForResult(intentCreateChooser, 16845);
    }
}
