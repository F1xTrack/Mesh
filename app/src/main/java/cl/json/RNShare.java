package cl.json;

import android.content.ActivityNotFoundException;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000.AbstractC0852NX;
import p000.AbstractC1633Zx;
import p000.AbstractC7222ym;
import p000.B81;
import p000.J00;
import p000.QI0;

/* loaded from: classes.dex */
public class RNShare extends ReactContextBaseJavaModule {
    private final QI0 delegate;

    public RNShare(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        QI0 qi0 = new QI0();
        QI0.f9561a = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(qi0);
        this.delegate = qi0;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        this.delegate.getClass();
        HashMap map = new HashMap();
        for (int i : AbstractC7222ym.m26223C(19)) {
            map.put(AbstractC0852NX.m5769r(i).toUpperCase(Locale.ROOT), AbstractC0852NX.m5769r(i));
        }
        return map;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNShare";
    }

    @ReactMethod
    public void isBase64File(String str, Promise promise) {
        this.delegate.getClass();
        try {
            String scheme = Uri.parse(str).getScheme();
            if (scheme == null || !scheme.equals("data")) {
                promise.resolve(Boolean.FALSE);
            } else {
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace(System.out);
            promise.reject(e.getMessage());
        }
    }

    @ReactMethod
    public void isPackageInstalled(String str, Promise promise) throws PackageManager.NameNotFoundException {
        this.delegate.getClass();
        try {
            boolean z = true;
            try {
                QI0.f9561a.getPackageManager().getPackageInfo(str, 1);
            } catch (PackageManager.NameNotFoundException unused) {
                z = false;
            }
            promise.resolve(Boolean.valueOf(z));
        } catch (Exception e) {
            e.getMessage();
            promise.reject(e.getMessage());
        }
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        this.delegate.getClass();
        B81.f589d = promise;
        try {
            new J00(QI0.f9561a).mo4103g(readableMap);
        } catch (ActivityNotFoundException e) {
            e.getMessage();
            e.printStackTrace(System.out);
            B81.m526a("not_available");
        } catch (Exception e2) {
            e2.getMessage();
            e2.printStackTrace(System.out);
            B81.m526a(e2.getMessage());
        }
    }

    @ReactMethod
    public void shareSingle(ReadableMap readableMap, Promise promise) {
        this.delegate.getClass();
        B81.f589d = promise;
        if (!AbstractC1633Zx.m9647f(readableMap, "social")) {
            B81.m526a("key 'social' missing in options");
            return;
        }
        try {
            AbstractC1633Zx abstractC1633ZxM5755d = AbstractC0852NX.m5755d(QI0.f9561a, readableMap.getString("social"));
            if (abstractC1633ZxM5755d == null) {
                throw new ActivityNotFoundException("Invalid share activity");
            }
            abstractC1633ZxM5755d.mo4103g(readableMap);
        } catch (ActivityNotFoundException e) {
            e.getMessage();
            e.printStackTrace(System.out);
            B81.m526a(e.getMessage());
        } catch (Exception e2) {
            e2.getMessage();
            e2.printStackTrace(System.out);
            B81.m526a(e2.getMessage());
        }
    }
}
