package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class KO1 {

    /* renamed from: c */
    public static final C10909rT0 f6059c = new C10909rT0("ReviewService");

    /* renamed from: a */
    public final C11364v12 f6060a;

    /* renamed from: b */
    public final String f6061b;

    public KO1(Context context) throws NoSuchAlgorithmException {
        String strEncodeToString;
        this.f6061b = context.getPackageName();
        C10909rT0 c10909rT0 = Z22.f14673a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    Object[] objArr = new Object[0];
                    boolean zIsLoggable = Log.isLoggable("PlayCore", 5);
                    C10909rT0 c10909rT02 = Z22.f14673a;
                    if (zIsLoggable) {
                        C10909rT0.m24352s((String) c10909rT02.f41672a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                        return;
                    } else {
                        c10909rT02.getClass();
                        return;
                    }
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    this.f6060a = new C11364v12(context, f6059c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
