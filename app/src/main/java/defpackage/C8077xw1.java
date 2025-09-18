package defpackage;

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
public final class C8077xw1 {
    public final C0085Av1 a;
    public final String b;
    public final C0244Cw1 c;

    public C8077xw1(Context context, C0085Av1 c0085Av1) throws NoSuchAlgorithmException {
        String strEncodeToString;
        this.b = context.getPackageName();
        this.a = c0085Av1;
        C0085Av1 c0085Av12 = AbstractC0945Lw1.a;
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
                        this.c = new C0244Cw1(context, c0085Av1, AbstractC0088Aw1.a);
                        return;
                    }
                }
                Object[] objArr = new Object[0];
                boolean zIsLoggable = Log.isLoggable("PlayCore", 5);
                C0085Av1 c0085Av13 = AbstractC0945Lw1.a;
                if (zIsLoggable) {
                    C0085Av1.b(c0085Av13.a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                } else {
                    c0085Av13.getClass();
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            C0085Av1.b(c0085Av1.a, "Phonesky is not installed.", objArr2);
        } else {
            c0085Av1.getClass();
        }
        this.c = null;
    }

    public static Bundle a(C8077xw1 c8077xw1, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c8077xw1.b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8258yt1(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8258yt1 c8258yt1 = (C8258yt1) it.next();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", c8258yt1.a);
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
