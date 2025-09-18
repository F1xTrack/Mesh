package p000;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class UO1 {
    /* renamed from: a */
    public static Typeface m8004a(Typeface typeface, int i, int i2, String str, AssetManager assetManager) {
        C11403vK0 c11403vK0 = new C11403vK0(i, i2);
        if (str != null) {
            if (CC0.f1248g == null) {
                CC0.f1248g = new CC0(2);
            }
            return CC0.f1248g.m1053Z0(str, c11403vK0, assetManager);
        }
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        int i3 = Build.VERSION.SDK_INT;
        boolean z = c11403vK0.f44331a;
        int i4 = c11403vK0.f44332b;
        if (i3 < 28) {
            return Typeface.create(typeface, i4 < 700 ? z ? 2 : 0 : z ? 3 : 1);
        }
        return Typeface.create(typeface, i4, z);
    }

    /* renamed from: b */
    public static Bitmap m8005b(int i, byte[] bArr) throws IOException {
        int i2 = 0;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, null);
        if (bitmapDecodeByteArray == null) {
            throw C10103lA0.m22366a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C7137xQ c7137xQ = new C7137xQ(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (c7137xQ.m25870f(1, "Orientation")) {
                case 3:
                case 4:
                    i2 = 180;
                    break;
                case 5:
                case 8:
                    i2 = 270;
                    break;
                case 6:
                case 7:
                    i2 = 90;
                    break;
            }
            if (i2 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i2);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static int m8006c(String str) {
        if (str == null) {
            return -1;
        }
        if ("italic".equals(str)) {
            return 2;
        }
        return "normal".equals(str) ? 0 : -1;
    }

    /* renamed from: d */
    public static String m8007d(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string != null) {
                switch (string) {
                    case "stylistic-thirteen":
                        arrayList.add("'ss13'");
                        break;
                    case "stylistic-fifteen":
                        arrayList.add("'ss15'");
                        break;
                    case "stylistic-eighteen":
                        arrayList.add("'ss18'");
                        break;
                    case "proportional-nums":
                        arrayList.add("'pnum'");
                        break;
                    case "lining-nums":
                        arrayList.add("'lnum'");
                        break;
                    case "historical-ligatures":
                        arrayList.add("'hlig'");
                        break;
                    case "tabular-nums":
                        arrayList.add("'tnum'");
                        break;
                    case "discretionary-ligatures":
                        arrayList.add("'dlig'");
                        break;
                    case "oldstyle-nums":
                        arrayList.add("'onum'");
                        break;
                    case "no-contextual":
                        arrayList.add("'calt' off");
                        break;
                    case "contextual":
                        arrayList.add("'calt'");
                        break;
                    case "no-common-ligatures":
                        arrayList.add("'liga' off");
                        arrayList.add("'clig' off");
                        break;
                    case "stylistic-eight":
                        arrayList.add("'ss08'");
                        break;
                    case "stylistic-seven":
                        arrayList.add("'ss07'");
                        break;
                    case "stylistic-three":
                        arrayList.add("'ss03'");
                        break;
                    case "stylistic-eleven":
                        arrayList.add("'ss11'");
                        break;
                    case "no-historical-ligatures":
                        arrayList.add("'hlig' off");
                        break;
                    case "stylistic-five":
                        arrayList.add("'ss05'");
                        break;
                    case "stylistic-four":
                        arrayList.add("'ss04'");
                        break;
                    case "stylistic-nine":
                        arrayList.add("'ss09'");
                        break;
                    case "stylistic-one":
                        arrayList.add("'ss01'");
                        break;
                    case "stylistic-six":
                        arrayList.add("'ss06'");
                        break;
                    case "stylistic-ten":
                        arrayList.add("'ss10'");
                        break;
                    case "stylistic-two":
                        arrayList.add("'ss02'");
                        break;
                    case "stylistic-sixteen":
                        arrayList.add("'ss16'");
                        break;
                    case "stylistic-twelve":
                        arrayList.add("'ss12'");
                        break;
                    case "stylistic-twenty":
                        arrayList.add("'ss20'");
                        break;
                    case "no-discretionary-ligatures":
                        arrayList.add("'dlig' off");
                        break;
                    case "small-caps":
                        arrayList.add("'smcp'");
                        break;
                    case "common-ligatures":
                        arrayList.add("'liga'");
                        arrayList.add("'clig'");
                        break;
                    case "stylistic-nineteen":
                        arrayList.add("'ss19'");
                        break;
                    case "stylistic-fourteen":
                        arrayList.add("'ss14'");
                        break;
                    case "stylistic-seventeen":
                        arrayList.add("'ss17'");
                        break;
                }
            }
        }
        return TextUtils.join(", ", arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m8008e(java.lang.String r2) {
        /*
            r0 = -1
            if (r2 == 0) goto Laa
            int r1 = r2.hashCode()
            switch(r1) {
                case -1039745817: goto L81;
                case 48625: goto L76;
                case 49586: goto L6b;
                case 50547: goto L60;
                case 51508: goto L55;
                case 52469: goto L4a;
                case 53430: goto L3f;
                case 54391: goto L34;
                case 55352: goto L27;
                case 56313: goto L1a;
                case 3029637: goto Ld;
                default: goto La;
            }
        La:
            r2 = r0
            goto L8b
        Ld:
            java.lang.String r1 = "bold"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L16
            goto La
        L16:
            r2 = 10
            goto L8b
        L1a:
            java.lang.String r1 = "900"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L23
            goto La
        L23:
            r2 = 9
            goto L8b
        L27:
            java.lang.String r1 = "800"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L30
            goto La
        L30:
            r2 = 8
            goto L8b
        L34:
            java.lang.String r1 = "700"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L3d
            goto La
        L3d:
            r2 = 7
            goto L8b
        L3f:
            java.lang.String r1 = "600"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L48
            goto La
        L48:
            r2 = 6
            goto L8b
        L4a:
            java.lang.String r1 = "500"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L53
            goto La
        L53:
            r2 = 5
            goto L8b
        L55:
            java.lang.String r1 = "400"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L5e
            goto La
        L5e:
            r2 = 4
            goto L8b
        L60:
            java.lang.String r1 = "300"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L69
            goto La
        L69:
            r2 = 3
            goto L8b
        L6b:
            java.lang.String r1 = "200"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L74
            goto La
        L74:
            r2 = 2
            goto L8b
        L76:
            java.lang.String r1 = "100"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L7f
            goto La
        L7f:
            r2 = 1
            goto L8b
        L81:
            java.lang.String r1 = "normal"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L8a
            goto La
        L8a:
            r2 = 0
        L8b:
            switch(r2) {
                case 0: goto La7;
                case 1: goto La4;
                case 2: goto La1;
                case 3: goto L9e;
                case 4: goto La7;
                case 5: goto L9b;
                case 6: goto L98;
                case 7: goto L95;
                case 8: goto L92;
                case 9: goto L8f;
                case 10: goto L95;
                default: goto L8e;
            }
        L8e:
            goto Laa
        L8f:
            r2 = 900(0x384, float:1.261E-42)
            return r2
        L92:
            r2 = 800(0x320, float:1.121E-42)
            return r2
        L95:
            r2 = 700(0x2bc, float:9.81E-43)
            return r2
        L98:
            r2 = 600(0x258, float:8.41E-43)
            return r2
        L9b:
            r2 = 500(0x1f4, float:7.0E-43)
            return r2
        L9e:
            r2 = 300(0x12c, float:4.2E-43)
            return r2
        La1:
            r2 = 200(0xc8, float:2.8E-43)
            return r2
        La4:
            r2 = 100
            return r2
        La7:
            r2 = 400(0x190, float:5.6E-43)
            return r2
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.UO1.m8008e(java.lang.String):int");
    }
}
