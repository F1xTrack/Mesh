package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: xw1 */
/* loaded from: classes.dex */
public final class C11734xw1 {

    /* renamed from: a */
    public final C7357Av1 f45909a;

    /* renamed from: b */
    public final String f45910b;

    /* renamed from: c */
    public final C7463Cw1 f45911c;

    public C11734xw1(Context context, C7357Av1 c7357Av1) throws NoSuchAlgorithmException {
        String strEncodeToString;
        this.f45910b = context.getPackageName();
        this.f45909a = c7357Av1;
        C7357Av1 c7357Av12 = AbstractC7931Lw1.f6936a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
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
                        this.f45911c = new C7463Cw1(context, c7357Av1, AbstractC7359Aw1.f475a);
                        return;
                    }
                }
                Object[] objArr = new Object[0];
                boolean zIsLoggable = Log.isLoggable("PlayCore", 5);
                C7357Av1 c7357Av13 = AbstractC7931Lw1.f6936a;
                if (zIsLoggable) {
                    C7357Av1.m408b(c7357Av13.f470a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                } else {
                    c7357Av13.getClass();
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            C7357Av1.m408b(c7357Av1.f470a, "Phonesky is not installed.", objArr2);
        } else {
            c7357Av1.getClass();
        }
        this.f45911c = null;
    }

    /* renamed from: a */
    public static Bundle m26008a(C11734xw1 c11734xw1, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c11734xw1.f45910b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C11855yt1(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11855yt1 c11855yt1 = (C11855yt1) it.next();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", c11855yt1.f46534a);
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
